package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class yc1 implements f01<ck0> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ wc1 f5576a;

    yc1(wc1 wc1) {
        this.f5576a = wc1;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a() {
        synchronized (this.f5576a) {
            this.f5576a.g = null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.f01
    public final /* synthetic */ void a(ck0 ck0) {
        ck0 ck02 = ck0;
        synchronized (this.f5576a) {
            this.f5576a.g = ck02;
            this.f5576a.g.b();
        }
    }
}
