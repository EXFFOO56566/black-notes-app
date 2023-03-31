package com.google.android.gms.internal.ads;

public final class ps0 implements r42<os0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ms0> f4225a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f4226b;

    private ps0(e52<ms0> e52, e52<ko1> e522) {
        this.f4225a = e52;
        this.f4226b = e522;
    }

    public static ps0 a(e52<ms0> e52, e52<ko1> e522) {
        return new ps0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new os0(this.f4225a.get(), this.f4226b.get());
    }
}
