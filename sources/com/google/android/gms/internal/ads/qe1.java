package com.google.android.gms.internal.ads;

public final class qe1 implements r42<ab0<a60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<te1> f4322a;

    private qe1(re1 re1, e52<te1> e52) {
        this.f4322a = e52;
    }

    public static qe1 a(re1 re1, e52<te1> e52) {
        return new qe1(re1, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4322a.get(), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
