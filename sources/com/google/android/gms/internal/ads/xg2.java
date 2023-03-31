package com.google.android.gms.internal.ads;

import android.view.Surface;

/* access modifiers changed from: package-private */
public final class xg2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Surface f5427b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ rg2 f5428c;

    xg2(rg2 rg2, Surface surface) {
        this.f5428c = rg2;
        this.f5427b = surface;
    }

    public final void run() {
        this.f5428c.f4502b.a(this.f5427b);
    }
}
