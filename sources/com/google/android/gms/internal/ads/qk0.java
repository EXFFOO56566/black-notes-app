package com.google.android.gms.internal.ads;

public final class qk0 implements r42<jt0<ck0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f4348a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f4349b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<yw0> f4350c;
    private final e52<ux0> d;

    public qk0(e52<sh1> e52, e52<ko1> e522, e52<yw0> e523, e52<ux0> e524) {
        this.f4348a = e52;
        this.f4349b = e522;
        this.f4350c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        yx0 yx0 = new yx0(this.f4348a.get(), this.f4349b.get(), this.d.get(), this.f4350c.get());
        y42.a(yx0, "Cannot return null from a non-@Nullable @Provides method");
        return yx0;
    }
}
