package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class yz0 implements f01<k20> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zz0 f5672a;

    yz0(zz0 zz0) {
        this.f5672a = zz0;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a() {
        synchronized (this.f5672a) {
            this.f5672a.d = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.f01
    public final /* synthetic */ void a(k20 k20) {
        k20 k202 = k20;
        synchronized (this.f5672a) {
            this.f5672a.d = false;
            this.f5672a.f5826c = k202.d();
            k202.b();
        }
    }
}
