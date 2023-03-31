package com.google.android.gms.internal.ads;

public final class f30 implements r42<String> {

    /* renamed from: a  reason: collision with root package name */
    private final d30 f2524a;

    private f30(d30 d30) {
        this.f2524a = d30;
    }

    public static f30 a(d30 d30) {
        return new f30(d30);
    }

    public static String b(d30 d30) {
        String c2 = d30.c();
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f2524a);
    }
}
