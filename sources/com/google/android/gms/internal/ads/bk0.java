package com.google.android.gms.internal.ads;

final /* synthetic */ class bk0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ws f1962b;

    private bk0(ws wsVar) {
        this.f1962b = wsVar;
    }

    static Runnable a(ws wsVar) {
        return new bk0(wsVar);
    }

    public final void run() {
        this.f1962b.destroy();
    }
}
