package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;
import java.util.Iterator;
import java.util.Map;

final class i12<T> implements z12<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c12 f3013a;

    /* renamed from: b  reason: collision with root package name */
    private final s22<?, ?> f3014b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3015c;
    private final fz1<?> d;

    private i12(s22<?, ?> s22, fz1<?> fz1, c12 c12) {
        this.f3014b = s22;
        this.f3015c = fz1.a(c12);
        this.d = fz1;
        this.f3013a = c12;
    }

    static <T> i12<T> a(s22<?, ?> s22, fz1<?> fz1, c12 c12) {
        return new i12<>(s22, fz1, c12);
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final T a() {
        return (T) this.f3013a.g().b();
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final void a(T t, l32 l32) {
        Iterator<Map.Entry<?, Object>> d2 = this.d.a((Object) t).d();
        while (d2.hasNext()) {
            Map.Entry<?, Object> next = d2.next();
            iz1 iz1 = (iz1) next.getKey();
            if (iz1.g() != m32.MESSAGE || iz1.k() || iz1.i()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            l32.a(iz1.a(), next instanceof e02 ? ((e02) next).a().a() : next.getValue());
        }
        s22<?, ?> s22 = this.f3014b;
        s22.b(s22.d(t), l32);
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final void a(T t, t12 t12, dz1 dz1) {
        boolean z;
        s22<?, ?> s22 = this.f3014b;
        fz1<?> fz1 = this.d;
        Object e = s22.e(t);
        gz1<?> b2 = fz1.b(t);
        do {
            try {
                if (t12.s() == Integer.MAX_VALUE) {
                    s22.b(t, e);
                    return;
                }
                int c2 = t12.c();
                if (c2 == 11) {
                    int i = 0;
                    Object obj = null;
                    dy1 dy1 = null;
                    while (t12.s() != Integer.MAX_VALUE) {
                        int c3 = t12.c();
                        if (c3 == 16) {
                            i = t12.k();
                            obj = fz1.a(dz1, this.f3013a, i);
                        } else if (c3 == 26) {
                            if (obj == null) {
                                dy1 = t12.d();
                            } else {
                                fz1.a(t12, obj, dz1, b2);
                                throw null;
                            }
                        } else if (!t12.g()) {
                            break;
                        }
                    }
                    if (t12.c() == 12) {
                        if (dy1 != null) {
                            if (obj == null) {
                                s22.a(e, i, dy1);
                            } else {
                                fz1.a(dy1, obj, dz1, b2);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw b02.e();
                    }
                } else if ((c2 & 7) == 2) {
                    Object a2 = fz1.a(dz1, this.f3013a, c2 >>> 3);
                    if (a2 == null) {
                        z = s22.a(e, t12);
                        continue;
                    } else {
                        fz1.a(t12, a2, dz1, b2);
                        throw null;
                    }
                } else {
                    z = t12.g();
                    continue;
                }
            } finally {
                s22.b(t, e);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final void a(T t, byte[] bArr, int i, int i2, cy1 cy1) {
        T t2 = t;
        r22 r22 = t2.zzhxv;
        if (r22 == r22.d()) {
            r22 = r22.e();
            t2.zzhxv = r22;
        }
        t.p();
        rz1.d dVar = null;
        while (i < i2) {
            int a2 = zx1.a(bArr, i, cy1);
            int i3 = cy1.f2185a;
            if (i3 == 11) {
                int i4 = 0;
                dy1 dy1 = null;
                while (a2 < i2) {
                    a2 = zx1.a(bArr, a2, cy1);
                    int i5 = cy1.f2185a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (dVar != null) {
                                n12.a();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a2 = zx1.e(bArr, a2, cy1);
                                dy1 = (dy1) cy1.f2187c;
                            }
                        }
                    } else if (i7 == 0) {
                        a2 = zx1.a(bArr, a2, cy1);
                        i4 = cy1.f2185a;
                        dVar = (rz1.d) this.d.a(cy1.d, this.f3013a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a2 = zx1.a(i5, bArr, a2, i2, cy1);
                }
                if (dy1 != null) {
                    r22.a((i4 << 3) | 2, dy1);
                }
                i = a2;
            } else if ((i3 & 7) == 2) {
                dVar = (rz1.d) this.d.a(cy1.d, this.f3013a, i3 >>> 3);
                if (dVar == null) {
                    i = zx1.a(i3, bArr, a2, i2, r22, cy1);
                } else {
                    n12.a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = zx1.a(i3, bArr, a2, i2, cy1);
            }
        }
        if (i != i2) {
            throw b02.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final boolean a(T t) {
        return this.d.a((Object) t).c();
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final boolean a(T t, T t2) {
        if (!this.f3014b.d(t).equals(this.f3014b.d(t2))) {
            return false;
        }
        if (this.f3015c) {
            return this.d.a((Object) t).equals(this.d.a((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final void b(T t) {
        this.f3014b.a((Object) t);
        this.d.c(t);
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final void b(T t, T t2) {
        b22.a(this.f3014b, t, t2);
        if (this.f3015c) {
            b22.a(this.d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final int c(T t) {
        s22<?, ?> s22 = this.f3014b;
        int f = s22.f(s22.d(t)) + 0;
        return this.f3015c ? f + this.d.a((Object) t).f() : f;
    }

    @Override // com.google.android.gms.internal.ads.z12
    public final int d(T t) {
        int hashCode = this.f3014b.d(t).hashCode();
        return this.f3015c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }
}
