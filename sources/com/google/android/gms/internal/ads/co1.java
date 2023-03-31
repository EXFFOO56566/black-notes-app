package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

final class co1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f2149b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f2150c;
    private final /* synthetic */ int d;

    co1(yh1 yh1, int i, int i2, int i3) {
        this.f2149b = i;
        this.f2150c = i2;
        this.d = i3;
    }

    public final void run() {
        try {
            yh1.z.a(MotionEvent.obtain(0, (long) this.f2149b, 0, (float) this.f2150c, (float) this.d, 0));
        } catch (Exception e) {
            yh1.B.a(2022, -1, e);
        }
    }
}
