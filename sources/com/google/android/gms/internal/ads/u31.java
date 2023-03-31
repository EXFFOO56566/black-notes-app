package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class u31 implements r42<gd1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<d> f4895a;

    public u31(e52<d> e52) {
        this.f4895a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        gd1 gd1 = new gd1(this.f4895a.get());
        y42.a(gd1, "Cannot return null from a non-@Nullable @Provides method");
        return gd1;
    }
}
