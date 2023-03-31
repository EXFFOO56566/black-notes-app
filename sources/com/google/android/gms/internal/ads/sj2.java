package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class sj2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ro f4669b;

    /* renamed from: c  reason: collision with root package name */
    private final Future f4670c;

    sj2(ro roVar, Future future) {
        this.f4669b = roVar;
        this.f4670c = future;
    }

    public final void run() {
        ro roVar = this.f4669b;
        Future future = this.f4670c;
        if (roVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
