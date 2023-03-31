package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class wy1 implements t12 {

    /* renamed from: a  reason: collision with root package name */
    private final ty1 f5334a;

    /* renamed from: b  reason: collision with root package name */
    private int f5335b;

    /* renamed from: c  reason: collision with root package name */
    private int f5336c;
    private int d = 0;

    private wy1(ty1 ty1) {
        uz1.a((Object) ty1, "input");
        ty1 ty12 = ty1;
        this.f5334a = ty12;
        ty12.d = this;
    }

    public static wy1 a(ty1 ty1) {
        wy1 wy1 = ty1.d;
        return wy1 != null ? wy1 : new wy1(ty1);
    }

    private final Object a(f32 f32, Class<?> cls, dz1 dz1) {
        switch (yy1.f5669a[f32.ordinal()]) {
            case 1:
                return Boolean.valueOf(m());
            case 2:
                return d();
            case 3:
                return Double.valueOf(n());
            case 4:
                return Integer.valueOf(o());
            case 5:
                return Integer.valueOf(j());
            case 6:
                return Long.valueOf(e());
            case 7:
                return Float.valueOf(p());
            case 8:
                return Integer.valueOf(q());
            case 9:
                return Long.valueOf(l());
            case 10:
                a(2);
                return c(n12.a().a((Class) cls), dz1);
            case 11:
                return Integer.valueOf(t());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(a());
            case 14:
                return Long.valueOf(h());
            case 15:
                return r();
            case 16:
                return Integer.valueOf(k());
            case 17:
                return Long.valueOf(b());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void a(int i) {
        if ((this.f5335b & 7) != i) {
            throw b02.f();
        }
    }

    private final void a(List<String> list, boolean z) {
        int d2;
        int d3;
        if ((this.f5335b & 7) != 2) {
            throw b02.f();
        } else if (!(list instanceof i02) || z) {
            do {
                list.add(z ? r() : i());
                if (!this.f5334a.s()) {
                    d2 = this.f5334a.d();
                } else {
                    return;
                }
            } while (d2 == this.f5335b);
            this.d = d2;
        } else {
            i02 i02 = (i02) list;
            do {
                i02.a(d());
                if (!this.f5334a.s()) {
                    d3 = this.f5334a.d();
                } else {
                    return;
                }
            } while (d3 == this.f5335b);
            this.d = d3;
        }
    }

    private static void b(int i) {
        if ((i & 7) != 0) {
            throw b02.h();
        }
    }

    private final <T> T c(z12<T> z12, dz1 dz1) {
        int m = this.f5334a.m();
        ty1 ty1 = this.f5334a;
        if (ty1.f4880a < ty1.f4881b) {
            int c2 = ty1.c(m);
            T a2 = z12.a();
            this.f5334a.f4880a++;
            z12.a(a2, this, dz1);
            z12.b(a2);
            this.f5334a.a(0);
            ty1 ty12 = this.f5334a;
            ty12.f4880a--;
            ty12.d(c2);
            return a2;
        }
        throw new b02("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw b02.h();
        }
    }

    private final <T> T d(z12<T> z12, dz1 dz1) {
        int i = this.f5336c;
        this.f5336c = ((this.f5335b >>> 3) << 3) | 4;
        try {
            T a2 = z12.a();
            z12.a(a2, this, dz1);
            z12.b(a2);
            if (this.f5335b == this.f5336c) {
                return a2;
            }
            throw b02.h();
        } finally {
            this.f5336c = i;
        }
    }

    private final void d(int i) {
        if (this.f5334a.t() != i) {
            throw b02.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int a() {
        a(0);
        return this.f5334a.q();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final <T> T a(z12<T> z12, dz1 dz1) {
        a(3);
        return (T) d(z12, dz1);
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void a(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    q02.a(this.f5334a.e());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    q02.a(this.f5334a.e());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5334a.e()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Long.valueOf(this.f5334a.e()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t12
    public final <T> void a(List<T> list, z12<T> z12, dz1 dz1) {
        int d2;
        int i = this.f5335b;
        if ((i & 7) == 2) {
            do {
                list.add(c(z12, dz1));
                if (!this.f5334a.s() && this.d == 0) {
                    d2 = this.f5334a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw b02.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t12
    public final <K, V> void a(Map<K, V> map, t02<K, V> t02, dz1 dz1) {
        a(2);
        int c2 = this.f5334a.c(this.f5334a.m());
        Object obj = t02.f4736b;
        Object obj2 = t02.d;
        while (true) {
            try {
                int s = s();
                if (s == Integer.MAX_VALUE || this.f5334a.s()) {
                    map.put(obj, obj2);
                } else if (s == 1) {
                    obj = a(t02.f4735a, (Class<?>) null, (dz1) null);
                } else if (s != 2) {
                    try {
                        if (!g()) {
                            throw new b02("Unable to parse map entry.");
                        }
                    } catch (a02 unused) {
                        if (!g()) {
                            throw new b02("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = a(t02.f4737c, t02.d.getClass(), dz1);
                }
            } finally {
                this.f5334a.d(c2);
            }
        }
        map.put(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final long b() {
        a(0);
        return this.f5334a.e();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final <T> T b(z12<T> z12, dz1 dz1) {
        a(2);
        return (T) c(z12, dz1);
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void b(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    q02.a(this.f5334a.r());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    q02.a(this.f5334a.r());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5334a.r()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Long.valueOf(this.f5334a.r()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.t12
    public final <T> void b(List<T> list, z12<T> z12, dz1 dz1) {
        int d2;
        int i = this.f5335b;
        if ((i & 7) == 3) {
            do {
                list.add(d(z12, dz1));
                if (!this.f5334a.s() && this.d == 0) {
                    d2 = this.f5334a.d();
                } else {
                    return;
                }
            } while (d2 == i);
            this.d = d2;
            return;
        }
        throw b02.f();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int c() {
        return this.f5335b;
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void c(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    sz1.a(this.f5334a.m());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    sz1.a(this.f5334a.m());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5334a.m()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Integer.valueOf(this.f5334a.m()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final dy1 d() {
        a(2);
        return this.f5334a.l();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void d(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            int i = this.f5335b & 7;
            if (i == 2) {
                int m = this.f5334a.m();
                c(m);
                int t = this.f5334a.t() + m;
                do {
                    sz1.a(this.f5334a.i());
                } while (this.f5334a.t() < t);
            } else if (i == 5) {
                do {
                    sz1.a(this.f5334a.i());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 2) {
                int m2 = this.f5334a.m();
                c(m2);
                int t2 = this.f5334a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.f5334a.i()));
                } while (this.f5334a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5334a.i()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final long e() {
        a(1);
        return this.f5334a.h();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void e(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            int i = this.f5335b & 7;
            if (i == 1) {
                do {
                    q02.a(this.f5334a.h());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.f5334a.m();
                b(m);
                int t = this.f5334a.t() + m;
                do {
                    q02.a(this.f5334a.h());
                } while (this.f5334a.t() < t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f5334a.h()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.f5334a.m();
                b(m2);
                int t2 = this.f5334a.t() + m2;
                do {
                    list.add(Long.valueOf(this.f5334a.h()));
                } while (this.f5334a.t() < t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final long f() {
        a(1);
        return this.f5334a.p();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void f(List<Float> list) {
        int d2;
        int d3;
        if (list instanceof mz1) {
            mz1 mz1 = (mz1) list;
            int i = this.f5335b & 7;
            if (i == 2) {
                int m = this.f5334a.m();
                c(m);
                int t = this.f5334a.t() + m;
                do {
                    mz1.a(this.f5334a.b());
                } while (this.f5334a.t() < t);
            } else if (i == 5) {
                do {
                    mz1.a(this.f5334a.b());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 2) {
                int m2 = this.f5334a.m();
                c(m2);
                int t2 = this.f5334a.t() + m2;
                do {
                    list.add(Float.valueOf(this.f5334a.b()));
                } while (this.f5334a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f5334a.b()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void g(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    sz1.a(this.f5334a.q());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    sz1.a(this.f5334a.q());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5334a.q()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Integer.valueOf(this.f5334a.q()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final boolean g() {
        int i;
        if (this.f5334a.s() || (i = this.f5335b) == this.f5336c) {
            return false;
        }
        return this.f5334a.b(i);
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final long h() {
        a(0);
        return this.f5334a.r();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void h(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            int i = this.f5335b & 7;
            if (i == 1) {
                do {
                    q02.a(this.f5334a.p());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.f5334a.m();
                b(m);
                int t = this.f5334a.t() + m;
                do {
                    q02.a(this.f5334a.p());
                } while (this.f5334a.t() < t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f5334a.p()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.f5334a.m();
                b(m2);
                int t2 = this.f5334a.t() + m2;
                do {
                    list.add(Long.valueOf(this.f5334a.p()));
                } while (this.f5334a.t() < t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final String i() {
        a(2);
        return this.f5334a.c();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void i(List<dy1> list) {
        int d2;
        if ((this.f5335b & 7) == 2) {
            do {
                list.add(d());
                if (!this.f5334a.s()) {
                    d2 = this.f5334a.d();
                } else {
                    return;
                }
            } while (d2 == this.f5335b);
            this.d = d2;
            return;
        }
        throw b02.f();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int j() {
        a(5);
        return this.f5334a.i();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void j(List<String> list) {
        a(list, false);
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int k() {
        a(0);
        return this.f5334a.m();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void k(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    sz1.a(this.f5334a.g());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    sz1.a(this.f5334a.g());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5334a.g()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Integer.valueOf(this.f5334a.g()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final long l() {
        a(0);
        return this.f5334a.f();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void l(List<Double> list) {
        int d2;
        int d3;
        if (list instanceof cz1) {
            cz1 cz1 = (cz1) list;
            int i = this.f5335b & 7;
            if (i == 1) {
                do {
                    cz1.a(this.f5334a.a());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int m = this.f5334a.m();
                b(m);
                int t = this.f5334a.t() + m;
                do {
                    cz1.a(this.f5334a.a());
                } while (this.f5334a.t() < t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f5334a.a()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int m2 = this.f5334a.m();
                b(m2);
                int t2 = this.f5334a.t() + m2;
                do {
                    list.add(Double.valueOf(this.f5334a.a()));
                } while (this.f5334a.t() < t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void m(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            int i = this.f5335b & 7;
            if (i == 2) {
                int m = this.f5334a.m();
                c(m);
                int t = this.f5334a.t() + m;
                do {
                    sz1.a(this.f5334a.o());
                } while (this.f5334a.t() < t);
            } else if (i == 5) {
                do {
                    sz1.a(this.f5334a.o());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 2) {
                int m2 = this.f5334a.m();
                c(m2);
                int t2 = this.f5334a.t() + m2;
                do {
                    list.add(Integer.valueOf(this.f5334a.o()));
                } while (this.f5334a.t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f5334a.o()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final boolean m() {
        a(0);
        return this.f5334a.j();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final double n() {
        a(1);
        return this.f5334a.a();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void n(List<String> list) {
        a(list, true);
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int o() {
        a(0);
        return this.f5334a.n();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void o(List<Long> list) {
        int d2;
        int d3;
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    q02.a(this.f5334a.f());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    q02.a(this.f5334a.f());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f5334a.f()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Long.valueOf(this.f5334a.f()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final float p() {
        a(5);
        return this.f5334a.b();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void p(List<Integer> list) {
        int d2;
        int d3;
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    sz1.a(this.f5334a.n());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    sz1.a(this.f5334a.n());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5334a.n()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Integer.valueOf(this.f5334a.n()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int q() {
        a(0);
        return this.f5334a.g();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final void q(List<Boolean> list) {
        int d2;
        int d3;
        if (list instanceof by1) {
            by1 by1 = (by1) list;
            int i = this.f5335b & 7;
            if (i == 0) {
                do {
                    by1.a(this.f5334a.j());
                    if (!this.f5334a.s()) {
                        d3 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d3 == this.f5335b);
                this.d = d3;
            } else if (i == 2) {
                int t = this.f5334a.t() + this.f5334a.m();
                do {
                    by1.a(this.f5334a.j());
                } while (this.f5334a.t() < t);
                d(t);
            } else {
                throw b02.f();
            }
        } else {
            int i2 = this.f5335b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5334a.j()));
                    if (!this.f5334a.s()) {
                        d2 = this.f5334a.d();
                    } else {
                        return;
                    }
                } while (d2 == this.f5335b);
                this.d = d2;
            } else if (i2 == 2) {
                int t2 = this.f5334a.t() + this.f5334a.m();
                do {
                    list.add(Boolean.valueOf(this.f5334a.j()));
                } while (this.f5334a.t() < t2);
                d(t2);
            } else {
                throw b02.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final String r() {
        a(2);
        return this.f5334a.k();
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int s() {
        int i = this.d;
        if (i != 0) {
            this.f5335b = i;
            this.d = 0;
        } else {
            this.f5335b = this.f5334a.d();
        }
        int i2 = this.f5335b;
        if (i2 == 0 || i2 == this.f5336c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.t12
    public final int t() {
        a(5);
        return this.f5334a.o();
    }
}
