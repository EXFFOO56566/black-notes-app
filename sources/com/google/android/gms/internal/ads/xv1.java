package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class xv1 implements fp1 {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f5503b = new aw1();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f5504a;

    public xv1(byte[] bArr) {
        jx1.a(bArr.length);
        this.f5504a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (gx1.a()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.fp1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a2 = ex1.a(12);
            System.arraycopy(a2, 0, bArr3, 0, 12);
            f5503b.get().init(1, this.f5504a, a(a2, 0, a2.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                f5503b.get().updateAAD(bArr2);
            }
            int doFinal = f5503b.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
