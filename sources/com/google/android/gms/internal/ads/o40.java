package com.google.android.gms.internal.ads;

public final class o40 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<x40> f3942a;

    private o40(i40 i40, e52<x40> e52) {
        this.f3942a = e52;
    }

    public static o40 a(i40 i40, e52<x40> e52) {
        return new o40(i40, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3942a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
