package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class pv implements r42<WeakReference<Context>> {

    /* renamed from: a  reason: collision with root package name */
    private final nv f4235a;

    public pv(nv nvVar) {
        this.f4235a = nvVar;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        WeakReference<Context> b2 = this.f4235a.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
