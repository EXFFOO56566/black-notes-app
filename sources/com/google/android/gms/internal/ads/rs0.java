package com.google.android.gms.internal.ads;

public final class rs0 implements r42<ss0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<xs0> f4541a;

    private rs0(e52<xs0> e52) {
        this.f4541a = e52;
    }

    public static rs0 a(e52<xs0> e52) {
        return new rs0(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ss0(this.f4541a.get());
    }
}
