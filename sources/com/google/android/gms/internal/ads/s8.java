package com.google.android.gms.internal.ads;

public final class s8 extends yo<e9> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f4612c = new Object();
    private final w8 d;
    private boolean e;

    public s8(w8 w8Var) {
        this.d = w8Var;
    }

    public final void c() {
        synchronized (this.f4612c) {
            if (!this.e) {
                this.e = true;
                a(new v8(this), new wo());
                a(new u8(this), new x8(this));
            }
        }
    }
}
