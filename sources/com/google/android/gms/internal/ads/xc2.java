package com.google.android.gms.internal.ads;

public final class xc2 implements zd2 {

    /* renamed from: b  reason: collision with root package name */
    private final zd2[] f5410b;

    public xc2(zd2[] zd2Arr) {
        this.f5410b = zd2Arr;
    }

    @Override // com.google.android.gms.internal.ads.zd2
    public final long a() {
        long j = Long.MAX_VALUE;
        for (zd2 zd2 : this.f5410b) {
            long a2 = zd2.a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zd2
    public final boolean a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a2 = a();
            if (a2 == Long.MIN_VALUE) {
                break;
            }
            zd2[] zd2Arr = this.f5410b;
            z = false;
            for (zd2 zd2 : zd2Arr) {
                if (zd2.a() == a2) {
                    z |= zd2.a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
