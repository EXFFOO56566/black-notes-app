package com.google.android.gms.internal.ads;

public final class xc0 implements r42<yc0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<t70> f5405a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<wa0> f5406b;

    private xc0(e52<t70> e52, e52<wa0> e522) {
        this.f5405a = e52;
        this.f5406b = e522;
    }

    public static xc0 a(e52<t70> e52, e52<wa0> e522) {
        return new xc0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new yc0(this.f5405a.get(), this.f5406b.get());
    }
}
