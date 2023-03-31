package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ik2;

public final class ae0 implements r42<ik2.a> {
    public static ae0 a() {
        return de0.f2245a;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ik2.a aVar = ik2.a.AD_LOADER;
        y42.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
