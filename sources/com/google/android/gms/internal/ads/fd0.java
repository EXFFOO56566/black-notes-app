package com.google.android.gms.internal.ads;

public final class fd0 implements r42<jt0<ac0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f2576a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f2577b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<jv0> f2578c;
    private final e52<ux0> d;

    public fd0(e52<sh1> e52, e52<ko1> e522, e52<jv0> e523, e52<ux0> e524) {
        this.f2576a = e52;
        this.f2577b = e522;
        this.f2578c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        yx0 yx0 = new yx0(this.f2576a.get(), this.f2577b.get(), this.d.get(), this.f2578c.get());
        y42.a(yx0, "Cannot return null from a non-@Nullable @Provides method");
        return yx0;
    }
}
