package com.google.android.gms.internal.ads;

final class z22 {
    public static void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (d(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || d(b4) || d(b5)) {
            throw b02.i();
        }
        int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void a(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (d(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || d(b4)))) {
            throw b02.i();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    public static void a(byte b2, byte b3, char[] cArr, int i) {
        if (b2 < -62 || d(b3)) {
            throw b02.i();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static void a(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    public static boolean a(byte b2) {
        return b2 >= 0;
    }

    public static boolean b(byte b2) {
        return b2 < -32;
    }

    public static boolean c(byte b2) {
        return b2 < -16;
    }

    private static boolean d(byte b2) {
        return b2 > -65;
    }
}
