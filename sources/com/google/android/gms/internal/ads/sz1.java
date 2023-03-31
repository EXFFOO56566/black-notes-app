package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class sz1 extends xx1<Integer> implements xz1, p12, RandomAccess {
    private static final sz1 e;

    /* renamed from: c  reason: collision with root package name */
    private int[] f4731c;
    private int d;

    static {
        sz1 sz1 = new sz1(new int[0], 0);
        e = sz1;
        sz1.c();
    }

    sz1() {
        this(new int[10], 0);
    }

    private sz1(int[] iArr, int i) {
        this.f4731c = iArr;
        this.d = i;
    }

    public static sz1 b() {
        return e;
    }

    private final void g(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private final String h(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.xz1
    public final void a(int i) {
        a();
        int i2 = this.d;
        int[] iArr = this.f4731c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4731c = iArr2;
        }
        int[] iArr3 = this.f4731c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.f4731c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f4731c, i, iArr2, i + 1, this.d - i);
            this.f4731c = iArr2;
        }
        this.f4731c[i] = intValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Integer num) {
        a(num.intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        uz1.a(collection);
        if (!(collection instanceof sz1)) {
            return super.addAll(collection);
        }
        sz1 sz1 = (sz1) collection;
        int i = sz1.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f4731c;
            if (i3 > iArr.length) {
                this.f4731c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(sz1.f4731c, 0, this.f4731c, this.d, sz1.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.xz1
    /* renamed from: d */
    public final xz1 e(int i) {
        if (i >= this.d) {
            return new sz1(Arrays.copyOf(this.f4731c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz1)) {
            return super.equals(obj);
        }
        sz1 sz1 = (sz1) obj;
        if (this.d != sz1.d) {
            return false;
        }
        int[] iArr = sz1.f4731c;
        for (int i = 0; i < this.d; i++) {
            if (this.f4731c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        g(i);
        return this.f4731c[i];
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(f(i));
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.f4731c[i2];
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        g(i);
        int[] iArr = this.f4731c;
        int i2 = iArr[i];
        int i3 = this.d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.f4731c[i]))) {
                int[] iArr = this.f4731c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d - i) - 1);
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
            int[] iArr = this.f4731c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        g(i);
        int[] iArr = this.f4731c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.d;
    }
}
