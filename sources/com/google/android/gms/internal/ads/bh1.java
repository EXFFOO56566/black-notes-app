package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class bh1<E, V> implements lo1<V> {

    /* renamed from: b  reason: collision with root package name */
    private final E f1950b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1951c;
    private final lo1<V> d;

    public bh1(E e, String str, lo1<V> lo1) {
        this.f1950b = e;
        this.f1951c = str;
        this.d = lo1;
    }

    public final E a() {
        return this.f1950b;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void a(Runnable runnable, Executor executor) {
        this.d.a(runnable, executor);
    }

    public final String b() {
        return this.f1951c;
    }

    public final boolean cancel(boolean z) {
        return this.d.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.d.get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.d.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.d.isCancelled();
    }

    public final boolean isDone() {
        return this.d.isDone();
    }

    public final String toString() {
        String str = this.f1951c;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
