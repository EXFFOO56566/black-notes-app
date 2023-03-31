package com.google.android.gms.internal.ads;

final class pp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dp f4214b;

    pp(dp dpVar) {
        this.f4214b = dpVar;
    }

    public final void run() {
        if (dp.a(this.f4214b) != null) {
            dp.a(this.f4214b).d();
        }
    }
}
