package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
public final class r82 {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4460a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4461b = 2;

    static {
        new r82(new int[]{2}, 2);
    }

    private r82(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f4460a = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean a(int i) {
        return Arrays.binarySearch(this.f4460a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r82)) {
            return false;
        }
        r82 r82 = (r82) obj;
        return Arrays.equals(this.f4460a, r82.f4460a) && this.f4461b == r82.f4461b;
    }

    public final int hashCode() {
        return this.f4461b + (Arrays.hashCode(this.f4460a) * 31);
    }

    public final String toString() {
        int i = this.f4461b;
        String arrays = Arrays.toString(this.f4460a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
