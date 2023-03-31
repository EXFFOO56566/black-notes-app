package com.google.android.gms.internal.ads;

final class ow implements a00 {

    /* renamed from: a  reason: collision with root package name */
    private k90 f4052a;

    /* renamed from: b  reason: collision with root package name */
    private g50 f4053b;

    /* renamed from: c  reason: collision with root package name */
    private vd1 f4054c;
    private tb1 d;
    private wa1 e;
    private final /* synthetic */ iw f;

    private ow(iw iwVar) {
        this.f = iwVar;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<b00> a(tb1 tb1) {
        this.d = tb1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<b00> a(vd1 vd1) {
        this.f4054c = vd1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<b00> a(wa1 wa1) {
        this.e = wa1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a00
    @Deprecated
    public final /* synthetic */ a00 b(i00 i00) {
        y42.a(i00);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a00
    public final /* synthetic */ a00 d(k90 k90) {
        y42.a(k90);
        this.f4052a = k90;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.a00
    /* renamed from: d */
    public final b00 f() {
        y42.a(this.f4052a, k90.class);
        y42.a(this.f4053b, g50.class);
        return new rw(this.f, new s30(), new re1(), new t40(), new io0(), this.f4052a, this.f4053b, new af1(), this.f4054c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.a00
    public final /* synthetic */ a00 e(g50 g50) {
        y42.a(g50);
        this.f4053b = g50;
        return this;
    }
}
