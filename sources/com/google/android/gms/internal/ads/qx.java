package com.google.android.gms.internal.ads;

final /* synthetic */ class qx implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ox f4408b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4409c;

    qx(ox oxVar, Runnable runnable) {
        this.f4408b = oxVar;
        this.f4409c = runnable;
    }

    public final void run() {
        this.f4408b.a(this.f4409c);
    }
}
