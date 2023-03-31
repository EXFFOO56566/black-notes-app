package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* access modifiers changed from: package-private */
public class sl1<E> extends vl1<E> {

    /* renamed from: a  reason: collision with root package name */
    Object[] f4676a;

    /* renamed from: b  reason: collision with root package name */
    int f4677b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f4678c;

    sl1(int i) {
        ol1.a(i, "initialCapacity");
        this.f4676a = new Object[i];
    }

    private final void a(int i) {
        Object[] objArr = this.f4676a;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.f4676a = Arrays.copyOf(objArr, i2);
                this.f4678c = false;
                return;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        } else if (this.f4678c) {
            this.f4676a = (Object[]) objArr.clone();
            this.f4678c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.vl1
    public vl1<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(this.f4677b + collection.size());
            if (collection instanceof tl1) {
                this.f4677b = ((tl1) collection).a(this.f4676a, this.f4677b);
                return this;
            }
        }
        super.a((Iterable) iterable);
        return this;
    }

    public sl1<E> b(E e) {
        jl1.a(e);
        a(this.f4677b + 1);
        Object[] objArr = this.f4676a;
        int i = this.f4677b;
        this.f4677b = i + 1;
        objArr[i] = e;
        return this;
    }
}
