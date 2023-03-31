package com.google.android.gms.internal.ads;

public final class hj0 implements r42<ej0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f2924a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<xe0> f2925b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<if0> f2926c;

    private hj0(e52<String> e52, e52<xe0> e522, e52<if0> e523) {
        this.f2924a = e52;
        this.f2925b = e522;
        this.f2926c = e523;
    }

    public static hj0 a(e52<String> e52, e52<xe0> e522, e52<if0> e523) {
        return new hj0(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ej0(this.f2924a.get(), this.f2925b.get(), this.f2926c.get());
    }
}
