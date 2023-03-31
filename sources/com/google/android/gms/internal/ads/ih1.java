package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

public final class ih1 {

    /* renamed from: a  reason: collision with root package name */
    private final E f3088a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ eh1 f3089b;

    private ih1(eh1 eh1, E e) {
        this.f3089b = eh1;
        this.f3088a = e;
    }

    private final <O> kh1<O> a(Callable<O> callable, ko1 ko1) {
        return new kh1<>(this.f3089b, this.f3088a, eh1.a(), Collections.emptyList(), ko1.a(callable));
    }

    public final kh1<?> a(ch1 ch1, ko1 ko1) {
        return a(new hh1(ch1), ko1);
    }

    public final <O> kh1<O> a(lo1<O> lo1) {
        return new kh1<>(this.f3089b, this.f3088a, eh1.a(), Collections.emptyList(), lo1);
    }

    public final <O> kh1<O> a(Callable<O> callable) {
        return a(callable, eh1.a(this.f3089b));
    }
}
