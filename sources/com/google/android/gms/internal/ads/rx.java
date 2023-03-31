package com.google.android.gms.internal.ads;

final /* synthetic */ class rx implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ox f4563b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4564c;

    rx(ox oxVar, Runnable runnable) {
        this.f4563b = oxVar;
        this.f4564c = runnable;
    }

    public final void run() {
        jo.e.execute(new qx(this.f4563b, this.f4564c));
    }
}
