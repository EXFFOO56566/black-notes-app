package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class vg2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f5114b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f5115c;
    private final /* synthetic */ rg2 d;

    vg2(rg2 rg2, int i, long j) {
        this.d = rg2;
        this.f5114b = i;
        this.f5115c = j;
    }

    public final void run() {
        this.d.f4502b.a(this.f5114b, this.f5115c);
    }
}
