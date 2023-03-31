package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class o02 extends l02 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f3928c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private o02() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> a(Object obj, long j, int i) {
        List<L> e;
        j02 j02;
        List<L> c2 = c(obj, j);
        if (c2.isEmpty()) {
            e = c2 instanceof i02 ? new j02(i) : (!(c2 instanceof p12) || !(c2 instanceof yz1)) ? new ArrayList<>(i) : ((yz1) c2).e(i);
        } else {
            if (f3928c.isAssignableFrom(c2.getClass())) {
                ArrayList arrayList = new ArrayList(c2.size() + i);
                arrayList.addAll(c2);
                j02 = arrayList;
            } else if (c2 instanceof t22) {
                j02 j022 = new j02(c2.size() + i);
                j022.addAll((t22) c2);
                j02 = j022;
            } else if (!(c2 instanceof p12) || !(c2 instanceof yz1)) {
                return c2;
            } else {
                yz1 yz1 = (yz1) c2;
                if (yz1.h()) {
                    return c2;
                }
                e = yz1.e(c2.size() + i);
            }
            y22.a(obj, j, j02);
            return j02;
        }
        y22.a(obj, j, e);
        return e;
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) y22.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.l02
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.l02
    public final <E> void a(Object obj, Object obj2, long j) {
        List c2 = c(obj2, j);
        List a2 = a(obj, j, c2.size());
        int size = a2.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(c2);
        }
        if (size > 0) {
            c2 = a2;
        }
        y22.a(obj, j, c2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.l02
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) y22.f(obj, j);
        if (list instanceof i02) {
            obj2 = ((i02) list).j();
        } else if (!f3928c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof p12) || !(list instanceof yz1)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                yz1 yz1 = (yz1) list;
                if (yz1.h()) {
                    yz1.c();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        y22.a(obj, j, obj2);
    }
}
