package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class kh1<O> {

    /* renamed from: a  reason: collision with root package name */
    private final E f3395a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3396b;

    /* renamed from: c  reason: collision with root package name */
    private final lo1<?> f3397c;
    private final List<lo1<?>> d;
    private final lo1<O> e;
    final /* synthetic */ eh1 f;

    private kh1(eh1 eh1, E e2, String str, lo1<?> lo1, List<lo1<?>> list, lo1<O> lo12) {
        this.f = eh1;
        this.f3395a = e2;
        this.f3396b = str;
        this.f3397c = lo1;
        this.d = list;
        this.e = lo12;
    }

    private final <O2> kh1<O2> a(ln1<O, O2> ln1, Executor executor) {
        return new kh1<>(this.f, this.f3395a, this.f3396b, this.f3397c, this.d, yn1.a(this.e, ln1, executor));
    }

    public final bh1<E, O> a() {
        E e2 = this.f3395a;
        String str = this.f3396b;
        if (str == null) {
            str = this.f.b((Object) e2);
        }
        bh1<E, O> bh1 = new bh1<>(e2, str, this.e);
        eh1.c(this.f).a(bh1);
        this.f3397c.a(new oh1(this, bh1), jo.f);
        yn1.a(bh1, new nh1(this, bh1), jo.f);
        return bh1;
    }

    public final kh1<O> a(long j, TimeUnit timeUnit) {
        eh1 eh1 = this.f;
        return new kh1<>(eh1, this.f3395a, this.f3396b, this.f3397c, this.d, yn1.a(this.e, j, timeUnit, eh1.b(eh1)));
    }

    public final <O2> kh1<O2> a(ln1<O, O2> ln1) {
        return a(ln1, eh1.a(this.f));
    }

    public final <O2> kh1<O2> a(lo1<O2> lo1) {
        return a(new mh1(lo1), jo.f);
    }

    public final <O2> kh1<O2> a(zg1<O, O2> zg1) {
        return a((ln1) new jh1(zg1));
    }

    public final <T extends Throwable> kh1<O> a(Class<T> cls, ln1<T, O> ln1) {
        eh1 eh1 = this.f;
        return new kh1<>(eh1, this.f3395a, this.f3396b, this.f3397c, this.d, yn1.a(this.e, cls, ln1, eh1.a(eh1)));
    }

    public final <T extends Throwable> kh1<O> a(Class<T> cls, zg1<T, O> zg1) {
        return a(cls, new lh1(zg1));
    }

    public final kh1<O> a(E e2) {
        return this.f.a(e2, a());
    }

    public final kh1<O> a(String str) {
        return new kh1<>(this.f, this.f3395a, str, this.f3397c, this.d, this.e);
    }
}
