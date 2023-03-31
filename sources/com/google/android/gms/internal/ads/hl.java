package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
public final class hl implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f2936b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ gl f2937c;

    hl(gl glVar, Context context) {
        this.f2937c = glVar;
        this.f2936b = context;
    }

    public final void run() {
        synchronized (this.f2937c.d) {
            this.f2937c.e = gl.c(this.f2936b);
            this.f2937c.d.notifyAll();
        }
    }
}
