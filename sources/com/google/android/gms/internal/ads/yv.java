package com.google.android.gms.internal.ads;

public final class yv implements r42<fo> {

    /* renamed from: a  reason: collision with root package name */
    private final nv f5656a;

    public yv(nv nvVar) {
        this.f5656a = nvVar;
    }

    public static fo a(nv nvVar) {
        fo c2 = nvVar.c();
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5656a);
    }
}
