package com.google.android.gms.internal.ads;

import java.util.ListIterator;

public abstract class pm1<E> extends qm1<E> implements ListIterator<E> {
    protected pm1() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
