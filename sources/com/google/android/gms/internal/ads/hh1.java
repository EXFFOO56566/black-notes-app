package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class hh1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ch1 f2918a;

    hh1(ch1 ch1) {
        this.f2918a = ch1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f2918a.run();
        return null;
    }
}
