package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class k52 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f3327a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f3328b = new AtomicInteger(1);

    k52() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3327a.newThread(runnable);
        int andIncrement = this.f3328b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
