package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class ge2 implements ne2 {

    /* renamed from: a  reason: collision with root package name */
    private final ae2 f2746a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2747b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f2748c;
    private final e82[] d;
    private int e;

    public ge2(ae2 ae2, int... iArr) {
        int i = 0;
        mf2.b(iArr.length > 0);
        mf2.a(ae2);
        this.f2746a = ae2;
        int length = iArr.length;
        this.f2747b = length;
        this.d = new e82[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = ae2.a(iArr[i2]);
        }
        Arrays.sort(this.d, new ie2());
        this.f2748c = new int[this.f2747b];
        while (true) {
            int i3 = this.f2747b;
            if (i < i3) {
                this.f2748c[i] = ae2.a(this.d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ne2
    public final int a(int i) {
        return this.f2748c[0];
    }

    @Override // com.google.android.gms.internal.ads.ne2
    public final ae2 a() {
        return this.f2746a;
    }

    @Override // com.google.android.gms.internal.ads.ne2
    public final e82 b(int i) {
        return this.d[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ge2 ge2 = (ge2) obj;
            return this.f2746a == ge2.f2746a && Arrays.equals(this.f2748c, ge2.f2748c);
        }
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = (System.identityHashCode(this.f2746a) * 31) + Arrays.hashCode(this.f2748c);
        }
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.ne2
    public final int length() {
        return this.f2748c.length;
    }
}
