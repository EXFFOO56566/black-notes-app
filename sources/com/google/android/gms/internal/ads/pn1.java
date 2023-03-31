package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class pn1 extends on1<V> {
    private final Callable<V> h;
    private final /* synthetic */ mn1 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    pn1(mn1 mn1, Callable<V> callable, Executor executor) {
        super(mn1, executor);
        this.i = mn1;
        jl1.a(callable);
        this.h = callable;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.on1
    public final void a(V v) {
        this.i.a((Object) v);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final V c() {
        this.f = false;
        return this.h.call();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final String d() {
        return this.h.toString();
    }
}
