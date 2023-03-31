package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class q02 extends xx1<Long> implements zz1, p12, RandomAccess {
    private static final q02 e;

    /* renamed from: c  reason: collision with root package name */
    private long[] f4257c;
    private int d;

    static {
        q02 q02 = new q02(new long[0], 0);
        e = q02;
        q02.c();
    }

    q02() {
        this(new long[10], 0);
    }

    private q02(long[] jArr, int i) {
        this.f4257c = jArr;
        this.d = i;
    }

    public static q02 b() {
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

    public final void a(long j) {
        a();
        int i = this.d;
        long[] jArr = this.f4257c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f4257c = jArr2;
        }
        long[] jArr3 = this.f4257c;
        int i2 = this.d;
        this.d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        long[] jArr = this.f4257c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f4257c, i, jArr2, i + 1, this.d - i);
            this.f4257c = jArr2;
        }
        this.f4257c[i] = longValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Long l) {
        a(l.longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        uz1.a(collection);
        if (!(collection instanceof q02)) {
            return super.addAll(collection);
        }
        q02 q02 = (q02) collection;
        int i = q02.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f4257c;
            if (i3 > jArr.length) {
                this.f4257c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(q02.f4257c, 0, this.f4257c, this.d, q02.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.zz1
    /* renamed from: b */
    public final zz1 e(int i) {
        if (i >= this.d) {
            return new q02(Arrays.copyOf(this.f4257c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q02)) {
            return super.equals(obj);
        }
        q02 q02 = (q02) obj;
        if (this.d != q02.d) {
            return false;
        }
        long[] jArr = q02.f4257c;
        for (int i = 0; i < this.d; i++) {
            if (this.f4257c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i) {
        g(i);
        return this.f4257c[i];
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(f(i));
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + uz1.a(this.f4257c[i2]);
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        g(i);
        long[] jArr = this.f4257c;
        long j = jArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.f4257c[i]))) {
                long[] jArr = this.f4257c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.d - i) - 1);
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
            long[] jArr = this.f4257c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        g(i);
        long[] jArr = this.f4257c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.d;
    }
}
