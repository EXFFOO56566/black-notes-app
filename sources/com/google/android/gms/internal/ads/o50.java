package com.google.android.gms.internal.ads;

public final class o50 implements r42<p50> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<id1> f3946a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<String> f3947b;

    private o50(e52<id1> e52, e52<String> e522) {
        this.f3946a = e52;
        this.f3947b = e522;
    }

    public static o50 a(e52<id1> e52, e52<String> e522) {
        return new o50(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new p50(this.f3946a.get(), this.f3947b.get());
    }
}
