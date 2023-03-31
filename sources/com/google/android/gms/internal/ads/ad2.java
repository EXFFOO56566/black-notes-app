package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class ad2 implements pa2, ld2, xd2, jf2<ed2> {
    private boolean[] A;
    private boolean[] B;
    private boolean C;
    private long D;
    private long E;
    private long F;
    private int G;
    private boolean H;
    private boolean I;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f1738b;

    /* renamed from: c  reason: collision with root package name */
    private final ye2 f1739c;
    private final int d;
    private final sk1 e;
    private final id2 f;
    private final md2 g;
    private final we2 h;
    private final String i;
    private final long j;
    private final gf2 k = new gf2("Loader:ExtractorMediaPeriod");
    private final hd2 l;
    private final of2 m;
    private final Runnable n;
    private final Runnable o;
    private final sk1 p;
    private final SparseArray<vd2> q;
    private kd2 r;
    private sa2 s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private ee2 y;
    private long z;

    public ad2(Uri uri, ye2 ye2, na2[] na2Arr, int i2, sk1 sk1, id2 id2, md2 md2, we2 we2, String str, int i3) {
        this.f1738b = uri;
        this.f1739c = ye2;
        this.d = i2;
        this.e = sk1;
        this.f = id2;
        this.g = md2;
        this.h = we2;
        this.i = str;
        this.j = (long) i3;
        this.l = new hd2(na2Arr, this);
        this.m = new of2();
        this.n = new zc2(this);
        this.o = new dd2(this);
        this.p = new sk1();
        this.F = -9223372036854775807L;
        this.q = new SparseArray<>();
        this.D = -1;
    }

    private final void a(ed2 ed2) {
        if (this.D == -1) {
            this.D = ed2.i;
        }
    }

    private final void i() {
        sa2 sa2;
        ed2 ed2 = new ed2(this, this.f1738b, this.f1739c, this.l, this.m);
        if (this.u) {
            mf2.b(m());
            long j2 = this.z;
            if (j2 == -9223372036854775807L || this.F < j2) {
                ed2.a(this.s.a(this.F), this.F);
                this.F = -9223372036854775807L;
            } else {
                this.H = true;
                this.F = -9223372036854775807L;
                return;
            }
        }
        this.G = k();
        int i2 = this.d;
        if (i2 == -1) {
            i2 = (this.u && this.D == -1 && ((sa2 = this.s) == null || sa2.c() == -9223372036854775807L)) ? 6 : 3;
        }
        this.k.a(ed2, this, i2);
    }

    /* access modifiers changed from: private */
    public final void j() {
        if (!this.I && !this.u && this.s != null && this.t) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.q.valueAt(i2).e() == null) {
                    return;
                }
            }
            this.m.c();
            ae2[] ae2Arr = new ae2[size];
            this.B = new boolean[size];
            this.A = new boolean[size];
            this.z = this.s.c();
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 < size) {
                    e82 e2 = this.q.valueAt(i3).e();
                    ae2Arr[i3] = new ae2(e2);
                    String str = e2.g;
                    if (!tf2.b(str) && !tf2.a(str)) {
                        z2 = false;
                    }
                    this.B[i3] = z2;
                    this.C = z2 | this.C;
                    i3++;
                } else {
                    this.y = new ee2(ae2Arr);
                    this.u = true;
                    this.g.a(new be2(this.z, this.s.b()), null);
                    this.r.a((ld2) this);
                    return;
                }
            }
        }
    }

    private final int k() {
        int size = this.q.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.q.valueAt(i3).c();
        }
        return i2;
    }

    private final long l() {
        int size = this.q.size();
        long j2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, this.q.valueAt(i2).b());
        }
        return j2;
    }

    private final boolean m() {
        return this.F != -9223372036854775807L;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2, g82 g82, ca2 ca2, boolean z2) {
        if (this.w || m()) {
            return -3;
        }
        return this.q.valueAt(i2).a(g82, ca2, z2, this.H, this.E);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.lf2, long, long, java.io.IOException] */
    @Override // com.google.android.gms.internal.ads.jf2
    public final /* synthetic */ int a(ed2 ed2, long j2, long j3, IOException iOException) {
        sa2 sa2;
        ed2 ed22 = ed2;
        a(ed22);
        sk1 sk1 = this.e;
        if (!(sk1 == null || this.f == null)) {
            sk1.post(new fd2(this, iOException));
        }
        if (iOException instanceof ce2) {
            return 3;
        }
        boolean z2 = k() > this.G;
        if (this.D == -1 && ((sa2 = this.s) == null || sa2.c() == -9223372036854775807L)) {
            this.E = 0;
            this.w = this.u;
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.q.valueAt(i2).a(!this.u || this.A[i2]);
            }
            ed22.a(0, 0);
        }
        this.G = k();
        return z2 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zd2, com.google.android.gms.internal.ads.ld2
    public final long a() {
        if (this.x == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long a(ne2[] ne2Arr, boolean[] zArr, wd2[] wd2Arr, boolean[] zArr2, long j2) {
        mf2.b(this.u);
        for (int i2 = 0; i2 < ne2Arr.length; i2++) {
            if (wd2Arr[i2] != null && (ne2Arr[i2] == null || !zArr[i2])) {
                int i3 = ((gd2) wd2Arr[i2]).f2742a;
                mf2.b(this.A[i3]);
                this.x--;
                this.A[i3] = false;
                this.q.valueAt(i3).a();
                wd2Arr[i2] = null;
            }
        }
        boolean z2 = false;
        for (int i4 = 0; i4 < ne2Arr.length; i4++) {
            if (wd2Arr[i4] == null && ne2Arr[i4] != null) {
                ne2 ne2 = ne2Arr[i4];
                mf2.b(ne2.length() == 1);
                mf2.b(ne2.a(0) == 0);
                int a2 = this.y.a(ne2.a());
                mf2.b(!this.A[a2]);
                this.x++;
                this.A[a2] = true;
                wd2Arr[i4] = new gd2(this, a2);
                zArr2[i4] = true;
                z2 = true;
            }
        }
        if (!this.v) {
            int size = this.q.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (!this.A[i5]) {
                    this.q.valueAt(i5).a();
                }
            }
        }
        if (this.x == 0) {
            this.w = false;
            if (this.k.a()) {
                this.k.b();
            }
        } else if (!this.v ? j2 != 0 : z2) {
            j2 = c(j2);
            for (int i6 = 0; i6 < wd2Arr.length; i6++) {
                if (wd2Arr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.v = true;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final ua2 a(int i2, int i3) {
        vd2 vd2 = this.q.get(i2);
        if (vd2 != null) {
            return vd2;
        }
        vd2 vd22 = new vd2(this.h);
        vd22.a(this);
        this.q.put(i2, vd22);
        return vd22;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        vd2 valueAt = this.q.valueAt(i2);
        if (!this.H || j2 <= valueAt.b()) {
            valueAt.a(j2, true);
        } else {
            valueAt.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.xd2
    public final void a(e82 e82) {
        this.p.post(this.n);
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final void a(kd2 kd2, long j2) {
        this.r = kd2;
        this.m.b();
        i();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.lf2, long, long] */
    @Override // com.google.android.gms.internal.ads.jf2
    public final /* synthetic */ void a(ed2 ed2, long j2, long j3) {
        a(ed2);
        this.H = true;
        if (this.z == -9223372036854775807L) {
            long l2 = l();
            this.z = l2 == Long.MIN_VALUE ? 0 : l2 + 10000;
            this.g.a(new be2(this.z, this.s.b()), null);
        }
        this.r.a((zd2) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.lf2, long, long, boolean] */
    @Override // com.google.android.gms.internal.ads.jf2
    public final /* synthetic */ void a(ed2 ed2, long j2, long j3, boolean z2) {
        a(ed2);
        if (!z2 && this.x > 0) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.q.valueAt(i2).a(this.A[i2]);
            }
            this.r.a((zd2) this);
        }
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void a(sa2 sa2) {
        this.s = sa2;
        this.p.post(this.n);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2) {
        if (!this.H) {
            return !m() && this.q.valueAt(i2).d();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zd2, com.google.android.gms.internal.ads.ld2
    public final boolean a(long j2) {
        if (this.H) {
            return false;
        }
        if (this.u && this.x == 0) {
            return false;
        }
        boolean b2 = this.m.b();
        if (this.k.a()) {
            return b2;
        }
        i();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long b() {
        if (!this.w) {
            return -9223372036854775807L;
        }
        this.w = false;
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final void b(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long c() {
        long j2;
        if (this.H) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.F;
        }
        if (this.C) {
            j2 = Long.MAX_VALUE;
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.B[i2]) {
                    j2 = Math.min(j2, this.q.valueAt(i2).b());
                }
            }
        } else {
            j2 = l();
        }
        return j2 == Long.MIN_VALUE ? this.E : j2;
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final long c(long j2) {
        if (!this.s.b()) {
            j2 = 0;
        }
        this.E = j2;
        int size = this.q.size();
        boolean z2 = !m();
        int i2 = 0;
        while (z2 && i2 < size) {
            if (this.A[i2]) {
                z2 = this.q.valueAt(i2).a(j2, false);
            }
            i2++;
        }
        if (!z2) {
            this.F = j2;
            this.H = false;
            if (this.k.a()) {
                this.k.b();
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    this.q.valueAt(i3).a(this.A[i3]);
                }
            }
        }
        this.w = false;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.pa2
    public final void d() {
        this.t = true;
        this.p.post(this.n);
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final void e() {
        this.k.a(RecyclerView.UNDEFINED_DURATION);
    }

    @Override // com.google.android.gms.internal.ads.ld2
    public final ee2 f() {
        return this.y;
    }

    public final void g() {
        this.k.a(new bd2(this, this.l));
        this.p.removeCallbacksAndMessages(null);
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.k.a(RecyclerView.UNDEFINED_DURATION);
    }
}
