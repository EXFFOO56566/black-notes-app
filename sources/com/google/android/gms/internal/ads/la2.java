package com.google.android.gms.internal.ads;

public final class la2 implements sa2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f3518a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f3519b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f3520c;
    private final long d;

    public la2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3519b = jArr;
        this.f3520c = jArr3;
        int length = iArr.length;
        this.f3518a = length;
        if (length > 0) {
            this.d = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.sa2
    public final long a(long j) {
        return this.f3519b[ag2.a(this.f3520c, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.sa2
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sa2
    public final long c() {
        return this.d;
    }
}
