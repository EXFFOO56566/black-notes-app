package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import javax.annotation.concurrent.GuardedBy;

public final class in {

    /* renamed from: a  reason: collision with root package name */
    private long f3110a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private long f3111b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3112c = new Object();

    public in(long j) {
        this.f3110a = j;
    }

    public final void a(long j) {
        synchronized (this.f3112c) {
            this.f3110a = j;
        }
    }

    public final boolean a() {
        synchronized (this.f3112c) {
            long b2 = q.j().b();
            if (this.f3111b + this.f3110a > b2) {
                return false;
            }
            this.f3111b = b2;
            return true;
        }
    }
}
