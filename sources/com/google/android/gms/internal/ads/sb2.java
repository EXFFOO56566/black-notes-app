package com.google.android.gms.internal.ads;

final class sb2 implements nb2 {

    /* renamed from: a  reason: collision with root package name */
    private final xf2 f4628a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4629b = this.f4628a.o();

    /* renamed from: c  reason: collision with root package name */
    private final int f4630c = (this.f4628a.o() & 255);
    private int d;
    private int e;

    public sb2(mb2 mb2) {
        xf2 xf2 = mb2.z0;
        this.f4628a = xf2;
        xf2.c(12);
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int a() {
        return this.f4629b;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final int b() {
        int i = this.f4630c;
        if (i == 8) {
            return this.f4628a.g();
        }
        if (i == 16) {
            return this.f4628a.h();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int g = this.f4628a.g();
        this.e = g;
        return (g & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.nb2
    public final boolean c() {
        return false;
    }
}
