package com.google.android.gms.internal.ads;

public final class e20 implements r42<f20> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<id1> f2356a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<m60> f2357b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<p70> f2358c;

    private e20(e52<id1> e52, e52<m60> e522, e52<p70> e523) {
        this.f2356a = e52;
        this.f2357b = e522;
        this.f2358c = e523;
    }

    public static e20 a(e52<id1> e52, e52<m60> e522, e52<p70> e523) {
        return new e20(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new f20(this.f2356a.get(), this.f2357b.get(), this.f2358c.get());
    }
}
