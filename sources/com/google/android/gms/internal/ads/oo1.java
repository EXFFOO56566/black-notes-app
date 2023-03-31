package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class oo1 extends an1 {

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f4027b;

    oo1(ExecutorService executorService) {
        jl1.a(executorService);
        this.f4027b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f4027b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f4027b.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f4027b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f4027b.isTerminated();
    }

    public final void shutdown() {
        this.f4027b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f4027b.shutdownNow();
    }
}
