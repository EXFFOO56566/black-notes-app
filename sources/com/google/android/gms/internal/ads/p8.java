package com.google.android.gms.internal.ads;

final /* synthetic */ class p8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final r7 f4123b;

    private p8(r7 r7Var) {
        this.f4123b = r7Var;
    }

    static Runnable a(r7 r7Var) {
        return new p8(r7Var);
    }

    public final void run() {
        this.f4123b.destroy();
    }
}
