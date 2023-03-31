package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ae2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1740a;

    /* renamed from: b  reason: collision with root package name */
    private final e82[] f1741b;

    /* renamed from: c  reason: collision with root package name */
    private int f1742c;

    public ae2(e82... e82Arr) {
        mf2.b(e82Arr.length > 0);
        this.f1741b = e82Arr;
        this.f1740a = e82Arr.length;
    }

    public final int a(e82 e82) {
        int i = 0;
        while (true) {
            e82[] e82Arr = this.f1741b;
            if (i >= e82Arr.length) {
                return -1;
            }
            if (e82 == e82Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final e82 a(int i) {
        return this.f1741b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ae2.class == obj.getClass()) {
            ae2 ae2 = (ae2) obj;
            return this.f1740a == ae2.f1740a && Arrays.equals(this.f1741b, ae2.f1741b);
        }
    }

    public final int hashCode() {
        if (this.f1742c == 0) {
            this.f1742c = Arrays.hashCode(this.f1741b) + 527;
        }
        return this.f1742c;
    }
}
