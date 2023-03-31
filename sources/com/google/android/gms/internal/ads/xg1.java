package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class xg1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ud1 f5426b;

    xg1(ud1 ud1) {
        this.f5426b = ud1;
    }

    public final void run() {
        boolean z;
        if (this.f5426b.f4933b == null) {
            synchronized (ud1.f4931c) {
                if (this.f5426b.f4933b == null) {
                    boolean z2 = false;
                    try {
                        z = zr2.U0.a().booleanValue();
                    } catch (IllegalStateException unused) {
                        z = false;
                    }
                    if (z) {
                        try {
                            ud1.d = new ak2(this.f5426b.f4932a.f3499a, "ADSHIELD", null);
                        } catch (Throwable unused2) {
                        }
                    }
                    z2 = z;
                    this.f5426b.f4933b = Boolean.valueOf(z2);
                    ud1.f4931c.open();
                }
            }
        }
    }
}
