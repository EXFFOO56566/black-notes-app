package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class un1<V> extends rl1 implements Future<V> {
    protected un1() {
    }

    /* access modifiers changed from: protected */
    public abstract Future<? extends V> c();

    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return (V) c().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return (V) c().get(j, timeUnit);
    }

    public boolean isCancelled() {
        return c().isCancelled();
    }

    public boolean isDone() {
        return c().isDone();
    }
}
