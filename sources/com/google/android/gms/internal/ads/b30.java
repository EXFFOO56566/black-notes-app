package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class b30 implements zn1<q20> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zn1 f1853a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ y20 f1854b;

    b30(y20 y20, zn1 zn1) {
        this.f1854b = y20;
        this.f1853a = zn1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(q20 q20) {
        this.f1854b.a(q20.f4262a, this.f1853a);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        this.f1853a.a(th);
        this.f1854b.c();
    }
}
