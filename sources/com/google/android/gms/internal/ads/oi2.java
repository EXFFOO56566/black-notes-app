package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class oi2 extends ci2 {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f4003c;
    private final int d;
    private final int e;

    public oi2(int i) {
        int i2 = i / 8;
        this.d = i % 8 > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final byte[] a(String str) {
        synchronized (this.f2124a) {
            MessageDigest a2 = a();
            this.f4003c = a2;
            if (a2 == null) {
                return new byte[0];
            }
            a2.reset();
            this.f4003c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.f4003c.digest();
            int length = digest.length > this.d ? this.d : digest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if (this.e % 8 > 0) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += (long) (bArr[i] & 255);
                }
                long j2 = j >>> (8 - (this.e % 8));
                for (int i2 = this.d - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) ((int) (255 & j2));
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
