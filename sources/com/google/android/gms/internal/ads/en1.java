package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class en1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lo1 f2454b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f2455c;
    private final /* synthetic */ fn1 d;

    en1(fn1 fn1, lo1 lo1, int i) {
        this.d = fn1;
        this.f2454b = lo1;
        this.f2455c = i;
    }

    public final void run() {
        try {
            if (this.f2454b.isCancelled()) {
                this.d.m = null;
                this.d.cancel(false);
            } else {
                this.d.a((fn1) this.f2455c, (int) this.f2454b);
            }
        } finally {
            this.d.a((fn1) null);
        }
    }
}
