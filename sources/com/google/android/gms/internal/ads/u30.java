package com.google.android.gms.internal.ads;

public final class u30 implements r42<ab0<u50>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<y30> f4894a;

    private u30(s30 s30, e52<y30> e52) {
        this.f4894a = e52;
    }

    public static u30 a(s30 s30, e52<y30> e52) {
        return new u30(s30, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4894a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
