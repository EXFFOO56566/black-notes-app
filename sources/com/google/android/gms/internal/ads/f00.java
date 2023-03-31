package com.google.android.gms.internal.ads;

public final class f00 implements r42<String> {
    public static f00 a() {
        return e00.a();
    }

    public static String b() {
        y42.a("app_open_ad", "Cannot return null from a non-@Nullable @Provides method");
        return "app_open_ad";
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b();
    }
}
