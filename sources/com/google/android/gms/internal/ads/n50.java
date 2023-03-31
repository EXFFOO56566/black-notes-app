package com.google.android.gms.internal.ads;

public final class n50 implements r42<zd1> {

    /* renamed from: a  reason: collision with root package name */
    private final g50 f3798a;

    private n50(g50 g50) {
        this.f3798a = g50;
    }

    public static n50 a(g50 g50) {
        return new n50(g50);
    }

    public static zd1 b(g50 g50) {
        zd1 b2 = g50.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f3798a);
    }
}
