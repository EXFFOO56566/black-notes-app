package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class cg2 {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f2115a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2116b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2117c;

    private cg2(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f2115a = list;
        this.f2116b = i;
        this.f2117c = f;
    }

    public static cg2 a(xf2 xf2) {
        float f;
        int i;
        int i2;
        try {
            xf2.d(4);
            int g = (xf2.g() & 3) + 1;
            if (g != 3) {
                ArrayList arrayList = new ArrayList();
                int g2 = xf2.g() & 31;
                for (int i3 = 0; i3 < g2; i3++) {
                    arrayList.add(b(xf2));
                }
                int g3 = xf2.g();
                for (int i4 = 0; i4 < g3; i4++) {
                    arrayList.add(b(xf2));
                }
                if (g2 > 0) {
                    vf2 a2 = sf2.a((byte[]) arrayList.get(0), g, ((byte[]) arrayList.get(0)).length);
                    int i5 = a2.f5106a;
                    int i6 = a2.f5107b;
                    f = a2.f5108c;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new cg2(arrayList, g, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new h82("Error parsing AVC config", e);
        }
    }

    private static byte[] b(xf2 xf2) {
        int h = xf2.h();
        int b2 = xf2.b();
        xf2.d(h);
        return pf2.a(xf2.f5423a, b2, h);
    }
}
