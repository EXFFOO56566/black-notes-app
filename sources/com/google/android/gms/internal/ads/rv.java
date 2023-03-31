package com.google.android.gms.internal.ads;

public final class rv implements r42<kt0<le1, uu0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<rl0> f4551a;

    public rv(nv nvVar, e52<rl0> e52) {
        this.f4551a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        nv0 nv0 = new nv0(this.f4551a.get());
        y42.a(nv0, "Cannot return null from a non-@Nullable @Provides method");
        return nv0;
    }
}
