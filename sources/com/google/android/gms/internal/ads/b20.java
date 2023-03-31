package com.google.android.gms.internal.ads;

public final class b20 implements r42<r3> {

    /* renamed from: a  reason: collision with root package name */
    private final z10 f1846a;

    public b20(z10 z10) {
        this.f1846a = z10;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        r3 a2 = this.f1846a.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
