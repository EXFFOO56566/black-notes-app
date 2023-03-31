package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class ex0 implements jt0<ck0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2497a;

    /* renamed from: b  reason: collision with root package name */
    private final pk0 f2498b;

    /* renamed from: c  reason: collision with root package name */
    private final fk0 f2499c;
    private final zd1 d;
    private final Executor e;
    private final fo f;

    public ex0(Context context, fo foVar, zd1 zd1, Executor executor, fk0 fk0, pk0 pk0) {
        this.f2497a = context;
        this.d = zd1;
        this.f2499c = fk0;
        this.e = executor;
        this.f = foVar;
        this.f2498b = pk0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(id1 id1, gl0 gl0, vd1 vd1, Object obj) {
        lo1<?> lo1;
        ws a2 = this.f2498b.a(this.d.e, id1.P);
        a2.f(id1.M);
        gl0.a(this.f2497a, a2.getView());
        ro roVar = new ro();
        ek0 a3 = this.f2499c.a(new d30(vd1, id1, null), new dk0(new kx0(this.f2497a, this.f2498b, this.d, this.f, id1, roVar, a2), a2));
        roVar.b(a3);
        o5.a(a2, a3.l());
        a3.d().a(new jx0(a2), jo.f);
        a3.h().a(a2, true);
        if (!((Boolean) on2.e().a(zr2.e3)).booleanValue() || !id1.P) {
            a3.h();
            md1 md1 = id1.p;
            lo1 = sk0.a(a2, md1.f3693b, md1.f3692a);
        } else {
            lo1 = yn1.a((Object) null);
        }
        return yn1.a(lo1, new ix0(this, a2, id1, a3), this.e);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<ck0> a(vd1 vd1, id1 id1) {
        gl0 gl0 = new gl0();
        lo1<ck0> a2 = yn1.a(yn1.a((Object) null), new hx0(this, id1, gl0, vd1), this.e);
        gl0.getClass();
        a2.a(gx0.a(gl0), this.e);
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        md1 md1 = id1.p;
        return (md1 == null || md1.f3692a == null) ? false : true;
    }
}
