package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class vd2 implements ua2 {

    /* renamed from: a  reason: collision with root package name */
    private final we2 f5094a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5095b;

    /* renamed from: c  reason: collision with root package name */
    private final td2 f5096c = new td2();
    private final sd2 d = new sd2();
    private final xf2 e = new xf2(32);
    private final AtomicInteger f = new AtomicInteger();
    private ud2 g;
    private ud2 h;
    private e82 i;
    private long j;
    private int k;
    private xd2 l;

    public vd2(we2 we2) {
        this.f5094a = we2;
        this.f5095b = we2.b();
        int i2 = this.f5095b;
        this.k = i2;
        ud2 ud2 = new ud2(0, i2);
        this.g = ud2;
        this.h = ud2;
    }

    private final int a(int i2) {
        if (this.k == this.f5095b) {
            this.k = 0;
            ud2 ud2 = this.h;
            if (ud2.f4936c) {
                this.h = ud2.e;
            }
            ud2 ud22 = this.h;
            te2 a2 = this.f5094a.a();
            ud2 ud23 = new ud2(this.h.f4935b, this.f5095b);
            ud22.d = a2;
            ud22.e = ud23;
            ud22.f4936c = true;
        }
        return Math.min(i2, this.f5095b - this.k);
    }

    private final void a(long j2) {
        while (true) {
            ud2 ud2 = this.g;
            if (j2 >= ud2.f4935b) {
                this.f5094a.a(ud2.d);
                this.g = this.g.a();
            } else {
                return;
            }
        }
    }

    private final void a(long j2, byte[] bArr, int i2) {
        a(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.g.f4934a);
            int min = Math.min(i2 - i3, this.f5095b - i4);
            te2 te2 = this.g.d;
            System.arraycopy(te2.f4800a, te2.a(i4), bArr, i3, min);
            j2 += (long) min;
            i3 += min;
            if (j2 == this.g.f4935b) {
                this.f5094a.a(te2);
                this.g = this.g.a();
            }
        }
    }

    private final void g() {
        this.f5096c.b();
        ud2 ud2 = this.g;
        if (ud2.f4936c) {
            ud2 ud22 = this.h;
            int i2 = (ud22.f4936c ? 1 : 0) + (((int) (ud22.f4934a - ud2.f4934a)) / this.f5095b);
            te2[] te2Arr = new te2[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                te2Arr[i3] = ud2.d;
                ud2 = ud2.a();
            }
            this.f5094a.a(te2Arr);
        }
        ud2 ud23 = new ud2(0, this.f5095b);
        this.g = ud23;
        this.h = ud23;
        this.j = 0;
        this.k = this.f5095b;
        this.f5094a.e0();
    }

    private final boolean h() {
        return this.f.compareAndSet(0, 1);
    }

    private final void i() {
        if (!this.f.compareAndSet(1, 0)) {
            g();
        }
    }

    public final int a(g82 g82, ca2 ca2, boolean z, boolean z2, long j2) {
        int i2;
        int a2 = this.f5096c.a(g82, ca2, z, z2, this.i, this.d);
        if (a2 == -5) {
            this.i = g82.f2723a;
            return -5;
        } else if (a2 == -4) {
            if (!ca2.c()) {
                if (ca2.d < j2) {
                    ca2.b(RecyclerView.UNDEFINED_DURATION);
                }
                if (ca2.e()) {
                    sd2 sd2 = this.d;
                    long j3 = sd2.f4645b;
                    this.e.a(1);
                    a(j3, this.e.f5423a, 1);
                    long j4 = j3 + 1;
                    byte b2 = this.e.f5423a[0];
                    boolean z3 = (b2 & 128) != 0;
                    int i3 = b2 & Byte.MAX_VALUE;
                    x92 x92 = ca2.f2091b;
                    if (x92.f5392a == null) {
                        x92.f5392a = new byte[16];
                    }
                    a(j4, ca2.f2091b.f5392a, i3);
                    long j5 = j4 + ((long) i3);
                    if (z3) {
                        this.e.a(2);
                        a(j5, this.e.f5423a, 2);
                        j5 += 2;
                        i2 = this.e.h();
                    } else {
                        i2 = 1;
                    }
                    int[] iArr = ca2.f2091b.d;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = ca2.f2091b.e;
                    if (iArr2 == null || iArr2.length < i2) {
                        iArr2 = new int[i2];
                    }
                    if (z3) {
                        int i4 = i2 * 6;
                        this.e.a(i4);
                        a(j5, this.e.f5423a, i4);
                        j5 += (long) i4;
                        this.e.c(0);
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i5] = this.e.h();
                            iArr2[i5] = this.e.o();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = sd2.f4644a - ((int) (j5 - sd2.f4645b));
                    }
                    xa2 xa2 = sd2.d;
                    x92 x922 = ca2.f2091b;
                    x922.a(i2, iArr, iArr2, xa2.f5397b, x922.f5392a, xa2.f5396a);
                    long j6 = sd2.f4645b;
                    int i6 = (int) (j5 - j6);
                    sd2.f4645b = j6 + ((long) i6);
                    sd2.f4644a -= i6;
                }
                ca2.d(this.d.f4644a);
                sd2 sd22 = this.d;
                long j7 = sd22.f4645b;
                ByteBuffer byteBuffer = ca2.f2092c;
                int i7 = sd22.f4644a;
                a(j7);
                while (i7 > 0) {
                    int i8 = (int) (j7 - this.g.f4934a);
                    int min = Math.min(i7, this.f5095b - i8);
                    te2 te2 = this.g.d;
                    byteBuffer.put(te2.f4800a, te2.a(i8), min);
                    j7 += (long) min;
                    i7 -= min;
                    if (j7 == this.g.f4935b) {
                        this.f5094a.a(te2);
                        this.g = this.g.a();
                    }
                }
                a(this.d.f4646c);
            }
            return -4;
        } else if (a2 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final int a(ma2 ma2, int i2, boolean z) {
        if (!h()) {
            int a2 = ma2.a(i2);
            if (a2 != -1) {
                return a2;
            }
            throw new EOFException();
        }
        try {
            int a3 = a(i2);
            te2 te2 = this.h.d;
            int a4 = ma2.a(te2.f4800a, te2.a(this.k), a3);
            if (a4 != -1) {
                this.k += a4;
                this.j += (long) a4;
                return a4;
            }
            throw new EOFException();
        } finally {
            i();
        }
    }

    public final void a() {
        if (this.f.getAndSet(2) == 0) {
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final void a(long j2, int i2, int i3, int i4, xa2 xa2) {
        if (!h()) {
            this.f5096c.a(j2);
            return;
        }
        try {
            this.f5096c.a(j2, i2, this.j - ((long) i3), i3, xa2);
        } finally {
            i();
        }
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final void a(e82 e82) {
        if (e82 == null) {
            e82 = null;
        }
        boolean a2 = this.f5096c.a(e82);
        xd2 xd2 = this.l;
        if (xd2 != null && a2) {
            xd2.a(e82);
        }
    }

    public final void a(xd2 xd2) {
        this.l = xd2;
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final void a(xf2 xf2, int i2) {
        if (!h()) {
            xf2.d(i2);
            return;
        }
        while (i2 > 0) {
            int a2 = a(i2);
            te2 te2 = this.h.d;
            xf2.a(te2.f4800a, te2.a(this.k), a2);
            this.k += a2;
            this.j += (long) a2;
            i2 -= a2;
        }
        i();
    }

    public final void a(boolean z) {
        int andSet = this.f.getAndSet(z ? 0 : 2);
        g();
        this.f5096c.c();
        if (andSet == 2) {
            this.i = null;
        }
    }

    public final boolean a(long j2, boolean z) {
        long a2 = this.f5096c.a(j2, z);
        if (a2 == -1) {
            return false;
        }
        a(a2);
        return true;
    }

    public final long b() {
        return this.f5096c.a();
    }

    public final int c() {
        return this.f5096c.d();
    }

    public final boolean d() {
        return this.f5096c.e();
    }

    public final e82 e() {
        return this.f5096c.f();
    }

    public final void f() {
        long g2 = this.f5096c.g();
        if (g2 != -1) {
            a(g2);
        }
    }
}
