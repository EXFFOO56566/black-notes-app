package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class mj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final cj f3718a;

    mj(cj cjVar) {
        this.f3718a = cjVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3718a.a();
    }
}
