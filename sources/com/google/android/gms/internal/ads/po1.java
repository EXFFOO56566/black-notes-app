package com.google.android.gms.internal.ads;

final class po1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f4212b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ mo1 f4213c;

    po1(mo1 mo1, Runnable runnable) {
        this.f4213c = mo1;
        this.f4212b = runnable;
    }

    public final void run() {
        this.f4213c.f3740b = false;
        this.f4212b.run();
    }
}
