package com.google.android.gms.internal.ads;

final class wp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f5303b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ tp f5304c;

    wp(tp tpVar, boolean z) {
        this.f5304c = tpVar;
        this.f5303b = z;
    }

    public final void run() {
        this.f5304c.b("windowVisibilityChanged", "isVisible", String.valueOf(this.f5303b));
    }
}
