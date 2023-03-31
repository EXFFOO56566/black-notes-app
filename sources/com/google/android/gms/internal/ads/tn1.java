package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class tn1<V> extends do1<V> {
    tn1() {
    }

    public static <V> tn1<V> b(lo1<V> lo1) {
        return lo1 instanceof tn1 ? (tn1) lo1 : new vn1(lo1);
    }

    public final tn1<V> a(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (tn1) yn1.a(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> tn1<T> a(ln1<? super V, T> ln1, Executor executor) {
        jl1.a(executor);
        dn1 dn1 = new dn1(this, ln1);
        a((Runnable) dn1, no1.a(executor, dn1));
        return dn1;
    }

    public final <T> tn1<T> a(xk1<? super V, T> xk1, Executor executor) {
        jl1.a(xk1);
        cn1 cn1 = new cn1(this, xk1);
        a((Runnable) cn1, no1.a(executor, cn1));
        return cn1;
    }

    public final <X extends Throwable> tn1<V> a(Class<X> cls, xk1<? super X, ? extends V> xk1, Executor executor) {
        ym1 ym1 = new ym1(this, cls, xk1);
        a((Runnable) ym1, no1.a(executor, ym1));
        return ym1;
    }
}
