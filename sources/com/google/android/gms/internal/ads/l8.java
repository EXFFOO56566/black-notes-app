package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final r7 f3505b;

    private l8(r7 r7Var) {
        this.f3505b = r7Var;
    }

    static Runnable a(r7 r7Var) {
        return new l8(r7Var);
    }

    public final void run() {
        this.f3505b.destroy();
    }
}
