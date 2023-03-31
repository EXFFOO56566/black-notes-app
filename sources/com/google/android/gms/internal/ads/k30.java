package com.google.android.gms.internal.ads;

public final class k30 implements r42<h30> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<v60> f3314a;

    private k30(e52<v60> e52) {
        this.f3314a = e52;
    }

    public static k30 a(e52<v60> e52) {
        return new k30(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new h30(this.f3314a.get());
    }
}
