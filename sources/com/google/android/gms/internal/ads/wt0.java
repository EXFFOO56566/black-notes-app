package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class wt0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ws f5314b;

    private wt0(ws wsVar) {
        this.f5314b = wsVar;
    }

    static Runnable a(ws wsVar) {
        return new wt0(wsVar);
    }

    public final void run() {
        this.f5314b.Q();
    }
}
