package com.google.android.gms.internal.ads;

public final class kk0 implements r42<jt0<ck0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<yx0<ck0, le1, tu0>> f3408a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<yx0<ck0, le1, uu0>> f3409b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f3410c;

    public kk0(e52<yx0<ck0, le1, tu0>> e52, e52<yx0<ck0, le1, uu0>> e522, e52<zd1> e523) {
        this.f3408a = e52;
        this.f3409b = e522;
        this.f3410c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        jt0 jt0 = hk0.f2932a[this.f3410c.get().n.f3532a - 1] != 1 ? this.f3409b.get() : this.f3408a.get();
        y42.a(jt0, "Cannot return null from a non-@Nullable @Provides method");
        return jt0;
    }
}
