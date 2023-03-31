package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class uy1 extends ty1 {
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    private uy1(InputStream inputStream, int i2) {
        super();
        this.l = Integer.MAX_VALUE;
        uz1.a((Object) inputStream, "input");
        this.e = inputStream;
        this.f = new byte[i2];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    private final byte A() {
        if (this.i == this.g) {
            f(1);
        }
        byte[] bArr = this.f;
        int i2 = this.i;
        this.i = i2 + 1;
        return bArr[i2];
    }

    private final byte[] a(int i2, boolean z) {
        byte[] h2 = h(i2);
        if (h2 != null) {
            return h2;
        }
        int i3 = this.i;
        int i4 = this.g;
        int i5 = i4 - i3;
        this.k += i4;
        this.i = 0;
        this.g = 0;
        List<byte[]> i6 = i(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f, i3, bArr, 0, i5);
        for (byte[] bArr2 : i6) {
            System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
            i5 += bArr2.length;
        }
        return bArr;
    }

    private final void f(int i2) {
        if (g(i2)) {
            return;
        }
        if (i2 > (this.f4882c - this.k) - this.i) {
            throw b02.g();
        }
        throw b02.a();
    }

    private final boolean g(int i2) {
        do {
            int i3 = this.i;
            int i4 = i3 + i2;
            int i5 = this.g;
            if (i4 > i5) {
                int i6 = this.f4882c;
                int i7 = this.k;
                if (i2 > (i6 - i7) - i3 || i7 + i3 + i2 > this.l) {
                    return false;
                }
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.f;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.k += i3;
                    this.g -= i3;
                    this.i = 0;
                }
                InputStream inputStream = this.e;
                byte[] bArr2 = this.f;
                int i8 = this.g;
                int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.f4882c - this.k) - i8));
                if (read == 0 || read < -1 || read > this.f.length) {
                    String valueOf = String.valueOf(this.e.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.g += read;
                    z();
                }
            } else {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("refillBuffer() called when ");
                sb2.append(i2);
                sb2.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb2.toString());
            }
        } while (this.g < i2);
        return true;
    }

    private final byte[] h(int i2) {
        if (i2 == 0) {
            return uz1.f5030b;
        }
        if (i2 >= 0) {
            int i3 = this.k;
            int i4 = this.i;
            int i5 = i3 + i4 + i2;
            if (i5 - this.f4882c <= 0) {
                int i6 = this.l;
                if (i5 <= i6) {
                    int i7 = this.g - i4;
                    int i8 = i2 - i7;
                    if (i8 >= 4096 && i8 > this.e.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f, this.i, bArr, 0, i7);
                    this.k += this.g;
                    this.i = 0;
                    this.g = 0;
                    while (i7 < i2) {
                        int read = this.e.read(bArr, i7, i2 - i7);
                        if (read != -1) {
                            this.k += read;
                            i7 += read;
                        } else {
                            throw b02.a();
                        }
                    }
                    return bArr;
                }
                j((i6 - i3) - i4);
                throw b02.a();
            }
            throw b02.g();
        }
        throw b02.b();
    }

    private final List<byte[]> i(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                int read = this.e.read(bArr, i3, min - i3);
                if (read != -1) {
                    this.k += read;
                    i3 += read;
                } else {
                    throw b02.a();
                }
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void j(int i2) {
        int i3 = this.g;
        int i4 = this.i;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.i = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.k;
            int i6 = this.i;
            int i7 = i5 + i6 + i2;
            int i8 = this.l;
            if (i7 <= i8) {
                this.k = i5 + i6;
                int i9 = this.g - i6;
                this.g = 0;
                this.i = 0;
                while (i9 < i2) {
                    try {
                        long j2 = (long) (i2 - i9);
                        long skip = this.e.skip(j2);
                        int i10 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i10 >= 0 && skip <= j2) {
                            if (i10 == 0) {
                                break;
                            }
                            i9 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.e.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.k += i9;
                        z();
                        throw th;
                    }
                }
                this.k += i9;
                z();
                if (i9 < i2) {
                    int i11 = this.g;
                    int i12 = i11 - this.i;
                    this.i = i11;
                    while (true) {
                        f(1);
                        int i13 = i2 - i12;
                        int i14 = this.g;
                        if (i13 > i14) {
                            i12 += i14;
                            this.i = i14;
                        } else {
                            this.i = i13;
                            return;
                        }
                    }
                }
            } else {
                j((i8 - i5) - i6);
                throw b02.a();
            }
        } else {
            throw b02.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy1.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy1.w():long");
    }

    private final int x() {
        int i2 = this.i;
        if (this.g - i2 < 4) {
            f(4);
            i2 = this.i;
        }
        byte[] bArr = this.f;
        this.i = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long y() {
        int i2 = this.i;
        if (this.g - i2 < 8) {
            f(8);
            i2 = this.i;
        }
        byte[] bArr = this.f;
        this.i = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final void z() {
        int i2 = this.g + this.h;
        this.g = i2;
        int i3 = this.k + i2;
        int i4 = this.l;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.h = i5;
            this.g = i2 - i5;
            return;
        }
        this.h = 0;
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
            if (this.g - this.i >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f;
                    int i5 = this.i;
                    this.i = i5 + 1;
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
            j(8);
            return true;
        } else if (i3 == 2) {
            j(v());
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
                j(4);
                return true;
            }
            throw b02.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int c(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.k + this.i;
            int i4 = this.l;
            if (i3 <= i4) {
                this.l = i3;
                z();
                return i4;
            }
            throw b02.a();
        }
        throw b02.b();
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final String c() {
        int v = v();
        if (v > 0 && v <= this.g - this.i) {
            String str = new String(this.f, this.i, v, uz1.f5029a);
            this.i += v;
            return str;
        } else if (v == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (v > this.g) {
                return new String(a(v, false), uz1.f5029a);
            }
            f(v);
            String str2 = new String(this.f, this.i, v, uz1.f5029a);
            this.i += v;
            return str2;
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
        this.l = i2;
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
        byte[] bArr;
        int v = v();
        int i2 = this.i;
        if (v <= this.g - i2 && v > 0) {
            bArr = this.f;
            this.i = i2 + v;
        } else if (v == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (v <= this.g) {
                f(v);
                bArr = this.f;
                this.i = v;
            } else {
                bArr = a(v, false);
            }
            i2 = 0;
        }
        return a32.c(bArr, i2, v);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final dy1 l() {
        int v = v();
        int i2 = this.g;
        int i3 = this.i;
        if (v <= i2 - i3 && v > 0) {
            dy1 a2 = dy1.a(this.f, i3, v);
            this.i += v;
            return a2;
        } else if (v == 0) {
            return dy1.f2334c;
        } else {
            byte[] h2 = h(v);
            if (h2 != null) {
                return dy1.a(h2);
            }
            int i4 = this.i;
            int i5 = this.g;
            int i6 = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            List<byte[]> i7 = i(v - i6);
            byte[] bArr = new byte[v];
            System.arraycopy(this.f, i4, bArr, 0, i6);
            for (byte[] bArr2 : i7) {
                System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                i6 += bArr2.length;
            }
            return dy1.b(bArr);
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
        return this.i == this.g && !g(1);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final int t() {
        return this.k + this.i;
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
