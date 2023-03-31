package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class ki2 extends ci2 {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f3404c;

    @Override // com.google.android.gms.internal.ads.ci2
    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a2 = gi2.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a2);
            bArr = allocate.array();
        } else {
            if (split.length < 5) {
                bArr2 = new byte[(split.length << 1)];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int a3 = gi2.a(split[i2]);
                    int i3 = (a3 >> 16) ^ (65535 & a3);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 << 1;
                    bArr2[i4] = bArr3[0];
                    bArr2[i4 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[split.length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int a4 = gi2.a(split[i5]);
                    bArr2[i5] = (byte) ((a4 >> 24) ^ (((a4 & 255) ^ ((a4 >> 8) & 255)) ^ ((a4 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.f3404c = a();
        synchronized (this.f2124a) {
            if (this.f3404c == null) {
                return new byte[0];
            }
            this.f3404c.reset();
            this.f3404c.update(bArr);
            byte[] digest = this.f3404c.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, i);
            return bArr4;
        }
    }
}
