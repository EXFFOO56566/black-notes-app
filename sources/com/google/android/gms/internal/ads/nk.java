package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class nk {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3859a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f3860b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f3861c;

    private nk() {
        this.f3859a = new Object();
        this.f3860b = mk.f3723a;
        this.f3861c = 0;
    }

    /* synthetic */ nk(kk kkVar) {
        this();
    }

    public final void a() {
        long a2 = q.j().a();
        synchronized (this.f3859a) {
            if (this.f3860b == mk.f3724b) {
                if (this.f3861c + ((Long) on2.e().a(zr2.N2)).longValue() <= a2) {
                    this.f3860b = mk.f3723a;
                }
            }
        }
        long a3 = q.j().a();
        synchronized (this.f3859a) {
            if (this.f3860b == 2) {
                this.f3860b = 3;
                if (this.f3860b == mk.f3724b) {
                    this.f3861c = a3;
                }
            }
        }
    }
}
