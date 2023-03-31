package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class d92 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ y92 f2228b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v82 f2229c;

    d92(v82 v82, y92 y92) {
        this.f2229c = v82;
        this.f2228b = y92;
    }

    public final void run() {
        this.f2228b.a();
        this.f2229c.f5066b.a(this.f2228b);
    }
}
