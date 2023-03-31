package com.google.android.gms.internal.ads;

public final class sy0<AdT> implements r42<oy0<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f4724a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f4725b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<u> f4726c;
    private final e52<py0<AdT>> d;

    public sy0(e52<sh1> e52, e52<ko1> e522, e52<u> e523, e52<py0<AdT>> e524) {
        this.f4724a = e52;
        this.f4725b = e522;
        this.f4726c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new oy0(this.f4724a.get(), this.f4725b.get(), this.f4726c.get(), this.d.get());
    }
}
