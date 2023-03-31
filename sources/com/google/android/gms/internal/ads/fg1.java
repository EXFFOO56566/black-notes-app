package com.google.android.gms.internal.ads;

final class fg1 implements zn1<rf1<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ag1 f2592a;

    fg1(ag1 ag1) {
        this.f2592a = ag1;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(Object obj) {
        rf1<?> rf1 = (rf1) obj;
        synchronized (this.f2592a) {
            ag1.a(this.f2592a).a(rf1);
            if (ag1.b(this.f2592a) != pf1.h) {
                ag1.d(this.f2592a).a(ag1.c(this.f2592a).a(), rf1);
            }
            if (ag1.b(this.f2592a) == pf1.g) {
                ag1.a(this.f2592a, ag1.c(this.f2592a));
            }
            ag1.a(this.f2592a, pf1.g);
            ag1.e(this.f2592a).a(rf1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        synchronized (this.f2592a) {
            ag1.a(this.f2592a).a(th);
            ag1.e(this.f2592a).a(th);
        }
    }
}
