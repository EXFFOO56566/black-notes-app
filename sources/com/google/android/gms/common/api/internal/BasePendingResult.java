package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import b.c.b.a.e.d.d;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends k> extends g<R> {
    static final ThreadLocal<Boolean> n = new r0();

    /* renamed from: a  reason: collision with root package name */
    private final Object f1544a;

    /* renamed from: b  reason: collision with root package name */
    private final a<R> f1545b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f1546c;
    private final ArrayList<g.a> d;
    private l<? super R> e;
    private final AtomicReference<l0> f;
    private R g;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private boolean k;
    private volatile j0<R> l;
    private boolean m;
    @KeepName
    private b mResultGuardian;

    public static class a<R extends k> extends d {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(l<? super R> lVar, R r) {
            BasePendingResult.a(lVar);
            sendMessage(obtainMessage(1, new Pair(lVar, r)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.l */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                l lVar = (l) pair.first;
                k kVar = (k) pair.second;
                try {
                    lVar.a(kVar);
                } catch (RuntimeException e) {
                    BasePendingResult.c(kVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).b(Status.i);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, r0 r0Var) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.c(BasePendingResult.this.g);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f1544a = new Object();
        this.f1546c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.m = false;
        this.f1545b = new a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    protected BasePendingResult(f fVar) {
        this.f1544a = new Object();
        this.f1546c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.m = false;
        this.f1545b = new a<>(fVar != null ? fVar.a() : Looper.getMainLooper());
        new WeakReference(fVar);
    }

    /* access modifiers changed from: private */
    public static <R extends k> l<R> a(l<R> lVar) {
        return lVar;
    }

    private final void b(R r) {
        this.g = r;
        this.f1546c.countDown();
        this.h = this.g.a();
        if (this.j) {
            this.e = null;
        } else if (this.e != null) {
            this.f1545b.removeMessages(2);
            this.f1545b.a(this.e, c());
        } else if (this.g instanceof i) {
            this.mResultGuardian = new b(this, null);
        }
        ArrayList<g.a> arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            g.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.h);
        }
        this.d.clear();
    }

    private final R c() {
        R r;
        synchronized (this.f1544a) {
            r.b(!this.i, "Result has already been consumed.");
            r.b(a(), "Result is not ready.");
            r = this.g;
            this.g = null;
            this.e = null;
            this.i = true;
        }
        l0 andSet = this.f.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    public static void c(k kVar) {
        if (kVar instanceof i) {
            try {
                ((i) kVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final R a(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            r.c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        r.b(!this.i, "Result has already been consumed.");
        if (this.l != null) {
            z = false;
        }
        r.b(z, "Cannot await if then() has been called.");
        try {
            if (!this.f1546c.await(j2, timeUnit)) {
                b(Status.i);
            }
        } catch (InterruptedException unused) {
            b(Status.g);
        }
        r.b(a(), "Result is not ready.");
        return c();
    }

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    @Override // com.google.android.gms.common.api.g
    public final void a(g.a aVar) {
        r.a(aVar != null, "Callback cannot be null.");
        synchronized (this.f1544a) {
            if (a()) {
                aVar.a(this.h);
            } else {
                this.d.add(aVar);
            }
        }
    }

    public final void a(R r) {
        synchronized (this.f1544a) {
            if (this.k || this.j) {
                c(r);
                return;
            }
            a();
            boolean z = true;
            r.b(!a(), "Results have already been set");
            if (this.i) {
                z = false;
            }
            r.b(z, "Result has already been consumed");
            b(r);
        }
    }

    public final boolean a() {
        return this.f1546c.getCount() == 0;
    }

    public final void b() {
        this.m = this.m || n.get().booleanValue();
    }

    public final void b(Status status) {
        synchronized (this.f1544a) {
            if (!a()) {
                a(a(status));
                this.k = true;
            }
        }
    }
}
