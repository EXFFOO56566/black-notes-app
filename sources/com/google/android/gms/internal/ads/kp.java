package com.google.android.gms.internal.ads;

final class kp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3426b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3427c;
    private final /* synthetic */ dp d;

    kp(dp dpVar, int i, int i2) {
        this.d = dpVar;
        this.f3426b = i;
        this.f3427c = i2;
    }

    public final void run() {
        if (dp.a(this.d) != null) {
            dp.a(this.d).a(this.f3426b, this.f3427c);
        }
    }
}
