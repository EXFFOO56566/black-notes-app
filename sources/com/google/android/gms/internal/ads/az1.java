package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rz1;
import java.util.List;
import java.util.Map;

final class az1 implements l32 {

    /* renamed from: a  reason: collision with root package name */
    private final xy1 f1836a;

    private az1(xy1 xy1) {
        uz1.a((Object) xy1, "output");
        xy1 xy12 = xy1;
        this.f1836a = xy12;
        xy12.f5514a = this;
    }

    public static az1 a(xy1 xy1) {
        az1 az1 = xy1.f5514a;
        return az1 != null ? az1 : new az1(xy1);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final int a() {
        return rz1.f.k;
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i) {
        this.f1836a.a(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, double d) {
        this.f1836a.a(i, d);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, float f) {
        this.f1836a.a(i, f);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, int i2) {
        this.f1836a.e(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, long j) {
        this.f1836a.c(i, j);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, dy1 dy1) {
        this.f1836a.a(i, dy1);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final <K, V> void a(int i, t02<K, V> t02, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f1836a.a(i, 2);
            this.f1836a.b(u02.a(t02, entry.getKey(), entry.getValue()));
            u02.a(this.f1836a, t02, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, Object obj) {
        if (obj instanceof dy1) {
            this.f1836a.b(i, (dy1) obj);
        } else {
            this.f1836a.a(i, (c12) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, Object obj, z12 z12) {
        xy1 xy1 = this.f1836a;
        xy1.a(i, 3);
        z12.a((Object) ((c12) obj), (l32) xy1.f5514a);
        xy1.a(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, String str) {
        this.f1836a.a(i, str);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, List<dy1> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f1836a.a(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, List<?> list, z12 z12) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), z12);
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.g(list.get(i4).longValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void a(int i, boolean z) {
        this.f1836a.a(i, z);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void b(int i) {
        this.f1836a.a(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void b(int i, int i2) {
        this.f1836a.b(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void b(int i, long j) {
        this.f1836a.a(i, j);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void b(int i, Object obj, z12 z12) {
        this.f1836a.a(i, (c12) obj, z12);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void b(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof i02) {
            i02 i02 = (i02) list;
            while (i2 < list.size()) {
                Object c2 = i02.c(i2);
                if (c2 instanceof String) {
                    this.f1836a.a(i, (String) c2);
                } else {
                    this.f1836a.a(i, (dy1) c2);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.a(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void b(int i, List<?> list, z12 z12) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), z12);
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void b(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.b(list.get(i4).booleanValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void c(int i, int i2) {
        this.f1836a.e(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void c(int i, long j) {
        this.f1836a.a(i, j);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.f(list.get(i4).longValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.b(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void d(int i, int i2) {
        this.f1836a.c(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void d(int i, long j) {
        this.f1836a.c(i, j);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void d(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.f(list.get(i4).intValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void e(int i, int i2) {
        this.f1836a.b(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void e(int i, long j) {
        this.f1836a.b(i, j);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.e(list.get(i4).longValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void f(int i, int i2) {
        this.f1836a.d(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.k(list.get(i4).intValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.h(list.get(i4).intValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.d(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.d(list.get(i4).longValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void i(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.b(list.get(i4).doubleValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.h(list.get(i4).longValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.i(list.get(i4).intValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void l(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.b(list.get(i4).floatValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.a(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.g(list.get(i4).intValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.c(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.l32
    public final void n(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1836a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xy1.j(list.get(i4).intValue());
            }
            this.f1836a.b(i3);
            while (i2 < list.size()) {
                this.f1836a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1836a.e(i, list.get(i2).intValue());
            i2++;
        }
    }
}
