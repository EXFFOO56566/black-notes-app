package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class ro1 extends oo1 implements ko1, ScheduledExecutorService {

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f4528c;

    ro1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        jl1.a(scheduledExecutorService);
        this.f4528c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zo1 a2 = zo1.a(runnable, (Object) null);
        return new qo1(a2, this.f4528c.schedule(a2, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zo1 a2 = zo1.a(callable);
        return new qo1(a2, this.f4528c.schedule(a2, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        to1 to1 = new to1(runnable);
        return new qo1(to1, this.f4528c.scheduleAtFixedRate(to1, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        to1 to1 = new to1(runnable);
        return new qo1(to1, this.f4528c.scheduleWithFixedDelay(to1, j, j2, timeUnit));
    }
}
