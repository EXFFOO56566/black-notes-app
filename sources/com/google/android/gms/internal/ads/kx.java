package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.a;

public final class kx implements r42<a> {

    /* renamed from: a  reason: collision with root package name */
    private final ix f3462a;

    public kx(ix ixVar) {
        this.f3462a = ixVar;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        a d = this.f3462a.d();
        y42.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
