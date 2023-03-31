package com.google.android.gms.internal.ads;

final class lp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dp f3587b;

    lp(dp dpVar) {
        this.f3587b = dpVar;
    }

    public final void run() {
        if (dp.a(this.f3587b) != null) {
            dp.a(this.f3587b).g();
        }
    }
}
