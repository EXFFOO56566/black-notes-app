package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class xy1 extends ey1 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f5512b = Logger.getLogger(xy1.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f5513c = y22.a();

    /* renamed from: a  reason: collision with root package name */
    az1 f5514a;

    static class a extends xy1 {
        private final byte[] d;
        private final int e;
        private int f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.d = bArr;
                    this.f = 0;
                    this.e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        private final void c(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final int a() {
            return this.e - this.f;
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(byte b2) {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i, c12 c12) {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(c12);
            a(1, 4);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i, c12 c12, z12 z12) {
            a(i, 2);
            tx1 tx1 = (tx1) c12;
            int i2 = tx1.i();
            if (i2 == -1) {
                i2 = z12.c(tx1);
                tx1.a(i2);
            }
            b(i2);
            z12.a((Object) c12, (l32) this.f5514a);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i, dy1 dy1) {
            a(i, 2);
            a(dy1);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(long j) {
            if (!xy1.f5513c || a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.d;
                    int i = this.f;
                    this.f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    y22.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                y22.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(c12 c12) {
            b(c12.c());
            c12.a(this);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(dy1 dy1) {
            b(dy1.size());
            dy1.a(this);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void a(String str) {
            int i = this.f;
            try {
                int g = xy1.g(str.length() * 3);
                int g2 = xy1.g(str.length());
                if (g2 == g) {
                    int i2 = i + g2;
                    this.f = i2;
                    int a2 = a32.a(str, this.d, i2, a());
                    this.f = i;
                    b((a2 - i) - g2);
                    this.f = a2;
                    return;
                }
                b(a32.a(str));
                this.f = a32.a(str, this.d, this.f, a());
            } catch (e32 e2) {
                this.f = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // com.google.android.gms.internal.ads.ey1
        public final void a(byte[] bArr, int i, int i2) {
            c(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void b(int i) {
            if (!xy1.f5513c || ay1.a() || a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                y22.a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.f;
                this.f = i5 + 1;
                y22.a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.f;
                    this.f = i7 + 1;
                    y22.a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.f;
                this.f = i8 + 1;
                y22.a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.f;
                    this.f = i10 + 1;
                    y22.a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.f;
                this.f = i11 + 1;
                y22.a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.f;
                    this.f = i13 + 1;
                    y22.a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.f;
                this.f = i14 + 1;
                y22.a(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.d;
                int i15 = this.f;
                this.f = i15 + 1;
                y22.a(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void b(int i, dy1 dy1) {
            a(1, 3);
            c(2, i);
            a(3, dy1);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void b(byte[] bArr, int i, int i2) {
            b(i2);
            c(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void c(long j) {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.d;
                int i3 = i2 + 1;
                this.f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.d;
                int i6 = i5 + 1;
                this.f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.d;
                int i7 = i6 + 1;
                this.f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.d;
                int i8 = i7 + 1;
                this.f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.d;
                this.f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void d(int i) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.d;
                this.f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.xy1
        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }
    }

    public static class b extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy1.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private xy1() {
    }

    public static int a(int i, g02 g02) {
        int e = e(i);
        int b2 = g02.b();
        return e + g(b2) + b2;
    }

    static int a(c12 c12, z12 z12) {
        tx1 tx1 = (tx1) c12;
        int i = tx1.i();
        if (i == -1) {
            i = z12.c(tx1);
            tx1.a(i);
        }
        return g(i) + i;
    }

    public static int a(g02 g02) {
        int b2 = g02.b();
        return g(b2) + b2;
    }

    public static xy1 a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(int i, double d) {
        return e(i) + 8;
    }

    public static int b(int i, float f) {
        return e(i) + 4;
    }

    public static int b(int i, c12 c12) {
        return (e(1) << 1) + g(2, i) + e(3) + b(c12);
    }

    static int b(int i, c12 c12, z12 z12) {
        return e(i) + a(c12, z12);
    }

    public static int b(int i, g02 g02) {
        return (e(1) << 1) + g(2, i) + a(3, g02);
    }

    public static int b(int i, String str) {
        return e(i) + b(str);
    }

    public static int b(int i, boolean z) {
        return e(i) + 1;
    }

    public static int b(c12 c12) {
        int c2 = c12.c();
        return g(c2) + c2;
    }

    public static int b(dy1 dy1) {
        int size = dy1.size();
        return g(size) + size;
    }

    public static int b(String str) {
        int i;
        try {
            i = a32.a(str);
        } catch (e32 unused) {
            i = str.getBytes(uz1.f5029a).length;
        }
        return g(i) + i;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return g(length) + length;
    }

    @Deprecated
    static int c(int i, c12 c12, z12 z12) {
        int e = e(i) << 1;
        tx1 tx1 = (tx1) c12;
        int i2 = tx1.i();
        if (i2 == -1) {
            i2 = z12.c(tx1);
            tx1.a(i2);
        }
        return e + i2;
    }

    public static int c(int i, dy1 dy1) {
        int e = e(i);
        int size = dy1.size();
        return e + g(size) + size;
    }

    @Deprecated
    public static int c(c12 c12) {
        return c12.c();
    }

    public static int d(int i, long j) {
        return e(i) + e(j);
    }

    public static int d(int i, dy1 dy1) {
        return (e(1) << 1) + g(2, i) + c(3, dy1);
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(int i) {
        return g(i << 3);
    }

    public static int e(int i, long j) {
        return e(i) + e(j);
    }

    public static int e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int f(int i, int i2) {
        return e(i) + f(i2);
    }

    public static int f(int i, long j) {
        return e(i) + e(i(j));
    }

    public static int f(long j) {
        return e(i(j));
    }

    public static int g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int g(int i, int i2) {
        return e(i) + g(i2);
    }

    public static int g(int i, long j) {
        return e(i) + 8;
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return g(l(i));
    }

    public static int h(int i, int i2) {
        return e(i) + g(l(i2));
    }

    public static int h(int i, long j) {
        return e(i) + 8;
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i) {
        return 4;
    }

    public static int i(int i, int i2) {
        return e(i) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i) {
        return 4;
    }

    public static int j(int i, int i2) {
        return e(i) + 4;
    }

    public static int k(int i) {
        return f(i);
    }

    public static int k(int i, int i2) {
        return e(i) + f(i2);
    }

    private static int l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int m(int i) {
        return g(i);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public final void a(double d) {
        c(Double.doubleToRawLongBits(d));
    }

    public final void a(float f) {
        d(Float.floatToRawIntBits(f));
    }

    public abstract void a(int i);

    public final void a(int i, double d) {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, float f) {
        e(i, Float.floatToRawIntBits(f));
    }

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, c12 c12);

    /* access modifiers changed from: package-private */
    public abstract void a(int i, c12 c12, z12 z12);

    public abstract void a(int i, dy1 dy1);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(c12 c12);

    public abstract void a(dy1 dy1);

    public abstract void a(String str);

    /* access modifiers changed from: package-private */
    public final void a(String str, e32 e32) {
        f5512b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e32);
        byte[] bytes = str.getBytes(uz1.f5029a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new b(e);
        } catch (b e2) {
            throw e2;
        }
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : 0);
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public final void b(int i, long j) {
        a(i, i(j));
    }

    public abstract void b(int i, dy1 dy1);

    public final void b(long j) {
        a(i(j));
    }

    /* access modifiers changed from: package-private */
    public abstract void b(byte[] bArr, int i, int i2);

    public final void c(int i) {
        b(l(i));
    }

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public final void d(int i, int i2) {
        c(i, l(i2));
    }

    public abstract void e(int i, int i2);
}
