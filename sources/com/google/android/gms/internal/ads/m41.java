package com.google.android.gms.internal.ads;

public final class m41 implements r42<j41> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f3658a;

    private m41(e52<ko1> e52) {
        this.f3658a = e52;
    }

    public static m41 a(e52<ko1> e52) {
        return new m41(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new j41(this.f3658a.get());
    }
}
