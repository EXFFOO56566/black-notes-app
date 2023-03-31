package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

final /* synthetic */ class li implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final mi f3555b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f3556c;

    li(mi miVar, Bitmap bitmap) {
        this.f3555b = miVar;
        this.f3556c = bitmap;
    }

    public final void run() {
        this.f3555b.a(this.f3556c);
    }
}
