package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ou implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final pu f4044b;

    ou(pu puVar) {
        this.f4044b = puVar;
    }

    public final void run() {
        pu puVar = this.f4044b;
        puVar.d.N();
        c M = puVar.d.M();
        if (M != null) {
            M.d2();
        }
    }
}
