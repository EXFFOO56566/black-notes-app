package com.google.android.gms.internal.ads;

public final class l50 implements r42<String> {

    /* renamed from: a  reason: collision with root package name */
    private final g50 f3496a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<y30> f3497b;

    private l50(g50 g50, e52<y30> e52) {
        this.f3496a = g50;
        this.f3497b = e52;
    }

    public static l50 a(g50 g50, e52<y30> e52) {
        return new l50(g50, e52);
    }

    public static String a(g50 g50, y30 y30) {
        String a2 = y30.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f3496a, this.f3497b.get());
    }
}
