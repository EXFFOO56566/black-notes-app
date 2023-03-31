package com.google.android.gms.internal.ads;

public abstract class ty1 {

    /* renamed from: a  reason: collision with root package name */
    int f4880a;

    /* renamed from: b  reason: collision with root package name */
    int f4881b;

    /* renamed from: c  reason: collision with root package name */
    int f4882c;
    wy1 d;

    private ty1() {
        this.f4881b = 100;
        this.f4882c = Integer.MAX_VALUE;
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static ty1 a(byte[] bArr, int i, int i2, boolean z) {
        vy1 vy1 = new vy1(bArr, i, i2, z);
        try {
            vy1.c(i2);
            return vy1;
        } catch (b02 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double a();

    public abstract void a(int i);

    public abstract float b();

    public abstract boolean b(int i);

    public abstract int c(int i);

    public abstract String c();

    public abstract int d();

    public abstract void d(int i);

    public abstract long e();

    public abstract long f();

    public abstract int g();

    public abstract long h();

    public abstract int i();

    public abstract boolean j();

    public abstract String k();

    public abstract dy1 l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract boolean s();

    public abstract int t();
}
