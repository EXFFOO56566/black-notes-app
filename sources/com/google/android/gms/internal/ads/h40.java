package com.google.android.gms.internal.ads;

public final class h40 implements r42<n20> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<vd1> f2853a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<id1> f2854b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<p60> f2855c;
    private final e52<g70> d;
    private final e52<jb1> e;
    private final e52<p50> f;

    private h40(e52<vd1> e52, e52<id1> e522, e52<p60> e523, e52<g70> e524, e52<jb1> e525, e52<p50> e526) {
        this.f2853a = e52;
        this.f2854b = e522;
        this.f2855c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    public static h40 a(e52<vd1> e52, e52<id1> e522, e52<p60> e523, e52<g70> e524, e52<jb1> e525, e52<p50> e526) {
        return new h40(e52, e522, e523, e524, e525, e526);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new n20(this.f2853a.get(), this.f2854b.get(), this.f2855c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
