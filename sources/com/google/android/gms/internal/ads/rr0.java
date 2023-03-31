package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class rr0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final lo1 f4538a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f4539b;

    rr0(lo1 lo1, lo1 lo12) {
        this.f4538a = lo1;
        this.f4539b = lo12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        lo1 lo1 = this.f4538a;
        lo1 lo12 = this.f4539b;
        return new bs0((is0) lo1.get(), ((cs0) lo12.get()).f2161b, ((cs0) lo12.get()).f2160a);
    }
}
