package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class u81 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final r81 f4913a;

    u81(r81 r81) {
        this.f4913a = r81;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r81 r81 = this.f4913a;
        return new s81(r81.f4457a.a(r81.f4459c));
    }
}
