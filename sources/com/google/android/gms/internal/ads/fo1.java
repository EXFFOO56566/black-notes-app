package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.xm1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public class fo1<V> implements lo1<V> {

    /* renamed from: c  reason: collision with root package name */
    static final lo1<?> f2636c = new fo1(null);
    private static final Logger d = Logger.getLogger(fo1.class.getName());
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private final V f2637b;

    /* access modifiers changed from: package-private */
    public static final class a<V> extends xm1.k<V> {
        a(Throwable th) {
            a(th);
        }
    }

    fo1(@NullableDecl V v) {
        this.f2637b = v;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public void a(Runnable runnable, Executor executor) {
        jl1.a(runnable, "Runnable was null.");
        jl1.a(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = d;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f2637b;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        jl1.a(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f2637b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
