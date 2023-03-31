package com.google.android.gms.internal.ads;

public final class x00 implements r42<l20> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f5341a;

    public x00(r00 r00) {
        this.f5341a = r00;
    }

    public static l20 a(r00 r00) {
        l20 c2 = r00.c();
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5341a);
    }
}
