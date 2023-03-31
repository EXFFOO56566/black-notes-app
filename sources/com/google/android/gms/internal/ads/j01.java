package com.google.android.gms.internal.ads;

final class j01 implements zn1<k20> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f01 f3160a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zd0 f3161b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i01 f3162c;

    j01(i01 i01, f01 f01, zd0 zd0) {
        this.f3162c = i01;
        this.f3160a = f01;
        this.f3161b = zd0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(k20 k20) {
        k20 k202 = k20;
        synchronized (this.f3162c) {
            this.f3160a.a(k202);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        this.f3161b.b().a(gp0.a(th));
        ie1.a(th, "NativeAdLoader.onFailure");
        this.f3160a.a();
    }
}
