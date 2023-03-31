package com.google.android.gms.internal.ads;

final class mp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dp f3742b;

    mp(dp dpVar) {
        this.f3742b = dpVar;
    }

    public final void run() {
        if (dp.a(this.f3742b) != null) {
            dp.a(this.f3742b).e();
        }
    }
}
