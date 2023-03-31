package com.google.android.gms.internal.ads;

final /* synthetic */ class sp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final rp f4690b;

    private sp(rp rpVar) {
        this.f4690b = rpVar;
    }

    static Runnable a(rp rpVar) {
        return new sp(rpVar);
    }

    public final void run() {
        this.f4690b.d();
    }
}
