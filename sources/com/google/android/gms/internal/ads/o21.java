package com.google.android.gms.internal.ads;

public final class o21 implements r42<m21> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f3934a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f3935b;

    private o21(e52<ko1> e52, e52<zd1> e522) {
        this.f3934a = e52;
        this.f3935b = e522;
    }

    public static o21 a(e52<ko1> e52, e52<zd1> e522) {
        return new o21(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new m21(this.f3934a.get(), this.f3935b.get());
    }
}
