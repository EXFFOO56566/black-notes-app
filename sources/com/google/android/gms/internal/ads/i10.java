package com.google.android.gms.internal.ads;

public final class i10 implements r42<ab0<q80>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<e80> f3011a;

    public i10(r00 r00, e52<e80> e52) {
        this.f3011a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(new t00(this.f3011a.get()), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
