package com.google.android.gms.internal.ads;

public final class qe0 implements r42<of0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<nf0> f4321a;

    public qe0(le0 le0, e52<nf0> e52) {
        this.f4321a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        nf0 nf0 = this.f4321a.get();
        y42.a(nf0, "Cannot return null from a non-@Nullable @Provides method");
        return nf0;
    }
}
