package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class fq0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    static final ln1 f2641a = new fq0();

    private fq0() {
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return yn1.a((Throwable) new nr0("Timed out waiting for ad response.", 2));
    }
}
