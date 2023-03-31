package com.google.android.gms.internal.ads;

public final class t30 implements r42<ab0<n60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<y30> f4747a;

    private t30(s30 s30, e52<y30> e52) {
        this.f4747a = e52;
    }

    public static t30 a(s30 s30, e52<y30> e52) {
        return new t30(s30, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4747a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
