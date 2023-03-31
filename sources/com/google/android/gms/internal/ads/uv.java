package com.google.android.gms.internal.ads;

public final class uv implements r42<kt0<le1, tu0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<rl0> f5007a;

    public uv(nv nvVar, e52<rl0> e52) {
        this.f5007a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        fx0 fx0 = new fx0(this.f5007a.get());
        y42.a(fx0, "Cannot return null from a non-@Nullable @Provides method");
        return fx0;
    }
}
