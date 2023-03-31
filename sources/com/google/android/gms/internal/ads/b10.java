package com.google.android.gms.internal.ads;

public final class b10 implements r42<ab0<n60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<d20> f1843a;

    public b10(r00 r00, e52<d20> e52) {
        this.f1843a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f1843a.get(), jo.e);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
