package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class x52 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gh2 f5368b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ lf0 f5369c;

    x52(lf0 lf0, gh2 gh2) {
        this.f5369c = lf0;
        this.f5368b = gh2;
    }

    public final void run() {
        try {
            this.f5369c.f3539c.put(this.f5368b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
