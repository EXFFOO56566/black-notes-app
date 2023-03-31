package com.google.android.gms.internal.ads;

import android.net.Uri;

final class mr implements ye2 {

    /* renamed from: a  reason: collision with root package name */
    private final ye2 f3749a;

    /* renamed from: b  reason: collision with root package name */
    private final long f3750b;

    /* renamed from: c  reason: collision with root package name */
    private final ye2 f3751c;
    private long d;
    private Uri e;

    mr(ye2 ye2, int i, ye2 ye22) {
        this.f3749a = ye2;
        this.f3750b = (long) i;
        this.f3751c = ye22;
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final int a(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.f3750b;
        if (j < j2) {
            i3 = this.f3749a.a(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.d < this.f3750b) {
            return i3;
        }
        int a2 = this.f3751c.a(bArr, i + i3, i2 - i3);
        int i4 = i3 + a2;
        this.d += (long) a2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final long a(ze2 ze2) {
        ze2 ze22;
        this.e = ze2.f5742a;
        long j = ze2.d;
        long j2 = this.f3750b;
        ze2 ze23 = null;
        if (j >= j2) {
            ze22 = null;
        } else {
            long j3 = ze2.e;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            ze22 = new ze2(ze2.f5742a, j, j4, null);
        }
        long j5 = ze2.e;
        if (j5 == -1 || ze2.d + j5 > this.f3750b) {
            long max = Math.max(this.f3750b, ze2.d);
            long j6 = ze2.e;
            ze23 = new ze2(ze2.f5742a, max, j6 != -1 ? Math.min(j6, (ze2.d + j6) - this.f3750b) : -1, null);
        }
        long j7 = 0;
        long a2 = ze22 != null ? this.f3749a.a(ze22) : 0;
        if (ze23 != null) {
            j7 = this.f3751c.a(ze23);
        }
        this.d = ze2.d;
        if (a2 == -1 || j7 == -1) {
            return -1;
        }
        return a2 + j7;
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final void close() {
        this.f3749a.close();
        this.f3751c.close();
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final Uri l0() {
        return this.e;
    }
}
