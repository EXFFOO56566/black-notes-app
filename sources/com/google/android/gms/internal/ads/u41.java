package com.google.android.gms.internal.ads;

public final class u41 implements r42<s41> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f4899a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<gd1> f4900b;

    private u41(e52<ko1> e52, e52<gd1> e522) {
        this.f4899a = e52;
        this.f4900b = e522;
    }

    public static u41 a(e52<ko1> e52, e52<gd1> e522) {
        return new u41(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new s41(this.f4899a.get(), this.f4900b.get());
    }
}
