package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class m8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w8 f3676b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ r7 f3677c;
    private final /* synthetic */ f8 d;

    m8(f8 f8Var, w8 w8Var, r7 r7Var) {
        this.d = f8Var;
        this.f3676b = w8Var;
        this.f3677c = r7Var;
    }

    public final void run() {
        synchronized (this.d.f2551a) {
            if (this.f3676b.a() != -1) {
                if (this.f3676b.a() != 1) {
                    this.f3676b.b();
                    ko1 ko1 = jo.e;
                    r7 r7Var = this.f3677c;
                    r7Var.getClass();
                    ko1.execute(p8.a(r7Var));
                    wk.e("Could not receive loaded message in a timely manner. Rejecting.");
                }
            }
        }
    }
}
