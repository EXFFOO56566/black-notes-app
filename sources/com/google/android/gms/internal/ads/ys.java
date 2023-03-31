package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.c;

final /* synthetic */ class ys implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final vs f5647b;

    ys(vs vsVar) {
        this.f5647b = vsVar;
    }

    public final void run() {
        vs vsVar = this.f5647b;
        vsVar.f5152a.N();
        c M = vsVar.f5152a.M();
        if (M != null) {
            M.d2();
        }
    }
}
