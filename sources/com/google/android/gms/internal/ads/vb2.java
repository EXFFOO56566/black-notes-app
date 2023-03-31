package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

public final class vb2 implements na2, sa2 {
    private static final int p = ag2.d("qt  ");

    /* renamed from: a  reason: collision with root package name */
    private final xf2 f5083a = new xf2(sf2.f4651a);

    /* renamed from: b  reason: collision with root package name */
    private final xf2 f5084b = new xf2(4);

    /* renamed from: c  reason: collision with root package name */
    private final xf2 f5085c = new xf2(16);
    private final Stack<jb2> d = new Stack<>();
    private int e;
    private int f;
    private long g;
    private int h;
    private xf2 i;
    private int j;
    private int k;
    private pa2 l;
    private xb2[] m;
    private long n;
    private boolean o;

    static {
        new yb2();
    }

    private final void b(long j2) {
        qc2 qc2;
        ra2 ra2;
        zb2 a2;
        while (!this.d.isEmpty() && this.d.peek().z0 == j2) {
            jb2 pop = this.d.pop();
            if (pop.f3366a == kb2.w) {
                long j3 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j4 = Long.MAX_VALUE;
                qc2 qc22 = null;
                ra2 ra22 = new ra2();
                mb2 d2 = pop.d(kb2.l0);
                if (!(d2 == null || (qc22 = lb2.a(d2, this.o)) == null)) {
                    ra22.a(qc22);
                }
                int i2 = 0;
                while (i2 < pop.B0.size()) {
                    jb2 jb2 = pop.B0.get(i2);
                    if (jb2.f3366a == kb2.y && (a2 = lb2.a(jb2, pop.d(kb2.x), -9223372036854775807L, (ba2) null, this.o)) != null) {
                        bc2 a3 = lb2.a(a2, jb2.e(kb2.z).e(kb2.A).e(kb2.B), ra22);
                        if (a3.f1920a != 0) {
                            xb2 xb2 = new xb2(a2, a3, this.l.a(i2, a2.f5732b));
                            e82 a4 = a2.f.a(a3.d + 30);
                            if (a2.f5732b == 1) {
                                if (ra22.a()) {
                                    a4 = a4.a(ra22.f4469a, ra22.f4470b);
                                }
                                if (qc22 != null) {
                                    a4 = a4.a(qc22);
                                }
                            }
                            xb2.f5404c.a(a4);
                            qc2 = qc22;
                            ra2 = ra22;
                            j3 = Math.max(j3, a2.e);
                            arrayList.add(xb2);
                            long j5 = a3.f1921b[0];
                            if (j5 < j4) {
                                j4 = j5;
                            }
                            i2++;
                            ra22 = ra2;
                            qc22 = qc2;
                        }
                    }
                    qc2 = qc22;
                    ra2 = ra22;
                    i2++;
                    ra22 = ra2;
                    qc22 = qc2;
                }
                this.n = j3;
                this.m = (xb2[]) arrayList.toArray(new xb2[arrayList.size()]);
                this.l.d();
                this.l.a(this);
                this.d.clear();
                this.e = 2;
            } else if (!this.d.isEmpty()) {
                this.d.peek().B0.add(pop);
            }
        }
        if (this.e != 2) {
            d();
        }
    }

    private final void d() {
        this.e = 0;
        this.h = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x018e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0299 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.na2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.ma2 r24, com.google.android.gms.internal.ads.ta2 r25) {
        /*
        // Method dump skipped, instructions count: 666
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vb2.a(com.google.android.gms.internal.ads.ma2, com.google.android.gms.internal.ads.ta2):int");
    }

    @Override // com.google.android.gms.internal.ads.sa2
    public final long a(long j2) {
        long j3 = Long.MAX_VALUE;
        for (xb2 xb2 : this.m) {
            bc2 bc2 = xb2.f5403b;
            int a2 = bc2.a(j2);
            if (a2 == -1) {
                a2 = bc2.b(j2);
            }
            long j4 = bc2.f1921b[a2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final void a(long j2, long j3) {
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j2 == 0) {
            d();
            return;
        }
        xb2[] xb2Arr = this.m;
        if (xb2Arr != null) {
            for (xb2 xb2 : xb2Arr) {
                bc2 bc2 = xb2.f5403b;
                int a2 = bc2.a(j3);
                if (a2 == -1) {
                    a2 = bc2.b(j3);
                }
                xb2.d = a2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final void a(pa2 pa2) {
        this.l = pa2;
    }

    @Override // com.google.android.gms.internal.ads.na2
    public final boolean a(ma2 ma2) {
        return ac2.a(ma2);
    }

    @Override // com.google.android.gms.internal.ads.sa2
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sa2
    public final long c() {
        return this.n;
    }
}
