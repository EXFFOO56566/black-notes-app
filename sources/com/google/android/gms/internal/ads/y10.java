package com.google.android.gms.internal.ads;

public final class y10 implements r42<Runnable> {

    /* renamed from: a  reason: collision with root package name */
    private final z10 f5522a;

    public y10(z10 z10) {
        this.f5522a = z10;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Runnable b2 = this.f5522a.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
