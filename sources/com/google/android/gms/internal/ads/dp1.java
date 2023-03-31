package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

final class dp1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ MotionEvent f2290b;

    dp1(yh1 yh1, MotionEvent motionEvent) {
        this.f2290b = motionEvent;
    }

    public final void run() {
        try {
            yh1.z.a(this.f2290b);
        } catch (Exception e) {
            yh1.B.a(2022, -1, e);
        }
    }
}
