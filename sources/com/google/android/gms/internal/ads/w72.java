package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;

final class w72 implements Handler.Callback, kd2, md2, re2 {
    private long A;
    private int B;
    private c82 C;
    private long D;
    private a82 E;
    private a82 F;
    private a82 G;
    private o82 H;

    /* renamed from: b  reason: collision with root package name */
    private final j82[] f5222b;

    /* renamed from: c  reason: collision with root package name */
    private final m82[] f5223c;
    private final se2 d;
    private final i82 e;
    private final yf2 f;
    private final sk1 g;
    private final HandlerThread h;
    private final sk1 i;
    private final r72 j;
    private final p82 k;
    private final q82 l;
    private z72 m;
    private k82 n;
    private j82 o;
    private qf2 p;
    private nd2 q;
    private j82[] r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x = 0;
    private int y;
    private int z;

    public w72(j82[] j82Arr, se2 se2, i82 i82, boolean z2, int i2, sk1 sk1, z72 z72, r72 r72) {
        this.f5222b = j82Arr;
        this.d = se2;
        this.e = i82;
        this.t = z2;
        this.i = sk1;
        this.w = 1;
        this.m = z72;
        this.j = r72;
        this.f5223c = new m82[j82Arr.length];
        for (int i3 = 0; i3 < j82Arr.length; i3++) {
            j82Arr[i3].a(i3);
            this.f5223c[i3] = j82Arr[i3].H();
        }
        this.f = new yf2();
        this.r = new j82[0];
        this.k = new p82();
        this.l = new q82();
        se2.a((re2) this);
        this.n = k82.d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.g = new sk1(this.h.getLooper(), this);
    }

    private final int a(int i2, o82 o82, o82 o822) {
        int c2 = o82.c();
        int i3 = -1;
        for (int i4 = 0; i4 < c2 && i3 == -1; i4++) {
            i2 = o82.a(i2, this.l, this.k, this.x);
            i3 = o822.a(o82.a(i2, this.l, true).f4289b);
        }
        return i3;
    }

    private final long a(int i2, long j2) {
        a82 a82;
        e();
        this.u = false;
        a(2);
        a82 a822 = this.G;
        if (a822 == null) {
            a82 a823 = this.E;
            if (a823 != null) {
                a823.a();
            }
            a82 = null;
        } else {
            a82 = null;
            while (a822 != null) {
                if (a822.g != i2 || !a822.j) {
                    a822.a();
                } else {
                    a82 = a822;
                }
                a822 = a822.l;
            }
        }
        a82 a824 = this.G;
        if (!(a824 == a82 && a824 == this.F)) {
            for (j82 j82 : this.r) {
                j82.K();
            }
            this.r = new j82[0];
            this.p = null;
            this.o = null;
            this.G = null;
        }
        if (a82 != null) {
            a82.l = null;
            this.E = a82;
            this.F = a82;
            b(a82);
            a82 a825 = this.G;
            if (a825.k) {
                j2 = a825.f1717a.c(j2);
            }
            a(j2);
            i();
        } else {
            this.E = null;
            this.F = null;
            this.G = null;
            a(j2);
        }
        this.g.sendEmptyMessage(2);
        return j2;
    }

    private final Pair<Integer, Long> a(c82 c82) {
        o82 o82 = c82.f2079a;
        if (o82.a()) {
            o82 = this.H;
        }
        try {
            Pair<Integer, Long> b2 = b(o82, c82.f2080b, c82.f2081c);
            o82 o822 = this.H;
            if (o822 == o82) {
                return b2;
            }
            int a2 = o822.a(o82.a(((Integer) b2.first).intValue(), this.l, true).f4289b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), (Long) b2.second);
            }
            int a3 = a(((Integer) b2.first).intValue(), o82, this.H);
            if (a3 == -1) {
                return null;
            }
            this.H.a(a3, this.l, false);
            return b(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new f82(this.H, c82.f2080b, c82.f2081c);
        }
    }

    private final Pair<Integer, Long> a(o82 o82, int i2, long j2, long j3) {
        mf2.a(i2, 0, o82.b());
        o82.a(i2, this.k, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = this.k.h;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        long j4 = this.k.j + j2;
        long j5 = o82.a(0, this.l, false).f4290c;
        if (j5 != -9223372036854775807L) {
            int i3 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j4));
    }

    private final void a(int i2) {
        if (this.w != i2) {
            this.w = i2;
            this.i.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    private final void a(long j2) {
        a82 a82 = this.G;
        long b2 = j2 + (a82 == null ? 60000000 : a82.b());
        this.D = b2;
        this.f.a(b2);
        for (j82 j82 : this.r) {
            j82.a(this.D);
        }
    }

    private final void a(long j2, long j3) {
        this.g.removeMessages(2);
        long elapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.g.sendEmptyMessage(2);
        } else {
            this.g.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private static void a(a82 a82) {
        while (a82 != null) {
            a82.a();
            a82 = a82.l;
        }
    }

    private static void a(j82 j82) {
        if (j82.getState() == 2) {
            j82.stop();
        }
    }

    private final void a(Object obj, int i2) {
        this.m = new z72(0, 0);
        b(obj, i2);
        this.m = new z72(0, -9223372036854775807L);
        a(4);
        c(false);
    }

    private final void a(boolean[] zArr, int i2) {
        this.r = new j82[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j82[] j82Arr = this.f5222b;
            if (i3 < j82Arr.length) {
                j82 j82 = j82Arr[i3];
                ne2 a2 = this.G.m.f4940b.a(i3);
                if (a2 != null) {
                    int i5 = i4 + 1;
                    this.r[i4] = j82;
                    if (j82.getState() == 0) {
                        l82 l82 = this.G.m.d[i3];
                        boolean z2 = this.t && this.w == 3;
                        boolean z3 = !zArr[i3] && z2;
                        int length = a2.length();
                        e82[] e82Arr = new e82[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            e82Arr[i6] = a2.b(i6);
                        }
                        a82 a82 = this.G;
                        j82.a(l82, e82Arr, a82.d[i3], this.D, z3, a82.b());
                        qf2 J = j82.J();
                        if (J != null) {
                            if (this.p == null) {
                                this.p = J;
                                this.o = j82;
                                J.a(this.n);
                            } else {
                                throw o72.a(new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z2) {
                            j82.start();
                        }
                    }
                    i4 = i5;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    private final Pair<Integer, Long> b(int i2, long j2) {
        return b(this.H, i2, -9223372036854775807L);
    }

    private final Pair<Integer, Long> b(o82 o82, int i2, long j2) {
        return a(o82, i2, j2, 0);
    }

    private final void b(a82 a82) {
        if (this.G != a82) {
            boolean[] zArr = new boolean[this.f5222b.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                j82[] j82Arr = this.f5222b;
                if (i2 < j82Arr.length) {
                    j82 j82 = j82Arr[i2];
                    zArr[i2] = j82.getState() != 0;
                    ne2 a2 = a82.m.f4940b.a(i2);
                    if (a2 != null) {
                        i3++;
                    }
                    if (zArr[i2] && (a2 == null || (j82.I() && j82.L() == this.G.d[i2]))) {
                        if (j82 == this.o) {
                            this.f.a(this.p);
                            this.p = null;
                            this.o = null;
                        }
                        a(j82);
                        j82.K();
                    }
                    i2++;
                } else {
                    this.G = a82;
                    this.i.obtainMessage(3, a82.m).sendToTarget();
                    a(zArr, i3);
                    return;
                }
            }
        }
    }

    private final void b(Object obj, int i2) {
        this.i.obtainMessage(6, new b82(this.H, obj, this.m, i2)).sendToTarget();
    }

    private final void b(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            this.i.obtainMessage(2, z2 ? 1 : 0, 0).sendToTarget();
        }
    }

    private final boolean b(int i2) {
        this.H.a(i2, this.l, false);
        return !this.H.a(0, this.k, false).e && this.H.a(i2, this.l, this.k, this.x) == -1;
    }

    private final boolean b(long j2) {
        if (j2 == -9223372036854775807L || this.m.f5712c < j2) {
            return true;
        }
        a82 a82 = this.G.l;
        return a82 != null && a82.j;
    }

    private final void c(boolean z2) {
        this.g.removeMessages(2);
        this.u = false;
        this.f.d();
        this.p = null;
        this.o = null;
        this.D = 60000000;
        j82[] j82Arr = this.r;
        for (j82 j82 : j82Arr) {
            try {
                a(j82);
                j82.K();
            } catch (o72 | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.r = new j82[0];
        a82 a82 = this.G;
        if (a82 == null) {
            a82 = this.E;
        }
        a(a82);
        this.E = null;
        this.F = null;
        this.G = null;
        b(false);
        if (z2) {
            nd2 nd2 = this.q;
            if (nd2 != null) {
                nd2.b();
                this.q = null;
            }
            this.H = null;
        }
    }

    private final void d() {
        this.u = false;
        this.f.c();
        for (j82 j82 : this.r) {
            j82.start();
        }
    }

    private final void e() {
        this.f.d();
        for (j82 j82 : this.r) {
            a(j82);
        }
    }

    private final void f() {
        a82 a82 = this.G;
        if (a82 != null) {
            long b2 = a82.f1717a.b();
            if (b2 != -9223372036854775807L) {
                a(b2);
            } else {
                j82 j82 = this.o;
                if (j82 == null || j82.E()) {
                    this.D = this.f.a();
                } else {
                    long a2 = this.p.a();
                    this.D = a2;
                    this.f.a(a2);
                }
                b2 = this.D - this.G.b();
            }
            this.m.f5712c = b2;
            this.A = SystemClock.elapsedRealtime() * 1000;
            long c2 = this.r.length == 0 ? Long.MIN_VALUE : this.G.f1717a.c();
            z72 z72 = this.m;
            if (c2 == Long.MIN_VALUE) {
                c2 = this.H.a(this.G.g, this.l, false).f4290c;
            }
            z72.d = c2;
        }
    }

    private final void g() {
        c(true);
        this.e.d();
        a(1);
    }

    private final void h() {
        a82 a82 = this.E;
        if (!(a82 == null || a82.j)) {
            a82 a822 = this.F;
            if (a822 == null || a822.l == a82) {
                for (j82 j82 : this.r) {
                    if (!j82.N()) {
                        return;
                    }
                }
                this.E.f1717a.e();
            }
        }
    }

    private final void i() {
        a82 a82 = this.E;
        long a2 = !a82.j ? 0 : a82.f1717a.a();
        if (a2 == Long.MIN_VALUE) {
            b(false);
            return;
        }
        long b2 = this.D - this.E.b();
        boolean a3 = this.e.a(a2 - b2);
        b(a3);
        if (a3) {
            this.E.f1717a.a(b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.re2
    public final void a() {
        this.g.sendEmptyMessage(10);
    }

    @Override // com.google.android.gms.internal.ads.kd2
    public final void a(ld2 ld2) {
        this.g.obtainMessage(8, ld2).sendToTarget();
    }

    public final void a(nd2 nd2, boolean z2) {
        this.g.obtainMessage(0, 1, 0, nd2).sendToTarget();
    }

    public final void a(o82 o82, int i2, long j2) {
        this.g.obtainMessage(3, new c82(o82, i2, j2)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.md2
    public final void a(o82 o82, Object obj) {
        this.g.obtainMessage(7, Pair.create(o82, obj)).sendToTarget();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.zd2] */
    @Override // com.google.android.gms.internal.ads.yd2
    public final /* synthetic */ void a(ld2 ld2) {
        this.g.obtainMessage(9, ld2).sendToTarget();
    }

    public final void a(boolean z2) {
        this.g.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public final void a(s72... s72Arr) {
        if (this.s) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.y++;
        this.g.obtainMessage(11, s72Arr).sendToTarget();
    }

    public final synchronized void b() {
        if (!this.s) {
            this.g.sendEmptyMessage(6);
            while (!this.s) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.h.quit();
        }
    }

    public final synchronized void b(s72... s72Arr) {
        if (this.s) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i2 = this.y;
        this.y = i2 + 1;
        this.g.obtainMessage(11, s72Arr).sendToTarget();
        while (this.z <= i2) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void c() {
        this.g.sendEmptyMessage(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0899, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x089a, code lost:
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r0);
        r2 = r34.i;
        r1 = com.google.android.gms.internal.ads.o72.a(r0);
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x08b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x08b6, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x08c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x08c8, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05ae A[LOOP:7: B:315:0x05ae->B:319:0x05c0, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0899 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
        // Method dump skipped, instructions count: 2292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w72.handleMessage(android.os.Message):boolean");
    }
}
