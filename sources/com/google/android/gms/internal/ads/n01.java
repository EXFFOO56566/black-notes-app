package com.google.android.gms.internal.ads;

import b.c.b.a.d.a;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class n01 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o01 f3776a;

    /* renamed from: b  reason: collision with root package name */
    private final List f3777b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3778c;

    n01(o01 o01, List list, a aVar) {
        this.f3776a = o01;
        this.f3777b = list;
        this.f3778c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3776a.a(this.f3777b, this.f3778c);
    }
}
