package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ik2;

public final class d00 implements r42<ik2.a> {
    public static d00 a() {
        return c00.a();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ik2.a aVar = ik2.a.APP_OPEN;
        y42.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
