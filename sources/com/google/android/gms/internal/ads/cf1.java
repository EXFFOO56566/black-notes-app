package com.google.android.gms.internal.ads;

public final class cf1 implements r42<ye1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<we1> f2108a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<String> f2109b;

    private cf1(af1 af1, e52<we1> e52, e52<String> e522) {
        this.f2108a = e52;
        this.f2109b = e522;
    }

    public static cf1 a(af1 af1, e52<we1> e52, e52<String> e522) {
        return new cf1(af1, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ye1 a2 = this.f2108a.get().a(this.f2109b.get());
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
