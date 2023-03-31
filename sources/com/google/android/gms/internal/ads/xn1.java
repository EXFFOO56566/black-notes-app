package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public abstract class xn1<V> extends un1<V> implements lo1<V> {
    protected xn1() {
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public void a(Runnable runnable, Executor executor) {
        e().a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public abstract lo1<? extends V> e();
}
