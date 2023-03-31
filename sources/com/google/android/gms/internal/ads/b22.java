package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class b22 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f1850a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final s22<?, ?> f1851b = a(false);

    /* renamed from: c  reason: collision with root package name */
    private static final s22<?, ?> f1852c = a(true);
    private static final s22<?, ?> d = new u22();

    static int a(int i, Object obj, z12 z12) {
        return obj instanceof g02 ? xy1.a(i, (g02) obj) : xy1.b(i, (c12) obj, z12);
    }

    static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = xy1.e(i) * size;
        if (list instanceof i02) {
            i02 i02 = (i02) list;
            while (i2 < size) {
                Object c2 = i02.c(i2);
                e += c2 instanceof dy1 ? xy1.b((dy1) c2) : xy1.b((String) c2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof dy1 ? xy1.b((dy1) obj) : xy1.b((String) obj);
                i2++;
            }
        }
        return e;
    }

    static int a(int i, List<?> list, z12 z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = xy1.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof g02 ? xy1.a((g02) obj) : xy1.a((c12) obj, z12);
        }
        return e;
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return j(list) + (list.size() * xy1.e(i));
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            i = 0;
            while (i2 < size) {
                i += xy1.e(q02.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += xy1.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static s22<?, ?> a() {
        return f1851b;
    }

    private static s22<?, ?> a(boolean z) {
        try {
            Class<?> e = e();
            if (e == null) {
                return null;
            }
            return (s22) e.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, s22<UT, UB> s22) {
        if (ub == null) {
            ub = s22.a();
        }
        s22.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, vz1 vz1, UB ub, s22<UT, UB> s22) {
        if (vz1 == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (vz1.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) a(i, intValue, ub, s22);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!vz1.a(intValue2)) {
                    ub = (UB) a(i, intValue2, ub, s22);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void a(int i, List<String> list, l32 l32) {
        if (list != null && !list.isEmpty()) {
            l32.b(i, list);
        }
    }

    public static void a(int i, List<?> list, l32 l32, z12 z12) {
        if (list != null && !list.isEmpty()) {
            l32.a(i, list, z12);
        }
    }

    public static void a(int i, List<Double> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.i(i, list, z);
        }
    }

    static <T, FT extends iz1<FT>> void a(fz1<FT> fz1, T t, T t2) {
        gz1<FT> a2 = fz1.a((Object) t2);
        if (!a2.f2834a.isEmpty()) {
            fz1.b(t).a(a2);
        }
    }

    static <T, UT, UB> void a(s22<UT, UB> s22, T t, T t2) {
        s22.a(t, s22.c(s22.d(t), s22.d(t2)));
    }

    static <T> void a(v02 v02, T t, T t2, long j) {
        y22.a(t, j, v02.a(y22.f(t, j), y22.f(t2, j)));
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!rz1.class.isAssignableFrom(cls) && (cls2 = f1850a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int b(int i, List<dy1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * xy1.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += xy1.b(list.get(i2));
        }
        return e;
    }

    static int b(int i, List<c12> list, z12 z12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += xy1.c(i, list.get(i3), z12);
        }
        return i2;
    }

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a(list) + (size * xy1.e(i));
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            i = 0;
            while (i2 < size) {
                i += xy1.f(q02.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += xy1.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static s22<?, ?> b() {
        return f1852c;
    }

    public static void b(int i, List<dy1> list, l32 l32) {
        if (list != null && !list.isEmpty()) {
            l32.a(i, list);
        }
    }

    public static void b(int i, List<?> list, l32 l32, z12 z12) {
        if (list != null && !list.isEmpty()) {
            l32.b(i, list, z12);
        }
    }

    public static void b(int i, List<Float> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.l(i, list, z);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * xy1.e(i));
    }

    static int c(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            i = 0;
            while (i2 < size) {
                i += xy1.k(sz1.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += xy1.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static s22<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.h(i, list, z);
        }
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * xy1.e(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            i = 0;
            while (i2 < size) {
                i += xy1.f(sz1.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += xy1.f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.e(i, list, z);
        }
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * xy1.e(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            i = 0;
            while (i2 < size) {
                i += xy1.g(sz1.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += xy1.g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.c(i, list, z);
        }
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * xy1.e(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof sz1) {
            sz1 sz1 = (sz1) list;
            i = 0;
            while (i2 < size) {
                i += xy1.h(sz1.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += xy1.h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.a(i, list, z);
        }
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * xy1.e(i));
    }

    static int g(List<?> list) {
        return list.size() << 2;
    }

    public static void g(int i, List<Long> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.j(i, list, z);
        }
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * xy1.i(i, 0);
    }

    static int h(List<?> list) {
        return list.size() << 3;
    }

    public static void h(int i, List<Integer> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.d(i, list, z);
        }
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * xy1.g(i, 0L);
    }

    static int i(List<?> list) {
        return list.size();
    }

    public static void i(int i, List<Integer> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.m(i, list, z);
        }
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * xy1.b(i, true);
    }

    static int j(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q02) {
            q02 q02 = (q02) list;
            i = 0;
            while (i2 < size) {
                i += xy1.d(q02.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += xy1.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void j(int i, List<Integer> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.g(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.k(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.n(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.f(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, l32 l32, boolean z) {
        if (list != null && !list.isEmpty()) {
            l32.b(i, list, z);
        }
    }
}
