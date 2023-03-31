package com.google.android.gms.internal.ads;

final class bc2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1920a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f1921b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f1922c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public bc2(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        mf2.a(iArr.length == jArr2.length);
        mf2.a(jArr.length == jArr2.length);
        mf2.a(iArr2.length != jArr2.length ? false : z);
        this.f1921b = jArr;
        this.f1922c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.f1920a = jArr.length;
    }

    public final int a(long j) {
        for (int a2 = ag2.a(this.e, j, true, false); a2 >= 0; a2--) {
            if ((this.f[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int b2 = ag2.b(this.e, j, true, false); b2 < this.e.length; b2++) {
            if ((this.f[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
