package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.r;

public final class w8 extends yo<r7> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f5224c = new Object();
    private mm<r7> d;
    private boolean e;
    private int f;

    public w8(mm<r7> mmVar) {
        this.d = mmVar;
        this.e = false;
        this.f = 0;
    }

    private final void f() {
        synchronized (this.f5224c) {
            r.b(this.f >= 0);
            if (!this.e || this.f != 0) {
                wk.e("There are still references to the engine. Not destroying.");
            } else {
                wk.e("No reference is left (including root). Cleaning up engine.");
                a(new c9(this), new wo());
            }
        }
    }

    public final s8 c() {
        s8 s8Var = new s8(this);
        synchronized (this.f5224c) {
            a(new z8(this, s8Var), new y8(this, s8Var));
            r.b(this.f >= 0);
            this.f++;
        }
        return s8Var;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        synchronized (this.f5224c) {
            r.b(this.f > 0);
            wk.e("Releasing 1 reference for JS Engine");
            this.f--;
            f();
        }
    }

    public final void e() {
        synchronized (this.f5224c) {
            r.b(this.f >= 0);
            wk.e("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            f();
        }
    }
}
