package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c50 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final z40 f2065a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f2066b;

    c50(z40 z40, lo1 lo1) {
        this.f2065a = z40;
        this.f2066b = lo1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2065a.a(this.f2066b);
    }
}
