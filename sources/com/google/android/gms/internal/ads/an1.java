package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class an1 extends AbstractExecutorService implements ko1 {
    @Override // com.google.android.gms.internal.ads.ko1
    /* renamed from: a */
    public final lo1<?> submit(Runnable runnable) {
        return (lo1) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.ko1
    /* renamed from: a */
    public final <T> lo1<T> submit(Callable<T> callable) {
        return (lo1) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return zo1.a(runnable, (Object) t);
    }

    /* access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return zo1.a((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (lo1) super.submit(runnable, obj);
    }
}
