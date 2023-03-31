package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.qc2;
import java.util.ArrayList;

final class lb2 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f3524a = ag2.d("vide");

    /* renamed from: b  reason: collision with root package name */
    private static final int f3525b = ag2.d("soun");

    /* renamed from: c  reason: collision with root package name */
    private static final int f3526c = ag2.d("text");
    private static final int d = ag2.d("sbtl");
    private static final int e = ag2.d("subt");
    private static final int f = ag2.d("clcp");
    private static final int g = ag2.d("cenc");
    private static final int h = ag2.d("meta");

    private static int a(xf2 xf2) {
        int g2 = xf2.g();
        int i = g2 & 127;
        while ((g2 & 128) == 128) {
            g2 = xf2.g();
            i = (i << 7) | (g2 & 127);
        }
        return i;
    }

    private static int a(xf2 xf2, int i, int i2, qb2 qb2, int i3) {
        int b2 = xf2.b();
        while (true) {
            boolean z = false;
            if (b2 - i >= i2) {
                return 0;
            }
            xf2.c(b2);
            int d2 = xf2.d();
            mf2.a(d2 > 0, "childAtomSize should be positive");
            if (xf2.d() == kb2.N) {
                int i4 = b2 + 8;
                Pair pair = null;
                Integer num = null;
                dc2 dc2 = null;
                boolean z2 = false;
                while (i4 - b2 < d2) {
                    xf2.c(i4);
                    int d3 = xf2.d();
                    int d4 = xf2.d();
                    if (d4 == kb2.T) {
                        num = Integer.valueOf(xf2.d());
                    } else if (d4 == kb2.O) {
                        xf2.d(4);
                        z2 = xf2.d() == g;
                    } else if (d4 == kb2.P) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= d3) {
                                dc2 = null;
                                break;
                            }
                            xf2.c(i5);
                            int d5 = xf2.d();
                            if (xf2.d() == kb2.Q) {
                                xf2.d(6);
                                boolean z3 = xf2.g() == 1;
                                int g2 = xf2.g();
                                byte[] bArr = new byte[16];
                                xf2.a(bArr, 0, 16);
                                dc2 = new dc2(z3, g2, bArr);
                            } else {
                                i5 += d5;
                            }
                        }
                    }
                    i4 += d3;
                }
                if (z2) {
                    mf2.a(num != null, "frma atom is mandatory");
                    if (dc2 != null) {
                        z = true;
                    }
                    mf2.a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, dc2);
                }
                if (pair != null) {
                    qb2.f4306a[i3] = (dc2) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            b2 += d2;
        }
    }

    private static Pair<String, byte[]> a(xf2 xf2, int i) {
        xf2.c(i + 8 + 4);
        xf2.d(1);
        a(xf2);
        xf2.d(2);
        int g2 = xf2.g();
        if ((g2 & 128) != 0) {
            xf2.d(2);
        }
        if ((g2 & 64) != 0) {
            xf2.d(xf2.h());
        }
        if ((g2 & 32) != 0) {
            xf2.d(2);
        }
        xf2.d(1);
        a(xf2);
        int g3 = xf2.g();
        String str = null;
        if (g3 == 32) {
            str = "video/mp4v-es";
        } else if (g3 == 33) {
            str = "video/avc";
        } else if (g3 != 35) {
            if (g3 != 64) {
                if (g3 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (g3 == 165) {
                    str = "audio/ac3";
                } else if (g3 != 166) {
                    switch (g3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        xf2.d(12);
        xf2.d(1);
        int a2 = a(xf2);
        byte[] bArr = new byte[a2];
        xf2.a(bArr, 0, a2);
        return Pair.create(str, bArr);
    }

    public static bc2 a(zb2 zb2, jb2 jb2, ra2 ra2) {
        nb2 nb2;
        boolean z;
        int i;
        int i2;
        long j;
        int i3;
        int[] iArr;
        int i4;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        zb2 zb22;
        long j2;
        long[] jArr3;
        boolean z2;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i5;
        int i6;
        int i7;
        int i8;
        mb2 d2 = jb2.d(kb2.b0);
        if (d2 != null) {
            nb2 = new pb2(d2);
        } else {
            mb2 d3 = jb2.d(kb2.c0);
            if (d3 != null) {
                nb2 = new sb2(d3);
            } else {
                throw new h82("Track has no sample table size information");
            }
        }
        int a2 = nb2.a();
        if (a2 == 0) {
            return new bc2(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        mb2 d4 = jb2.d(kb2.d0);
        if (d4 == null) {
            d4 = jb2.d(kb2.e0);
            z = true;
        } else {
            z = false;
        }
        xf2 xf2 = d4.z0;
        xf2 xf22 = jb2.d(kb2.a0).z0;
        xf2 xf23 = jb2.d(kb2.X).z0;
        mb2 d5 = jb2.d(kb2.Y);
        xf2 xf24 = null;
        xf2 xf25 = d5 != null ? d5.z0 : null;
        mb2 d6 = jb2.d(kb2.Z);
        xf2 xf26 = d6 != null ? d6.z0 : null;
        ob2 ob2 = new ob2(xf22, xf2, z);
        xf23.c(12);
        int o = xf23.o() - 1;
        int o2 = xf23.o();
        int o3 = xf23.o();
        if (xf26 != null) {
            xf26.c(12);
            i = xf26.o();
        } else {
            i = 0;
        }
        int i9 = -1;
        if (xf25 != null) {
            xf25.c(12);
            i2 = xf25.o();
            if (i2 > 0) {
                i9 = xf25.o() - 1;
                xf24 = xf25;
            }
        } else {
            xf24 = xf25;
            i2 = 0;
        }
        long j3 = 0;
        if (!(nb2.c() && "audio/raw".equals(zb2.f.g) && o == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[a2];
            iArr = new int[a2];
            jArr = new long[a2];
            iArr2 = new int[a2];
            int i10 = i9;
            long j4 = 0;
            j = 0;
            int i11 = 0;
            i4 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = i;
            int i16 = o3;
            int i17 = o2;
            int i18 = o;
            int i19 = i2;
            while (i11 < a2) {
                while (i13 == 0) {
                    mf2.b(ob2.a());
                    j4 = ob2.d;
                    i13 = ob2.f3976c;
                    i16 = i16;
                    i17 = i17;
                }
                if (xf26 != null) {
                    while (i12 == 0 && i15 > 0) {
                        i12 = xf26.o();
                        i14 = xf26.d();
                        i15--;
                    }
                    i12--;
                }
                jArr5[i11] = j4;
                iArr[i11] = nb2.b();
                if (iArr[i11] > i4) {
                    i4 = iArr[i11];
                }
                jArr[i11] = j + ((long) i14);
                iArr2[i11] = xf24 == null ? 1 : 0;
                if (i11 == i10) {
                    iArr2[i11] = 1;
                    i19--;
                    if (i19 > 0) {
                        i10 = xf24.o() - 1;
                    }
                }
                j += (long) i16;
                int i20 = i17 - 1;
                if (i20 != 0 || i18 <= 0) {
                    i7 = i16;
                    i8 = i20;
                } else {
                    i8 = xf23.o();
                    i7 = xf23.o();
                    i18--;
                }
                j4 += (long) iArr[i11];
                i13--;
                i11++;
                a2 = a2;
                jArr5 = jArr5;
                i10 = i10;
                i14 = i14;
                i17 = i8;
                i16 = i7;
                nb2 = nb2;
            }
            i3 = a2;
            mf2.a(i12 == 0);
            while (i15 > 0) {
                mf2.a(xf26.o() == 0);
                xf26.d();
                i15--;
            }
            if (i19 == 0 && i17 == 0) {
                i6 = i13;
                if (i6 == 0 && i18 == 0) {
                    zb22 = zb2;
                    jArr2 = jArr5;
                }
            } else {
                i6 = i13;
            }
            zb22 = zb2;
            int i21 = zb22.f5731a;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i21);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i19);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i17);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i6);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i18);
            Log.w("AtomParsers", sb.toString());
            jArr2 = jArr5;
        } else {
            zb22 = zb2;
            i3 = a2;
            int i22 = ob2.f3974a;
            long[] jArr6 = new long[i22];
            int[] iArr6 = new int[i22];
            while (ob2.a()) {
                int i23 = ob2.f3975b;
                jArr6[i23] = ob2.d;
                iArr6[i23] = ob2.f3976c;
            }
            int b2 = nb2.b();
            long j5 = (long) o3;
            int i24 = 8192 / b2;
            int i25 = 0;
            for (int i26 = 0; i26 < i22; i26++) {
                i25 += ag2.a(iArr6[i26], i24);
            }
            long[] jArr7 = new long[i25];
            int[] iArr7 = new int[i25];
            long[] jArr8 = new long[i25];
            int[] iArr8 = new int[i25];
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i27 < i22) {
                int i31 = iArr6[i27];
                long j6 = jArr6[i27];
                int i32 = i31;
                while (i32 > 0) {
                    int min = Math.min(i24, i32);
                    jArr7[i29] = j6;
                    iArr7[i29] = b2 * min;
                    i30 = Math.max(i30, iArr7[i29]);
                    jArr8[i29] = ((long) i28) * j5;
                    iArr8[i29] = 1;
                    j6 += (long) iArr7[i29];
                    i28 += min;
                    i32 -= min;
                    i29++;
                    jArr6 = jArr6;
                    iArr6 = iArr6;
                }
                i27++;
                i22 = i22;
            }
            tb2 tb2 = new tb2(jArr7, iArr7, i30, jArr8, iArr8);
            jArr2 = tb2.f4781a;
            iArr = tb2.f4782b;
            i4 = tb2.f4783c;
            jArr = tb2.d;
            iArr2 = tb2.e;
            j = 0;
        }
        if (zb22.h == null || ra2.a()) {
            ag2.a(jArr, 1000000, zb22.f5733c);
            return new bc2(jArr2, iArr, i4, jArr, iArr2);
        }
        long[] jArr9 = zb22.h;
        if (jArr9.length == 1 && zb22.f5732b == 1 && jArr.length >= 2) {
            long j7 = zb22.i[0];
            long a3 = ag2.a(jArr9[0], zb22.f5733c, zb22.d) + j7;
            if (jArr[0] <= j7 && j7 < jArr[1] && jArr[jArr.length - 1] < a3 && a3 <= j) {
                long j8 = j - a3;
                long a4 = ag2.a(j7 - jArr[0], (long) zb22.f.t, zb22.f5733c);
                long a5 = ag2.a(j8, (long) zb22.f.t, zb22.f5733c);
                if (!(a4 == 0 && a5 == 0) && a4 <= 2147483647L && a5 <= 2147483647L) {
                    ra2.f4469a = (int) a4;
                    ra2.f4470b = (int) a5;
                    ag2.a(jArr, 1000000, zb22.f5733c);
                    return new bc2(jArr2, iArr, i4, jArr, iArr2);
                }
            }
        }
        long[] jArr10 = zb22.h;
        if (jArr10.length == 1) {
            char c2 = 0;
            if (jArr10[0] == 0) {
                int i33 = 0;
                while (i33 < jArr.length) {
                    jArr[i33] = ag2.a(jArr[i33] - zb22.i[c2], 1000000, zb22.f5733c);
                    i33++;
                    c2 = 0;
                }
                return new bc2(jArr2, iArr, i4, jArr, iArr2);
            }
        }
        boolean z3 = zb22.f5732b == 1;
        boolean z4 = false;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            long[] jArr11 = zb22.h;
            j2 = -1;
            if (i36 >= jArr11.length) {
                break;
            }
            long j9 = zb22.i[i36];
            if (j9 != -1) {
                i5 = i4;
                long a6 = ag2.a(jArr11[i36], zb22.f5733c, zb22.d);
                int b3 = ag2.b(jArr, j9, true, true);
                int b4 = ag2.b(jArr, j9 + a6, z3, false);
                i34 += b4 - b3;
                z4 |= i35 != b3;
                i35 = b4;
            } else {
                i5 = i4;
            }
            i36++;
            iArr = iArr;
            i4 = i5;
        }
        int[] iArr9 = iArr;
        boolean z5 = z4 | (i34 != i3);
        long[] jArr12 = z5 ? new long[i34] : jArr2;
        int[] iArr10 = z5 ? new int[i34] : iArr9;
        int i37 = z5 ? 0 : i4;
        int[] iArr11 = z5 ? new int[i34] : iArr2;
        long[] jArr13 = new long[i34];
        int i38 = i37;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            long[] jArr14 = zb22.h;
            if (i39 >= jArr14.length) {
                break;
            }
            int[] iArr12 = iArr11;
            long j10 = zb22.i[i39];
            long j11 = jArr14[i39];
            if (j10 != j2) {
                jArr4 = jArr12;
                int b5 = ag2.b(jArr, j10, true, true);
                int b6 = ag2.b(jArr, ag2.a(j11, zb22.f5733c, zb22.d) + j10, z3, false);
                if (z5) {
                    int i41 = b6 - b5;
                    System.arraycopy(jArr2, b5, jArr4, i40, i41);
                    iArr4 = iArr9;
                    z2 = z3;
                    iArr3 = iArr10;
                    System.arraycopy(iArr4, b5, iArr3, i40, i41);
                    jArr3 = jArr2;
                    iArr5 = iArr12;
                    System.arraycopy(iArr2, b5, iArr5, i40, i41);
                } else {
                    iArr4 = iArr9;
                    jArr3 = jArr2;
                    iArr5 = iArr12;
                    z2 = z3;
                    iArr3 = iArr10;
                }
                int i42 = i38;
                while (b5 < b6) {
                    jArr13[i40] = ag2.a(j3, 1000000, zb22.d) + ag2.a(jArr[b5] - j10, 1000000, zb22.f5733c);
                    if (z5 && iArr3[i40] > i42) {
                        i42 = iArr4[b5];
                    }
                    i40++;
                    b5++;
                    iArr4 = iArr4;
                    j10 = j10;
                    iArr5 = iArr5;
                }
                iArr12 = iArr5;
                iArr9 = iArr4;
                i38 = i42;
            } else {
                jArr4 = jArr12;
                jArr3 = jArr2;
                z2 = z3;
                iArr3 = iArr10;
            }
            j3 += j11;
            i39++;
            iArr10 = iArr3;
            jArr12 = jArr4;
            z3 = z2;
            iArr11 = iArr12;
            jArr2 = jArr3;
            j2 = -1;
        }
        boolean z6 = false;
        for (int i43 = 0; i43 < iArr11.length && !z6; i43++) {
            z6 |= (iArr11[i43] & 1) != 0;
        }
        if (z6) {
            return new bc2(jArr12, iArr10, i38, jArr13, iArr11);
        }
        throw new h82("The edited sample sequence does not contain a sync sample.");
    }

    public static qc2 a(mb2 mb2, boolean z) {
        if (z) {
            return null;
        }
        xf2 xf2 = mb2.z0;
        xf2.c(8);
        while (xf2.j() >= 8) {
            int b2 = xf2.b();
            int d2 = xf2.d();
            if (xf2.d() == kb2.m0) {
                xf2.c(b2);
                int i = b2 + d2;
                xf2.d(12);
                while (true) {
                    if (xf2.b() >= i) {
                        break;
                    }
                    int b3 = xf2.b();
                    int d3 = xf2.d();
                    if (xf2.d() == kb2.n0) {
                        xf2.c(b3);
                        int i2 = b3 + d3;
                        xf2.d(8);
                        ArrayList arrayList = new ArrayList();
                        while (xf2.b() < i2) {
                            qc2.a a2 = wb2.a(xf2);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new qc2(arrayList);
                        }
                    } else {
                        xf2.d(d3 - 8);
                    }
                }
                return null;
            }
            xf2.d(d2 - 8);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r14 == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zb2 a(com.google.android.gms.internal.ads.jb2 r50, com.google.android.gms.internal.ads.mb2 r51, long r52, com.google.android.gms.internal.ads.ba2 r54, boolean r55) {
        /*
        // Method dump skipped, instructions count: 1823
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lb2.a(com.google.android.gms.internal.ads.jb2, com.google.android.gms.internal.ads.mb2, long, com.google.android.gms.internal.ads.ba2, boolean):com.google.android.gms.internal.ads.zb2");
    }
}
