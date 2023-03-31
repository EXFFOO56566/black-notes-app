package com.google.android.gms.internal.ads;

final /* synthetic */ class tq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final oq f4844b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4845c;
    private final int d;

    tq(oq oqVar, int i, int i2) {
        this.f4844b = oqVar;
        this.f4845c = i;
        this.d = i2;
    }

    public final void run() {
        this.f4844b.b(this.f4845c, this.d);
    }
}
