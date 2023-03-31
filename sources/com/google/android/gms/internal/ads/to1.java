package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.xm1;

final class to1 extends xm1.k<Void> implements Runnable {
    private final Runnable i;

    public to1(Runnable runnable) {
        jl1.a(runnable);
        this.i = runnable;
    }

    public final void run() {
        try {
            this.i.run();
        } catch (Throwable th) {
            a(th);
            ml1.c(th);
            throw null;
        }
    }
}
