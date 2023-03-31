package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class t22 extends AbstractList<String> implements i02, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private final i02 f4746b;

    public t22(i02 i02) {
        this.f4746b = i02;
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final void a(dy1 dy1) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final Object c(int i) {
        return this.f4746b.c(i);
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final List<?> f() {
        return this.f4746b.f();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.f4746b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new v22(this);
    }

    @Override // com.google.android.gms.internal.ads.i02
    public final i02 j() {
        return this;
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new w22(this, i);
    }

    public final int size() {
        return this.f4746b.size();
    }
}
