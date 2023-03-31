package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class xa2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5396a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5397b;

    public xa2(int i, byte[] bArr) {
        this.f5397b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xa2.class == obj.getClass()) {
            xa2 xa2 = (xa2) obj;
            return this.f5396a == xa2.f5396a && Arrays.equals(this.f5397b, xa2.f5397b);
        }
    }

    public final int hashCode() {
        return (this.f5396a * 31) + Arrays.hashCode(this.f5397b);
    }
}
