package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class vy1 extends ty1 {
    private final byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private vy1(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.k = Integer.MAX_VALUE;
        this.e = bArr;
        this.f = i3 + i2;
        this.h = i2;
        this.i = i2;
    }

    private final byte A() {
        int i2 = this.h;
        if (i2 != this.f) {
            byte[] bArr = this.e;
            this.h = i2 + 1;
            return bArr[i2];
        }
        throw b02.a();
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (i2 <= i3 - i4) {
                this.h = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw b02.b();
        }
        throw b02.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy1.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy1.w():long");
    }

    private final int x() {
        int i2 = this.h;
        if (this.f - i2 >= 4) {
            byte[] bArr = this.e;
            this.h = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw b02.a();
    }

    private final long y() {
        int i2 = this.h;
        if (this.f - i2 >= 8) {
            byte[] bArr = this.e;
            this.h = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw b02.a();
    }

    private final void z() {
        int i2 = this.f + this.g;
        this.f = i2;
        int i3 = i2 - this.i;
        int i4 = this.k;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.g = i5;
            this.f = i2 - i5;
            return;
        }
        this.g = 0;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final double a() {
        return Double.longBitsToDouble(y());
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final void a(int i2) {
        if (this.j != i2) {
            throw b02.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final float b() {
        return Float.intBitsToFloat(x());
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean b(int i2) {
        int d;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f - this.h >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.e;
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw b02.c();
            }
            while (i4 < 10) {
                if (A() < 0) {
                    i4++;
                }
            }
            throw b02.c();
            return true;
        } else if (i3 == 1) {
            f(8);
            return true;
        } else if (i3 == 2) {
            f(v());
            return true;
        } else if (i3 == 3) {
            do {
                d = d();
                if (d == 0) {
                    break;
                }
            } while (b(d));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                f(4);
                return true;
            }
            throw b02.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int c(int i2) {
        if (i2 >= 0) {
            int t = i2 + t();
            int i3 = this.k;
            if (t <= i3) {
                this.k = t;
                z();
                return i3;
            }
            throw b02.a();
        }
        throw b02.b();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final String c() {
        int v = v();
        if (v > 0 && v <= this.f - this.h) {
            String str = new String(this.e, this.h, v, uz1.f5029a);
            this.h += v;
            return str;
        } else if (v == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (v < 0) {
                throw b02.b();
            }
            throw b02.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int d() {
        if (s()) {
            this.j = 0;
            return 0;
        }
        int v = v();
        this.j = v;
        if ((v >>> 3) != 0) {
            return v;
        }
        throw b02.d();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final void d(int i2) {
        this.k = i2;
        z();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long e() {
        return w();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long f() {
        return w();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int g() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long h() {
        return y();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int i() {
        return x();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean j() {
        return w() != 0;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final String k() {
        int v = v();
        if (v > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (v <= i2 - i3) {
                String c2 = a32.c(this.e, i3, v);
                this.h += v;
                return c2;
            }
        }
        if (v == 0) {
            return BuildConfig.FLAVOR;
        }
        if (v <= 0) {
            throw b02.b();
        }
        throw b02.a();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final dy1 l() {
        byte[] bArr;
        int v = v();
        if (v > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (v <= i2 - i3) {
                dy1 a2 = dy1.a(this.e, i3, v);
                this.h += v;
                return a2;
            }
        }
        if (v == 0) {
            return dy1.f2334c;
        }
        if (v > 0) {
            int i4 = this.f;
            int i5 = this.h;
            if (v <= i4 - i5) {
                int i6 = v + i5;
                this.h = i6;
                bArr = Arrays.copyOfRange(this.e, i5, i6);
                return dy1.b(bArr);
            }
        }
        if (v > 0) {
            throw b02.a();
        } else if (v == 0) {
            bArr = uz1.f5030b;
            return dy1.b(bArr);
        } else {
            throw b02.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int m() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int n() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int o() {
        return x();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long p() {
        return y();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int q() {
        return ty1.e(v());
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long r() {
        return ty1.a(w());
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean s() {
        return this.h == this.f;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int t() {
        return this.h - this.i;
    }

    /* access modifiers changed from: package-private */
    public final long u() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw b02.c();
    }
}
