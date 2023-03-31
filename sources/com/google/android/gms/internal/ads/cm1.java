package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class cm1<E> extends tl1<E> implements Set<E> {
    @NullableDecl

    /* renamed from: c  reason: collision with root package name */
    private transient ul1<E> f2141c;

    cm1() {
    }

    /* access modifiers changed from: private */
    public static <E> cm1<E> a(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return a(objArr[0]);
            }
            int f = f(i);
            Object[] objArr2 = new Object[f];
            int i2 = f - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                gm1.a(obj, i5);
                int hashCode = obj.hashCode();
                int a2 = ql1.a(hashCode);
                while (true) {
                    int i6 = a2 & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    a2++;
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new nm1(objArr[0], i3);
            }
            if (f(i4) < f / 2) {
                i = i4;
            } else {
                if (a(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new lm1(objArr, i3, objArr2, i2, i4);
            }
        }
        return lm1.i;
    }

    public static <E> cm1<E> a(E e) {
        return new nm1(e);
    }

    @SafeVarargs
    public static <E> cm1<E> a(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        jl1.a(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return a(length, objArr);
    }

    /* access modifiers changed from: private */
    public static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int f(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        jl1.a(z, "collection too large");
        return 1073741824;
    }

    public static <E> bm1<E> g(int i) {
        ol1.a(i, "expectedSize");
        return new bm1<>(i);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cm1) || !k() || !((cm1) obj).k() || hashCode() == obj.hashCode()) {
            return om1.a(this, obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public ul1<E> g() {
        ul1<E> ul1 = this.f2141c;
        if (ul1 != null) {
            return ul1;
        }
        ul1<E> l = l();
        this.f2141c = l;
        return l;
    }

    public int hashCode() {
        return om1.a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.android.gms.internal.ads.tl1, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public ul1<E> l() {
        return ul1.b(toArray());
    }
}
