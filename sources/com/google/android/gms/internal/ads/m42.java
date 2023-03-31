package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class m42 {
    public static final m42 j = new m42(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final m42 k = new m42(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final m42 l = new m42(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final m42 m = new m42(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    private final double f3659a;

    /* renamed from: b  reason: collision with root package name */
    private final double f3660b;

    /* renamed from: c  reason: collision with root package name */
    private final double f3661c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;

    private m42(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f3659a = d6;
        this.f3660b = d7;
        this.f3661c = d8;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = d9;
        this.i = d10;
    }

    public static m42 a(ByteBuffer byteBuffer) {
        double d2 = mu.d(byteBuffer);
        double d3 = mu.d(byteBuffer);
        double e2 = mu.e(byteBuffer);
        return new m42(d2, d3, mu.d(byteBuffer), mu.d(byteBuffer), e2, mu.e(byteBuffer), mu.e(byteBuffer), mu.d(byteBuffer), mu.d(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m42.class != obj.getClass()) {
            return false;
        }
        m42 m42 = (m42) obj;
        return Double.compare(m42.d, this.d) == 0 && Double.compare(m42.e, this.e) == 0 && Double.compare(m42.f, this.f) == 0 && Double.compare(m42.g, this.g) == 0 && Double.compare(m42.h, this.h) == 0 && Double.compare(m42.i, this.i) == 0 && Double.compare(m42.f3659a, this.f3659a) == 0 && Double.compare(m42.f3660b, this.f3660b) == 0 && Double.compare(m42.f3661c, this.f3661c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f3659a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f3660b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f3661c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        double d2 = this.f3659a;
        double d3 = this.f3660b;
        double d4 = this.f3661c;
        double d5 = this.d;
        double d6 = this.e;
        double d7 = this.f;
        double d8 = this.g;
        double d9 = this.h;
        double d10 = this.i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
