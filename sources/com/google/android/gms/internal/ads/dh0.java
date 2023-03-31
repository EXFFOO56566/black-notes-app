package com.google.android.gms.internal.ads;

public final class dh0 implements r42<sf0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<yg0> f2254a;

    public dh0(ah0 ah0, e52<yg0> e52) {
        this.f2254a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        yg0 yg0 = this.f2254a.get();
        y42.a(yg0, "Cannot return null from a non-@Nullable @Provides method");
        return yg0;
    }
}
