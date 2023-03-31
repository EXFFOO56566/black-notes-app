package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public final class yg1 implements r42<ScheduledExecutorService> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ThreadFactory> f5593a;

    public yg1(e52<ThreadFactory> e52) {
        this.f5593a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, this.f5593a.get());
        y42.a(scheduledThreadPoolExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return scheduledThreadPoolExecutor;
    }
}
