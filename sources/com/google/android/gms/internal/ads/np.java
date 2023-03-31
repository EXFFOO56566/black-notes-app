package com.google.android.gms.internal.ads;

final class np implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dp f3876b;

    np(dp dpVar) {
        this.f3876b = dpVar;
    }

    public final void run() {
        if (dp.a(this.f3876b) != null) {
            dp.a(this.f3876b).d();
            dp.a(this.f3876b).b();
        }
    }
}
