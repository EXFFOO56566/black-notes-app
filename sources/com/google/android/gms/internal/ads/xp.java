package com.google.android.gms.internal.ads;

final class xp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ tp f5472b;

    xp(tp tpVar) {
        this.f5472b = tpVar;
    }

    public final void run() {
        this.f5472b.b("surfaceDestroyed", new String[0]);
    }
}
