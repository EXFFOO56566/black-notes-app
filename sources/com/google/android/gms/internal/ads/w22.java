package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class w22 implements ListIterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private ListIterator<String> f5202b = this.d.f4746b.listIterator(this.f5203c);

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f5203c;
    private final /* synthetic */ t22 d;

    w22(t22 t22, int i) {
        this.d = t22;
        this.f5203c = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f5202b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f5202b.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.f5202b.next();
    }

    public final int nextIndex() {
        return this.f5202b.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f5202b.previous();
    }

    public final int previousIndex() {
        return this.f5202b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
