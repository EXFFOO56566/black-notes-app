package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class rf2 {

    /* renamed from: a  reason: collision with root package name */
    private int f4497a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f4498b;

    public rf2() {
        this(32);
    }

    private rf2(int i) {
        this.f4498b = new long[32];
    }

    public final int a() {
        return this.f4497a;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.f4497a) {
            return this.f4498b[i];
        }
        int i2 = this.f4497a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void a(long j) {
        int i = this.f4497a;
        long[] jArr = this.f4498b;
        if (i == jArr.length) {
            this.f4498b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.f4498b;
        int i2 = this.f4497a;
        this.f4497a = i2 + 1;
        jArr2[i2] = j;
    }
}
