package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class eh1<E> {
    private static final lo1<?> d = yn1.a((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f2424a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f2425b;

    /* renamed from: c  reason: collision with root package name */
    private final qh1<E> f2426c;

    public eh1(ko1 ko1, ScheduledExecutorService scheduledExecutorService, qh1<E> qh1) {
        this.f2424a = ko1;
        this.f2425b = scheduledExecutorService;
        this.f2426c = qh1;
    }

    public final gh1 a(E e, lo1<?>... lo1Arr) {
        return new gh1(this, e, Arrays.asList(lo1Arr));
    }

    public final ih1 a(E e) {
        return new ih1(this, e);
    }

    public final <I> kh1<I> a(E e, lo1<I> lo1) {
        return new kh1<>(this, e, lo1, Collections.singletonList(lo1), lo1);
    }

    /* access modifiers changed from: protected */
    public abstract String b(E e);
}
