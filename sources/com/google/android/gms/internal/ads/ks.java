package com.google.android.gms.internal.ads;

final /* synthetic */ class ks implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final gq f3443b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3444c;
    private final long d;

    ks(gq gqVar, boolean z, long j) {
        this.f3443b = gqVar;
        this.f3444c = z;
        this.d = j;
    }

    public final void run() {
        this.f3443b.a(this.f3444c, this.d);
    }
}
