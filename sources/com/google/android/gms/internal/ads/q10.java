package com.google.android.gms.internal.ads;

public final class q10 implements r42<String> {
    public static q10 a() {
        return p10.a();
    }

    public static String b() {
        y42.a("banner", "Cannot return null from a non-@Nullable @Provides method");
        return "banner";
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b();
    }
}
