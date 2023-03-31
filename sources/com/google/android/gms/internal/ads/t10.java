package com.google.android.gms.internal.ads;

public final class t10 implements r42<jt0<n00>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f4738a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f4739b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<gu0> f4740c;
    private final e52<ux0> d;

    public t10(e52<sh1> e52, e52<ko1> e522, e52<gu0> e523, e52<ux0> e524) {
        this.f4738a = e52;
        this.f4739b = e522;
        this.f4740c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        yx0 yx0 = new yx0(this.f4738a.get(), this.f4739b.get(), this.d.get(), this.f4740c.get());
        y42.a(yx0, "Cannot return null from a non-@Nullable @Provides method");
        return yx0;
    }
}
