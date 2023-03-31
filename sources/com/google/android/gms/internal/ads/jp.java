package com.google.android.gms.internal.ads;

final class jp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dp f3261b;

    jp(dp dpVar) {
        this.f3261b = dpVar;
    }

    public final void run() {
        if (dp.a(this.f3261b) != null) {
            dp.a(this.f3261b).c();
        }
    }
}
