package com.google.android.gms.internal.ads;

public final class r51 implements r42<s51> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f4448a;

    private r51(e52<String> e52) {
        this.f4448a = e52;
    }

    public static r51 a(e52<String> e52) {
        return new r51(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new s51(this.f4448a.get());
    }
}
