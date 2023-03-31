package com.google.android.gms.internal.ads;

public final class in0 implements r42<jn0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<rn0> f3113a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zn0> f3114b;

    private in0(e52<rn0> e52, e52<zn0> e522) {
        this.f3113a = e52;
        this.f3114b = e522;
    }

    public static in0 a(e52<rn0> e52, e52<zn0> e522) {
        return new in0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new jn0(this.f3113a.get(), this.f3114b.get());
    }
}
