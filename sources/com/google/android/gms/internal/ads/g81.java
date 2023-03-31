package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class g81 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final h81 f2722a;

    g81(h81 h81) {
        this.f2722a = h81;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        h81 h81 = this.f2722a;
        return new e81(h81.f2876a.a(h81.f2878c));
    }
}
