package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class iq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private tp f3122b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3123c = false;

    iq(tp tpVar) {
        this.f3122b = tpVar;
    }

    private final void c() {
        gl.h.removeCallbacks(this);
        gl.h.postDelayed(this, 250);
    }

    public final void a() {
        this.f3123c = true;
        this.f3122b.o();
    }

    public final void b() {
        this.f3123c = false;
        c();
    }

    public final void run() {
        if (!this.f3123c) {
            this.f3122b.o();
            c();
        }
    }
}
