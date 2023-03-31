package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

public final class xf2 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f5423a;

    /* renamed from: b  reason: collision with root package name */
    private int f5424b;

    /* renamed from: c  reason: collision with root package name */
    private int f5425c;

    public xf2() {
    }

    public xf2(int i) {
        this.f5423a = new byte[i];
        this.f5425c = i;
    }

    public xf2(byte[] bArr) {
        this.f5423a = bArr;
        this.f5425c = bArr.length;
    }

    public final int a() {
        byte[] bArr = this.f5423a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void a(int i) {
        a(a() < i ? new byte[i] : this.f5423a, i);
    }

    public final void a(byte[] bArr, int i) {
        this.f5423a = bArr;
        this.f5425c = i;
        this.f5424b = 0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f5423a, this.f5424b, bArr, i, i2);
        this.f5424b += i2;
    }

    public final int b() {
        return this.f5424b;
    }

    public final void b(int i) {
        mf2.a(i >= 0 && i <= this.f5423a.length);
        this.f5425c = i;
    }

    public final int c() {
        return this.f5425c;
    }

    public final void c(int i) {
        mf2.a(i >= 0 && i <= this.f5425c);
        this.f5424b = i;
    }

    public final int d() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        int i3 = i2 + 1;
        this.f5424b = i3;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        this.f5424b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f5424b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public final void d(int i) {
        c(this.f5424b + i);
    }

    public final long e() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        int i3 = i2 + 1;
        this.f5424b = i3;
        int i4 = i3 + 1;
        this.f5424b = i4;
        int i5 = i4 + 1;
        this.f5424b = i5;
        int i6 = i5 + 1;
        this.f5424b = i6;
        int i7 = i6 + 1;
        this.f5424b = i7;
        int i8 = i7 + 1;
        this.f5424b = i8;
        this.f5424b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final String e(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = (this.f5424b + i) - 1;
        String str = new String(this.f5423a, this.f5424b, (i2 >= this.f5425c || this.f5423a[i2] != 0) ? i : i - 1);
        this.f5424b += i;
        return str;
    }

    public final short f() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        this.f5424b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int g() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        this.f5424b = i + 1;
        return bArr[i] & 255;
    }

    public final int h() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        this.f5424b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final void i() {
        this.f5424b = 0;
        this.f5425c = 0;
    }

    public final int j() {
        return this.f5425c - this.f5424b;
    }

    public final int k() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        this.f5424b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final long l() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        int i3 = i2 + 1;
        this.f5424b = i3;
        int i4 = i3 + 1;
        this.f5424b = i4;
        this.f5424b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final long m() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        int i3 = i2 + 1;
        this.f5424b = i3;
        int i4 = i3 + 1;
        this.f5424b = i4;
        this.f5424b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final int n() {
        byte[] bArr = this.f5423a;
        int i = this.f5424b;
        int i2 = i + 1;
        this.f5424b = i2;
        int i3 = i2 + 1;
        this.f5424b = i3;
        int i4 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f5424b = i3 + 2;
        return i4;
    }

    public final int o() {
        int d = d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    public final long p() {
        long e = e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }
}
