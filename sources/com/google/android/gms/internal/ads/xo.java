package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class xo implements zn1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ yo f5469a;

    xo(yo yoVar) {
        this.f5469a = yoVar;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(T t) {
        this.f5469a.f5621b.set(1);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        this.f5469a.f5621b.set(-1);
    }
}
