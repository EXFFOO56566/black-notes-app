package com.google.android.gms.internal.ads;

public final class g20 implements r42<e80> {

    /* renamed from: a  reason: collision with root package name */
    private final h20 f2695a;

    public g20(h20 h20) {
        this.f2695a = h20;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        e80 a2 = this.f2695a.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
