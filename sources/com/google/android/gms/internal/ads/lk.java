package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class lk implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ik f3570a;

    lk(ik ikVar) {
        this.f3570a = ikVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3570a.l();
    }
}
