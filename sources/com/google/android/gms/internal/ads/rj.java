package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class rj implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f4508a = new AtomicInteger(1);

    rj(cj cjVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f4508a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
