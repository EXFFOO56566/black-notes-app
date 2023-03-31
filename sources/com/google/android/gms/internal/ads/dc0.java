package com.google.android.gms.internal.ads;

final /* synthetic */ class dc0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ws f2239b;

    private dc0(ws wsVar) {
        this.f2239b = wsVar;
    }

    static Runnable a(ws wsVar) {
        return new dc0(wsVar);
    }

    public final void run() {
        this.f2239b.destroy();
    }
}
