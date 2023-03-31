package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class su0 implements zn1<n00> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ nu0 f4705a;

    su0(nu0 nu0) {
        this.f4705a = nu0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(n00 n00) {
        n00.b();
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        this.f4705a.d.a(gp0.a(th));
        ie1.a(th, "DelayedBannerAd.onFailure");
    }
}
