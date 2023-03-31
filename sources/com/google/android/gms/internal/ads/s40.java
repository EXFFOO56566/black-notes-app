package com.google.android.gms.internal.ads;

public final class s40 implements r42<ab0<m80>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<r40> f4597a;

    private s40(t40 t40, e52<r40> e52) {
        this.f4597a = e52;
    }

    public static s40 a(t40 t40, e52<r40> e52) {
        return new s40(t40, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4597a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
