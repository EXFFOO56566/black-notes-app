package com.google.android.gms.internal.ads;

import java.util.List;

public final class vp0 implements r42<List<String>> {
    public static vp0 a() {
        return up0.a();
    }

    public static List<String> b() {
        List<String> a2 = zr2.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b();
    }
}
