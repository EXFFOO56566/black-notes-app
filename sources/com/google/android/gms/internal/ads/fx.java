package com.google.android.gms.internal.ads;

final class fx implements ik0 {

    /* renamed from: a  reason: collision with root package name */
    private k90 f2667a;

    /* renamed from: b  reason: collision with root package name */
    private g50 f2668b;

    /* renamed from: c  reason: collision with root package name */
    private vd1 f2669c;
    private tb1 d;
    private wa1 e;
    private final /* synthetic */ iw f;

    private fx(iw iwVar) {
        this.f = iwVar;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<fk0> a(tb1 tb1) {
        this.d = tb1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<fk0> a(vd1 vd1) {
        this.f2669c = vd1;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.d50' to match base method */
    @Override // com.google.android.gms.internal.ads.d50
    public final /* synthetic */ d50<fk0> a(wa1 wa1) {
        this.e = wa1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ik0
    public final /* synthetic */ ik0 a(k90 k90) {
        y42.a(k90);
        this.f2667a = k90;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ik0
    /* renamed from: b */
    public final fk0 f() {
        y42.a(this.f2667a, k90.class);
        y42.a(this.f2668b, g50.class);
        return new ex(this.f, new s30(), new re1(), new t40(), new io0(), this.f2667a, this.f2668b, new af1(), this.f2669c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.ik0
    public final /* synthetic */ ik0 b(g50 g50) {
        y42.a(g50);
        this.f2668b = g50;
        return this;
    }
}
