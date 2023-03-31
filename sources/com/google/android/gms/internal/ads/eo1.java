package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class eo1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2461a;

    /* renamed from: b  reason: collision with root package name */
    private final ul1<lo1<? extends V>> f2462b;

    private eo1(boolean z, ul1<lo1<? extends V>> ul1) {
        this.f2461a = z;
        this.f2462b = ul1;
    }

    /* synthetic */ eo1(boolean z, ul1 ul1, bo1 bo1) {
        this(z, ul1);
    }

    public final <C> lo1<C> a(Callable<C> callable, Executor executor) {
        return new mn1(this.f2462b, this.f2461a, executor, callable);
    }
}
