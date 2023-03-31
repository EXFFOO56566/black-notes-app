package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class q81 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final lo1 f4286a;

    /* renamed from: b  reason: collision with root package name */
    private final lo1 f4287b;

    q81(lo1 lo1, lo1 lo12) {
        this.f4286a = lo1;
        this.f4287b = lo12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new n81((String) this.f4286a.get(), (String) this.f4287b.get());
    }
}
