package com.google.android.gms.internal.ads;

public final class br implements i82 {

    /* renamed from: a  reason: collision with root package name */
    private final cf2 f1996a;

    /* renamed from: b  reason: collision with root package name */
    private long f1997b;

    /* renamed from: c  reason: collision with root package name */
    private long f1998c;
    private long d;
    private long e;
    private int f;
    private boolean g;

    br() {
        this(15000, 30000, 2500, 5000);
    }

    private br(int i, int i2, long j, long j2) {
        this.f1996a = new cf2(true, 65536);
        this.f1997b = 15000000;
        this.f1998c = 30000000;
        this.d = 2500000;
        this.e = 5000000;
    }

    private final void a(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.f1996a.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.i82
    public final void a() {
        a(false);
    }

    public final synchronized void a(int i) {
        this.d = ((long) i) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.i82
    public final void a(j82[] j82Arr, ee2 ee2, pe2 pe2) {
        this.f = 0;
        for (int i = 0; i < j82Arr.length; i++) {
            if (pe2.a(i) != null) {
                this.f += ag2.b(j82Arr[i].F());
            }
        }
        this.f1996a.a(this.f);
    }

    @Override // com.google.android.gms.internal.ads.i82
    public final synchronized boolean a(long j) {
        boolean z;
        z = false;
        char c2 = j > this.f1998c ? 0 : j < this.f1997b ? (char) 2 : 1;
        boolean z2 = this.f1996a.d() >= this.f;
        if (c2 == 2 || (c2 == 1 && this.g && !z2)) {
            z = true;
        }
        this.g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.i82
    public final synchronized boolean a(long j, boolean z) {
        long j2;
        j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    @Override // com.google.android.gms.internal.ads.i82
    public final void b() {
        a(true);
    }

    public final synchronized void b(int i) {
        this.e = ((long) i) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.i82
    public final we2 c() {
        return this.f1996a;
    }

    public final synchronized void c(int i) {
        this.f1997b = ((long) i) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.i82
    public final void d() {
        a(true);
    }

    public final synchronized void d(int i) {
        this.f1998c = ((long) i) * 1000;
    }
}
