package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class yg2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f5594b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f5595c;
    private final /* synthetic */ int d;
    private final /* synthetic */ float e;
    private final /* synthetic */ rg2 f;

    yg2(rg2 rg2, int i, int i2, int i3, float f2) {
        this.f = rg2;
        this.f5594b = i;
        this.f5595c = i2;
        this.d = i3;
        this.e = f2;
    }

    public final void run() {
        this.f.f4502b.a(this.f5594b, this.f5595c, this.d, this.e);
    }
}
