package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

final class pw extends r71 {

    /* renamed from: a  reason: collision with root package name */
    private final b91 f4240a;

    /* renamed from: b  reason: collision with root package name */
    private e52<m71> f4241b;

    /* renamed from: c  reason: collision with root package name */
    private e52<String> f4242c;
    private e52<x71> d;
    private e52<Integer> e;
    private e52<b81> f;
    private e52<h81> g;
    private e52<m81> h;
    private e52<Boolean> i;
    private e52<ApplicationInfo> j;
    private e52<w81> k;
    private e52<a91> l;
    private e52<o91> m;
    private e52<String> n;
    private e52<fn0> o;
    private e52<fn0> p;
    private e52<fn0> q;
    private e52<fn0> r;
    private e52<Map<ph1, fn0>> s;
    private e52<Set<ab0<zh1>>> t;
    private e52<Set<ab0<zh1>>> u;
    private e52 v;
    private e52<sh1> w;
    private final /* synthetic */ iw x;

    private pw(iw iwVar, b91 b91) {
        this.x = iwVar;
        this.f4240a = b91;
        this.f4241b = new n71(hy.f2992a, this.x.k, this.x.f, qg1.a());
        this.f4242c = new e91(b91);
        this.d = new z71(zv.a(), this.x.k, this.f4242c, qg1.a());
        this.e = new f91(b91);
        this.f = new f81(hy.f2992a, this.e, this.x.k, this.x.D, this.x.f, qg1.a());
        this.g = new j81(by.f2028a, qg1.a(), this.x.k);
        this.h = new o81(dy.f2331a, qg1.a(), this.f4242c);
        this.i = new g91(b91);
        this.j = new d91(b91);
        this.k = new y81(this.x.F, this.x.f, this.i, this.j);
        this.l = new c91(fy.f2672a, this.x.f, this.x.k);
        this.m = new r91(qg1.a());
        this.n = new i91(b91);
        this.o = t42.a(um0.a());
        this.p = t42.a(rm0.a());
        this.q = t42.a(wm0.a());
        this.r = t42.a(ym0.a());
        w42 a2 = u42.a(4);
        a2.a(ph1.GMS_SIGNALS, this.o);
        w42 w42 = a2;
        w42.a(ph1.BUILD_URL, this.p);
        w42 w422 = w42;
        w422.a(ph1.HTTP, this.q);
        w42 w423 = w422;
        w423.a(ph1.PRE_PROCESS, this.r);
        this.s = w423.a();
        this.t = t42.a(new an0(this.n, this.x.k, qg1.a(), this.s));
        c52 a3 = a52.a(0, 1);
        a3.b(this.t);
        a52 a4 = a3.a();
        this.u = a4;
        this.v = bi1.a(a4);
        this.w = t42.a(xh1.a(qg1.a(), this.x.f, this.v));
    }

    private final r81 d() {
        ir2 ir2 = new ir2();
        y42.a(ir2, "Cannot return null from a non-@Nullable @Provides method");
        ko1 b2 = qg1.b();
        List<String> e2 = this.f4240a.e();
        y42.a(e2, "Cannot return null from a non-@Nullable @Provides method");
        return new r81(ir2, b2, e2);
    }

    private final t71 e() {
        dk a2 = ey.a();
        ko1 b2 = qg1.b();
        String b3 = this.f4240a.b();
        y42.a(b3, "Cannot return null from a non-@Nullable @Provides method");
        return new t71(a2, b2, b3, this.f4240a.c());
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final x61<JSONObject> a() {
        ko1 b2 = qg1.b();
        g51 g51 = new g51(new m81(ay.a(), qg1.b(), e91.a(this.f4240a)), 0, (ScheduledExecutorService) this.x.f.get());
        y42.a(g51, "Cannot return null from a non-@Nullable @Provides method");
        g51 g512 = g51;
        g51 g513 = new g51(new w81(mx.a(this.x.f3139b), (ScheduledExecutorService) this.x.f.get(), this.f4240a.d(), d91.a(this.f4240a)), ((Long) on2.e().a(zr2.C1)).longValue(), (ScheduledExecutorService) this.x.f.get());
        y42.a(g513, "Cannot return null from a non-@Nullable @Provides method");
        g51 g514 = new g51(new a91(cy.a(), (ScheduledExecutorService) this.x.f.get(), qv.a(this.x.f3140c)), ((Long) on2.e().a(zr2.H1)).longValue(), (ScheduledExecutorService) this.x.f.get());
        y42.a(g514, "Cannot return null from a non-@Nullable @Provides method");
        g51 g515 = new g51(new m71(ey.a(), qv.a(this.x.f3140c), (ScheduledExecutorService) this.x.f.get(), qg1.b()), 0, (ScheduledExecutorService) this.x.f.get());
        y42.a(g515, "Cannot return null from a non-@Nullable @Provides method");
        g51 g516 = new g51(new o91(qg1.b()), 0, (ScheduledExecutorService) this.x.f.get());
        y42.a(g516, "Cannot return null from a non-@Nullable @Provides method");
        y61<? extends v61<JSONObject>> a2 = h91.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return c71.a(b2, cm1.a(g512, g513, g514, g515, g516, a2, new x71(null, qv.a(this.x.f3140c), e91.a(this.f4240a), qg1.b()), new h81(yx.a(), qg1.b(), qv.a(this.x.f3140c)), d(), e(), new b81(ey.a(), this.f4240a.h(), qv.a(this.x.f3140c), (ik) this.x.D.get(), (ScheduledExecutorService) this.x.f.get(), qg1.b()), (y61) this.x.E.get()));
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final x61<JSONObject> b() {
        return m91.a(ay.a(), this.x.E.get(), e(), d(), t42.b(this.f4241b), t42.b(this.d), t42.b(this.f), t42.b(this.g), t42.b(this.h), t42.b(this.k), t42.b(this.l), t42.b(this.m), qg1.b(), (ScheduledExecutorService) this.x.f.get());
    }

    @Override // com.google.android.gms.internal.ads.r71
    public final sh1 c() {
        return this.w.get();
    }
}
