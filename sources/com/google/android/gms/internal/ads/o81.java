package com.google.android.gms.internal.ads;

public final class o81 implements r42<m81> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<zj> f3960a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f3961b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<String> f3962c;

    public o81(e52<zj> e52, e52<ko1> e522, e52<String> e523) {
        this.f3960a = e52;
        this.f3961b = e522;
        this.f3962c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new m81(this.f3960a.get(), this.f3961b.get(), this.f3962c.get());
    }
}
