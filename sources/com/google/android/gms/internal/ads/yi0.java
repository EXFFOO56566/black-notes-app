package com.google.android.gms.internal.ads;

public final class yi0 implements r42<zi0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f5599a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<xe0> f5600b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<if0> f5601c;

    private yi0(e52<String> e52, e52<xe0> e522, e52<if0> e523) {
        this.f5599a = e52;
        this.f5600b = e522;
        this.f5601c = e523;
    }

    public static yi0 a(e52<String> e52, e52<xe0> e522, e52<if0> e523) {
        return new yi0(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new zi0(this.f5599a.get(), this.f5600b.get(), this.f5601c.get());
    }
}
