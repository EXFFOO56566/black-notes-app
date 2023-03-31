package com.google.android.gms.internal.ads;

public final class ux1 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5019a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private int f5020b;

    /* renamed from: c  reason: collision with root package name */
    private int f5021c;

    public ux1(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f5019a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f5019a;
            i2 = (i2 + bArr2[i3] + bArr[i3 % bArr.length]) & 255;
            byte b2 = bArr2[i3];
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b2;
        }
        this.f5020b = 0;
        this.f5021c = 0;
    }

    public final void a(byte[] bArr) {
        int i = this.f5020b;
        int i2 = this.f5021c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f5019a;
            i2 = (i2 + bArr2[i]) & 255;
            byte b2 = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b2;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.f5020b = i;
        this.f5021c = i2;
    }
}
