package com.google.android.gms.internal.ads;

final /* synthetic */ class yq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final oq f5632b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5633c;
    private final long d;

    yq(oq oqVar, boolean z, long j) {
        this.f5632b = oqVar;
        this.f5633c = z;
        this.d = j;
    }

    public final void run() {
        this.f5632b.b(this.f5633c, this.d);
    }
}
