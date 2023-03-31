package com.google.android.gms.internal.ads;

public final class of2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3987a;

    public final synchronized void a() {
        while (!this.f3987a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        if (this.f3987a) {
            return false;
        }
        this.f3987a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.f3987a;
        this.f3987a = false;
        return z;
    }
}
