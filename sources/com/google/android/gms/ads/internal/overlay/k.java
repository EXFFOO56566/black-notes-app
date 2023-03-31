package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final /* synthetic */ class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final l f1424b;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable f1425c;

    k(l lVar, Drawable drawable) {
        this.f1424b = lVar;
        this.f1425c = drawable;
    }

    public final void run() {
        l lVar = this.f1424b;
        lVar.f1426c.f1413b.getWindow().setBackgroundDrawable(this.f1425c);
    }
}
