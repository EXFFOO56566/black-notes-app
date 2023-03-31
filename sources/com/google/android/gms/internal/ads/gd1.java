package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import javax.annotation.concurrent.GuardedBy;

public final class gd1 {

    /* renamed from: a  reason: collision with root package name */
    private final d f2739a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f2740b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private volatile int f2741c = fd1.f2579a;
    private volatile long d = 0;

    public gd1(d dVar) {
        this.f2739a = dVar;
    }

    private final void a(int i, int i2) {
        d();
        long a2 = this.f2739a.a();
        synchronized (this.f2740b) {
            if (this.f2741c == i) {
                this.f2741c = i2;
                if (this.f2741c == fd1.f2581c) {
                    this.d = a2;
                }
            }
        }
    }

    private final void d() {
        long a2 = this.f2739a.a();
        synchronized (this.f2740b) {
            if (this.f2741c == fd1.f2581c) {
                if (this.d + ((Long) on2.e().a(zr2.N2)).longValue() <= a2) {
                    this.f2741c = fd1.f2579a;
                }
            }
        }
    }

    public final void a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = fd1.f2579a;
            i2 = fd1.f2580b;
        } else {
            i = fd1.f2580b;
            i2 = fd1.f2579a;
        }
        a(i, i2);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f2740b) {
            d();
            z = this.f2741c == fd1.f2580b;
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f2740b) {
            d();
            z = this.f2741c == fd1.f2581c;
        }
        return z;
    }

    public final void c() {
        a(fd1.f2580b, fd1.f2581c);
    }
}
