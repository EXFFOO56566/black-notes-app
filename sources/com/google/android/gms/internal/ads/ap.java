package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class ap implements zn1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ vo f1798a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ to f1799b;

    ap(yo yoVar, vo voVar, to toVar) {
        this.f1798a = voVar;
        this.f1799b = toVar;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(T t) {
        this.f1798a.a(t);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        this.f1799b.run();
    }
}
