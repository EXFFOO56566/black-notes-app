package com.google.android.gms.internal.ads;

public final class ax1 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f1828a;

    private ax1(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f1828a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static ax1 a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new ax1(bArr, 0, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.f1828a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
