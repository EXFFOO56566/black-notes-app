package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ro<T> implements lo1<T> {

    /* renamed from: b  reason: collision with root package name */
    private final so1<T> f4525b = so1.h();

    private static boolean a(boolean z) {
        if (!z) {
            q.g().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public void a(Runnable runnable, Executor executor) {
        this.f4525b.a(runnable, executor);
    }

    public final boolean a(Throwable th) {
        boolean a2 = this.f4525b.a(th);
        a(a2);
        return a2;
    }

    public final boolean b(T t) {
        boolean a2 = this.f4525b.a(t);
        a(a2);
        return a2;
    }

    public boolean cancel(boolean z) {
        return this.f4525b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.f4525b.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        return this.f4525b.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.f4525b.isCancelled();
    }

    public boolean isDone() {
        return this.f4525b.isDone();
    }
}
