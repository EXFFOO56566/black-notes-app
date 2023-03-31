package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class st0 implements jt0<n00> {

    /* renamed from: a  reason: collision with root package name */
    private final k10 f4702a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4703b;

    /* renamed from: c  reason: collision with root package name */
    private final pk0 f4704c;
    private final zd1 d;
    private final Executor e;
    private final xk1<id1, xl> f;

    public st0(k10 k10, Context context, Executor executor, pk0 pk0, zd1 zd1, xk1<id1, xl> xk1) {
        this.f4703b = context;
        this.f4702a = k10;
        this.e = executor;
        this.f4704c = pk0;
        this.d = zd1;
        this.f = xk1;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<n00> a(vd1 vd1, id1 id1) {
        return yn1.a(yn1.a((Object) null), new vt0(this, vd1, id1), this.e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(vd1 vd1, id1 id1, Object obj) {
        um2 a2 = ce1.a(this.f4703b, id1.r);
        ws a3 = this.f4704c.a(a2);
        a3.f(id1.M);
        k10 k10 = this.f4702a;
        d30 d30 = new d30(vd1, id1, null);
        hl0 hl0 = new hl0(this.f4703b, a3.getView(), this.f.a(id1));
        a3.getClass();
        m00 a4 = k10.a(d30, new r00(hl0, a3, ut0.a(a3), ce1.a(a2)));
        a4.h().a(a3, false);
        a4.d().a(new xt0(a3), jo.f);
        a4.h();
        md1 md1 = id1.p;
        lo1<?> a5 = sk0.a(a3, md1.f3693b, md1.f3692a);
        if (id1.E) {
            a3.getClass();
            a5.a(wt0.a(a3), this.e);
        }
        a5.a(new zt0(this, a3), this.e);
        return yn1.a(a5, new yt0(a4), jo.f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ws wsVar) {
        wsVar.x();
        rt i = wsVar.i();
        er2 er2 = this.d.f5737b;
        if (er2 != null && i != null) {
            i.b(er2);
        }
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        md1 md1 = id1.p;
        return (md1 == null || md1.f3692a == null) ? false : true;
    }
}
