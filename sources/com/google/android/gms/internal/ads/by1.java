package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class by1 extends xx1<Boolean> implements yz1<Boolean>, p12, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f2032c;
    private int d;

    static {
        new by1(new boolean[0], 0).c();
    }

    by1() {
        this(new boolean[10], 0);
    }

    private by1(boolean[] zArr, int i) {
        this.f2032c = zArr;
        this.d = i;
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

    public final void a(boolean z) {
        a();
        int i = this.d;
        boolean[] zArr = this.f2032c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f2032c = zArr2;
        }
        boolean[] zArr3 = this.f2032c;
        int i2 = this.d;
        this.d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        boolean[] zArr = this.f2032c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f2032c, i, zArr2, i + 1, this.d - i);
            this.f2032c = zArr2;
        }
        this.f2032c[i] = booleanValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Boolean bool) {
        a(bool.booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        uz1.a(collection);
        if (!(collection instanceof by1)) {
            return super.addAll(collection);
        }
        by1 by1 = (by1) collection;
        int i = by1.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f2032c;
            if (i3 > zArr.length) {
                this.f2032c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(by1.f2032c, 0, this.f2032c, this.d, by1.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.yz1' to match base method */
    @Override // com.google.android.gms.internal.ads.yz1
    public final /* synthetic */ yz1<Boolean> e(int i) {
        if (i >= this.d) {
            return new by1(Arrays.copyOf(this.f2032c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by1)) {
            return super.equals(obj);
        }
        by1 by1 = (by1) obj;
        if (this.d != by1.d) {
            return false;
        }
        boolean[] zArr = by1.f2032c;
        for (int i = 0; i < this.d; i++) {
            if (this.f2032c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Boolean.valueOf(this.f2032c[i]);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + uz1.a(this.f2032c[i2]);
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        f(i);
        boolean[] zArr = this.f2032c;
        boolean z = zArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Boolean.valueOf(this.f2032c[i]))) {
                boolean[] zArr = this.f2032c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.d - i) - 1);
                this.d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            boolean[] zArr = this.f2032c;
            System.arraycopy(zArr, i2, zArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        f(i);
        boolean[] zArr = this.f2032c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.d;
    }
}
