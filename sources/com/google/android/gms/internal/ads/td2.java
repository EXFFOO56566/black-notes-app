package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class td2 {

    /* renamed from: a  reason: collision with root package name */
    private int f4794a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4795b = new int[1000];

    /* renamed from: c  reason: collision with root package name */
    private long[] f4796c = new long[1000];
    private int[] d = new int[1000];
    private int[] e = new int[1000];
    private long[] f = new long[1000];
    private xa2[] g = new xa2[1000];
    private e82[] h = new e82[1000];
    private int i;
    private int j;
    private int k;
    private int l;
    private long m = Long.MIN_VALUE;
    private long n = Long.MIN_VALUE;
    private boolean o = true;
    private boolean p = true;
    private e82 q;

    public final synchronized int a(g82 g82, ca2 ca2, boolean z, boolean z2, e82 e82, sd2 sd2) {
        if (!e()) {
            if (z2) {
                ca2.a(4);
                return -4;
            } else if (this.q == null || (!z && this.q == e82)) {
                return -3;
            } else {
                g82.f2723a = this.q;
                return -5;
            }
        } else if (z || this.h[this.k] != e82) {
            g82.f2723a = this.h[this.k];
            return -5;
        } else {
            if (ca2.f2092c == null) {
                return -3;
            }
            ca2.d = this.f[this.k];
            ca2.a(this.e[this.k]);
            sd2.f4644a = this.d[this.k];
            sd2.f4645b = this.f4796c[this.k];
            sd2.d = this.g[this.k];
            this.m = Math.max(this.m, ca2.d);
            this.i--;
            int i2 = this.k + 1;
            this.k = i2;
            this.j++;
            if (i2 == this.f4794a) {
                this.k = 0;
            }
            sd2.f4646c = this.i > 0 ? this.f4796c[this.k] : sd2.f4645b + ((long) sd2.f4644a);
            return -4;
        }
    }

    public final synchronized long a() {
        return Math.max(this.m, this.n);
    }

    public final synchronized long a(long j2, boolean z) {
        if (e()) {
            if (j2 >= this.f[this.k]) {
                if (j2 > this.n && !z) {
                    return -1;
                }
                int i2 = 0;
                int i3 = this.k;
                int i4 = -1;
                while (i3 != this.l && this.f[i3] <= j2) {
                    if ((this.e[i3] & 1) != 0) {
                        i4 = i2;
                    }
                    i3 = (i3 + 1) % this.f4794a;
                    i2++;
                }
                if (i4 == -1) {
                    return -1;
                }
                int i5 = (this.k + i4) % this.f4794a;
                this.k = i5;
                this.j += i4;
                this.i -= i4;
                return this.f4796c[i5];
            }
        }
        return -1;
    }

    public final synchronized void a(long j2) {
        this.n = Math.max(this.n, j2);
    }

    public final synchronized void a(long j2, int i2, long j3, int i3, xa2 xa2) {
        if (this.o) {
            if ((i2 & 1) != 0) {
                this.o = false;
            } else {
                return;
            }
        }
        mf2.b(!this.p);
        a(j2);
        this.f[this.l] = j2;
        this.f4796c[this.l] = j3;
        this.d[this.l] = i3;
        this.e[this.l] = i2;
        this.g[this.l] = xa2;
        this.h[this.l] = this.q;
        this.f4795b[this.l] = 0;
        int i4 = this.i + 1;
        this.i = i4;
        if (i4 == this.f4794a) {
            int i5 = this.f4794a + 1000;
            int[] iArr = new int[i5];
            long[] jArr = new long[i5];
            long[] jArr2 = new long[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            xa2[] xa2Arr = new xa2[i5];
            e82[] e82Arr = new e82[i5];
            int i6 = this.f4794a - this.k;
            System.arraycopy(this.f4796c, this.k, jArr, 0, i6);
            System.arraycopy(this.f, this.k, jArr2, 0, i6);
            System.arraycopy(this.e, this.k, iArr2, 0, i6);
            System.arraycopy(this.d, this.k, iArr3, 0, i6);
            System.arraycopy(this.g, this.k, xa2Arr, 0, i6);
            System.arraycopy(this.h, this.k, e82Arr, 0, i6);
            System.arraycopy(this.f4795b, this.k, iArr, 0, i6);
            int i7 = this.k;
            System.arraycopy(this.f4796c, 0, jArr, i6, i7);
            System.arraycopy(this.f, 0, jArr2, i6, i7);
            System.arraycopy(this.e, 0, iArr2, i6, i7);
            System.arraycopy(this.d, 0, iArr3, i6, i7);
            System.arraycopy(this.g, 0, xa2Arr, i6, i7);
            System.arraycopy(this.h, 0, e82Arr, i6, i7);
            System.arraycopy(this.f4795b, 0, iArr, i6, i7);
            this.f4796c = jArr;
            this.f = jArr2;
            this.e = iArr2;
            this.d = iArr3;
            this.g = xa2Arr;
            this.h = e82Arr;
            this.f4795b = iArr;
            this.k = 0;
            this.l = this.f4794a;
            this.i = this.f4794a;
            this.f4794a = i5;
            return;
        }
        int i8 = this.l + 1;
        this.l = i8;
        if (i8 == this.f4794a) {
            this.l = 0;
        }
    }

    public final synchronized boolean a(e82 e82) {
        if (e82 == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (ag2.a(e82, this.q)) {
            return false;
        }
        this.q = e82;
        return true;
    }

    public final void b() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.i = 0;
        this.o = true;
    }

    public final void c() {
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final int d() {
        return this.j + this.i;
    }

    public final synchronized boolean e() {
        return this.i != 0;
    }

    public final synchronized e82 f() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final synchronized long g() {
        if (!e()) {
            return -1;
        }
        int i2 = ((this.k + this.i) - 1) % this.f4794a;
        this.k = (this.k + this.i) % this.f4794a;
        this.j += this.i;
        this.i = 0;
        return this.f4796c[i2] + ((long) this.d[i2]);
    }
}
