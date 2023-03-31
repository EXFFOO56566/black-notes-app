package com.google.android.gms.internal.ads;

import android.view.View;

public final class xz implements r42<View> {

    /* renamed from: a  reason: collision with root package name */
    private final uz f5515a;

    public xz(uz uzVar) {
        this.f5515a = uzVar;
    }

    public static View a(uz uzVar) {
        View b2 = uzVar.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5515a);
    }
}
