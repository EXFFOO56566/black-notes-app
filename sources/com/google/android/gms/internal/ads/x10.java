package com.google.android.gms.internal.ads;

final /* synthetic */ class x10 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final v10 f5346b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f5347c;

    x10(v10 v10, Runnable runnable) {
        this.f5346b = v10;
        this.f5347c = runnable;
    }

    public final void run() {
        this.f5346b.a(this.f5347c);
    }
}
