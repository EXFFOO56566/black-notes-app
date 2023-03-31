package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class r12<E> extends xx1<E> implements RandomAccess {
    private static final r12<Object> e;

    /* renamed from: c  reason: collision with root package name */
    private E[] f4430c;
    private int d;

    static {
        r12<Object> r12 = new r12<>(new Object[0], 0);
        e = r12;
        r12.c();
    }

    private r12(E[] eArr, int i) {
        this.f4430c = eArr;
        this.d = i;
    }

    public static <E> r12<E> b() {
        return (r12<E>) e;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    private final String g(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.List, java.util.AbstractList
    public final void add(int i, E e2) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        E[] eArr = this.f4430c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f4430c, i, eArr2, i + 1, this.d - i);
            this.f4430c = eArr2;
        }
        this.f4430c[i] = e2;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final boolean add(E e2) {
        a();
        int i = this.d;
        E[] eArr = this.f4430c;
        if (i == eArr.length) {
            this.f4430c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4430c;
        int i2 = this.d;
        this.d = i2 + 1;
        eArr2[i2] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yz1
    public final /* synthetic */ yz1 e(int i) {
        if (i >= this.d) {
            return new r12(Arrays.copyOf(this.f4430c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i) {
        f(i);
        return this.f4430c[i];
    }

    @Override // java.util.List, java.util.AbstractList
    public final E remove(int i) {
        a();
        f(i);
        E[] eArr = this.f4430c;
        E e2 = eArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final E set(int i, E e2) {
        a();
        f(i);
        E[] eArr = this.f4430c;
        E e3 = eArr[i];
        eArr[i] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    public final int size() {
        return this.d;
    }
}
