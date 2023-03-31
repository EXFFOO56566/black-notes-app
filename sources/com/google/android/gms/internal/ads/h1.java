package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public final class h1 extends r1 {
    private static final int j = Color.rgb(12, 174, 206);
    private static final int k = Color.rgb(204, 204, 204);
    private static final int l = j;

    /* renamed from: b  reason: collision with root package name */
    private final String f2840b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i1> f2841c = new ArrayList();
    private final List<v1> d = new ArrayList();
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public h1(String str, List<i1> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f2840b = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                i1 i1Var = list.get(i4);
                this.f2841c.add(i1Var);
                this.d.add(i1Var);
            }
        }
        this.e = num != null ? num.intValue() : k;
        this.f = num2 != null ? num2.intValue() : l;
        this.g = num3 != null ? num3.intValue() : 12;
        this.h = i2;
        this.i = i3;
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final String D0() {
        return this.f2840b;
    }

    public final int b2() {
        return this.e;
    }

    public final int c2() {
        return this.f;
    }

    public final int d2() {
        return this.g;
    }

    public final List<i1> e2() {
        return this.f2841c;
    }

    public final int f2() {
        return this.h;
    }

    public final int g2() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final List<v1> q0() {
        return this.d;
    }
}
