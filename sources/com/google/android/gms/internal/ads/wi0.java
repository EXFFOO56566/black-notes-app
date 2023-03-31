package com.google.android.gms.internal.ads;

public final class wi0 implements r42<vi0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<xe0> f5276a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<if0> f5277b;

    private wi0(e52<xe0> e52, e52<if0> e522) {
        this.f5276a = e52;
        this.f5277b = e522;
    }

    public static wi0 a(e52<xe0> e52, e52<if0> e522) {
        return new wi0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new vi0(this.f5276a.get(), this.f5277b.get());
    }
}
