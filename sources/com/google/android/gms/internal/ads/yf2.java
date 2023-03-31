package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class yf2 implements qf2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5587a;

    /* renamed from: b  reason: collision with root package name */
    private long f5588b;

    /* renamed from: c  reason: collision with root package name */
    private long f5589c;
    private k82 d = k82.d;

    @Override // com.google.android.gms.internal.ads.qf2
    public final long a() {
        long j = this.f5588b;
        if (!this.f5587a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5589c;
        k82 k82 = this.d;
        return j + (k82.f3342a == 1.0f ? p72.b(elapsedRealtime) : k82.a(elapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.qf2
    public final k82 a(k82 k82) {
        if (this.f5587a) {
            a(a());
        }
        this.d = k82;
        return k82;
    }

    public final void a(long j) {
        this.f5588b = j;
        if (this.f5587a) {
            this.f5589c = SystemClock.elapsedRealtime();
        }
    }

    public final void a(qf2 qf2) {
        a(qf2.a());
        this.d = qf2.b();
    }

    @Override // com.google.android.gms.internal.ads.qf2
    public final k82 b() {
        return this.d;
    }

    public final void c() {
        if (!this.f5587a) {
            this.f5589c = SystemClock.elapsedRealtime();
            this.f5587a = true;
        }
    }

    public final void d() {
        if (this.f5587a) {
            a(a());
            this.f5587a = false;
        }
    }
}
