package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

public final class k40 implements r42<ab0<o>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<h30> f3318a;

    private k40(i40 i40, e52<h30> e52) {
        this.f3318a = e52;
    }

    public static k40 a(i40 i40, e52<h30> e52) {
        return new k40(i40, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3318a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
