package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class hb2 {
    private static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f2889a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f2890b;

    /* renamed from: c  reason: collision with root package name */
    private int f2891c;

    public static int a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long a(ma2 ma2, boolean z, boolean z2, int i) {
        if (this.f2890b == 0) {
            if (!ma2.a(this.f2889a, 0, 1, z)) {
                return -1;
            }
            int a2 = a(this.f2889a[0] & 255);
            this.f2891c = a2;
            if (a2 != -1) {
                this.f2890b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f2891c;
        if (i2 > i) {
            this.f2890b = 0;
            return -2;
        }
        if (i2 != 1) {
            ma2.b(this.f2889a, 1, i2 - 1);
        }
        this.f2890b = 0;
        return a(this.f2889a, this.f2891c, z2);
    }

    public final void a() {
        this.f2890b = 0;
        this.f2891c = 0;
    }

    public final int b() {
        return this.f2891c;
    }
}
