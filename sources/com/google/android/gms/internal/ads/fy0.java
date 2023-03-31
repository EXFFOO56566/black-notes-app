package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class fy0 implements jt0<n00> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2673a;

    /* renamed from: b  reason: collision with root package name */
    private final k10 f2674b;

    /* renamed from: c  reason: collision with root package name */
    private final u f2675c;
    private final ko1 d;
    private final sh1 e;

    public fy0(Context context, k10 k10, sh1 sh1, ko1 ko1, u uVar) {
        this.f2673a = context;
        this.f2674b = k10;
        this.e = sh1;
        this.d = ko1;
        this.f2675c = uVar;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<n00> a(vd1 vd1, id1 id1) {
        m00 a2 = this.f2674b.a(new d30(vd1, id1, null), new ky0(this, new View(this.f2673a), null, iy0.f3149a, id1.r.get(0)));
        jy0 k = a2.k();
        md1 md1 = id1.p;
        return this.e.a(ph1.CUSTOM_RENDER_SYN).a(new hy0(this, new r(k, md1.f3693b, md1.f3692a)), this.d).a(ph1.CUSTOM_RENDER_ACK).a((lo1) yn1.a(a2.i())).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(r rVar) {
        this.f2675c.a(rVar);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        md1 md1;
        return (this.f2675c == null || (md1 = id1.p) == null || md1.f3692a == null) ? false : true;
    }
}
