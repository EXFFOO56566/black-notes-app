package com.google.android.gms.internal.ads;

final class pb2 implements nb2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f4141a = this.f4143c.o();

    /* renamed from: b  reason: collision with root package name */
    private final int f4142b = this.f4143c.o();

    /* renamed from: c  reason: collision with root package name */
    private final xf2 f4143c;

    public pb2(mb2 mb2) {
        xf2 xf2 = mb2.z0;
        this.f4143c = xf2;
        xf2.c(12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int a() {
        return this.f4142b;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int b() {
        int i = this.f4141a;
        return i == 0 ? this.f4143c.o() : i;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final boolean c() {
        return this.f4141a != 0;
    }
}
