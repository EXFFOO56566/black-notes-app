package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

public final class ke1<T> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final Deque<lo1<T>> f3378a = new LinkedBlockingDeque();

    /* renamed from: b  reason: collision with root package name */
    private final Callable<T> f3379b;

    /* renamed from: c  reason: collision with root package name */
    private final ko1 f3380c;

    public ke1(Callable<T> callable, ko1 ko1) {
        this.f3379b = callable;
        this.f3380c = ko1;
    }

    public final synchronized lo1<T> a() {
        a(1);
        return this.f3378a.poll();
    }

    public final synchronized void a(int i) {
        int size = i - this.f3378a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3378a.add(this.f3380c.a(this.f3379b));
        }
    }

    public final synchronized void a(lo1<T> lo1) {
        this.f3378a.addFirst(lo1);
    }
}
