package com.google.android.gms.internal.ads;

import android.util.Log;

final class a82 {

    /* renamed from: a  reason: collision with root package name */
    public final ld2 f1717a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1718b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1719c;
    public final wd2[] d;
    private final boolean[] e;
    public final long f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public a82 l;
    public ue2 m;
    private final j82[] n;
    private final m82[] o;
    private final se2 p;
    private final i82 q;
    private final nd2 r;
    private ue2 s;

    public a82(j82[] j82Arr, m82[] m82Arr, long j2, se2 se2, i82 i82, nd2 nd2, Object obj, int i2, int i3, boolean z, long j3) {
        this.n = j82Arr;
        this.o = m82Arr;
        this.f = j2;
        this.p = se2;
        this.q = i82;
        this.r = nd2;
        mf2.a(obj);
        this.f1718b = obj;
        this.f1719c = i2;
        this.g = i3;
        this.i = z;
        this.h = j3;
        this.d = new wd2[j82Arr.length];
        this.e = new boolean[j82Arr.length];
        this.f1717a = nd2.a(i3, i82.c());
    }

    public final long a(long j2, boolean z) {
        return a(j2, false, new boolean[this.n.length]);
    }

    public final long a(long j2, boolean z, boolean[] zArr) {
        pe2 pe2 = this.m.f4940b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= pe2.f4154a) {
                break;
            }
            boolean[] zArr2 = this.e;
            if (z || !this.m.a(this.s, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long a2 = this.f1717a.a(pe2.a(), this.e, this.d, zArr, j2);
        this.s = this.m;
        this.k = false;
        int i3 = 0;
        while (true) {
            wd2[] wd2Arr = this.d;
            if (i3 < wd2Arr.length) {
                if (wd2Arr[i3] != null) {
                    mf2.b(pe2.a(i3) != null);
                    this.k = true;
                } else {
                    mf2.b(pe2.a(i3) == null);
                }
                i3++;
            } else {
                this.q.a(this.n, this.m.f4939a, pe2);
                return a2;
            }
        }
    }

    public final void a() {
        try {
            this.r.a(this.f1717a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    public final void a(int i2, boolean z) {
        this.g = i2;
        this.i = z;
    }

    public final long b() {
        return this.f - this.h;
    }

    public final boolean c() {
        if (this.j) {
            return !this.k || this.f1717a.c() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.se2 r0 = r6.p
            com.google.android.gms.internal.ads.m82[] r1 = r6.o
            com.google.android.gms.internal.ads.ld2 r2 = r6.f1717a
            com.google.android.gms.internal.ads.ee2 r2 = r2.f()
            com.google.android.gms.internal.ads.ue2 r0 = r0.a(r1, r2)
            com.google.android.gms.internal.ads.ue2 r1 = r6.s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.pe2 r5 = r0.f4940b
            int r5 = r5.f4154a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.m = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a82.d():boolean");
    }
}
