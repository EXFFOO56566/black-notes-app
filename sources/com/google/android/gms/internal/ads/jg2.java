package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class jg2 {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f3223a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3224b;

    private jg2(List<byte[]> list, int i) {
        this.f3223a = list;
        this.f3224b = i;
    }

    public static jg2 a(xf2 xf2) {
        try {
            xf2.d(21);
            int g = xf2.g() & 3;
            int g2 = xf2.g();
            int b2 = xf2.b();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                xf2.d(1);
                int h = xf2.h();
                for (int i3 = 0; i3 < h; i3++) {
                    int h2 = xf2.h();
                    i += h2 + 4;
                    xf2.d(h2);
                }
            }
            xf2.c(b2);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                xf2.d(1);
                int h3 = xf2.h();
                for (int i6 = 0; i6 < h3; i6++) {
                    int h4 = xf2.h();
                    System.arraycopy(sf2.f4651a, 0, bArr, i4, sf2.f4651a.length);
                    int length = i4 + sf2.f4651a.length;
                    System.arraycopy(xf2.f5423a, xf2.b(), bArr, length, h4);
                    i4 = length + h4;
                    xf2.d(h4);
                }
            }
            return new jg2(i == 0 ? null : Collections.singletonList(bArr), g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new h82("Error parsing HEVC config", e);
        }
    }
}
