package com.google.android.gms.internal.ads;

public final class dd0 implements r42<String> {
    public static dd0 a() {
        return gd0.a();
    }

    public static String b() {
        y42.a("interstitial", "Cannot return null from a non-@Nullable @Provides method");
        return "interstitial";
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b();
    }
}
