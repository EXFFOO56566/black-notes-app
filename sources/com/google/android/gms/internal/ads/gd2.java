package com.google.android.gms.internal.ads;

final class gd2 implements wd2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2742a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ad2 f2743b;

    public gd2(ad2 ad2, int i) {
        this.f2743b = ad2;
        this.f2742a = i;
    }

    @Override // com.google.android.gms.internal.ads.wd2
    public final boolean D() {
        return this.f2743b.a(this.f2742a);
    }

    @Override // com.google.android.gms.internal.ads.wd2
    public final int a(g82 g82, ca2 ca2, boolean z) {
        return this.f2743b.a(this.f2742a, g82, ca2, z);
    }

    @Override // com.google.android.gms.internal.ads.wd2
    public final void a() {
        this.f2743b.h();
    }

    @Override // com.google.android.gms.internal.ads.wd2
    public final void a(long j) {
        this.f2743b.a(this.f2742a, j);
    }
}
