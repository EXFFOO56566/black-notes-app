package com.google.android.gms.internal.ads;

public final class md0 implements r42<nd0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<m60> f3690a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<id1> f3691b;

    private md0(e52<m60> e52, e52<id1> e522) {
        this.f3690a = e52;
        this.f3691b = e522;
    }

    public static md0 a(e52<m60> e52, e52<id1> e522) {
        return new md0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new nd0(this.f3690a.get(), this.f3691b.get());
    }
}
