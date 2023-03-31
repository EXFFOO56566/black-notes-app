package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class c<T extends IInterface> {
    private static final b.c.b.a.c.d[] v = new b.c.b.a.c.d[0];

    /* renamed from: a  reason: collision with root package name */
    private l0 f1602a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1603b;

    /* renamed from: c  reason: collision with root package name */
    private final i f1604c;
    private final b.c.b.a.c.f d;
    final Handler e;
    private final Object f;
    private final Object g;
    @GuardedBy("mServiceBrokerLock")
    private o h;
    protected AbstractC0073c i;
    @GuardedBy("mLock")
    private T j;
    private final ArrayList<g<?>> k;
    @GuardedBy("mLock")
    private j l;
    @GuardedBy("mLock")
    private int m;
    private final a n;
    private final b o;
    private final int p;
    private final String q;
    private b.c.b.a.c.b r;
    private boolean s;
    private volatile f0 t;
    protected AtomicInteger u;

    public interface a {
        void b(int i);

        void e(Bundle bundle);
    }

    public interface b {
        void a(b.c.b.a.c.b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface AbstractC0073c {
        void a(b.c.b.a.c.b bVar);
    }

    protected class d implements AbstractC0073c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.AbstractC0073c
        public void a(b.c.b.a.c.b bVar) {
            if (bVar.j()) {
                c cVar = c.this;
                cVar.a((l) null, cVar.v());
            } else if (c.this.o != null) {
                c.this.o.a(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    private abstract class f extends g<Boolean> {
        private final int d;
        private final Bundle e;

        protected f(int i, Bundle bundle) {
            super(true);
            this.d = i;
            this.e = bundle;
        }

        /* access modifiers changed from: protected */
        public abstract void a(b.c.b.a.c.b bVar);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.g
        public final /* synthetic */ void a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                c.this.c(1, null);
                return;
            }
            int i = this.d;
            if (i != 0) {
                if (i != 10) {
                    c.this.c(1, null);
                    Bundle bundle = this.e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    a(new b.c.b.a.c.b(this.d, pendingIntent));
                    return;
                }
                c.this.c(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), c.this.l(), c.this.c()));
            } else if (!e()) {
                c.this.c(1, null);
                a(new b.c.b.a.c.b(8, null));
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.g
        public final void c() {
        }

        /* access modifiers changed from: protected */
        public abstract boolean e();
    }

    /* access modifiers changed from: protected */
    public abstract class g<TListener> {

        /* renamed from: a  reason: collision with root package name */
        private TListener f1606a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1607b = false;

        public g(TListener tlistener) {
            this.f1606a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.f1606a = null;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        public final void b() {
            a();
            synchronized (c.this.k) {
                c.this.k.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void c();

        public final void d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f1606a;
                if (this.f1607b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e) {
                    c();
                    throw e;
                }
            } else {
                c();
            }
            synchronized (this) {
                this.f1607b = true;
            }
            b();
        }
    }

    final class h extends b.c.b.a.e.e.d {
        public h(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            g gVar = (g) message.obj;
            gVar.c();
            gVar.b();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            if (c.this.u.get() == message.arg1) {
                int i = message.what;
                if ((i == 1 || i == 7 || ((i == 4 && !c.this.o()) || message.what == 5)) && !c.this.f()) {
                    a(message);
                    return;
                }
                int i2 = message.what;
                PendingIntent pendingIntent = null;
                if (i2 == 4) {
                    c.this.r = new b.c.b.a.c.b(message.arg2);
                    if (!c.this.C() || c.this.s) {
                        b.c.b.a.c.b bVar = c.this.r != null ? c.this.r : new b.c.b.a.c.b(8);
                        c.this.i.a(bVar);
                        c.this.a(bVar);
                        return;
                    }
                    c.this.c(3, null);
                } else if (i2 == 5) {
                    b.c.b.a.c.b bVar2 = c.this.r != null ? c.this.r : new b.c.b.a.c.b(8);
                    c.this.i.a(bVar2);
                    c.this.a(bVar2);
                } else if (i2 == 3) {
                    Object obj = message.obj;
                    if (obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) obj;
                    }
                    b.c.b.a.c.b bVar3 = new b.c.b.a.c.b(message.arg2, pendingIntent);
                    c.this.i.a(bVar3);
                    c.this.a(bVar3);
                } else if (i2 == 6) {
                    c.this.c(5, null);
                    if (c.this.n != null) {
                        c.this.n.b(message.arg2);
                    }
                    c.this.a(message.arg2);
                    c.this.a((c) 5, 1, (int) null);
                } else if (i2 == 2 && !c.this.a()) {
                    a(message);
                } else if (b(message)) {
                    ((g) message.obj).d();
                } else {
                    int i3 = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i3);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            } else if (b(message)) {
                a(message);
            }
        }
    }

    public static final class i extends m.a {

        /* renamed from: b  reason: collision with root package name */
        private c f1610b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1611c;

        public i(c cVar, int i) {
            this.f1610b = cVar;
            this.f1611c = i;
        }

        @Override // com.google.android.gms.common.internal.m
        public final void a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.m
        public final void a(int i, IBinder iBinder, Bundle bundle) {
            r.a(this.f1610b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1610b.a(i, iBinder, bundle, this.f1611c);
            this.f1610b = null;
        }

        @Override // com.google.android.gms.common.internal.m
        public final void a(int i, IBinder iBinder, f0 f0Var) {
            r.a(this.f1610b, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.a(f0Var);
            this.f1610b.a((c) f0Var);
            a(i, iBinder, f0Var.f1622b);
        }
    }

    public final class j implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final int f1612a;

        public j(int i) {
            this.f1612a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o oVar;
            c cVar = c.this;
            if (iBinder == null) {
                cVar.c((c) 16);
                return;
            }
            synchronized (cVar.g) {
                c cVar2 = c.this;
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    oVar = (queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new n(iBinder) : (o) queryLocalInterface;
                }
                cVar2.h = oVar;
            }
            c.this.a(0, (Bundle) null, this.f1612a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (c.this.g) {
                c.this.h = null;
            }
            Handler handler = c.this.e;
            handler.sendMessage(handler.obtainMessage(6, this.f1612a, 1));
        }
    }

    /* access modifiers changed from: protected */
    public final class k extends f {
        public k(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final void a(b.c.b.a.c.b bVar) {
            if (!c.this.o() || !c.this.C()) {
                c.this.i.a(bVar);
                c.this.a(bVar);
                return;
            }
            c.this.c((c) 16);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final boolean e() {
            c.this.i.a(b.c.b.a.c.b.f);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final class l extends f {
        private final IBinder g;

        public l(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.g = iBinder;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final void a(b.c.b.a.c.b bVar) {
            if (c.this.o != null) {
                c.this.o.a(bVar);
            }
            c.this.a(bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.c.f
        public final boolean e() {
            try {
                String interfaceDescriptor = this.g.getInterfaceDescriptor();
                if (!c.this.c().equals(interfaceDescriptor)) {
                    String c2 = c.this.c();
                    StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(c2);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a2 = c.this.a(this.g);
                if (a2 == null || (!c.this.a((c) 2, 4, (int) a2) && !c.this.a((c) 3, 4, (int) a2))) {
                    return false;
                }
                c.this.r = null;
                Bundle r = c.this.r();
                if (c.this.n == null) {
                    return true;
                }
                c.this.n.e(r);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c.a r13, com.google.android.gms.common.internal.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.i.a(r10)
            b.c.b.a.c.f r4 = b.c.b.a.c.f.a()
            com.google.android.gms.common.internal.r.a(r13)
            r6 = r13
            com.google.android.gms.common.internal.c$a r6 = (com.google.android.gms.common.internal.c.a) r6
            com.google.android.gms.common.internal.r.a(r14)
            r7 = r14
            com.google.android.gms.common.internal.c$b r7 = (com.google.android.gms.common.internal.c.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    protected c(Context context, Looper looper, i iVar, b.c.b.a.c.f fVar, int i2, a aVar, b bVar, String str) {
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList<>();
        this.m = 1;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = new AtomicInteger(0);
        r.a(context, "Context must not be null");
        this.f1603b = context;
        r.a(looper, "Looper must not be null");
        r.a(iVar, "Supervisor must not be null");
        this.f1604c = iVar;
        r.a(fVar, "API availability must not be null");
        this.d = fVar;
        this.e = new h(looper);
        this.p = i2;
        this.n = aVar;
        this.o = bVar;
        this.q = str;
    }

    private final String A() {
        String str = this.q;
        return str == null ? this.f1603b.getClass().getName() : str;
    }

    private final boolean B() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean C() {
        if (this.s || TextUtils.isEmpty(c()) || TextUtils.isEmpty(u())) {
            return false;
        }
        try {
            Class.forName(c());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(f0 f0Var) {
        this.t = f0Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean a(int i2, int i3, T t2) {
        synchronized (this.f) {
            if (this.m != i2) {
                return false;
            }
            c(i3, t2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i2) {
        int i3;
        if (B()) {
            i3 = 5;
            this.s = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(i3, this.u.get(), 16));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i2, T t2) {
        boolean z = false;
        if ((i2 == 4) == (t2 != null)) {
            z = true;
        }
        r.a(z);
        synchronized (this.f) {
            this.m = i2;
            this.j = t2;
            b(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.l == null || this.f1602a == null)) {
                        String d2 = this.f1602a.d();
                        String a2 = this.f1602a.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 70 + String.valueOf(a2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(d2);
                        sb.append(" on ");
                        sb.append(a2);
                        Log.e("GmsClient", sb.toString());
                        this.f1604c.a(this.f1602a.d(), this.f1602a.a(), this.f1602a.c(), this.l, A(), this.f1602a.b());
                        this.u.incrementAndGet();
                    }
                    this.l = new j(this.u.get());
                    l0 l0Var = (this.m != 3 || u() == null) ? new l0(x(), l(), false, 129, y()) : new l0(s().getPackageName(), u(), true, 129, false);
                    this.f1602a = l0Var;
                    if (!l0Var.b() || e() >= 17895000) {
                        if (!this.f1604c.a(new i.a(this.f1602a.d(), this.f1602a.a(), this.f1602a.c(), this.f1602a.b()), this.l, A())) {
                            String d3 = this.f1602a.d();
                            String a3 = this.f1602a.a();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 34 + String.valueOf(a3).length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(d3);
                            sb2.append(" on ");
                            sb2.append(a3);
                            Log.e("GmsClient", sb2.toString());
                            a(16, (Bundle) null, this.u.get());
                        }
                    } else {
                        String valueOf = String.valueOf(this.f1602a.d());
                        throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                } else if (i2 == 4) {
                    a(t2);
                }
            } else if (this.l != null) {
                this.f1604c.a(this.f1602a.d(), this.f1602a.a(), this.f1602a.c(), this.l, A(), this.f1602a.b());
                this.l = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public void a(int i2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Bundle bundle, int i3) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new k(i2, null)));
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new l(i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public void a(T t2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void a(b.c.b.a.c.b bVar) {
        bVar.d();
        System.currentTimeMillis();
    }

    public void a(AbstractC0073c cVar) {
        r.a(cVar, "Connection progress callbacks cannot be null.");
        this.i = cVar;
        c(2, null);
    }

    /* access modifiers changed from: protected */
    public void a(AbstractC0073c cVar, int i2, PendingIntent pendingIntent) {
        r.a(cVar, "Connection progress callbacks cannot be null.");
        this.i = cVar;
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3, this.u.get(), i2, pendingIntent));
    }

    public void a(e eVar) {
        eVar.a();
    }

    public void a(l lVar, Set<Scope> set) {
        Bundle t2 = t();
        g gVar = new g(this.p);
        gVar.e = this.f1603b.getPackageName();
        gVar.h = t2;
        if (set != null) {
            gVar.g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (k()) {
            gVar.i = p() != null ? p() : new Account("<<default account>>", "com.google");
            if (lVar != null) {
                gVar.f = lVar.asBinder();
            }
        } else if (z()) {
            gVar.i = p();
        }
        gVar.j = v;
        gVar.k = q();
        try {
            synchronized (this.g) {
                if (this.h != null) {
                    this.h.a(new i(this, this.u.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            b(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, (IBinder) null, (Bundle) null, this.u.get());
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    public void b(int i2) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(6, this.u.get(), i2));
    }

    /* access modifiers changed from: package-private */
    public void b(int i2, T t2) {
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public boolean d() {
        return true;
    }

    public int e() {
        return b.c.b.a.c.f.f1163a;
    }

    public boolean f() {
        boolean z;
        synchronized (this.f) {
            if (this.m != 2) {
                if (this.m != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final b.c.b.a.c.d[] g() {
        f0 f0Var = this.t;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f1623c;
    }

    public String h() {
        l0 l0Var;
        if (a() && (l0Var = this.f1602a) != null) {
            return l0Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void i() {
        this.u.incrementAndGet();
        synchronized (this.k) {
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.get(i2).a();
            }
            this.k.clear();
        }
        synchronized (this.g) {
            this.h = null;
        }
        c(1, null);
    }

    public boolean k() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract String l();

    public void m() {
        int a2 = this.d.a(this.f1603b, e());
        if (a2 != 0) {
            c(1, null);
            a(new d(), a2, (PendingIntent) null);
            return;
        }
        a(new d());
    }

    /* access modifiers changed from: protected */
    public final void n() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean o() {
        return false;
    }

    public Account p() {
        return null;
    }

    public b.c.b.a.c.d[] q() {
        return v;
    }

    public Bundle r() {
        return null;
    }

    public final Context s() {
        return this.f1603b;
    }

    /* access modifiers changed from: protected */
    public Bundle t() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public String u() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> v() {
        return Collections.EMPTY_SET;
    }

    public final T w() {
        T t2;
        synchronized (this.f) {
            if (this.m != 5) {
                n();
                r.b(this.j != null, "Client is connected but service is null");
                t2 = this.j;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public String x() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }

    public boolean z() {
        return false;
    }
}
