package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class ky1 extends oy1 {
    private final int f;
    private final int g;

    ky1(byte[] bArr, int i, int i2) {
        super(bArr);
        dy1.c(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.oy1, com.google.android.gms.internal.ads.dy1
    public final void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.e, n() + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.oy1, com.google.android.gms.internal.ads.dy1
    public final byte f(int i) {
        dy1.b(i, size());
        return this.e[this.f + i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.oy1, com.google.android.gms.internal.ads.dy1
    public final byte g(int i) {
        return this.e[this.f + i];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.oy1
    public final int n() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.oy1, com.google.android.gms.internal.ads.dy1
    public final int size() {
        return this.g;
    }
}
