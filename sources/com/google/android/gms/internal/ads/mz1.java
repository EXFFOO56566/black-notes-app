package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class mz1 extends xx1<Float> implements yz1<Float>, p12, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private float[] f3773c;
    private int d;

    static {
        new mz1(new float[0], 0).c();
    }

    mz1() {
        this(new float[10], 0);
    }

    private mz1(float[] fArr, int i) {
        this.f3773c = fArr;
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

    public final void a(float f) {
        a();
        int i = this.d;
        float[] fArr = this.f3773c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f3773c = fArr2;
        }
        float[] fArr3 = this.f3773c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        float[] fArr = this.f3773c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f3773c, i, fArr2, i + 1, this.d - i);
            this.f3773c = fArr2;
        }
        this.f3773c[i] = floatValue;
        this.d++;
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Float f) {
        a(f.floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        uz1.a(collection);
        if (!(collection instanceof mz1)) {
            return super.addAll(collection);
        }
        mz1 mz1 = (mz1) collection;
        int i = mz1.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f3773c;
            if (i3 > fArr.length) {
                this.f3773c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(mz1.f3773c, 0, this.f3773c, this.d, mz1.d);
            this.d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.yz1' to match base method */
    @Override // com.google.android.gms.internal.ads.yz1
    public final /* synthetic */ yz1<Float> e(int i) {
        if (i >= this.d) {
            return new mz1(Arrays.copyOf(this.f3773c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz1)) {
            return super.equals(obj);
        }
        mz1 mz1 = (mz1) obj;
        if (this.d != mz1.d) {
            return false;
        }
        float[] fArr = mz1.f3773c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.f3773c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Float.valueOf(this.f3773c[i]);
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f3773c[i2]);
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        f(i);
        float[] fArr = this.f3773c;
        float f = fArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.ads.xx1, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Float.valueOf(this.f3773c[i]))) {
                float[] fArr = this.f3773c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.d - i) - 1);
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
            float[] fArr = this.f3773c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
            this.d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        f(i);
        float[] fArr = this.f3773c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.d;
    }
}
