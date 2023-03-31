package com.google.android.gms.internal.ads;

public final class xv implements r42<ke1<jj0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<uj0> f5498a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f5499b;

    public xv(e52<uj0> e52, e52<ko1> e522) {
        this.f5498a = e52;
        this.f5499b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ke1 ke1 = new ke1(this.f5498a.get(), this.f5499b.get());
        y42.a(ke1, "Cannot return null from a non-@Nullable @Provides method");
        return ke1;
    }
}
