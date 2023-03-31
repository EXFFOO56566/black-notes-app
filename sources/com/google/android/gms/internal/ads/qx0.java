package com.google.android.gms.internal.ads;

final class qx0 implements ob0 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ vd1 f4410a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ id1 f4411b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ lt0 f4412c;
    final /* synthetic */ ox0 d;

    qx0(ox0 ox0, vd1 vd1, id1 id1, lt0 lt0) {
        this.d = ox0;
        this.f4410a = vd1;
        this.f4411b = id1;
        this.f4412c = lt0;
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final void U() {
        this.d.f4063b.execute(new tx0(this, this.f4410a, this.f4411b, this.f4412c));
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final void a(int i) {
        String valueOf = String.valueOf(this.f4412c.f3599a);
        co.d(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }
}
