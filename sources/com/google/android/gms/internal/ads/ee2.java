package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ee2 {
    public static final ee2 d = new ee2(new ae2[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f2410a;

    /* renamed from: b  reason: collision with root package name */
    private final ae2[] f2411b;

    /* renamed from: c  reason: collision with root package name */
    private int f2412c;

    public ee2(ae2... ae2Arr) {
        this.f2411b = ae2Arr;
        this.f2410a = ae2Arr.length;
    }

    public final int a(ae2 ae2) {
        for (int i = 0; i < this.f2410a; i++) {
            if (this.f2411b[i] == ae2) {
                return i;
            }
        }
        return -1;
    }

    public final ae2 a(int i) {
        return this.f2411b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ee2.class == obj.getClass()) {
            ee2 ee2 = (ee2) obj;
            return this.f2410a == ee2.f2410a && Arrays.equals(this.f2411b, ee2.f2411b);
        }
    }

    public final int hashCode() {
        if (this.f2412c == 0) {
            this.f2412c = Arrays.hashCode(this.f2411b);
        }
        return this.f2412c;
    }
}
