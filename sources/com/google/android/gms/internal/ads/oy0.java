package com.google.android.gms.internal.ads;

public final class oy0<AdT> implements jt0<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final u f4067a;

    /* renamed from: b  reason: collision with root package name */
    private final ko1 f4068b;

    /* renamed from: c  reason: collision with root package name */
    private final sh1 f4069c;
    private final py0<AdT> d;

    public oy0(sh1 sh1, ko1 ko1, u uVar, py0<AdT> py0) {
        this.f4069c = sh1;
        this.f4068b = ko1;
        this.f4067a = uVar;
        this.d = py0;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<AdT> a(vd1 vd1, id1 id1) {
        ro roVar = new ro();
        wy0 wy0 = new wy0();
        wy0.a(new qy0(this, roVar, vd1, id1, wy0));
        md1 md1 = id1.p;
        return this.f4069c.a(ph1.CUSTOM_RENDER_SYN).a(new ny0(this, new r(wy0, md1.f3693b, md1.f3692a)), this.f4068b).a(ph1.CUSTOM_RENDER_ACK).a((lo1) roVar).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(r rVar) {
        this.f4067a.a(rVar);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        md1 md1;
        return (this.f4067a == null || (md1 = id1.p) == null || md1.f3692a == null) ? false : true;
    }
}
