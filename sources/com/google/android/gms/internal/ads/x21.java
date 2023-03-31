package com.google.android.gms.internal.ads;

public final class x21 implements r42<v21> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f5356a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<String> f5357b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<y30> f5358c;
    private final e52<te1> d;
    private final e52<zd1> e;

    private x21(e52<String> e52, e52<String> e522, e52<y30> e523, e52<te1> e524, e52<zd1> e525) {
        this.f5356a = e52;
        this.f5357b = e522;
        this.f5358c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static x21 a(e52<String> e52, e52<String> e522, e52<y30> e523, e52<te1> e524, e52<zd1> e525) {
        return new x21(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new v21(this.f5356a.get(), this.f5357b.get(), this.f5358c.get(), this.d.get(), this.e.get());
    }
}
