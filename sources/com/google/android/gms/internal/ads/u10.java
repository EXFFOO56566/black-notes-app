package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

final /* synthetic */ class u10 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f4889b;

    u10(AtomicReference atomicReference) {
        this.f4889b = atomicReference;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.f4889b.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
