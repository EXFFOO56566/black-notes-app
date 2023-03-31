package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class sv1 implements wp1 {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f4712a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4713b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f4714c;
    private byte[] d;

    public sv1(byte[] bArr, int i) {
        jx1.a(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i <= 16) {
            this.f4712a = new SecretKeySpec(bArr, "AES");
            this.f4713b = i;
            Cipher a2 = a();
            a2.init(1, this.f4712a);
            byte[] a3 = zv1.a(a2.doFinal(new byte[16]));
            this.f4714c = a3;
            this.d = zv1.a(a3);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    private static Cipher a() {
        return tw1.f.a("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.wp1
    public final byte[] a(byte[] bArr) {
        byte[] bArr2;
        Cipher a2 = a();
        a2.init(1, this.f4712a);
        int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if ((max << 4) == bArr.length) {
            bArr2 = cw1.a(bArr, (max - 1) << 4, this.f4714c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length < 16) {
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                bArr2 = cw1.a(copyOf, this.d);
            } else {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
        }
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr3 = a2.doFinal(cw1.a(bArr3, 0, bArr, i << 4, 16));
        }
        byte[] a3 = cw1.a(bArr2, bArr3);
        byte[] bArr4 = new byte[this.f4713b];
        System.arraycopy(a2.doFinal(a3), 0, bArr4, 0, this.f4713b);
        return bArr4;
    }
}
