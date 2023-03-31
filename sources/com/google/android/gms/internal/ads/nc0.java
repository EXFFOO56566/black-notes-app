package com.google.android.gms.internal.ads;

public final class nc0 implements r42<ab0<n5>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ak0> f3825a;

    public nc0(fc0 fc0, e52<ak0> e52) {
        this.f3825a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3825a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
