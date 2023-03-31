package com.google.android.gms.internal.ads;

import java.util.List;

final class m02 extends l02 {
    private m02() {
        super();
    }

    private static <E> yz1<E> c(Object obj, long j) {
        return (yz1) y22.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.l02
    public final <L> List<L> a(Object obj, long j) {
        yz1 c2 = c(obj, j);
        if (c2.h()) {
            return c2;
        }
        int size = c2.size();
        yz1 e = c2.e(size == 0 ? 10 : size << 1);
        y22.a(obj, j, e);
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.l02
    public final <E> void a(Object obj, Object obj2, long j) {
        yz1<E> c2 = c(obj, j);
        yz1<E> c3 = c(obj2, j);
        int size = c2.size();
        int size2 = c3.size();
        yz1<E> yz1 = c2;
        yz1 = c2;
        if (size > 0 && size2 > 0) {
            boolean h = c2.h();
            yz1<E> yz12 = c2;
            if (!h) {
                yz12 = c2.e(size2 + size);
            }
            yz12.addAll(c3);
            yz1 = yz12;
        }
        if (size > 0) {
            c3 = yz1;
        }
        y22.a(obj, j, c3);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.l02
    public final void b(Object obj, long j) {
        c(obj, j).c();
    }
}
