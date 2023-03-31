package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

final class pd2 implements kd2, ld2 {

    /* renamed from: b  reason: collision with root package name */
    public final ld2[] f4151b;

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<wd2, Integer> f4152c = new IdentityHashMap<>();
    private kd2 d;
    private int e;
    private ee2 f;
    private ld2[] g;
    private zd2 h;

    public pd2(ld2... ld2Arr) {
        this.f4151b = ld2Arr;
    }

    @Override // com.google.android.gms.internal.ads.zd2, com.google.android.gms.internal.ads.ld2
    public final long a() {
        return this.h.a();
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long a(ne2[] ne2Arr, boolean[] zArr, wd2[] wd2Arr, boolean[] zArr2, long j) {
        wd2[] wd2Arr2 = wd2Arr;
        int[] iArr = new int[ne2Arr.length];
        int[] iArr2 = new int[ne2Arr.length];
        for (int i = 0; i < ne2Arr.length; i++) {
            iArr[i] = wd2Arr2[i] == null ? -1 : this.f4152c.get(wd2Arr2[i]).intValue();
            iArr2[i] = -1;
            if (ne2Arr[i] != null) {
                ae2 a2 = ne2Arr[i].a();
                int i2 = 0;
                while (true) {
                    ld2[] ld2Arr = this.f4151b;
                    if (i2 >= ld2Arr.length) {
                        break;
                    } else if (ld2Arr[i2].f().a(a2) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f4152c.clear();
        int length = ne2Arr.length;
        wd2[] wd2Arr3 = new wd2[length];
        wd2[] wd2Arr4 = new wd2[ne2Arr.length];
        ne2[] ne2Arr2 = new ne2[ne2Arr.length];
        ArrayList arrayList = new ArrayList(this.f4151b.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f4151b.length) {
            for (int i4 = 0; i4 < ne2Arr.length; i4++) {
                ne2 ne2 = null;
                wd2Arr4[i4] = iArr[i4] == i3 ? wd2Arr2[i4] : null;
                if (iArr2[i4] == i3) {
                    ne2 = ne2Arr[i4];
                }
                ne2Arr2[i4] = ne2;
            }
            long a3 = this.f4151b[i3].a(ne2Arr2, zArr, wd2Arr4, zArr2, j2);
            if (i3 == 0) {
                j2 = a3;
            } else if (a3 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i5 = 0; i5 < ne2Arr.length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    mf2.b(wd2Arr4[i5] != null);
                    wd2Arr3[i5] = wd2Arr4[i5];
                    this.f4152c.put(wd2Arr4[i5], Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (wd2Arr4[i5] != null) {
                        z2 = false;
                    }
                    mf2.b(z2);
                }
            }
            if (z) {
                arrayList.add(this.f4151b[i3]);
            }
            i3++;
            arrayList = arrayList;
            ne2Arr2 = ne2Arr2;
            wd2Arr2 = wd2Arr;
        }
        System.arraycopy(wd2Arr3, 0, wd2Arr2, 0, length);
        ld2[] ld2Arr2 = new ld2[arrayList.size()];
        this.g = ld2Arr2;
        arrayList.toArray(ld2Arr2);
        this.h = new xc2(this.g);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final void a(kd2 kd2, long j) {
        this.d = kd2;
        ld2[] ld2Arr = this.f4151b;
        this.e = ld2Arr.length;
        for (ld2 ld2 : ld2Arr) {
            ld2.a(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void a(ld2 ld2) {
        int i = this.e - 1;
        this.e = i;
        if (i <= 0) {
            int i2 = 0;
            for (ld2 ld22 : this.f4151b) {
                i2 += ld22.f().f2410a;
            }
            ae2[] ae2Arr = new ae2[i2];
            int i3 = 0;
            for (ld2 ld23 : this.f4151b) {
                ee2 f2 = ld23.f();
                int i4 = f2.f2410a;
                int i5 = 0;
                while (i5 < i4) {
                    ae2Arr[i3] = f2.a(i5);
                    i5++;
                    i3++;
                }
            }
            this.f = new ee2(ae2Arr);
            this.d.a((ld2) this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.zd2] */
    @Override // com.google.android.gms.internal.ads.yd2
    public final /* synthetic */ void a(ld2 ld2) {
        if (this.f != null) {
            this.d.a((zd2) this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zd2, com.google.android.gms.internal.ads.ld2
    public final boolean a(long j) {
        return this.h.a(j);
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long b() {
        long b2 = this.f4151b[0].b();
        int i = 1;
        while (true) {
            ld2[] ld2Arr = this.f4151b;
            if (i >= ld2Arr.length) {
                if (b2 != -9223372036854775807L) {
                    ld2[] ld2Arr2 = this.g;
                    for (ld2 ld2 : ld2Arr2) {
                        if (ld2 != this.f4151b[0] && ld2.c(b2) != b2) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return b2;
            } else if (ld2Arr[i].b() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final void b(long j) {
        for (ld2 ld2 : this.g) {
            ld2.b(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long c() {
        long j = Long.MAX_VALUE;
        for (ld2 ld2 : this.g) {
            long c2 = ld2.c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long c(long j) {
        long c2 = this.g[0].c(j);
        int i = 1;
        while (true) {
            ld2[] ld2Arr = this.g;
            if (i >= ld2Arr.length) {
                return c2;
            }
            if (ld2Arr[i].c(c2) == c2) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final void e() {
        for (ld2 ld2 : this.f4151b) {
            ld2.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final ee2 f() {
        return this.f;
    }
}
