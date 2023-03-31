package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ul1<E> extends tl1<E> implements List<E>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final pm1<Object> f4974c = new wl1(fm1.f, 0);

    ul1() {
    }

    public static <E> ul1<E> a(Iterable<? extends E> iterable) {
        jl1.a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection instanceof tl1) {
                ul1<E> g = ((tl1) collection).g();
                if (!g.i()) {
                    return g;
                }
                Object[] array = g.toArray();
                return b(array, array.length);
            }
            Object[] array2 = collection.toArray();
            int length = array2.length;
            for (int i = 0; i < length; i++) {
                gm1.a(array2[i], i);
            }
            return b(array2, array2.length);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return (ul1<E>) fm1.f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a(next);
        }
        xl1 xl1 = new xl1();
        xl1.a(next);
        xl1 xl12 = xl1;
        xl12.a((Iterator) it);
        xl1 xl13 = xl12;
        xl13.f4678c = true;
        return b(xl13.f4676a, xl13.f4677b);
    }

    public static <E> ul1<E> a(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            gm1.a(objArr[0], 0);
        }
        return b(objArr, 1);
    }

    public static <E> ul1<E> a(E[] eArr) {
        if (eArr.length == 0) {
            return (ul1<E>) fm1.f;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            gm1.a(objArr[i], i);
        }
        return b(objArr, objArr.length);
    }

    static <E> ul1<E> b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static <E> ul1<E> b(Object[] objArr, int i) {
        return i == 0 ? (ul1<E>) fm1.f : new fm1(objArr, i);
    }

    public static <E> ul1<E> k() {
        return (ul1<E>) fm1.f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.tl1
    /* renamed from: a */
    public final qm1<E> iterator() {
        return (pm1) listIterator();
    }

    /* renamed from: a */
    public ul1<E> subList(int i, int i2) {
        jl1.a(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? (ul1<E>) fm1.f : new zl1(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        jl1.a(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (fl1.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!fl1.a(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public final ul1<E> g() {
        return this;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (pm1) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        jl1.b(i, size());
        return isEmpty() ? f4974c : new wl1(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
