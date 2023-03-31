package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class yo<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ro<T> f5620a = new ro<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f5621b = new AtomicInteger(0);

    public yo() {
        yn1.a(this.f5620a, new xo(this), jo.f);
    }

    @Deprecated
    public final int a() {
        return this.f5621b.get();
    }

    @Deprecated
    public final void a(vo<T> voVar, to toVar) {
        yn1.a(this.f5620a, new ap(this, voVar, toVar), jo.f);
    }

    @Deprecated
    public final void a(T t) {
        this.f5620a.b(t);
    }

    @Deprecated
    public final void b() {
        this.f5620a.a(new Exception());
    }
}
