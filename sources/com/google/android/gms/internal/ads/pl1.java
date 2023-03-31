package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

abstract class pl1<E> extends pm1<E> {

    /* renamed from: b  reason: collision with root package name */
    private final int f4199b;

    /* renamed from: c  reason: collision with root package name */
    private int f4200c;

    protected pl1(int i, int i2) {
        jl1.b(i2, i);
        this.f4199b = i;
        this.f4200c = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final boolean hasNext() {
        return this.f4200c < this.f4199b;
    }

    public final boolean hasPrevious() {
        return this.f4200c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f4200c;
            this.f4200c = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f4200c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f4200c - 1;
            this.f4200c = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f4200c - 1;
    }
}
