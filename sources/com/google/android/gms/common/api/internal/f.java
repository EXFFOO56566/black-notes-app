package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import b.c.b.a.c.d;
import b.c.b.a.c.e;
import b.c.b.a.h.g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public class f implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status p = new Status(4, "The user must be signed in to make this API call.");
    private static final Object q = new Object();
    @GuardedBy("lock")
    private static f r;

    /* renamed from: b  reason: collision with root package name */
    private long f1561b = 5000;

    /* renamed from: c  reason: collision with root package name */
    private long f1562c = 120000;
    private long d = 10000;
    private final Context e;
    private final e f;
    private final k g;
    private final AtomicInteger h = new AtomicInteger(1);
    private final AtomicInteger i = new AtomicInteger(0);
    private final Map<b<?>, a<?>> j = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")
    private r k = null;
    @GuardedBy("lock")
    private final Set<b<?>> l = new a.e.b();
    private final Set<b<?>> m = new a.e.b();
    private final Handler n;

    public class a<O extends a.d> implements f.a, f.b, s0 {

        /* renamed from: b  reason: collision with root package name */
        private final Queue<e0> f1563b = new LinkedList();

        /* renamed from: c  reason: collision with root package name */
        private final a.f f1564c;
        private final a.b d;
        private final b<O> e;
        private final t0 f;
        private final Set<p0> g = new HashSet();
        private final Map<j<?>, d0> h = new HashMap();
        private final int i;
        private final g0 j;
        private boolean k;
        private final List<c> l = new ArrayList();
        private b.c.b.a.c.b m = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            a.f a2 = eVar.a(f.this.n.getLooper(), this);
            this.f1564c = a2;
            this.d = a2 instanceof u ? ((u) a2).B() : a2;
            this.e = eVar.c();
            this.f = new t0();
            this.i = eVar.e();
            if (this.f1564c.k()) {
                this.j = eVar.a(f.this.e, f.this.n);
            } else {
                this.j = null;
            }
        }

        private final d a(d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                d[] g2 = this.f1564c.g();
                if (g2 == null) {
                    g2 = new d[0];
                }
                a.e.a aVar = new a.e.a(g2.length);
                for (d dVar : g2) {
                    aVar.put(dVar.d(), Long.valueOf(dVar.e()));
                }
                for (d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.d()) || ((Long) aVar.get(dVar2.d())).longValue() < dVar2.e()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(c cVar) {
            if (!this.l.contains(cVar) || this.k) {
                return;
            }
            if (!this.f1564c.a()) {
                a();
            } else {
                o();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final boolean a(boolean z) {
            r.a(f.this.n);
            if (!this.f1564c.a() || this.h.size() != 0) {
                return false;
            }
            if (this.f.a()) {
                if (z) {
                    q();
                }
                return false;
            }
            this.f1564c.i();
            return true;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(c cVar) {
            d[] b2;
            if (this.l.remove(cVar)) {
                f.this.n.removeMessages(15, cVar);
                f.this.n.removeMessages(16, cVar);
                d dVar = cVar.f1569b;
                ArrayList arrayList = new ArrayList(this.f1563b.size());
                for (e0 e0Var : this.f1563b) {
                    if ((e0Var instanceof u) && (b2 = ((u) e0Var).b((a<?>) this)) != null && com.google.android.gms.common.util.a.a(b2, dVar)) {
                        arrayList.add(e0Var);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    e0 e0Var2 = (e0) obj;
                    this.f1563b.remove(e0Var2);
                    e0Var2.a(new n(dVar));
                }
            }
        }

        private final boolean b(e0 e0Var) {
            if (!(e0Var instanceof u)) {
                c(e0Var);
                return true;
            }
            u uVar = (u) e0Var;
            d a2 = a(uVar.b((a<?>) this));
            if (a2 == null) {
                c(e0Var);
                return true;
            } else if (uVar.c(this)) {
                c cVar = new c(this.e, a2, null);
                int indexOf = this.l.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.l.get(indexOf);
                    f.this.n.removeMessages(15, cVar2);
                    f.this.n.sendMessageDelayed(Message.obtain(f.this.n, 15, cVar2), f.this.f1561b);
                    return false;
                }
                this.l.add(cVar);
                f.this.n.sendMessageDelayed(Message.obtain(f.this.n, 15, cVar), f.this.f1561b);
                f.this.n.sendMessageDelayed(Message.obtain(f.this.n, 16, cVar), f.this.f1562c);
                b.c.b.a.c.b bVar = new b.c.b.a.c.b(2, null);
                if (c(bVar)) {
                    return false;
                }
                f.this.b(bVar, this.i);
                return false;
            } else {
                uVar.a(new n(a2));
                return false;
            }
        }

        private final void c(e0 e0Var) {
            e0Var.a(this.f, d());
            try {
                e0Var.a((a<?>) this);
            } catch (DeadObjectException unused) {
                b(1);
                this.f1564c.i();
            }
        }

        private final boolean c(b.c.b.a.c.b bVar) {
            synchronized (f.q) {
                if (f.this.k != null) {
                    if (f.this.l.contains(this.e)) {
                        f.this.k.a(bVar, this.i);
                        throw null;
                    }
                }
            }
            return false;
        }

        private final void d(b.c.b.a.c.b bVar) {
            for (p0 p0Var : this.g) {
                String str = null;
                if (p.a(bVar, b.c.b.a.c.b.f)) {
                    str = this.f1564c.h();
                }
                p0Var.a(this.e, bVar, str);
            }
            this.g.clear();
        }

        /* access modifiers changed from: private */
        public final void m() {
            j();
            d(b.c.b.a.c.b.f);
            p();
            Iterator<d0> it = this.h.values().iterator();
            while (it.hasNext()) {
                d0 next = it.next();
                if (a(next.f1559a.b()) == null) {
                    try {
                        next.f1559a.a(this.d, new g<>());
                    } catch (DeadObjectException unused) {
                        b(1);
                        this.f1564c.i();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            o();
            q();
        }

        /* access modifiers changed from: private */
        public final void n() {
            j();
            this.k = true;
            this.f.c();
            f.this.n.sendMessageDelayed(Message.obtain(f.this.n, 9, this.e), f.this.f1561b);
            f.this.n.sendMessageDelayed(Message.obtain(f.this.n, 11, this.e), f.this.f1562c);
            f.this.g.a();
        }

        private final void o() {
            ArrayList arrayList = new ArrayList(this.f1563b);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                e0 e0Var = (e0) obj;
                if (!this.f1564c.a()) {
                    return;
                }
                if (b(e0Var)) {
                    this.f1563b.remove(e0Var);
                }
            }
        }

        private final void p() {
            if (this.k) {
                f.this.n.removeMessages(11, this.e);
                f.this.n.removeMessages(9, this.e);
                this.k = false;
            }
        }

        private final void q() {
            f.this.n.removeMessages(12, this.e);
            f.this.n.sendMessageDelayed(f.this.n.obtainMessage(12, this.e), f.this.d);
        }

        public final void a() {
            r.a(f.this.n);
            if (!this.f1564c.a() && !this.f1564c.f()) {
                int a2 = f.this.g.a(f.this.e, this.f1564c);
                if (a2 != 0) {
                    a(new b.c.b.a.c.b(a2, null));
                    return;
                }
                b bVar = new b(this.f1564c, this.e);
                if (this.f1564c.k()) {
                    this.j.a(bVar);
                }
                this.f1564c.a(bVar);
            }
        }

        @Override // com.google.android.gms.common.api.internal.k
        public final void a(b.c.b.a.c.b bVar) {
            r.a(f.this.n);
            g0 g0Var = this.j;
            if (g0Var != null) {
                g0Var.r0();
            }
            j();
            f.this.g.a();
            d(bVar);
            if (bVar.d() == 4) {
                a(f.p);
            } else if (this.f1563b.isEmpty()) {
                this.m = bVar;
            } else if (!c(bVar) && !f.this.b(bVar, this.i)) {
                if (bVar.d() == 18) {
                    this.k = true;
                }
                if (this.k) {
                    f.this.n.sendMessageDelayed(Message.obtain(f.this.n, 9, this.e), f.this.f1561b);
                    return;
                }
                String a2 = this.e.a();
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 63 + String.valueOf(valueOf).length());
                sb.append("API: ");
                sb.append(a2);
                sb.append(" is not available on this device. Connection failed with: ");
                sb.append(valueOf);
                a(new Status(17, sb.toString()));
            }
        }

        public final void a(Status status) {
            r.a(f.this.n);
            for (e0 e0Var : this.f1563b) {
                e0Var.a(status);
            }
            this.f1563b.clear();
        }

        public final void a(e0 e0Var) {
            r.a(f.this.n);
            if (!this.f1564c.a()) {
                this.f1563b.add(e0Var);
                b.c.b.a.c.b bVar = this.m;
                if (bVar == null || !bVar.i()) {
                    a();
                } else {
                    a(this.m);
                }
            } else if (b(e0Var)) {
                q();
            } else {
                this.f1563b.add(e0Var);
            }
        }

        public final void a(p0 p0Var) {
            r.a(f.this.n);
            this.g.add(p0Var);
        }

        public final int b() {
            return this.i;
        }

        @Override // com.google.android.gms.common.api.internal.e
        public final void b(int i2) {
            if (Looper.myLooper() == f.this.n.getLooper()) {
                n();
            } else {
                f.this.n.post(new x(this));
            }
        }

        public final void b(b.c.b.a.c.b bVar) {
            r.a(f.this.n);
            this.f1564c.i();
            a(bVar);
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            return this.f1564c.a();
        }

        public final boolean d() {
            return this.f1564c.k();
        }

        public final void e() {
            r.a(f.this.n);
            if (this.k) {
                a();
            }
        }

        @Override // com.google.android.gms.common.api.internal.e
        public final void e(Bundle bundle) {
            if (Looper.myLooper() == f.this.n.getLooper()) {
                m();
            } else {
                f.this.n.post(new w(this));
            }
        }

        public final a.f f() {
            return this.f1564c;
        }

        public final void g() {
            r.a(f.this.n);
            if (this.k) {
                p();
                a(f.this.f.b(f.this.e) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f1564c.i();
            }
        }

        public final void h() {
            r.a(f.this.n);
            a(f.o);
            this.f.b();
            for (j jVar : (j[]) this.h.keySet().toArray(new j[this.h.size()])) {
                a(new o0(jVar, new g()));
            }
            d(new b.c.b.a.c.b(4));
            if (this.f1564c.a()) {
                this.f1564c.a(new z(this));
            }
        }

        public final Map<j<?>, d0> i() {
            return this.h;
        }

        public final void j() {
            r.a(f.this.n);
            this.m = null;
        }

        public final b.c.b.a.c.b k() {
            r.a(f.this.n);
            return this.m;
        }

        public final boolean l() {
            return a(true);
        }
    }

    /* access modifiers changed from: private */
    public class b implements h0, c.AbstractC0073c {

        /* renamed from: a  reason: collision with root package name */
        private final a.f f1565a;

        /* renamed from: b  reason: collision with root package name */
        private final b<?> f1566b;

        /* renamed from: c  reason: collision with root package name */
        private l f1567c = null;
        private Set<Scope> d = null;
        private boolean e = false;

        public b(a.f fVar, b<?> bVar) {
            this.f1565a = fVar;
            this.f1566b = bVar;
        }

        /* access modifiers changed from: private */
        public final void a() {
            l lVar;
            if (this.e && (lVar = this.f1567c) != null) {
                this.f1565a.a(lVar, this.d);
            }
        }

        @Override // com.google.android.gms.common.internal.c.AbstractC0073c
        public final void a(b.c.b.a.c.b bVar) {
            f.this.n.post(new b0(this, bVar));
        }

        @Override // com.google.android.gms.common.api.internal.h0
        public final void a(l lVar, Set<Scope> set) {
            if (lVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new b.c.b.a.c.b(4));
                return;
            }
            this.f1567c = lVar;
            this.d = set;
            a();
        }

        @Override // com.google.android.gms.common.api.internal.h0
        public final void b(b.c.b.a.c.b bVar) {
            ((a) f.this.j.get(this.f1566b)).b(bVar);
        }
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final b<?> f1568a;

        /* renamed from: b  reason: collision with root package name */
        private final d f1569b;

        private c(b<?> bVar, d dVar) {
            this.f1568a = bVar;
            this.f1569b = dVar;
        }

        /* synthetic */ c(b bVar, d dVar, v vVar) {
            this(bVar, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                return p.a(this.f1568a, cVar.f1568a) && p.a(this.f1569b, cVar.f1569b);
            }
        }

        public final int hashCode() {
            return p.a(this.f1568a, this.f1569b);
        }

        public final String toString() {
            p.a a2 = p.a(this);
            a2.a("key", this.f1568a);
            a2.a("feature", this.f1569b);
            return a2.toString();
        }
    }

    private f(Context context, Looper looper, e eVar) {
        this.e = context;
        this.n = new b.c.b.a.e.d.d(looper, this);
        this.f = eVar;
        this.g = new k(eVar);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static f a(Context context) {
        f fVar;
        synchronized (q) {
            if (r == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                r = new f(context.getApplicationContext(), handlerThread.getLooper(), e.a());
            }
            fVar = r;
        }
        return fVar;
    }

    private final void b(com.google.android.gms.common.api.e<?> eVar) {
        b<?> c2 = eVar.c();
        a<?> aVar = this.j.get(c2);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.j.put(c2, aVar);
        }
        if (aVar.d()) {
            this.m.add(c2);
        }
        aVar.a();
    }

    public static void c() {
        synchronized (q) {
            if (r != null) {
                f fVar = r;
                fVar.i.incrementAndGet();
                fVar.n.sendMessageAtFrontOfQueue(fVar.n.obtainMessage(10));
            }
        }
    }

    public final int a() {
        return this.h.getAndIncrement();
    }

    public final void a(b.c.b.a.c.b bVar, int i2) {
        if (!b(bVar, i2)) {
            Handler handler = this.n;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
        }
    }

    public final void a(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d> void a(com.google.android.gms.common.api.e<O> eVar, int i2, d<? extends com.google.android.gms.common.api.k, a.b> dVar) {
        m0 m0Var = new m0(i2, dVar);
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(4, new c0(m0Var, this.i.get(), eVar)));
    }

    public final void b() {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: package-private */
    public final boolean b(b.c.b.a.c.b bVar, int i2) {
        return this.f.a(this.e, bVar, i2);
    }

    public boolean handleMessage(Message message) {
        g<Boolean> gVar;
        boolean z;
        int i2 = message.what;
        long j2 = 300000;
        a<?> aVar = null;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.d = j2;
                this.n.removeMessages(12);
                for (b<?> bVar : this.j.keySet()) {
                    Handler handler = this.n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.d);
                }
                break;
            case 2:
                p0 p0Var = (p0) message.obj;
                Iterator<b<?>> it = p0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b<?> next = it.next();
                        a<?> aVar2 = this.j.get(next);
                        if (aVar2 == null) {
                            p0Var.a(next, new b.c.b.a.c.b(13), null);
                            break;
                        } else if (aVar2.c()) {
                            p0Var.a(next, b.c.b.a.c.b.f, aVar2.f().h());
                        } else if (aVar2.k() != null) {
                            p0Var.a(next, aVar2.k(), null);
                        } else {
                            aVar2.a(p0Var);
                            aVar2.a();
                        }
                    }
                }
            case 3:
                for (a<?> aVar3 : this.j.values()) {
                    aVar3.j();
                    aVar3.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                c0 c0Var = (c0) message.obj;
                a<?> aVar4 = this.j.get(c0Var.f1558c.c());
                if (aVar4 == null) {
                    b(c0Var.f1558c);
                    aVar4 = this.j.get(c0Var.f1558c.c());
                }
                if (!aVar4.d() || this.i.get() == c0Var.f1557b) {
                    aVar4.a(c0Var.f1556a);
                    break;
                } else {
                    c0Var.f1556a.a(o);
                    aVar4.h();
                    break;
                }
            case 5:
                int i3 = message.arg1;
                b.c.b.a.c.b bVar2 = (b.c.b.a.c.b) message.obj;
                Iterator<a<?>> it2 = this.j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a<?> next2 = it2.next();
                        if (next2.b() == i3) {
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    String a2 = this.f.a(bVar2.d());
                    String e2 = bVar2.e();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 69 + String.valueOf(e2).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(a2);
                    sb.append(": ");
                    sb.append(e2);
                    aVar.a(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i3);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (com.google.android.gms.common.util.l.a() && (this.e.getApplicationContext() instanceof Application)) {
                    c.a((Application) this.e.getApplicationContext());
                    c.b().a(new v(this));
                    if (!c.b().a(true)) {
                        this.d = 300000;
                        break;
                    }
                }
                break;
            case 7:
                b((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.j.containsKey(message.obj)) {
                    this.j.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (b<?> bVar3 : this.m) {
                    this.j.remove(bVar3).h();
                }
                this.m.clear();
                break;
            case 11:
                if (this.j.containsKey(message.obj)) {
                    this.j.get(message.obj).g();
                    break;
                }
                break;
            case 12:
                if (this.j.containsKey(message.obj)) {
                    this.j.get(message.obj).l();
                    break;
                }
                break;
            case 14:
                s sVar = (s) message.obj;
                b<?> a3 = sVar.a();
                if (!this.j.containsKey(a3)) {
                    gVar = sVar.b();
                    z = false;
                } else {
                    boolean a4 = this.j.get(a3).a((a) false);
                    gVar = sVar.b();
                    z = Boolean.valueOf(a4);
                }
                gVar.a(z);
                break;
            case 15:
                c cVar = (c) message.obj;
                if (this.j.containsKey(cVar.f1568a)) {
                    this.j.get(cVar.f1568a).a((a) cVar);
                    break;
                }
                break;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.j.containsKey(cVar2.f1568a)) {
                    this.j.get(cVar2.f1568a).b((a) cVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
