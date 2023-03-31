package com.google.android.gms.internal.ads;

import android.content.Context;

public final class qv implements r42<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final nv f4396a;

    public qv(nv nvVar) {
        this.f4396a = nvVar;
    }

    public static Context a(nv nvVar) {
        Context a2 = nvVar.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f4396a);
    }
}
