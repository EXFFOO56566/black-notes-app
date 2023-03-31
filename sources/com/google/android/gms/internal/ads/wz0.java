package com.google.android.gms.internal.ads;

final class wz0 implements zn1<ac0> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ad0 f5338a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ xz0 f5339b;

    wz0(xz0 xz0, ad0 ad0) {
        this.f5339b = xz0;
        this.f5338a = ad0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(ac0 ac0) {
        ac0 ac02 = ac0;
        synchronized (this.f5339b) {
            this.f5339b.l = null;
            this.f5339b.k = ac02;
            ac02.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        synchronized (this.f5339b) {
            this.f5339b.l = null;
            this.f5338a.b().a(gp0.a(th));
            ie1.a(th, "InterstitialAdManagerShim.onFailure");
        }
    }
}
