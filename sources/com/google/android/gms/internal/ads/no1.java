package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class no1 {
    public static ko1 a(ExecutorService executorService) {
        return executorService instanceof ko1 ? (ko1) executorService : executorService instanceof ScheduledExecutorService ? new ro1((ScheduledExecutorService) executorService) : new oo1(executorService);
    }

    public static Executor a() {
        return rn1.INSTANCE;
    }

    static Executor a(Executor executor, xm1<?> xm1) {
        jl1.a(executor);
        jl1.a(xm1);
        return executor == rn1.INSTANCE ? executor : new mo1(executor, xm1);
    }
}
