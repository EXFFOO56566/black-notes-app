package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class fb2 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public long J;
    public long K;
    public boolean L;
    public boolean M;
    private String N;
    public ua2 O;
    public int P;

    /* renamed from: a */
    public String f2566a;

    /* renamed from: b */
    public int f2567b;

    /* renamed from: c */
    public int f2568c;
    public int d;
    public boolean e;
    public byte[] f;
    public xa2 g;
    public byte[] h;
    public ba2 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte[] o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;

    private fb2() {
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = 0;
        this.o = null;
        this.p = -1;
        this.q = false;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 1000;
        this.v = 200;
        this.w = -1.0f;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = -1.0f;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = 1;
        this.H = -1;
        this.I = 8000;
        this.J = 0;
        this.K = 0;
        this.M = true;
        this.N = "eng";
    }

    /* synthetic */ fb2(db2 db2) {
        this();
    }

    private static List<byte[]> a(xf2 xf2) {
        try {
            xf2.d(16);
            if (xf2.m() != 826496599) {
                return null;
            }
            byte[] bArr = xf2.f5423a;
            for (int b2 = xf2.b() + 20; b2 < bArr.length - 4; b2++) {
                if (bArr[b2] == 0 && bArr[b2 + 1] == 0 && bArr[b2 + 2] == 1 && bArr[b2 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, b2, bArr.length));
                }
            }
            throw new h82("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new h82("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> a(byte[] bArr) {
        try {
            if (bArr[0] == 2) {
                int i2 = 1;
                int i3 = 0;
                while (bArr[i2] == -1) {
                    i3 += 255;
                    i2++;
                }
                int i4 = i2 + 1;
                int i5 = i3 + bArr[i2];
                int i6 = 0;
                while (bArr[i4] == -1) {
                    i6 += 255;
                    i4++;
                }
                int i7 = i4 + 1;
                int i8 = i6 + bArr[i4];
                if (bArr[i7] == 1) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, i7, bArr2, 0, i5);
                    int i9 = i7 + i5;
                    if (bArr[i9] == 3) {
                        int i10 = i9 + i8;
                        if (bArr[i10] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i10)];
                            System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new h82("Error parsing vorbis codec private");
                    }
                    throw new h82("Error parsing vorbis codec private");
                }
                throw new h82("Error parsing vorbis codec private");
            }
            throw new h82("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new h82("Error parsing vorbis codec private");
        }
    }

    private static boolean b(xf2 xf2) {
        try {
            int k2 = xf2.k();
            if (k2 == 1) {
                return true;
            }
            if (k2 == 65534) {
                xf2.c(24);
                return xf2.e() == eb2.b0.getMostSignificantBits() && xf2.e() == eb2.b0.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new h82("Error parsing MS/ACM codec private");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0335  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.pa2 r43, int r44) {
        /*
        // Method dump skipped, instructions count: 1396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fb2.a(com.google.android.gms.internal.ads.pa2, int):void");
    }
}
