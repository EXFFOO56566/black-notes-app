package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class jo {

    /* renamed from: a  reason: collision with root package name */
    public static final ko1 f3256a = a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), a("Default")));

    /* renamed from: b  reason: collision with root package name */
    public static final ko1 f3257b;

    /* renamed from: c  reason: collision with root package name */
    public static final ko1 f3258c;
    public static final ScheduledExecutorService d = new ScheduledThreadPoolExecutor(3, a("Schedule"));
    public static final ko1 e = a(new lo());
    public static final ko1 f = a(no1.a());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3257b = a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f3258c = a(threadPoolExecutor2);
    }

    private static ko1 a(Executor executor) {
        return new oo(executor, null);
    }

    private static ThreadFactory a(String str) {
        return new mo(str);
    }
}
