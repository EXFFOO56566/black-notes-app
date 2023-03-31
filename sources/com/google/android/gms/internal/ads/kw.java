package com.google.android.gms.internal.ads;

final class kw implements yd0 {

    /* renamed from: a  reason: collision with root package name */
    private k90 f3454a;

    /* renamed from: b  reason: collision with root package name */
    private g50 f3455b;

    /* renamed from: c  reason: collision with root package name */
    private vd0 f3456c;
    private vd1 d;
    private tb1 e;
    private wa1 f;
    private final /* synthetic */ iw g;

    private kw(iw iwVar) {
        this.g = iwVar;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<zd0> a(tb1 tb1) {
        this.e = tb1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<zd0> a(vd1 vd1) {
        this.d = vd1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<zd0> a(wa1 wa1) {
        this.f = wa1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yd0
    public final /* synthetic */ yd0 a(g50 g50) {
        y42.a(g50);
        this.f3455b = g50;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yd0
    public final /* synthetic */ yd0 b(vd0 vd0) {
        y42.a(vd0);
        this.f3456c = vd0;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yd0
    /* renamed from: c */
    public final zd0 f() {
        y42.a(this.f3454a, k90.class);
        y42.a(this.f3455b, g50.class);
        y42.a(this.f3456c, vd0.class);
        return new jw(this.g, this.f3456c, new s30(), new re1(), new t40(), new io0(), this.f3454a, this.f3455b, new af1(), this.d, this.e, this.f);
    }

    @Override // com.google.android.gms.internal.ads.yd0
    public final /* synthetic */ yd0 e(k90 k90) {
        y42.a(k90);
        this.f3454a = k90;
        return this;
    }
}
