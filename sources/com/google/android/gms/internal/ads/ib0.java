package com.google.android.gms.internal.ads;

public final class ib0 implements r42<jb0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<id1> f3053a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ci1> f3054b;

    private ib0(e52<id1> e52, e52<ci1> e522) {
        this.f3053a = e52;
        this.f3054b = e522;
    }

    public static ib0 a(e52<id1> e52, e52<ci1> e522) {
        return new ib0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new jb0(this.f3053a.get(), this.f3054b.get());
    }
}
