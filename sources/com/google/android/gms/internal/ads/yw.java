package com.google.android.gms.internal.ads;

final class yw implements zc0 {

    /* renamed from: a  reason: collision with root package name */
    private k90 f5659a;

    /* renamed from: b  reason: collision with root package name */
    private g50 f5660b;

    /* renamed from: c  reason: collision with root package name */
    private ry0 f5661c;
    private vd1 d;
    private tb1 e;
    private wa1 f;
    private final /* synthetic */ iw g;

    private yw(iw iwVar) {
        this.g = iwVar;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<ad0> a(tb1 tb1) {
        this.e = tb1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<ad0> a(vd1 vd1) {
        this.d = vd1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<ad0> a(wa1 wa1) {
        this.f = wa1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zc0
    public final /* synthetic */ zc0 a(ry0 ry0) {
        y42.a(ry0);
        this.f5661c = ry0;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zc0
    public final /* synthetic */ zc0 c(g50 g50) {
        y42.a(g50);
        this.f5660b = g50;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zc0
    public final /* synthetic */ zc0 c(k90 k90) {
        y42.a(k90);
        this.f5659a = k90;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zc0
    /* renamed from: e */
    public final ad0 f() {
        y42.a(this.f5659a, k90.class);
        y42.a(this.f5660b, g50.class);
        y42.a(this.f5661c, ry0.class);
        return new bx(this.g, new s30(), new re1(), new t40(), new io0(), this.f5659a, this.f5660b, new af1(), this.f5661c, this.d, this.e, this.f);
    }
}
