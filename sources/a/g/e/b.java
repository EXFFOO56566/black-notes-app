package a.g.e;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public class b {

    /* access modifiers changed from: private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f118a;

        /* renamed from: b  reason: collision with root package name */
        boolean f119b;

        a() {
        }
    }

    /* renamed from: a.g.e.b$b  reason: collision with other inner class name */
    public static class C0009b {

        /* renamed from: a  reason: collision with root package name */
        public char f120a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f121b;

        C0009b(char c2, float[] fArr) {
            this.f120a = c2;
            this.f121b = fArr;
        }

        C0009b(C0009b bVar) {
            this.f120a = bVar.f120a;
            float[] fArr = bVar.f121b;
            this.f121b = b.a(fArr, 0, fArr.length);
        }

        private static void a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ((double) ceil);
            double d19 = d8;
            double d20 = d17;
            double d21 = d14;
            int i = 0;
            double d22 = d5;
            double d23 = d6;
            while (i < ceil) {
                double d24 = d19 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d26 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (sin3 * d15) + (cos3 * d16);
                double d29 = d24 - d19;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d22 + (d21 * sin4)), (float) (d23 + (d20 * sin4)), (float) (d25 - (sin4 * d27)), (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                sin = sin;
                d22 = d25;
                d15 = d15;
                cos = cos;
                d19 = d24;
                d20 = d28;
                d21 = d27;
                ceil = ceil;
                d23 = d26;
                d10 = d3;
            }
        }

        private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f;
            double d4 = d3 * cos;
            double d5 = (double) f2;
            double d6 = (double) f5;
            double d7 = (d4 + (d5 * sin)) / d6;
            double d8 = (double) f6;
            double d9 = ((((double) (-f)) * sin) + (d5 * cos)) / d8;
            double d10 = (double) f4;
            double d11 = ((((double) f3) * cos) + (d10 * sin)) / d6;
            double d12 = ((((double) (-f3)) * sin) + (d10 * cos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d17);
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d2 = d15 - d20;
                d = d16 + d19;
            } else {
                d2 = d15 + d20;
                d = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d, d7 - d2);
            double atan22 = Math.atan2(d12 - d, d11 - d2) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d21 = d2 * d6;
            double d22 = d * d8;
            a(path, (d21 * cos) - (d22 * sin), (d21 * sin) + (d22 * cos), d6, d8, d3, d5, radians, atan2, atan22);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c4 = c3;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i3 = 0;
            char c5 = c2;
            while (i3 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        i2 = i3;
                        int i4 = i2 + 2;
                        int i5 = i2 + 3;
                        int i6 = i2 + 4;
                        int i7 = i2 + 5;
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i4], fArr2[i5], fArr2[i6], fArr2[i7]);
                        f15 = fArr2[i6];
                        float f19 = fArr2[i7];
                        float f20 = fArr2[i4];
                        float f21 = fArr2[i5];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c4 == 'H') {
                        i2 = i3;
                        int i8 = i2 + 0;
                        path.lineTo(fArr2[i8], f16);
                        f15 = fArr2[i8];
                    } else if (c4 == 'Q') {
                        i2 = i3;
                        int i9 = i2 + 0;
                        int i10 = i2 + 1;
                        int i11 = i2 + 2;
                        int i12 = i2 + 3;
                        path.quadTo(fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        float f22 = fArr2[i9];
                        float f23 = fArr2[i10];
                        f15 = fArr2[i11];
                        f16 = fArr2[i12];
                        f11 = f22;
                        f12 = f23;
                    } else if (c4 == 'V') {
                        i2 = i3;
                        int i13 = i2 + 0;
                        path.lineTo(f15, fArr2[i13]);
                        f16 = fArr2[i13];
                    } else if (c4 != 'a') {
                        if (c4 == 'c') {
                            int i14 = i3 + 2;
                            int i15 = i3 + 3;
                            int i16 = i3 + 4;
                            int i17 = i3 + 5;
                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                            f2 = fArr2[i14] + f15;
                            f = fArr2[i15] + f16;
                            f15 += fArr2[i16];
                            f3 = fArr2[i17];
                            f16 += f3;
                            f11 = f2;
                            f12 = f;
                        } else if (c4 != 'h') {
                            if (c4 != 'q') {
                                if (c4 == 'v') {
                                    int i18 = i3 + 0;
                                    path.rLineTo(0.0f, fArr2[i18]);
                                    f4 = fArr2[i18];
                                } else if (c4 != 'L') {
                                    if (c4 == 'M') {
                                        int i19 = i3 + 0;
                                        f15 = fArr2[i19];
                                        int i20 = i3 + 1;
                                        f16 = fArr2[i20];
                                        if (i3 > 0) {
                                            path.lineTo(fArr2[i19], fArr2[i20]);
                                        } else {
                                            path.moveTo(fArr2[i19], fArr2[i20]);
                                        }
                                    } else if (c4 == 'S') {
                                        if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                            f15 = (f15 * 2.0f) - f11;
                                            f16 = (f16 * 2.0f) - f12;
                                        }
                                        int i21 = i3 + 0;
                                        int i22 = i3 + 1;
                                        int i23 = i3 + 2;
                                        int i24 = i3 + 3;
                                        path.cubicTo(f15, f16, fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                                        f2 = fArr2[i21];
                                        f = fArr2[i22];
                                        f15 = fArr2[i23];
                                        f16 = fArr2[i24];
                                        f11 = f2;
                                        f12 = f;
                                    } else if (c4 == 'T') {
                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                            f15 = (f15 * 2.0f) - f11;
                                            f16 = (f16 * 2.0f) - f12;
                                        }
                                        int i25 = i3 + 0;
                                        int i26 = i3 + 1;
                                        path.quadTo(f15, f16, fArr2[i25], fArr2[i26]);
                                        float f24 = fArr2[i25];
                                        float f25 = fArr2[i26];
                                        i2 = i3;
                                        f12 = f16;
                                        f11 = f15;
                                        f15 = f24;
                                        f16 = f25;
                                    } else if (c4 == 'l') {
                                        int i27 = i3 + 0;
                                        int i28 = i3 + 1;
                                        path.rLineTo(fArr2[i27], fArr2[i28]);
                                        f15 += fArr2[i27];
                                        f4 = fArr2[i28];
                                    } else if (c4 == 'm') {
                                        int i29 = i3 + 0;
                                        f15 += fArr2[i29];
                                        int i30 = i3 + 1;
                                        f16 += fArr2[i30];
                                        if (i3 > 0) {
                                            path.rLineTo(fArr2[i29], fArr2[i30]);
                                        } else {
                                            path.rMoveTo(fArr2[i29], fArr2[i30]);
                                        }
                                    } else if (c4 == 's') {
                                        if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                            float f26 = f15 - f11;
                                            f5 = f16 - f12;
                                            f6 = f26;
                                        } else {
                                            f6 = 0.0f;
                                            f5 = 0.0f;
                                        }
                                        int i31 = i3 + 0;
                                        int i32 = i3 + 1;
                                        int i33 = i3 + 2;
                                        int i34 = i3 + 3;
                                        path.rCubicTo(f6, f5, fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                                        f2 = fArr2[i31] + f15;
                                        f = fArr2[i32] + f16;
                                        f15 += fArr2[i33];
                                        f3 = fArr2[i34];
                                    } else if (c4 == 't') {
                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                            f7 = f15 - f11;
                                            f8 = f16 - f12;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i35 = i3 + 0;
                                        int i36 = i3 + 1;
                                        path.rQuadTo(f7, f8, fArr2[i35], fArr2[i36]);
                                        float f27 = f7 + f15;
                                        float f28 = f8 + f16;
                                        f15 += fArr2[i35];
                                        f16 += fArr2[i36];
                                        f12 = f28;
                                        f11 = f27;
                                    }
                                    i2 = i3;
                                    f18 = f16;
                                    f17 = f15;
                                } else {
                                    int i37 = i3 + 0;
                                    int i38 = i3 + 1;
                                    path.lineTo(fArr2[i37], fArr2[i38]);
                                    f15 = fArr2[i37];
                                    f16 = fArr2[i38];
                                }
                                f16 += f4;
                            } else {
                                int i39 = i3 + 0;
                                int i40 = i3 + 1;
                                int i41 = i3 + 2;
                                int i42 = i3 + 3;
                                path.rQuadTo(fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                f2 = fArr2[i39] + f15;
                                f = fArr2[i40] + f16;
                                f15 += fArr2[i41];
                                f3 = fArr2[i42];
                            }
                            f16 += f3;
                            f11 = f2;
                            f12 = f;
                        } else {
                            int i43 = i3 + 0;
                            path.rLineTo(fArr2[i43], 0.0f);
                            f15 += fArr2[i43];
                        }
                        i2 = i3;
                    } else {
                        int i44 = i3 + 5;
                        int i45 = i3 + 6;
                        i2 = i3;
                        a(path, f15, f16, fArr2[i44] + f15, fArr2[i45] + f16, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f15 += fArr2[i44];
                        f16 += fArr2[i45];
                    }
                    i3 = i2 + i;
                    c5 = c3;
                    c4 = c5;
                } else {
                    i2 = i3;
                    int i46 = i2 + 5;
                    int i47 = i2 + 6;
                    a(path, f15, f16, fArr2[i46], fArr2[i47], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                    f15 = fArr2[i46];
                    f16 = fArr2[i47];
                }
                f12 = f16;
                f11 = f15;
                i3 = i2 + i;
                c5 = c3;
                c4 = c5;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        public static void a(C0009b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                a(path, fArr, c2, bVarArr[i].f120a, bVarArr[i].f121b);
                c2 = bVarArr[i].f120a;
            }
        }

        public void a(C0009b bVar, C0009b bVar2, float f) {
            this.f120a = bVar.f120a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.f121b;
                if (i < fArr.length) {
                    this.f121b[i] = (fArr[i] * (1.0f - f)) + (bVar2.f121b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[LOOP:0: B:1:0x0007->B:19:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r8, int r9, a.g.e.b.a r10) {
        /*
            r0 = 0
            r10.f119b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0033
            r6 = 69
            if (r5 == r6) goto L_0x0031
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0031
            switch(r5) {
                case 44: goto L_0x0033;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x002f
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x0035
        L_0x0027:
            r10.f119b = r7
            goto L_0x0033
        L_0x002a:
            if (r1 == r9) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            r2 = 0
            goto L_0x0035
        L_0x0031:
            r2 = 1
            goto L_0x0035
        L_0x0033:
            r2 = 0
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003b:
            r10.f118a = r1
            return
            switch-data {44->0x0033, 45->0x002a, 46->0x0022, }
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.e.b.a(java.lang.String, int, a.g.e.b$a):void");
    }

    private static void a(ArrayList<C0009b> arrayList, char c2, float[] fArr) {
        arrayList.add(new C0009b(c2, fArr));
    }

    public static boolean a(C0009b[] bVarArr, C0009b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (!(bVarArr[i].f120a == bVarArr2[i].f120a && bVarArr[i].f121b.length == bVarArr2[i].f121b.length)) {
                return false;
            }
        }
        return true;
    }

    static float[] a(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static C0009b[] a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a2 = a(str, i);
            String trim = str.substring(i2, a2).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), c(trim));
            }
            i2 = a2;
            i = a2 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0009b[]) arrayList.toArray(new C0009b[arrayList.size()]);
    }

    public static C0009b[] a(C0009b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0009b[] bVarArr2 = new C0009b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0009b(bVarArr[i]);
        }
        return bVarArr2;
    }

    public static Path b(String str) {
        Path path = new Path();
        C0009b[] a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            C0009b.a(a2, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static void b(C0009b[] bVarArr, C0009b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f120a = bVarArr2[i].f120a;
            for (int i2 = 0; i2 < bVarArr2[i].f121b.length; i2++) {
                bVarArr[i].f121b[i2] = bVarArr2[i].f121b[i2];
            }
        }
    }

    private static float[] c(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                a(str, i, aVar);
                int i3 = aVar.f118a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = aVar.f119b ? i3 : i3 + 1;
            }
            return a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }
}
