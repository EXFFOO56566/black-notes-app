package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class s82 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f4615a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f4616b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f4617c = {2, 1, 2, 3, 3, 4, 4, 5};

    public static int a() {
        return 1536;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f4615a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static e82 a(xf2 xf2, String str, String str2, ba2 ba2) {
        int i = f4616b[(xf2.g() & 192) >> 6];
        int g = xf2.g();
        int i2 = f4617c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return e82.a(str, "audio/ac3", null, -1, -1, i2, i, null, null, 0, str2);
    }

    public static e82 b(xf2 xf2, String str, String str2, ba2 ba2) {
        xf2.d(2);
        int i = f4616b[(xf2.g() & 192) >> 6];
        int g = xf2.g();
        int i2 = f4617c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return e82.a(str, "audio/eac3", null, -1, -1, i2, i, null, null, 0, str2);
    }
}
