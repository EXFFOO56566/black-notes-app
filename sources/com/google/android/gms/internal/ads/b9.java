package com.google.android.gms.internal.ads;

final /* synthetic */ class b9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final c9 f1892b;

    /* renamed from: c  reason: collision with root package name */
    private final r7 f1893c;

    b9(c9 c9Var, r7 r7Var) {
        this.f1892b = c9Var;
        this.f1893c = r7Var;
    }

    public final void run() {
        c9 c9Var = this.f1892b;
        r7 r7Var = this.f1893c;
        c9Var.f2082a.d.a(r7Var);
        r7Var.destroy();
    }
}
