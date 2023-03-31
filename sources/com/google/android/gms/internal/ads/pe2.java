package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class pe2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4154a;

    /* renamed from: b  reason: collision with root package name */
    private final ne2[] f4155b;

    /* renamed from: c  reason: collision with root package name */
    private int f4156c;

    public pe2(ne2... ne2Arr) {
        this.f4155b = ne2Arr;
        this.f4154a = ne2Arr.length;
    }

    public final ne2 a(int i) {
        return this.f4155b[i];
    }

    public final ne2[] a() {
        return (ne2[]) this.f4155b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pe2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4155b, ((pe2) obj).f4155b);
    }

    public final int hashCode() {
        if (this.f4156c == 0) {
            this.f4156c = Arrays.hashCode(this.f4155b) + 527;
        }
        return this.f4156c;
    }
}
