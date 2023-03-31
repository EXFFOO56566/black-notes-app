package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class pf2 {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f4165a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f4166b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f4167c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int a(uf2 uf2) {
        int a2 = uf2.a(5);
        return a2 == 31 ? uf2.a(6) + 32 : a2;
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        uf2 uf2 = new uf2(bArr);
        int a2 = a(uf2);
        int b2 = b(uf2);
        int a3 = uf2.a(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(uf2);
            if (a(uf2) == 22) {
                a3 = uf2.a(4);
            }
        }
        int i = f4167c[a3];
        mf2.a(i != -1);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f4165a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f4165a.length, i2);
        return bArr3;
    }

    private static int b(uf2 uf2) {
        int a2 = uf2.a(4);
        if (a2 == 15) {
            return uf2.a(24);
        }
        mf2.a(a2 < 13);
        return f4166b[a2];
    }
}
