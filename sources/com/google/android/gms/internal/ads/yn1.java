package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fo1;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class yn1 extends go1 {
    @SafeVarargs
    public static <V> eo1<V> a(lo1<? extends V>... lo1Arr) {
        return new eo1<>(false, ul1.a((Object[]) lo1Arr), null);
    }

    public static <O> lo1<O> a(jn1<O> jn1, Executor executor) {
        zo1 zo1 = new zo1(jn1);
        executor.execute(zo1);
        return zo1;
    }

    public static <V> lo1<V> a(lo1<V> lo1, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return lo1.isDone() ? lo1 : vo1.a(lo1, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> lo1<O> a(lo1<I> lo1, ln1<? super I, ? extends O> ln1, Executor executor) {
        return zm1.a(lo1, ln1, executor);
    }

    public static <I, O> lo1<O> a(lo1<I> lo1, xk1<? super I, ? extends O> xk1, Executor executor) {
        return zm1.a(lo1, xk1, executor);
    }

    public static <V, X extends Throwable> lo1<V> a(lo1<? extends V> lo1, Class<X> cls, ln1<? super X, ? extends V> ln1, Executor executor) {
        return wm1.a(lo1, cls, ln1, executor);
    }

    public static <V> lo1<List<V>> a(Iterable<? extends lo1<? extends V>> iterable) {
        return new nn1(ul1.a((Iterable) iterable), true);
    }

    public static <V> lo1<V> a(@NullableDecl V v) {
        return v == null ? (lo1<V>) fo1.f2636c : new fo1(v);
    }

    public static <V> lo1<V> a(Throwable th) {
        jl1.a(th);
        return new fo1.a(th);
    }

    public static <V> V a(Future<V> future) {
        if (future.isDone()) {
            return (V) ep1.a(future);
        }
        throw new IllegalStateException(kl1.a("Future was expected to be done: %s", future));
    }

    public static <V> void a(lo1<V> lo1, zn1<? super V> zn1, Executor executor) {
        jl1.a(zn1);
        lo1.a(new ao1(lo1, zn1), executor);
    }

    public static <V> eo1<V> b(Iterable<? extends lo1<? extends V>> iterable) {
        return new eo1<>(false, ul1.a((Iterable) iterable), null);
    }

    @SafeVarargs
    public static <V> eo1<V> b(lo1<? extends V>... lo1Arr) {
        return new eo1<>(true, ul1.a((Object[]) lo1Arr), null);
    }

    public static <V> V b(Future<V> future) {
        jl1.a(future);
        try {
            return (V) ep1.a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new qn1((Error) cause);
            }
            throw new ap1(cause);
        }
    }

    public static <V> eo1<V> c(Iterable<? extends lo1<? extends V>> iterable) {
        return new eo1<>(true, ul1.a((Iterable) iterable), null);
    }
}
