package com.google.android.gms.internal.ads;

public final class m81 implements y61<n81> {

    /* renamed from: a  reason: collision with root package name */
    private zj f3678a;

    /* renamed from: b  reason: collision with root package name */
    private String f3679b;

    public m81(zj zjVar, ko1 ko1, String str) {
        this.f3678a = zjVar;
        this.f3679b = str;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<n81> a() {
        new ro();
        lo1<String> a2 = yn1.a((Object) null);
        if (((Boolean) on2.e().a(zr2.I2)).booleanValue()) {
            a2 = this.f3678a.a(this.f3679b);
        }
        lo1<String> b2 = this.f3678a.b(this.f3679b);
        return yn1.b(a2, b2).a(new q81(a2, b2), jo.f3256a);
    }
}
