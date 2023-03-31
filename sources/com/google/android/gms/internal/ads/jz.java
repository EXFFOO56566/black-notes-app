package com.google.android.gms.internal.ads;

public final class jz implements r42<v9> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<q9> f3296a;

    private jz(e52<q9> e52) {
        this.f3296a = e52;
    }

    public static jz a(e52<q9> e52) {
        return new jz(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        v9 a2 = this.f3296a.get().a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
