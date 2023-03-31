package com.google.android.gms.internal.ads;

public abstract class n72 implements j82, m82 {

    /* renamed from: a  reason: collision with root package name */
    private final int f3806a;

    /* renamed from: b  reason: collision with root package name */
    private l82 f3807b;

    /* renamed from: c  reason: collision with root package name */
    private int f3808c;
    private int d;
    private wd2 e;
    private long f;
    private boolean g = true;
    private boolean h;

    public n72(int i) {
        this.f3806a = i;
    }

    @Override // com.google.android.gms.internal.ads.j82, com.google.android.gms.internal.ads.m82
    public final int F() {
        return this.f3806a;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void G() {
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final m82 H() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final boolean I() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public qf2 J() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void K() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        mf2.b(z);
        this.d = 0;
        this.e = null;
        this.h = false;
        g();
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final wd2 L() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void M() {
        this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final boolean N() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public final int a(g82 g82, ca2 ca2, boolean z) {
        int a2 = this.e.a(g82, ca2, z);
        if (a2 == -4) {
            if (ca2.c()) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            ca2.d += this.f;
        } else if (a2 == -5) {
            e82 e82 = g82.f2723a;
            long j = e82.x;
            if (j != Long.MAX_VALUE) {
                g82.f2723a = e82.b(j + this.f);
            }
        }
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void a(int i) {
        this.f3808c = i;
    }

    @Override // com.google.android.gms.internal.ads.t72
    public void a(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void a(long j) {
        this.h = false;
        this.g = false;
        a(j, false);
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j, boolean z);

    @Override // com.google.android.gms.internal.ads.j82
    public final void a(l82 l82, e82[] e82Arr, wd2 wd2, long j, boolean z, long j2) {
        mf2.b(this.d == 0);
        this.f3807b = l82;
        this.d = 1;
        a(z);
        a(e82Arr, wd2, j2);
        a(j, z);
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public void a(e82[] e82Arr, long j) {
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void a(e82[] e82Arr, wd2 wd2, long j) {
        mf2.b(!this.h);
        this.e = wd2;
        this.g = false;
        this.f = j;
        a(e82Arr, j);
    }

    /* access modifiers changed from: protected */
    public final void b(long j) {
        this.e.a(j - this.f);
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return this.f3808c;
    }

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract void f();

    /* access modifiers changed from: protected */
    public abstract void g();

    @Override // com.google.android.gms.internal.ads.j82
    public final int getState() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final l82 h() {
        return this.f3807b;
    }

    /* access modifiers changed from: protected */
    public final boolean i() {
        return this.g ? this.h : this.e.D();
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void start() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        mf2.b(z);
        this.d = 2;
        e();
    }

    @Override // com.google.android.gms.internal.ads.j82
    public final void stop() {
        mf2.b(this.d == 2);
        this.d = 1;
        f();
    }
}
