package com.google.android.gms.internal.ads;

public final class te0 implements r42<ab0<n60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<wg0> f4797a;

    public te0(le0 le0, e52<wg0> e52) {
        this.f4797a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4797a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
