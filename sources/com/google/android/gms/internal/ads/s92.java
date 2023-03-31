package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class s92 {

    /* renamed from: a  reason: collision with root package name */
    private final int f4619a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4620b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4621c;
    private final int d;
    private final int e;
    private final short[] f;
    private int g;
    private short[] h;
    private int i;
    private short[] j;
    private int k;
    private short[] l;
    private int m = 0;
    private int n = 0;
    private float o = 1.0f;
    private float p = 1.0f;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u = 0;
    private int v;
    private int w;
    private int x;

    public s92(int i2, int i3) {
        this.f4619a = i2;
        this.f4620b = i3;
        this.f4621c = i2 / 400;
        int i4 = i2 / 65;
        this.d = i4;
        int i5 = i4 * 2;
        this.e = i5;
        this.f = new short[i5];
        this.g = i5;
        this.h = new short[(i5 * i3)];
        this.i = i5;
        this.j = new short[(i5 * i3)];
        this.k = i5;
        this.l = new short[(i5 * i3)];
    }

    private final int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f4620b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                short s2 = sArr[i5 + i11];
                short s3 = sArr[i5 + i3 + i11];
                i10 += s2 >= s3 ? s2 - s3 : s3 - s2;
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.w = i6 / i8;
        this.x = i9 / i7;
        return i8;
    }

    private final void a(int i2) {
        int i3 = this.r + i2;
        int i4 = this.i;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.i = i5;
            this.j = Arrays.copyOf(this.j, i5 * this.f4620b);
        }
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    private final void a(short[] sArr, int i2, int i3) {
        a(i3);
        int i4 = this.f4620b;
        System.arraycopy(sArr, i2 * i4, this.j, this.r * i4, i4 * i3);
        this.r += i3;
    }

    private final void b(int i2) {
        int i3 = this.q + i2;
        int i4 = this.g;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.g = i5;
            this.h = Arrays.copyOf(this.h, i5 * this.f4620b);
        }
    }

    private final void b(short[] sArr, int i2, int i3) {
        int i4 = this.e / i3;
        int i5 = this.f4620b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f[i8] = (short) (i9 / i6);
        }
    }

    private final void c() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.r;
        float f2 = this.o / this.p;
        double d2 = (double) f2;
        int i9 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i10 = this.q;
            if (i10 >= this.e) {
                int i11 = 0;
                while (true) {
                    int i12 = this.t;
                    if (i12 > 0) {
                        int min = Math.min(this.e, i12);
                        a(this.h, i11, min);
                        this.t -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.h;
                        int i13 = this.f4619a;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.f4620b == i9 && i14 == i9) {
                            i5 = a(sArr, i11, this.f4621c, this.d);
                        } else {
                            b(sArr, i11, i14);
                            int a2 = a(this.f, 0, this.f4621c / i14, this.d / i14);
                            if (i14 != i9) {
                                int i15 = a2 * i14;
                                int i16 = i14 << 2;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f4621c;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.d;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f4620b == i9) {
                                    i5 = a(sArr, i11, i17, i18);
                                } else {
                                    b(sArr, i11, i9);
                                    i5 = a(this.f, 0, i17, i18);
                                }
                            } else {
                                i5 = a2;
                            }
                        }
                        int i21 = this.w;
                        int i22 = i21 != 0 && this.u != 0 && this.x <= i21 * 3 && (i21 << 1) > this.v * 3 ? this.u : i5;
                        this.v = this.w;
                        this.u = i5;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.h;
                            if (f2 >= 2.0f) {
                                i7 = (int) (((float) i22) / (f2 - 1.0f));
                            } else {
                                this.t = (int) ((((float) i22) * (2.0f - f2)) / (f2 - 1.0f));
                                i7 = i22;
                            }
                            a(i7);
                            a(i7, this.f4620b, this.j, this.r, sArr2, i11, sArr2, i11 + i22);
                            this.r += i7;
                            i11 += i22 + i7;
                        } else {
                            short[] sArr3 = this.h;
                            if (f2 < 0.5f) {
                                i6 = (int) ((((float) i22) * f2) / (1.0f - f2));
                            } else {
                                this.t = (int) ((((float) i22) * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
                                i6 = i22;
                            }
                            int i23 = i22 + i6;
                            a(i23);
                            int i24 = this.f4620b;
                            System.arraycopy(sArr3, i11 * i24, this.j, this.r * i24, i24 * i22);
                            a(i6, this.f4620b, this.j, this.r + i22, sArr3, i22 + i11, sArr3, i11);
                            this.r += i23;
                            i11 += i6;
                        }
                    }
                    if (this.e + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                }
                int i25 = this.q - i11;
                short[] sArr4 = this.h;
                int i26 = this.f4620b;
                System.arraycopy(sArr4, i11 * i26, sArr4, 0, i26 * i25);
                this.q = i25;
            }
        } else {
            a(this.h, 0, this.q);
            this.q = 0;
        }
        float f3 = this.p;
        if (f3 != 1.0f && this.r != i8) {
            int i27 = this.f4619a;
            int i28 = (int) (((float) i27) / f3);
            while (true) {
                if (i28 <= 16384 && i27 <= 16384) {
                    break;
                }
                i28 /= 2;
                i27 /= 2;
            }
            int i29 = this.r - i8;
            int i30 = this.s + i29;
            int i31 = this.k;
            if (i30 > i31) {
                int i32 = i31 + (i31 / 2) + i29;
                this.k = i32;
                this.l = Arrays.copyOf(this.l, i32 * this.f4620b);
            }
            short[] sArr5 = this.j;
            int i33 = this.f4620b;
            System.arraycopy(sArr5, i8 * i33, this.l, this.s * i33, i33 * i29);
            this.r = i8;
            this.s += i29;
            int i34 = 0;
            while (true) {
                i2 = this.s;
                if (i34 >= i2 - 1) {
                    break;
                }
                while (true) {
                    i3 = this.m;
                    int i35 = (i3 + 1) * i28;
                    i4 = this.n;
                    if (i35 <= i4 * i27) {
                        break;
                    }
                    a(1);
                    int i36 = 0;
                    while (true) {
                        int i37 = this.f4620b;
                        if (i36 >= i37) {
                            break;
                        }
                        short[] sArr6 = this.l;
                        int i38 = (i34 * i37) + i36;
                        short s2 = sArr6[i38];
                        short s3 = sArr6[i38 + i37];
                        int i39 = this.m;
                        int i40 = i39 * i28;
                        int i41 = (i39 + 1) * i28;
                        int i42 = i41 - (this.n * i27);
                        int i43 = i41 - i40;
                        this.j[(this.r * i37) + i36] = (short) (((s2 * i42) + ((i43 - i42) * s3)) / i43);
                        i36++;
                    }
                    this.n++;
                    this.r++;
                }
                int i44 = i3 + 1;
                this.m = i44;
                if (i44 == i27) {
                    this.m = 0;
                    mf2.b(i4 == i28);
                    this.n = 0;
                }
                i34++;
            }
            int i45 = i2 - 1;
            if (i45 != 0) {
                short[] sArr7 = this.l;
                int i46 = this.f4620b;
                System.arraycopy(sArr7, i45 * i46, sArr7, 0, (i2 - i45) * i46);
                this.s -= i45;
            }
        }
    }

    public final void a() {
        int i2;
        int i3 = this.q;
        float f2 = this.o;
        float f3 = this.p;
        int i4 = this.r + ((int) ((((((float) i3) / (f2 / f3)) + ((float) this.s)) / f3) + 0.5f));
        b((this.e * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.e;
            int i6 = this.f4620b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.h[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.q += i2 * 2;
        c();
        if (this.r > i4) {
            this.r = i4;
        }
        this.q = 0;
        this.t = 0;
        this.s = 0;
    }

    public final void a(float f2) {
        this.o = f2;
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f4620b;
        int i3 = remaining / i2;
        b(i3);
        shortBuffer.get(this.h, this.q * this.f4620b, ((i2 * i3) << 1) / 2);
        this.q += i3;
        c();
    }

    public final int b() {
        return this.r;
    }

    public final void b(float f2) {
        this.p = f2;
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f4620b, this.r);
        shortBuffer.put(this.j, 0, this.f4620b * min);
        int i2 = this.r - min;
        this.r = i2;
        short[] sArr = this.j;
        int i3 = this.f4620b;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }
}
