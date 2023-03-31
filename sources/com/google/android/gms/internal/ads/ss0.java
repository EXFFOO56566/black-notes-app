package com.google.android.gms.internal.ads;

public final class ss0 implements a60, l70 {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4698c = new Object();
    private static int d;

    /* renamed from: b  reason: collision with root package name */
    private final xs0 f4699b;

    public ss0(xs0 xs0) {
        this.f4699b = xs0;
    }

    private static void a() {
        synchronized (f4698c) {
            d++;
        }
    }

    private static boolean b() {
        boolean z;
        synchronized (f4698c) {
            z = d < ((Integer) on2.e().a(zr2.a3)).intValue();
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(int i) {
        if (((Boolean) on2.e().a(zr2.Z2)).booleanValue() && b()) {
            this.f4699b.a(false);
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        if (((Boolean) on2.e().a(zr2.Z2)).booleanValue() && b()) {
            this.f4699b.a(true);
            a();
        }
    }
}
