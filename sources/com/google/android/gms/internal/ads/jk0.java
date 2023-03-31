package com.google.android.gms.internal.ads;

public final class jk0 implements r42<ab0<u50>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sa0> f3246a;

    public jk0(e52<sa0> e52) {
        this.f3246a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3246a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
