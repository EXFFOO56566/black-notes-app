package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class zg2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ y92 f5751b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ rg2 f5752c;

    zg2(rg2 rg2, y92 y92) {
        this.f5752c = rg2;
        this.f5751b = y92;
    }

    public final void run() {
        this.f5751b.a();
        this.f5752c.f4502b.b(this.f5751b);
    }
}
