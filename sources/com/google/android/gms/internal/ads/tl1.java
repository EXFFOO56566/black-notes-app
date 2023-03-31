package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class tl1<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private static final Object[] f4830b = new Object[0];

    tl1() {
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        qm1 qm1 = (qm1) iterator();
        while (qm1.hasNext()) {
            objArr[i] = qm1.next();
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public abstract qm1<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] b() {
        return null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        throw new UnsupportedOperationException();
    }

    public ul1<E> g() {
        return isEmpty() ? ul1.k() : ul1.b(toArray());
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f4830b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        jl1.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] b2 = b();
            if (b2 != null) {
                return (T[]) Arrays.copyOfRange(b2, d(), e(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
