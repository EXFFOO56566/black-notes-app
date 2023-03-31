package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ik2;

public final class o10 implements r42<ik2.a> {
    public static o10 a() {
        return n10.a();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ik2.a aVar = ik2.a.BANNER;
        y42.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
