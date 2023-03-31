package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ur0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final mr0 f4990a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f4991b;

    /* renamed from: c  reason: collision with root package name */
    private final lo1 f4992c;

    ur0(mr0 mr0, lo1 lo1, lo1 lo12) {
        this.f4990a = mr0;
        this.f4991b = lo1;
        this.f4992c = lo12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4990a.a(this.f4991b, this.f4992c);
    }
}
