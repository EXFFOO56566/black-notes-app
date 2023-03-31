package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class xp1<P> {

    /* renamed from: a  reason: collision with root package name */
    private final P f5474a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5475b;

    /* renamed from: c  reason: collision with root package name */
    private final su1 f5476c;
    private final lv1 d;

    xp1(P p, byte[] bArr, su1 su1, lv1 lv1, int i) {
        this.f5474a = p;
        this.f5475b = Arrays.copyOf(bArr, bArr.length);
        this.f5476c = su1;
        this.d = lv1;
    }

    public final P a() {
        return this.f5474a;
    }

    public final su1 b() {
        return this.f5476c;
    }

    public final lv1 c() {
        return this.d;
    }

    public final byte[] d() {
        byte[] bArr = this.f5475b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
