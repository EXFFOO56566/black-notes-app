package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class cz1 extends xx1<Double> implements yz1<Double>, p12, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private double[] f2193c;
    private int d;

    static {
        new cz1(new double[0], 0).c();
    }

    cz1() {
        this(new double[10], 0);
    }

    private cz1(double[] dArr, int i) {
        this.f2193c = dArr;
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

    public final void a(double d2) {
        a();
        int i = this.d;
        double[] dArr = this.f2193c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f2193c = dArr2;
        }
        double[] dArr3 = this.f2193c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        double[] dArr = this.f2193c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f2193c, i, dArr2, i + 1, this.d - i);
            this.f2193c = dArr2;
        }
        this.f2193c[i] = doubleValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Double d2) {
        a(d2.doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        uz1.a(collection);
        if (!(collection instanceof cz1)) {
            return super.addAll(collection);
        }
        cz1 cz1 = (cz1) collection;
        int i = cz1.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f2193c;
            if (i3 > dArr.length) {
                this.f2193c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(cz1.f2193c, 0, this.f2193c, this.d, cz1.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.yz1' to match base method */
    @Override // com.google.android.gms.internal.ads.yz1
    public final /* synthetic */ yz1<Double> e(int i) {
        if (i >= this.d) {
            return new cz1(Arrays.copyOf(this.f2193c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz1)) {
            return super.equals(obj);
        }
        cz1 cz1 = (cz1) obj;
        if (this.d != cz1.d) {
            return false;
        }
        double[] dArr = cz1.f2193c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.f2193c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Double.valueOf(this.f2193c[i]);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + uz1.a(Double.doubleToLongBits(this.f2193c[i2]));
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        f(i);
        double[] dArr = this.f2193c;
        double d2 = dArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Double.valueOf(this.f2193c[i]))) {
                double[] dArr = this.f2193c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.d - i) - 1);
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
            double[] dArr = this.f2193c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        f(i);
        double[] dArr = this.f2193c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.d;
    }
}
