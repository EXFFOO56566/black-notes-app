package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class tt implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final rt f4851b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4852c;
    private final int d;
    private final boolean e;
    private final boolean f;

    tt(rt rtVar, int i, int i2, boolean z, boolean z2) {
        this.f4851b = rtVar;
        this.f4852c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
    }

    public final void run() {
        this.f4851b.a(this.f4852c, this.d, this.e, this.f);
    }
}
