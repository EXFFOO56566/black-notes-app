package com.google.android.gms.internal.ads;

public final class sm0 implements r42<lm0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<wj2> f4679a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<tb1> f4680b;

    private sm0(e52<wj2> e52, e52<tb1> e522) {
        this.f4679a = e52;
        this.f4680b = e522;
    }

    public static sm0 a(e52<wj2> e52, e52<tb1> e522) {
        return new sm0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new lm0(this.f4679a.get(), this.f4680b.get());
    }
}
