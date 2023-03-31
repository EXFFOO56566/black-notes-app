package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class vn1<V> extends tn1<V> {
    private final lo1<V> i;

    vn1(lo1<V> lo1) {
        jl1.a(lo1);
        this.i = lo1;
    }

    @Override // com.google.android.gms.internal.ads.xm1, com.google.android.gms.internal.ads.lo1
    public final void a(Runnable runnable, Executor executor) {
        this.i.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.xm1
    public final boolean cancel(boolean z) {
        return this.i.cancel(z);
    }

    @Override // java.util.concurrent.Future, com.google.android.gms.internal.ads.xm1
    public final V get() {
        return this.i.get();
    }

    @Override // java.util.concurrent.Future, com.google.android.gms.internal.ads.xm1
    public final V get(long j, TimeUnit timeUnit) {
        return this.i.get(j, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.xm1
    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.xm1
    public final boolean isDone() {
        return this.i.isDone();
    }

    @Override // com.google.android.gms.internal.ads.xm1
    public final String toString() {
        return this.i.toString();
    }
}
