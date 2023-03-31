package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class uv1 implements dx1 {
    private static final ThreadLocal<Cipher> d = new tv1();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKeySpec f5011a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5012b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5013c;

    public uv1(byte[] bArr, int i) {
        jx1.a(bArr.length);
        this.f5011a = new SecretKeySpec(bArr, "AES");
        int blockSize = d.get().getBlockSize();
        this.f5013c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f5012b = i;
    }

    @Override // com.google.android.gms.internal.ads.dx1
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f5012b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a2 = ex1.a(i);
            System.arraycopy(a2, 0, bArr2, 0, this.f5012b);
            int length2 = bArr.length;
            int i2 = this.f5012b;
            Cipher cipher = d.get();
            byte[] bArr3 = new byte[this.f5013c];
            System.arraycopy(a2, 0, bArr3, 0, this.f5012b);
            cipher.init(1, this.f5011a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(Integer.MAX_VALUE - this.f5012b);
        throw new GeneralSecurityException(sb.toString());
    }
}
