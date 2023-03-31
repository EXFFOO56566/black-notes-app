package com.google.android.gms.internal.ads;

public final class ef1 implements r42<tk> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ye1> f2416a;

    private ef1(af1 af1, e52<ye1> e52) {
        this.f2416a = e52;
    }

    public static ef1 a(af1 af1, e52<ye1> e52) {
        return new ef1(af1, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        tk tkVar = this.f2416a.get().f5583c;
        y42.a(tkVar, "Cannot return null from a non-@Nullable @Provides method");
        return tkVar;
    }
}
