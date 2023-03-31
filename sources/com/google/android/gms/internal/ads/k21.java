package com.google.android.gms.internal.ads;

public final class k21 implements r42<h21> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f3311a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f3312b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<rl0> f3313c;

    private k21(e52<String> e52, e52<ko1> e522, e52<rl0> e523) {
        this.f3311a = e52;
        this.f3312b = e522;
        this.f3313c = e523;
    }

    public static k21 a(e52<String> e52, e52<ko1> e522, e52<rl0> e523) {
        return new k21(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new h21(this.f3311a.get(), this.f3312b.get(), this.f3313c.get());
    }
}
