package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.rz1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
public final class g12<T> implements z12<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = y22.c();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f2692a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f2693b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2694c;
    private final int d;
    private final c12 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final k12 m;
    private final l02 n;
    private final s22<?, ?> o;
    private final fz1<?> p;
    private final v02 q;

    private g12(int[] iArr, Object[] objArr, int i2, int i3, c12 c12, boolean z, boolean z2, int[] iArr2, int i4, int i5, k12 k12, l02 l02, s22<?, ?> s22, fz1<?> fz1, v02 v02) {
        this.f2692a = iArr;
        this.f2693b = objArr;
        this.f2694c = i2;
        this.d = i3;
        this.g = c12 instanceof rz1;
        this.h = z;
        this.f = fz1 != null && fz1.a(c12);
        this.i = false;
        this.j = iArr2;
        this.k = i4;
        this.l = i5;
        this.m = k12;
        this.n = l02;
        this.o = s22;
        this.p = fz1;
        this.e = c12;
        this.q = v02;
    }

    private final int a(int i2, int i3) {
        if (i2 < this.f2694c || i2 > this.d) {
            return -1;
        }
        return b(i2, i3);
    }

    private static <UT, UB> int a(s22<UT, UB> s22, T t) {
        return s22.c(s22.d(t));
    }

    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, cy1 cy1) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        long j3;
        int i11;
        Unsafe unsafe = s;
        long j4 = (long) (this.f2692a[i9 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    obj = Double.valueOf(zx1.c(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    obj2 = Float.valueOf(zx1.d(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = zx1.b(bArr, i2, cy1);
                    j3 = cy1.f2186b;
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = zx1.a(bArr, i2, cy1);
                    i11 = cy1.f2185a;
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    obj = Long.valueOf(zx1.b(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    obj2 = Integer.valueOf(zx1.a(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    i10 = zx1.b(bArr, i2, cy1);
                    obj3 = Boolean.valueOf(cy1.f2186b != 0);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    i10 = zx1.a(bArr, i2, cy1);
                    int i12 = cy1.f2185a;
                    if (i12 == 0) {
                        obj3 = BuildConfig.FLAVOR;
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else if ((i7 & 536870912) == 0 || a32.a(bArr, i10, i10 + i12)) {
                        unsafe.putObject(t, j2, new String(bArr, i10, i12, uz1.f5029a));
                        i10 += i12;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else {
                        throw b02.i();
                    }
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    i10 = zx1.a(a(i9), bArr, i2, i3, cy1);
                    Object object = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = cy1.f2187c;
                    if (object != null) {
                        obj3 = uz1.a(object, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    i10 = zx1.e(bArr, i2, cy1);
                    obj3 = cy1.f2187c;
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int a2 = zx1.a(bArr, i2, cy1);
                    int i13 = cy1.f2185a;
                    vz1 c2 = c(i9);
                    if (c2 == null || c2.a(i13)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i13));
                        i10 = a2;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    }
                    e(t).a(i4, Long.valueOf((long) i13));
                    return a2;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    i10 = zx1.a(bArr, i2, cy1);
                    i11 = ty1.e(cy1.f2185a);
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    i10 = zx1.b(bArr, i2, cy1);
                    j3 = ty1.a(cy1.f2186b);
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    i10 = zx1.a(a(i9), bArr, i2, i3, (i4 & -8) | 4, cy1);
                    Object object2 = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = cy1.f2187c;
                    if (object2 != null) {
                        obj3 = uz1.a(object2, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026e, code lost:
        if (r30.f2186b != 0) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0270, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0272, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0273, code lost:
        r11.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0276, code lost:
        if (r4 >= r20) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0278, code lost:
        r6 = com.google.android.gms.internal.ads.zx1.a(r18, r4, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x027e, code lost:
        if (r21 != r30.f2185a) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0280, code lost:
        r4 = com.google.android.gms.internal.ads.zx1.b(r18, r6, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0288, code lost:
        if (r30.f2186b == 0) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        if (r4 == 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r11.add(com.google.android.gms.internal.ads.dy1.f2334c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r11.add(com.google.android.gms.internal.ads.dy1.a(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        if (r1 >= r20) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0152, code lost:
        r4 = com.google.android.gms.internal.ads.zx1.a(r18, r1, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0158, code lost:
        if (r21 != r30.f2185a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        r1 = com.google.android.gms.internal.ads.zx1.a(r18, r4, r30);
        r4 = r30.f2185a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0160, code lost:
        if (r4 < 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        if (r4 > (r18.length - r1)) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0166, code lost:
        if (r4 != 0) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        throw com.google.android.gms.internal.ads.b02.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw com.google.android.gms.internal.ads.b02.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.cy1 r30) {
        /*
        // Method dump skipped, instructions count: 1054
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.cy1):int");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x003e */
    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, cy1 cy1) {
        Unsafe unsafe = s;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.q.c(object)) {
            Object f2 = this.q.f(b2);
            this.q.a(f2, object);
            unsafe.putObject(t, j2, f2);
            object = f2;
        }
        t02<?, ?> b3 = this.q.b(b2);
        Map<?, ?> e2 = this.q.e(object);
        int a2 = zx1.a(bArr, i2, cy1);
        int i5 = cy1.f2185a;
        if (i5 < 0 || i5 > i3 - a2) {
            throw b02.a();
        }
        int i6 = i5 + a2;
        CharSequence charSequence = (K) b3.f4736b;
        CharSequence charSequence2 = (V) b3.d;
        while (a2 < i6) {
            int i7 = a2 + 1;
            byte b4 = bArr[a2];
            int i8 = b4;
            if (b4 < 0) {
                i7 = zx1.a(b4, bArr, i7, cy1);
                i8 = cy1.f2185a;
            }
            int i9 = (i8 == 1 ? 1 : 0) >>> 3;
            int i10 = (i8 == 1 ? 1 : 0) & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == b3.f4737c.c()) {
                    a2 = a(bArr, i7, i3, b3.f4737c, b3.d.getClass(), cy1);
                    charSequence2 = (V) cy1.f2187c;
                }
            } else if (i10 == b3.f4735a.c()) {
                a2 = a(bArr, i7, i3, b3.f4735a, (Class<?>) null, cy1);
                charSequence = (K) cy1.f2187c;
            }
            a2 = zx1.a(i8, bArr, i7, i3, cy1);
        }
        if (a2 == i6) {
            e2.put(charSequence, charSequence2);
            return i6;
        }
        throw b02.h();
    }

    private static int a(byte[] bArr, int i2, int i3, f32 f32, Class<?> cls, cy1 cy1) {
        int b2;
        Object valueOf;
        Object obj;
        Object obj2;
        int i4;
        long j2;
        switch (f12.f2519a[f32.ordinal()]) {
            case 1:
                b2 = zx1.b(bArr, i2, cy1);
                valueOf = Boolean.valueOf(cy1.f2186b != 0);
                cy1.f2187c = valueOf;
                return b2;
            case 2:
                return zx1.e(bArr, i2, cy1);
            case 3:
                obj = Double.valueOf(zx1.c(bArr, i2));
                cy1.f2187c = obj;
                return i2 + 8;
            case 4:
            case 5:
                obj2 = Integer.valueOf(zx1.a(bArr, i2));
                cy1.f2187c = obj2;
                return i2 + 4;
            case 6:
            case 7:
                obj = Long.valueOf(zx1.b(bArr, i2));
                cy1.f2187c = obj;
                return i2 + 8;
            case 8:
                obj2 = Float.valueOf(zx1.d(bArr, i2));
                cy1.f2187c = obj2;
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                b2 = zx1.a(bArr, i2, cy1);
                i4 = cy1.f2185a;
                valueOf = Integer.valueOf(i4);
                cy1.f2187c = valueOf;
                return b2;
            case 12:
            case 13:
                b2 = zx1.b(bArr, i2, cy1);
                j2 = cy1.f2186b;
                valueOf = Long.valueOf(j2);
                cy1.f2187c = valueOf;
                return b2;
            case 14:
                return zx1.a(n12.a().a((Class) cls), bArr, i2, i3, cy1);
            case 15:
                b2 = zx1.a(bArr, i2, cy1);
                i4 = ty1.e(cy1.f2185a);
                valueOf = Integer.valueOf(i4);
                cy1.f2187c = valueOf;
                return b2;
            case 16:
                b2 = zx1.b(bArr, i2, cy1);
                j2 = ty1.a(cy1.f2186b);
                valueOf = Long.valueOf(j2);
                cy1.f2187c = valueOf;
                return b2;
            case 17:
                return zx1.d(bArr, i2, cy1);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    static <T> g12<T> a(Class<T> cls, a12 a12, k12 k12, l02 l02, s22<?, ?> s22, fz1<?> fz1, v02 v02) {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        q12 q12;
        int i12;
        Class<?> cls2;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        Field field;
        int i18;
        char charAt;
        int i19;
        Field field2;
        Field field3;
        int i20;
        char charAt2;
        int i21;
        char charAt3;
        int i22;
        char charAt4;
        int i23;
        int i24;
        char charAt5;
        int i25;
        char charAt6;
        int i26;
        char charAt7;
        int i27;
        char charAt8;
        int i28;
        char charAt9;
        int i29;
        char charAt10;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        char charAt14;
        if (a12 instanceof q12) {
            q12 q122 = (q12) a12;
            int i33 = 0;
            boolean z2 = q122.a() == rz1.f.j;
            String d2 = q122.d();
            int length = d2.length();
            int charAt15 = d2.charAt(0);
            if (charAt15 >= 55296) {
                int i34 = charAt15 & 8191;
                int i35 = 1;
                int i36 = 13;
                while (true) {
                    i2 = i35 + 1;
                    charAt14 = d2.charAt(i35);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i34 |= (charAt14 & 8191) << i36;
                    i36 += 13;
                    i35 = i2;
                }
                charAt15 = i34 | (charAt14 << i36);
            } else {
                i2 = 1;
            }
            int i37 = i2 + 1;
            int charAt16 = d2.charAt(i2);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i32 = i37 + 1;
                    charAt13 = d2.charAt(i37);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i38 |= (charAt13 & 8191) << i39;
                    i39 += 13;
                    i37 = i32;
                }
                charAt16 = i38 | (charAt13 << i39);
                i37 = i32;
            }
            if (charAt16 == 0) {
                iArr = r;
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                int i40 = i37 + 1;
                int charAt17 = d2.charAt(i37);
                if (charAt17 >= 55296) {
                    int i41 = charAt17 & 8191;
                    int i42 = 13;
                    while (true) {
                        i31 = i40 + 1;
                        charAt12 = d2.charAt(i40);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i41 |= (charAt12 & 8191) << i42;
                        i42 += 13;
                        i40 = i31;
                    }
                    charAt17 = i41 | (charAt12 << i42);
                    i40 = i31;
                }
                int i43 = i40 + 1;
                int charAt18 = d2.charAt(i40);
                if (charAt18 >= 55296) {
                    int i44 = charAt18 & 8191;
                    int i45 = 13;
                    while (true) {
                        i30 = i43 + 1;
                        charAt11 = d2.charAt(i43);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i44 |= (charAt11 & 8191) << i45;
                        i45 += 13;
                        i43 = i30;
                    }
                    charAt18 = i44 | (charAt11 << i45);
                    i43 = i30;
                }
                int i46 = i43 + 1;
                i6 = d2.charAt(i43);
                if (i6 >= 55296) {
                    int i47 = i6 & 8191;
                    int i48 = 13;
                    while (true) {
                        i29 = i46 + 1;
                        charAt10 = d2.charAt(i46);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i47 |= (charAt10 & 8191) << i48;
                        i48 += 13;
                        i46 = i29;
                    }
                    i6 = i47 | (charAt10 << i48);
                    i46 = i29;
                }
                int i49 = i46 + 1;
                int charAt19 = d2.charAt(i46);
                if (charAt19 >= 55296) {
                    int i50 = charAt19 & 8191;
                    int i51 = 13;
                    while (true) {
                        i28 = i49 + 1;
                        charAt9 = d2.charAt(i49);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i50 |= (charAt9 & 8191) << i51;
                        i51 += 13;
                        i49 = i28;
                    }
                    charAt19 = i50 | (charAt9 << i51);
                    i49 = i28;
                }
                int i52 = i49 + 1;
                i4 = d2.charAt(i49);
                if (i4 >= 55296) {
                    int i53 = i4 & 8191;
                    int i54 = 13;
                    while (true) {
                        i27 = i52 + 1;
                        charAt8 = d2.charAt(i52);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i53 |= (charAt8 & 8191) << i54;
                        i54 += 13;
                        i52 = i27;
                    }
                    i4 = i53 | (charAt8 << i54);
                    i52 = i27;
                }
                int i55 = i52 + 1;
                int charAt20 = d2.charAt(i52);
                if (charAt20 >= 55296) {
                    int i56 = charAt20 & 8191;
                    int i57 = 13;
                    while (true) {
                        i26 = i55 + 1;
                        charAt7 = d2.charAt(i55);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i56 |= (charAt7 & 8191) << i57;
                        i57 += 13;
                        i55 = i26;
                    }
                    charAt20 = i56 | (charAt7 << i57);
                    i55 = i26;
                }
                int i58 = i55 + 1;
                int charAt21 = d2.charAt(i55);
                if (charAt21 >= 55296) {
                    int i59 = charAt21 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i25 = i60 + 1;
                        charAt6 = d2.charAt(i60);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i59 |= (charAt6 & 8191) << i61;
                        i61 += 13;
                        i60 = i25;
                    }
                    charAt21 = i59 | (charAt6 << i61);
                    i23 = i25;
                } else {
                    i23 = i58;
                }
                int i62 = i23 + 1;
                int charAt22 = d2.charAt(i23);
                if (charAt22 >= 55296) {
                    int i63 = charAt22 & 8191;
                    int i64 = i62;
                    int i65 = 13;
                    while (true) {
                        i24 = i64 + 1;
                        charAt5 = d2.charAt(i64);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i63 |= (charAt5 & 8191) << i65;
                        i65 += 13;
                        i64 = i24;
                    }
                    charAt22 = i63 | (charAt5 << i65);
                    i62 = i24;
                }
                int i66 = (charAt17 << 1) + charAt18;
                i7 = charAt19;
                i5 = i66;
                i3 = charAt22;
                i33 = charAt17;
                i37 = i62;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                i8 = charAt20;
            }
            Unsafe unsafe = s;
            Object[] e2 = q122.e();
            Class<?> cls3 = q122.c().getClass();
            int[] iArr2 = new int[(i4 * 3)];
            Object[] objArr = new Object[(i4 << 1)];
            int i67 = i3 + i8;
            int i68 = i3;
            int i69 = i37;
            int i70 = i67;
            int i71 = 0;
            int i72 = 0;
            while (i69 < length) {
                int i73 = i69 + 1;
                int charAt23 = d2.charAt(i69);
                if (charAt23 >= 55296) {
                    int i74 = charAt23 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i22 = i75 + 1;
                        charAt4 = d2.charAt(i75);
                        i9 = i3;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i74 |= (charAt4 & 8191) << i76;
                        i76 += 13;
                        i75 = i22;
                        i3 = i9;
                    }
                    charAt23 = i74 | (charAt4 << i76);
                    i10 = i22;
                } else {
                    i9 = i3;
                    i10 = i73;
                }
                int i77 = i10 + 1;
                int charAt24 = d2.charAt(i10);
                if (charAt24 >= 55296) {
                    int i78 = charAt24 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i21 = i79 + 1;
                        charAt3 = d2.charAt(i79);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        i78 |= (charAt3 & 8191) << i80;
                        i80 += 13;
                        i79 = i21;
                        z2 = z;
                    }
                    charAt24 = i78 | (charAt3 << i80);
                    i11 = i21;
                } else {
                    z = z2;
                    i11 = i77;
                }
                int i81 = charAt24 & 255;
                if ((charAt24 & 1024) != 0) {
                    iArr[i71] = i72;
                    i71++;
                }
                if (i81 >= 51) {
                    int i82 = i11 + 1;
                    int charAt25 = d2.charAt(i11);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i83 = charAt25 & 8191;
                        int i84 = 13;
                        while (true) {
                            i20 = i82 + 1;
                            charAt2 = d2.charAt(i82);
                            if (charAt2 < c2) {
                                break;
                            }
                            i83 |= (charAt2 & 8191) << i84;
                            i84 += 13;
                            i82 = i20;
                            c2 = 55296;
                        }
                        charAt25 = i83 | (charAt2 << i84);
                        i82 = i20;
                    }
                    int i85 = i81 - 51;
                    if (i85 == 9 || i85 == 17) {
                        objArr[((i72 / 3) << 1) + 1] = e2[i5];
                        i5++;
                    } else if (i85 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i72 / 3) << 1) + 1] = e2[i5];
                        i5++;
                    }
                    int i86 = charAt25 << 1;
                    Object obj = e2[i86];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = a(cls3, (String) obj);
                        e2[i86] = field2;
                    }
                    q12 = q122;
                    i15 = (int) unsafe.objectFieldOffset(field2);
                    int i87 = i86 + 1;
                    Object obj2 = e2[i87];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = a(cls3, (String) obj2);
                        e2[i87] = field3;
                    }
                    cls2 = cls3;
                    i12 = i5;
                    i11 = i82;
                    str = d2;
                    i13 = 0;
                    i14 = (int) unsafe.objectFieldOffset(field3);
                    i16 = i33;
                } else {
                    q12 = q122;
                    int i88 = i5 + 1;
                    Field a2 = a(cls3, (String) e2[i5]);
                    if (i81 == 9 || i81 == 17) {
                        i17 = 1;
                        objArr[((i72 / 3) << 1) + 1] = a2.getType();
                    } else {
                        if (i81 == 27 || i81 == 49) {
                            i17 = 1;
                            i19 = i88 + 1;
                            objArr[((i72 / 3) << 1) + 1] = e2[i88];
                        } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i17 = 1;
                            if ((charAt15 & 1) == 1) {
                                i19 = i88 + 1;
                                objArr[((i72 / 3) << 1) + 1] = e2[i88];
                            }
                        } else {
                            if (i81 == 50) {
                                int i89 = i68 + 1;
                                iArr[i68] = i72;
                                int i90 = (i72 / 3) << 1;
                                int i91 = i88 + 1;
                                objArr[i90] = e2[i88];
                                if ((charAt24 & 2048) != 0) {
                                    i88 = i91 + 1;
                                    objArr[i90 + 1] = e2[i91];
                                    i68 = i89;
                                } else {
                                    i88 = i91;
                                    i17 = 1;
                                    i68 = i89;
                                }
                            }
                            i17 = 1;
                        }
                        i88 = i19;
                    }
                    i15 = (int) unsafe.objectFieldOffset(a2);
                    if ((charAt15 & 1) != i17 || i81 > 17) {
                        i12 = i88;
                        i16 = i33;
                        cls2 = cls3;
                        str = d2;
                        i14 = 0;
                        i13 = 0;
                    } else {
                        int i92 = i11 + 1;
                        str = d2;
                        int charAt26 = str.charAt(i11);
                        if (charAt26 >= 55296) {
                            int i93 = charAt26 & 8191;
                            int i94 = 13;
                            while (true) {
                                i18 = i92 + 1;
                                charAt = str.charAt(i92);
                                if (charAt < 55296) {
                                    break;
                                }
                                i93 |= (charAt & 8191) << i94;
                                i94 += 13;
                                i92 = i18;
                            }
                            charAt26 = i93 | (charAt << i94);
                            i92 = i18;
                        }
                        int i95 = (i33 << 1) + (charAt26 / 32);
                        Object obj3 = e2[i95];
                        i12 = i88;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = a(cls3, (String) obj3);
                            e2[i95] = field;
                        }
                        i16 = i33;
                        cls2 = cls3;
                        i14 = (int) unsafe.objectFieldOffset(field);
                        i13 = charAt26 % 32;
                        i11 = i92;
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i70] = i15;
                        i70++;
                    }
                }
                int i96 = i72 + 1;
                iArr2[i72] = charAt23;
                int i97 = i96 + 1;
                iArr2[i96] = i15 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i81 << 20);
                i72 = i97 + 1;
                iArr2[i97] = (i13 << 20) | i14;
                i33 = i16;
                d2 = str;
                i69 = i11;
                cls3 = cls2;
                i7 = i7;
                length = length;
                i3 = i9;
                z2 = z;
                i6 = i6;
                i5 = i12;
                q122 = q12;
            }
            return new g12<>(iArr2, objArr, i6, i7, q122.c(), z2, false, iArr, i3, i67, k12, l02, s22, fz1, v02);
        }
        ((k22) a12).a();
        throw null;
    }

    private final z12 a(int i2) {
        int i3 = (i2 / 3) << 1;
        z12 z12 = (z12) this.f2693b[i3];
        if (z12 != null) {
            return z12;
        }
        z12<T> a2 = n12.a().a((Class) ((Class) this.f2693b[i3 + 1]));
        this.f2693b[i3] = a2;
        return a2;
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, vz1 vz1, UB ub, s22<UT, UB> s22) {
        t02<?, ?> b2 = this.q.b(b(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!vz1.a(next.getValue().intValue())) {
                if (ub == null) {
                    ub = s22.a();
                }
                ly1 h2 = dy1.h(u02.a(b2, next.getKey(), next.getValue()));
                try {
                    u02.a(h2.b(), b2, next.getKey(), next.getValue());
                    s22.a(ub, i3, h2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, s22<UT, UB> s22) {
        vz1 c2;
        int i3 = this.f2692a[i2];
        Object f2 = y22.f(obj, (long) (d(i2) & 1048575));
        return (f2 == null || (c2 = c(i2)) == null) ? ub : (UB) a(i2, i3, (Map<K, V>) this.q.e(f2), c2, ub, s22);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> a(Object obj, long j2) {
        return (List) y22.f(obj, j2);
    }

    private static void a(int i2, Object obj, l32 l32) {
        if (obj instanceof String) {
            l32.a(i2, (String) obj);
        } else {
            l32.a(i2, (dy1) obj);
        }
    }

    private final <K, V> void a(l32 l32, int i2, Object obj, int i3) {
        if (obj != null) {
            l32.a(i2, this.q.b(b(i3)), this.q.a(obj));
        }
    }

    private static <UT, UB> void a(s22<UT, UB> s22, T t, l32 l32) {
        s22.a(s22.d(t), l32);
    }

    private final void a(Object obj, int i2, t12 t12) {
        long j2;
        Object d2;
        if (f(i2)) {
            j2 = (long) (i2 & 1048575);
            d2 = t12.r();
        } else {
            int i3 = i2 & 1048575;
            if (this.g) {
                j2 = (long) i3;
                d2 = t12.i();
            } else {
                j2 = (long) i3;
                d2 = t12.d();
            }
        }
        y22.a(obj, j2, d2);
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a((Object) t2, i2)) {
            Object f2 = y22.f(t, d2);
            Object f3 = y22.f(t2, d2);
            if (f2 != null && f3 != null) {
                y22.a(t, d2, uz1.a(f2, f3));
                b((Object) t, i2);
            } else if (f3 != null) {
                y22.a(t, d2, f3);
                b((Object) t, i2);
            }
        }
    }

    private final boolean a(T t, int i2) {
        if (this.h) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return y22.e(t, j2) != 0.0d;
                case 1:
                    return y22.d(t, j2) != 0.0f;
                case 2:
                    return y22.b(t, j2) != 0;
                case 3:
                    return y22.b(t, j2) != 0;
                case 4:
                    return y22.a(t, j2) != 0;
                case 5:
                    return y22.b(t, j2) != 0;
                case 6:
                    return y22.a(t, j2) != 0;
                case 7:
                    return y22.c(t, j2);
                case 8:
                    Object f2 = y22.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof dy1) {
                        return !dy1.f2334c.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return y22.f(t, j2) != null;
                case 10:
                    return !dy1.f2334c.equals(y22.f(t, j2));
                case 11:
                    return y22.a(t, j2) != 0;
                case 12:
                    return y22.a(t, j2) != 0;
                case 13:
                    return y22.a(t, j2) != 0;
                case 14:
                    return y22.b(t, j2) != 0;
                case 15:
                    return y22.a(t, j2) != 0;
                case 16:
                    return y22.b(t, j2) != 0;
                case 17:
                    return y22.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (y22.a(t, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return y22.a(t, (long) (e(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        return this.h ? a((Object) t, i2) : (i3 & i4) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.internal.ads.z12 */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(Object obj, int i2, z12 z12) {
        return z12.a(y22.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) y22.f(t, j2)).doubleValue();
    }

    private final int b(int i2, int i3) {
        int length = (this.f2692a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f2692a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final Object b(int i2) {
        return this.f2693b[(i2 / 3) << 1];
    }

    private final void b(T t, int i2) {
        if (!this.h) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            y22.a((Object) t, j2, y22.a(t, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        y22.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r19, com.google.android.gms.internal.ads.l32 r20) {
        /*
        // Method dump skipped, instructions count: 1312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.b(java.lang.Object, com.google.android.gms.internal.ads.l32):void");
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.f2692a[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = y22.f(t, j2);
            Object f3 = y22.f(t2, j2);
            if (f2 != null && f3 != null) {
                y22.a(t, j2, uz1.a(f2, f3));
                b(t, i3, i2);
            } else if (f3 != null) {
                y22.a(t, j2, f3);
                b(t, i3, i2);
            }
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) y22.f(t, j2)).floatValue();
    }

    private final vz1 c(int i2) {
        return (vz1) this.f2693b[((i2 / 3) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.f2692a[i2 + 1];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) y22.f(t, j2)).intValue();
    }

    private final int e(int i2) {
        return this.f2692a[i2 + 2];
    }

    private static <T> long e(T t, long j2) {
        return ((Long) y22.f(t, j2)).longValue();
    }

    private static r22 e(Object obj) {
        rz1 rz1 = (rz1) obj;
        r22 r22 = rz1.zzhxv;
        if (r22 != r22.d()) {
            return r22;
        }
        r22 e2 = r22.e();
        rz1.zzhxv = e2;
        return e2;
    }

    private static boolean f(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) y22.f(t, j2)).booleanValue();
    }

    private final int g(int i2) {
        if (i2 < this.f2694c || i2 > this.d) {
            return -1;
        }
        return b(i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0357, code lost:
        if (r0 == r4) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a0, code lost:
        if (r0 == r15) goto L_0x03c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.ads.cy1 r35) {
        /*
        // Method dump skipped, instructions count: 1238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.cy1):int");
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final T a() {
        return (T) this.m.a(this.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0464 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08c3  */
    @Override // com.google.android.gms.internal.ads.z12
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, com.google.android.gms.internal.ads.l32 r14) {
        /*
        // Method dump skipped, instructions count: 2538
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.a(java.lang.Object, com.google.android.gms.internal.ads.l32):void");
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IndexInsnNode.isSame(IndexInsnNode.java:36)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // com.google.android.gms.internal.ads.z12
    public final void a(T r11, com.google.android.gms.internal.ads.t12 r12, com.google.android.gms.internal.ads.dz1 r13) {
        /*
        // Method dump skipped, instructions count: 1466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.a(java.lang.Object, com.google.android.gms.internal.ads.t12, com.google.android.gms.internal.ads.dz1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r6 == 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0107, code lost:
        if (r6 == 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0109, code lost:
        r0 = com.google.android.gms.internal.ads.zx1.a(r12, r8, r11);
        r1 = r11.f2185a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c8, code lost:
        if (r0 == r8) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
        if (r0 == r15) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0212, code lost:
        if (r0 == r15) goto L_0x0214;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.z12
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.cy1 r32) {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.cy1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.z12] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.z12] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.z12
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r14) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.a(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.ads.b22.a(com.google.android.gms.internal.ads.y22.f(r10, r6), com.google.android.gms.internal.ads.y22.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.ads.y22.b(r10, r6) == com.google.android.gms.internal.ads.y22.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r10, r6) == com.google.android.gms.internal.ads.y22.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.ads.y22.b(r10, r6) == com.google.android.gms.internal.ads.y22.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r10, r6) == com.google.android.gms.internal.ads.y22.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r10, r6) == com.google.android.gms.internal.ads.y22.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r10, r6) == com.google.android.gms.internal.ads.y22.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.ads.b22.a(com.google.android.gms.internal.ads.y22.f(r10, r6), com.google.android.gms.internal.ads.y22.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.ads.b22.a(com.google.android.gms.internal.ads.y22.f(r10, r6), com.google.android.gms.internal.ads.y22.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.ads.b22.a(com.google.android.gms.internal.ads.y22.f(r10, r6), com.google.android.gms.internal.ads.y22.f(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.ads.y22.c(r10, r6) == com.google.android.gms.internal.ads.y22.c(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r10, r6) == com.google.android.gms.internal.ads.y22.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.ads.y22.b(r10, r6) == com.google.android.gms.internal.ads.y22.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.ads.y22.a(r10, r6) == com.google.android.gms.internal.ads.y22.a(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.ads.y22.b(r10, r6) == com.google.android.gms.internal.ads.y22.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.ads.y22.b(r10, r6) == com.google.android.gms.internal.ads.y22.b(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.y22.d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.y22.d(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.y22.e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.y22.e(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.b22.a(com.google.android.gms.internal.ads.y22.f(r10, r6), com.google.android.gms.internal.ads.y22.f(r11, r6)) != false) goto L_0x01b3;
     */
    @Override // com.google.android.gms.internal.ads.z12
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r10, T r11) {
        /*
        // Method dump skipped, instructions count: 626
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.a(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final void b(T t) {
        int i2;
        int i3 = this.k;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            long d2 = (long) (d(this.j[i3]) & 1048575);
            Object f2 = y22.f(t, d2);
            if (f2 != null) {
                y22.a(t, d2, this.q.d(f2));
            }
            i3++;
        }
        int length = this.j.length;
        while (i2 < length) {
            this.n.b(t, (long) this.j[i2]);
            i2++;
        }
        this.o.a((Object) t);
        if (this.f) {
            this.p.c(t);
        }
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.f2692a.length; i2 += 3) {
                int d2 = d(i2);
                long j2 = (long) (1048575 & d2);
                int i3 = this.f2692a[i2];
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (a((Object) t2, i2)) {
                            y22.a(t, j2, y22.e(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (a((Object) t2, i2)) {
                            y22.a((Object) t, j2, y22.d(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 3:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 4:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 5:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 6:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 7:
                        if (a((Object) t2, i2)) {
                            y22.a(t, j2, y22.c(t2, j2));
                            b((Object) t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a(t, j2, y22.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 9:
                    case 17:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a(t, j2, y22.f(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 11:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 12:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 13:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 14:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 15:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.a(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 16:
                        if (!a((Object) t2, i2)) {
                            break;
                        }
                        y22.a((Object) t, j2, y22.b(t2, j2));
                        b((Object) t, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.a(t, t2, j2);
                        break;
                    case 50:
                        b22.a(this.q, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        y22.a(t, j2, y22.f(t2, j2));
                        b(t, i3, i2);
                        break;
                    case 60:
                    case 68:
                        b(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                        y22.a(t, j2, y22.f(t2, j2));
                        b(t, i3, i2);
                        break;
                }
            }
            b22.a(this.o, t, t2);
            if (this.f) {
                b22.a(this.p, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r20, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.ads.xy1.e(r3) + com.google.android.gms.internal.ads.xy1.g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.dy1) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.ads.xy1.b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0414, code lost:
        if (a(r20, r15, r5) != false) goto L_0x06cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0434, code lost:
        if (a(r20, r15, r5) != false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x043c, code lost:
        if (a(r20, r15, r5) != false) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x045c, code lost:
        if (a(r20, r15, r5) != false) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0464, code lost:
        if (a(r20, r15, r5) != false) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0474, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.dy1) != false) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0519, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x052b, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x053d, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x054f, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0561, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0573, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0585, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0597, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05a8, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b9, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05ca, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05db, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05ec, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fd, code lost:
        if (r19.i != false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05ff, code lost:
        r2.putInt(r20, (long) r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0603, code lost:
        r8 = (com.google.android.gms.internal.ads.xy1.e(r15) + com.google.android.gms.internal.ads.xy1.g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06ca, code lost:
        if ((r12 & r18) != 0) goto L_0x06cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06cc, code lost:
        r4 = com.google.android.gms.internal.ads.xy1.c(r15, (com.google.android.gms.internal.ads.c12) r2.getObject(r20, r9), a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06f7, code lost:
        if ((r12 & r18) != 0) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f9, code lost:
        r4 = com.google.android.gms.internal.ads.xy1.h(r15, 0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0702, code lost:
        if ((r12 & r18) != 0) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0704, code lost:
        r8 = com.google.android.gms.internal.ads.xy1.j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0727, code lost:
        if ((r12 & r18) != 0) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0729, code lost:
        r4 = r2.getObject(r20, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x072d, code lost:
        r4 = com.google.android.gms.internal.ads.xy1.c(r15, (com.google.android.gms.internal.ads.dy1) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0736, code lost:
        if ((r12 & r18) != 0) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0738, code lost:
        r4 = com.google.android.gms.internal.ads.b22.a(r15, r2.getObject(r20, r9), a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.dy1) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0750, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.dy1) != false) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0753, code lost:
        r4 = com.google.android.gms.internal.ads.xy1.b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r19.i != false) goto L_0x020d;
     */
    @Override // com.google.android.gms.internal.ads.z12
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(T r20) {
        /*
        // Method dump skipped, instructions count: 2390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.c(java.lang.Object):int");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.ads.z12
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(T r9) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g12.d(java.lang.Object):int");
    }
}
