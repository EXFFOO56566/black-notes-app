package com.google.android.gms.internal.ads;

final class bw1 extends ew1 {
    bw1(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ew1
    public final int a() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ew1
    public final int[] a(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            ew1.a(iArr2, this.f2492a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
    }
}
