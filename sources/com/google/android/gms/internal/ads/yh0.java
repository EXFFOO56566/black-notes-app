package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class yh0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final lo1 f5596a;

    yh0(lo1 lo1) {
        this.f5596a = lo1;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        return obj != null ? this.f5596a : yn1.a((Throwable) new pw0("Retrieve required value in native ad response failed.", 0));
    }
}
