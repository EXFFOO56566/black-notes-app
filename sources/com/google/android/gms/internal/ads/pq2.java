package com.google.android.gms.internal.ads;

final class pq2 extends vn2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ nq2 f4220b;

    private pq2(nq2 nq2) {
        this.f4220b = nq2;
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final String V() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final String a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final void a(rm2 rm2, int i) {
        co.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        sn.f4682b.post(new sq2(this));
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final void b(rm2 rm2) {
        a(rm2, 1);
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final boolean u() {
        return false;
    }
}
