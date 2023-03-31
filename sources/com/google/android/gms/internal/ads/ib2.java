package com.google.android.gms.internal.ads;

final class ib2 {

    /* renamed from: a  reason: collision with root package name */
    private final xf2 f3056a = new xf2(8);

    /* renamed from: b  reason: collision with root package name */
    private int f3057b;

    private final long b(ma2 ma2) {
        int i = 0;
        ma2.c(this.f3056a.f5423a, 0, 1);
        int i2 = this.f3056a.f5423a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ma2.c(this.f3056a.f5423a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f3056a.f5423a[i] & 255) + (i5 << 8);
        }
        this.f3057b += i4 + 1;
        return (long) i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ads.ma2 r18) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ib2.a(com.google.android.gms.internal.ads.ma2):boolean");
    }
}
