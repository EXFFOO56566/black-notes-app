package com.google.android.gms.internal.ads;

public final class qg1 implements r42<ko1> {
    public static qg1 a() {
        return tg1.a();
    }

    public static ko1 b() {
        ko1 ko1 = jo.f3256a;
        y42.a(ko1, "Cannot return null from a non-@Nullable @Provides method");
        return ko1;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b();
    }
}
