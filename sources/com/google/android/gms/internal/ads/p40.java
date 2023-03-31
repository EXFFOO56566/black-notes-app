package com.google.android.gms.internal.ads;

public final class p40 implements r42<ab0<q60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<x40> f4107a;

    private p40(i40 i40, e52<x40> e52) {
        this.f4107a = e52;
    }

    public static p40 a(i40 i40, e52<x40> e52) {
        return new p40(i40, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4107a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
