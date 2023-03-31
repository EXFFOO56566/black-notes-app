package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

final class jg1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f3220a;

    /* renamed from: b  reason: collision with root package name */
    private final ig1 f3221b = new ig1();

    /* renamed from: c  reason: collision with root package name */
    private long f3222c;
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public jg1() {
        long a2 = q.j().a();
        this.f3220a = a2;
        this.f3222c = a2;
    }

    public final long a() {
        return this.f3220a;
    }

    public final long b() {
        return this.f3222c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return "Created: " + this.f3220a + " Last accessed: " + this.f3222c + " Accesses: " + this.d + "\nEntries retrieved: Valid: " + this.e + " Stale: " + this.f;
    }

    public final void e() {
        this.f3222c = q.j().a();
        this.d++;
    }

    public final void f() {
        this.e++;
        this.f3221b.f3081b = true;
    }

    public final void g() {
        this.f++;
        this.f3221b.f3082c++;
    }

    public final ig1 h() {
        ig1 ig1 = (ig1) this.f3221b.clone();
        ig1 ig12 = this.f3221b;
        ig12.f3081b = false;
        ig12.f3082c = 0;
        return ig1;
    }
}
