package com.google.android.gms.internal.ads;

public final class og1 implements r42<ko1> {
    public static og1 a() {
        return rg1.a();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ko1 ko1;
        if (((Boolean) on2.e().a(zr2.C2)).booleanValue()) {
            ko1 = jo.f3258c;
        } else {
            ko1 = ((Boolean) on2.e().a(zr2.B2)).booleanValue() ? jo.f3256a : jo.e;
        }
        y42.a(ko1, "Cannot return null from a non-@Nullable @Provides method");
        return ko1;
    }
}
