package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final class gh1 {

    /* renamed from: a  reason: collision with root package name */
    private final E f2760a;

    /* renamed from: b  reason: collision with root package name */
    private final List<lo1<?>> f2761b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ eh1 f2762c;

    private gh1(eh1 eh1, E e, List<lo1<?>> list) {
        this.f2762c = eh1;
        this.f2760a = e;
        this.f2761b = list;
    }

    public final <O> kh1<O> a(Callable<O> callable) {
        eo1 c2 = yn1.c(this.f2761b);
        lo1 a2 = c2.a(fh1.f2594a, jo.f);
        eh1 eh1 = this.f2762c;
        return new kh1<>(eh1, this.f2760a, a2, this.f2761b, c2.a(callable, eh1.a(eh1)));
    }
}
