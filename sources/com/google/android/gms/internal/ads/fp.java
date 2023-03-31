package com.google.android.gms.internal.ads;

final class fp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ dp f2638b;

    fp(dp dpVar) {
        this.f2638b = dpVar;
    }

    public final void run() {
        if (dp.a(this.f2638b) != null) {
            dp.a(this.f2638b).a();
        }
    }
}
