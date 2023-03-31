package com.google.android.gms.internal.ads;

public final class pe0 implements r42<sf0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<he0> f4153a;

    public pe0(le0 le0, e52<he0> e52) {
        this.f4153a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        he0 he0 = this.f4153a.get();
        y42.a(he0, "Cannot return null from a non-@Nullable @Provides method");
        return he0;
    }
}
