package com.google.android.gms.internal.ads;

public final class aj0 implements r42<bj0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f1769a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<xe0> f1770b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<if0> f1771c;

    private aj0(e52<String> e52, e52<xe0> e522, e52<if0> e523) {
        this.f1769a = e52;
        this.f1770b = e522;
        this.f1771c = e523;
    }

    public static aj0 a(e52<String> e52, e52<xe0> e522, e52<if0> e523) {
        return new aj0(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new bj0(this.f1769a.get(), this.f1770b.get(), this.f1771c.get());
    }
}
