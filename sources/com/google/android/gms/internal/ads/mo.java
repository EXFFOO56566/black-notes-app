package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class mo implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f3735a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3736b;

    mo(String str) {
        this.f3736b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f3736b;
        int andIncrement = this.f3735a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
