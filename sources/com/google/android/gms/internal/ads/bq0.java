package com.google.android.gms.internal.ads;

public abstract class bq0 implements ln1<zf, vd1> {

    /* renamed from: a  reason: collision with root package name */
    private final h80 f1989a;

    public bq0(h80 h80) {
        this.f1989a = h80;
    }

    /* access modifiers changed from: protected */
    public abstract lo1<vd1> a(zf zfVar);

    /* Return type fixed from 'com.google.android.gms.internal.ads.lo1' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ln1
    public final /* synthetic */ lo1<vd1> a(zf zfVar) {
        zf zfVar2 = zfVar;
        this.f1989a.a(zfVar2);
        lo1<vd1> a2 = a(zfVar2);
        yn1.a(a2, new eq0(this), jo.f);
        return a2;
    }
}
