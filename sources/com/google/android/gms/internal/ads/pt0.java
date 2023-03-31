package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class pt0 implements jt0<h00> {

    /* renamed from: a  reason: collision with root package name */
    private final b00 f4229a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4230b;

    /* renamed from: c  reason: collision with root package name */
    private final pk0 f4231c;
    private final Executor d;

    public pt0(b00 b00, Context context, Executor executor, pk0 pk0, zd1 zd1) {
        this.f4230b = context;
        this.f4229a = b00;
        this.d = executor;
        this.f4231c = pk0;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<h00> a(vd1 vd1, id1 id1) {
        return yn1.a(yn1.a((Object) null), new ot0(this, vd1, id1), this.d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(vd1 vd1, id1 id1, Object obj) {
        um2 a2 = ce1.a(this.f4230b, id1.r);
        ws a3 = this.f4231c.a(a2);
        vz a4 = this.f4229a.a(new d30(vd1, id1, null), new uz(a3.getView(), a3, ce1.a(a2), id1.R, id1.V, id1.F));
        a4.i().a(a3, false);
        a4.d().a(new rt0(a3), jo.f);
        a4.i();
        md1 md1 = id1.p;
        return yn1.a(sk0.a(a3, md1.f3693b, md1.f3692a), new qt0(a4), jo.f);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        md1 md1 = id1.p;
        return (md1 == null || md1.f3692a == null) ? false : true;
    }
}
