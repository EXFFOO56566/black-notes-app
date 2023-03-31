package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class uz1 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f5029a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5030b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5030b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f5030b;
        ty1.a(bArr2, 0, bArr2.length, false);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int a(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static Object a(Object obj, Object obj2) {
        b12 a2 = ((c12) obj).a();
        a2.a((c12) obj2);
        return a2.b();
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean a(c12 c12) {
        if (!(c12 instanceof vx1)) {
            return false;
        }
        vx1 vx1 = (vx1) c12;
        return false;
    }

    public static boolean b(byte[] bArr) {
        return a32.a(bArr);
    }

    public static String c(byte[] bArr) {
        return new String(bArr, f5029a);
    }
}
