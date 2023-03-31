package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

public final class ka2 implements ma2 {
    private static final byte[] g = new byte[4096];

    /* renamed from: a  reason: collision with root package name */
    private final ye2 f3358a;

    /* renamed from: b  reason: collision with root package name */
    private final long f3359b;

    /* renamed from: c  reason: collision with root package name */
    private long f3360c;
    private byte[] d = new byte[65536];
    private int e;
    private int f;

    public ka2(ye2 ye2, long j, long j2) {
        this.f3358a = ye2;
        this.f3360c = j;
        this.f3359b = j2;
    }

    private final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a2 = this.f3358a.a(bArr, i + i3, i2 - i3);
            if (a2 != -1) {
                return i3 + a2;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final boolean a(int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (i2 > bArr.length) {
            this.d = Arrays.copyOf(this.d, ag2.a(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f - this.e, i);
        while (min < i) {
            min = a(this.d, this.e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.e + i;
        this.e = i3;
        this.f = Math.max(this.f, i3);
        return true;
    }

    private final int d(int i) {
        int min = Math.min(this.f, i);
        e(min);
        return min;
    }

    private final int d(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.d, 0, bArr, i, min);
        e(min);
        return min;
    }

    private final void e(int i) {
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr = this.d;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.d, i, bArr, 0, this.f);
        this.d = bArr;
    }

    private final void f(int i) {
        if (i != -1) {
            this.f3360c += (long) i;
        }
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final int a(int i) {
        int d2 = d(i);
        if (d2 == 0) {
            byte[] bArr = g;
            d2 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        f(d2);
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final int a(byte[] bArr, int i, int i2) {
        int d2 = d(bArr, i, i2);
        if (d2 == 0) {
            d2 = a(bArr, i, i2, 0, true);
        }
        f(d2);
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final long a() {
        return this.f3359b;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int d2 = d(bArr, i, i2);
        while (d2 < i2 && d2 != -1) {
            d2 = a(bArr, i, i2, d2, z);
        }
        f(d2);
        return d2 != -1;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final void b() {
        this.e = 0;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final void b(int i) {
        int d2 = d(i);
        while (d2 < i && d2 != -1) {
            byte[] bArr = g;
            d2 = a(bArr, -d2, Math.min(i, bArr.length + d2), d2, false);
        }
        f(d2);
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final void b(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final long c() {
        return this.f3360c;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final void c(int i) {
        a(i, false);
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final void c(byte[] bArr, int i, int i2) {
        if (a(i2, false)) {
            System.arraycopy(this.d, this.e - i2, bArr, i, i2);
        }
    }
}
