package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.iz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class gz1<T extends iz1<T>> {
    private static final gz1 d = new gz1(true);

    /* renamed from: a  reason: collision with root package name */
    final a22<T, Object> f2834a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2835b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2836c;

    private gz1() {
        this.f2834a = a22.b(16);
    }

    private gz1(a22<T, Object> a22) {
        this.f2834a = a22;
        e();
    }

    private gz1(boolean z) {
        this(a22.b(0));
        e();
    }

    static int a(f32 f32, int i, Object obj) {
        int e = xy1.e(i);
        if (f32 == f32.GROUP) {
            uz1.a((c12) obj);
            e <<= 1;
        }
        return e + b(f32, obj);
    }

    private final Object a(T t) {
        Object obj = this.f2834a.get(t);
        if (!(obj instanceof c02)) {
            return obj;
        }
        c02 c02 = (c02) obj;
        c02.c();
        throw null;
    }

    private static Object a(Object obj) {
        if (obj instanceof h12) {
            return ((h12) obj).l();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.tz1) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.c02) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.android.gms.internal.ads.f32 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.uz1.a(r3)
            int[] r0 = com.google.android.gms.internal.ads.jz1.f3298a
            com.google.android.gms.internal.ads.m32 r2 = r2.b()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.c12
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.c02
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.tz1
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.dy1
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
            switch-data {1->0x0040, 2->0x003d, 3->0x003a, 4->0x0037, 5->0x0034, 6->0x0031, 7->0x0028, 8->0x001f, 9->0x0016, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gz1.a(com.google.android.gms.internal.ads.f32, java.lang.Object):void");
    }

    private final void a(T t, Object obj) {
        if (!t.k()) {
            a(t.d(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                a(t.d(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof c02) {
            this.f2836c = true;
        }
        this.f2834a.put(t, obj);
    }

    static void a(xy1 xy1, f32 f32, int i, Object obj) {
        if (f32 == f32.GROUP) {
            c12 c12 = (c12) obj;
            uz1.a(c12);
            xy1.a(i, 3);
            c12.a(xy1);
            xy1.a(i, 4);
            return;
        }
        xy1.a(i, f32.c());
        switch (jz1.f3299b[f32.ordinal()]) {
            case 1:
                xy1.a(((Double) obj).doubleValue());
                return;
            case 2:
                xy1.a(((Float) obj).floatValue());
                return;
            case 3:
                xy1.a(((Long) obj).longValue());
                return;
            case 4:
                xy1.a(((Long) obj).longValue());
                return;
            case 5:
                xy1.a(((Integer) obj).intValue());
                return;
            case 6:
                xy1.c(((Long) obj).longValue());
                return;
            case 7:
                xy1.d(((Integer) obj).intValue());
                return;
            case 8:
                xy1.a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((c12) obj).a(xy1);
                return;
            case 10:
                xy1.a((c12) obj);
                return;
            case 11:
                if (obj instanceof dy1) {
                    xy1.a((dy1) obj);
                    return;
                } else {
                    xy1.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof dy1) {
                    xy1.a((dy1) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                xy1.b(bArr, 0, bArr.length);
                return;
            case 13:
                xy1.b(((Integer) obj).intValue());
                return;
            case 14:
                xy1.d(((Integer) obj).intValue());
                return;
            case 15:
                xy1.c(((Long) obj).longValue());
                return;
            case 16:
                xy1.c(((Integer) obj).intValue());
                return;
            case 17:
                xy1.b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof tz1) {
                    xy1.a(((tz1) obj).a());
                    return;
                } else {
                    xy1.a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private static <T extends iz1<T>> boolean a(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.g() == m32.MESSAGE) {
            boolean k = key.k();
            Object value = entry.getValue();
            if (k) {
                for (c12 c12 : (List) value) {
                    if (!c12.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof c12) {
                if (!((c12) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof c02) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static int b(f32 f32, Object obj) {
        switch (jz1.f3299b[f32.ordinal()]) {
            case 1:
                return xy1.b(((Double) obj).doubleValue());
            case 2:
                return xy1.b(((Float) obj).floatValue());
            case 3:
                return xy1.d(((Long) obj).longValue());
            case 4:
                return xy1.e(((Long) obj).longValue());
            case 5:
                return xy1.f(((Integer) obj).intValue());
            case 6:
                return xy1.g(((Long) obj).longValue());
            case 7:
                return xy1.i(((Integer) obj).intValue());
            case 8:
                return xy1.b(((Boolean) obj).booleanValue());
            case 9:
                return xy1.c((c12) obj);
            case 10:
                return obj instanceof c02 ? xy1.a((c02) obj) : xy1.b((c12) obj);
            case 11:
                return obj instanceof dy1 ? xy1.b((dy1) obj) : xy1.b((String) obj);
            case 12:
                return obj instanceof dy1 ? xy1.b((dy1) obj) : xy1.b((byte[]) obj);
            case 13:
                return xy1.g(((Integer) obj).intValue());
            case 14:
                return xy1.j(((Integer) obj).intValue());
            case 15:
                return xy1.h(((Long) obj).longValue());
            case 16:
                return xy1.h(((Integer) obj).intValue());
            case 17:
                return xy1.f(((Long) obj).longValue());
            case 18:
                return obj instanceof tz1 ? xy1.k(((tz1) obj).a()) : xy1.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int b(iz1<?> iz1, Object obj) {
        f32 d2 = iz1.d();
        int a2 = iz1.a();
        if (!iz1.k()) {
            return a(d2, a2, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (iz1.i()) {
            for (Object obj2 : list) {
                i += b(d2, obj2);
            }
            return xy1.e(a2) + i + xy1.m(i);
        }
        for (Object obj3 : list) {
            i += a(d2, a2, obj3);
        }
        return i;
    }

    private final void b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c02) {
            c02 c02 = (c02) value;
            c02.c();
            throw null;
        } else if (key.k()) {
            Object a2 = a((iz1) key);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a2).add(a(obj));
            }
            this.f2834a.put(key, a2);
        } else if (key.g() == m32.MESSAGE) {
            Object a3 = a((iz1) key);
            if (a3 == null) {
                this.f2834a.put(key, a(value));
            } else {
                this.f2834a.put(key, a3 instanceof h12 ? key.a((h12) a3, (h12) value) : key.a(((c12) a3).a(), (c12) value).e());
            }
        } else {
            this.f2834a.put(key, a(value));
        }
    }

    private static int c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.g() != m32.MESSAGE || key.k() || key.i()) {
            return b((iz1<?>) key, value);
        }
        boolean z = value instanceof c02;
        int a2 = entry.getKey().a();
        return z ? xy1.b(a2, (c02) value) : xy1.b(a2, (c12) value);
    }

    public static <T extends iz1<T>> gz1<T> g() {
        return d;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> a() {
        return this.f2836c ? new h02(this.f2834a.e().iterator()) : this.f2834a.e().iterator();
    }

    public final void a(gz1<T> gz1) {
        for (int i = 0; i < gz1.f2834a.c(); i++) {
            b(gz1.f2834a.a(i));
        }
        for (Map.Entry<T, Object> entry : gz1.f2834a.d()) {
            b(entry);
        }
    }

    public final boolean b() {
        return this.f2835b;
    }

    public final boolean c() {
        for (int i = 0; i < this.f2834a.c(); i++) {
            if (!a((Map.Entry) this.f2834a.a(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f2834a.d()) {
            if (!a((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        gz1 gz1 = new gz1();
        for (int i = 0; i < this.f2834a.c(); i++) {
            Map.Entry<T, Object> a2 = this.f2834a.a(i);
            gz1.a(a2.getKey(), a2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f2834a.d()) {
            gz1.a(entry.getKey(), entry.getValue());
        }
        gz1.f2836c = this.f2836c;
        return gz1;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.f2836c ? new h02(this.f2834a.entrySet().iterator()) : this.f2834a.entrySet().iterator();
    }

    public final void e() {
        if (!this.f2835b) {
            this.f2834a.b();
            this.f2835b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz1)) {
            return false;
        }
        return this.f2834a.equals(((gz1) obj).f2834a);
    }

    public final int f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2834a.c(); i2++) {
            i += c(this.f2834a.a(i2));
        }
        for (Map.Entry<T, Object> entry : this.f2834a.d()) {
            i += c(entry);
        }
        return i;
    }

    public final int hashCode() {
        return this.f2834a.hashCode();
    }
}
