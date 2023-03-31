package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class ix1 extends ew1 {
    ix1(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ew1
    public final int a() {
        return 24;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ew1
    public final int[] a(int[] iArr, int i) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            ew1.a(iArr3, this.f2492a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            ew1.a(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            ew1.a(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
    }
}
