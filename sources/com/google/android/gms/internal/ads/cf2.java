package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class cf2 implements we2 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2110a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2111b;

    /* renamed from: c  reason: collision with root package name */
    private final te2[] f2112c;
    private int d;
    private int e;
    private int f;
    private te2[] g;

    public cf2(boolean z, int i) {
        this(true, 65536, 0);
    }

    private cf2(boolean z, int i, int i2) {
        mf2.a(true);
        mf2.a(true);
        this.f2110a = true;
        this.f2111b = 65536;
        this.f = 0;
        this.g = new te2[100];
        this.f2112c = new te2[1];
    }

    @Override // com.google.android.gms.internal.ads.we2
    public final synchronized te2 a() {
        te2 te2;
        this.e++;
        if (this.f > 0) {
            te2[] te2Arr = this.g;
            int i = this.f - 1;
            this.f = i;
            te2 = te2Arr[i];
            this.g[i] = null;
        } else {
            te2 = new te2(new byte[this.f2111b], 0);
        }
        return te2;
    }

    public final synchronized void a(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            e0();
        }
    }

    @Override // com.google.android.gms.internal.ads.we2
    public final synchronized void a(te2 te2) {
        this.f2112c[0] = te2;
        a(this.f2112c);
    }

    @Override // com.google.android.gms.internal.ads.we2
    public final synchronized void a(te2[] te2Arr) {
        boolean z;
        if (this.f + te2Arr.length >= this.g.length) {
            this.g = (te2[]) Arrays.copyOf(this.g, Math.max(this.g.length << 1, this.f + te2Arr.length));
        }
        for (te2 te2 : te2Arr) {
            if (te2.f4800a != null) {
                if (te2.f4800a.length != this.f2111b) {
                    z = false;
                    mf2.a(z);
                    te2[] te2Arr2 = this.g;
                    int i = this.f;
                    this.f = i + 1;
                    te2Arr2[i] = te2;
                }
            }
            z = true;
            mf2.a(z);
            te2[] te2Arr22 = this.g;
            int i2 = this.f;
            this.f = i2 + 1;
            te2Arr22[i2] = te2;
        }
        this.e -= te2Arr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.we2
    public final int b() {
        return this.f2111b;
    }

    public final synchronized void c() {
        if (this.f2110a) {
            a(0);
        }
    }

    public final synchronized int d() {
        return this.e * this.f2111b;
    }

    @Override // com.google.android.gms.internal.ads.we2
    public final synchronized void e0() {
        int max = Math.max(0, ag2.a(this.d, this.f2111b) - this.e);
        if (max < this.f) {
            Arrays.fill(this.g, max, this.f, (Object) null);
            this.f = max;
        }
    }
}
