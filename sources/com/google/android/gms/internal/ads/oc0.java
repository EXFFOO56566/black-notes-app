package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

public final class oc0 implements r42<ab0<o>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ld0> f3977a;

    private oc0(fc0 fc0, e52<ld0> e52) {
        this.f3977a = e52;
    }

    public static oc0 a(fc0 fc0, e52<ld0> e52) {
        return new oc0(fc0, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3977a.get(), jo.e);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
