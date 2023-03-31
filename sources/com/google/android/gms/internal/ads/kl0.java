package com.google.android.gms.internal.ads;

public final class kl0 implements r42<ab0<q60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<jl0> f3416a;

    private kl0(ll0 ll0, e52<jl0> e52) {
        this.f3416a = e52;
    }

    public static kl0 a(ll0 ll0, e52<jl0> e52) {
        return new kl0(ll0, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3416a.get(), jo.e);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
