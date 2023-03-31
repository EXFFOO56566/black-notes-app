package com.google.android.gms.internal.ads;

final class cc2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final gh2 f2097b;

    /* renamed from: c  reason: collision with root package name */
    private final ar2 f2098c;
    private final Runnable d;

    public cc2(gh2 gh2, ar2 ar2, Runnable runnable) {
        this.f2097b = gh2;
        this.f2098c = ar2;
        this.d = runnable;
    }

    public final void run() {
        this.f2097b.f();
        if (this.f2098c.f1808c == null) {
            this.f2097b.a((Object) this.f2098c.f1806a);
        } else {
            this.f2097b.a(this.f2098c.f1808c);
        }
        if (this.f2098c.d) {
            this.f2097b.a("intermediate-response");
        } else {
            this.f2097b.b("done");
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
