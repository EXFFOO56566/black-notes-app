package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class f80 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<e80> f2554b;

    private f80(e80 e80) {
        this.f2554b = new WeakReference<>(e80);
    }

    public final void run() {
        e80 e80 = this.f2554b.get();
        if (e80 != null) {
            e80.S();
        }
    }
}
