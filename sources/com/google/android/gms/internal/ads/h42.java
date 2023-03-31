package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class h42<E> extends AbstractList<E> {
    private static final j42 d = j42.a(h42.class);

    /* renamed from: b  reason: collision with root package name */
    List<E> f2858b;

    /* renamed from: c  reason: collision with root package name */
    Iterator<E> f2859c;

    public h42(List<E> list, Iterator<E> it) {
        this.f2858b = list;
        this.f2859c = it;
    }

    @Override // java.util.List, java.util.AbstractList
    public E get(int i) {
        if (this.f2858b.size() > i) {
            return this.f2858b.get(i);
        }
        if (this.f2859c.hasNext()) {
            this.f2858b.add(this.f2859c.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public Iterator<E> iterator() {
        return new k42(this);
    }

    public int size() {
        d.a("potentially expensive size() call");
        d.a("blowup running");
        while (this.f2859c.hasNext()) {
            this.f2858b.add(this.f2859c.next());
        }
        return this.f2858b.size();
    }
}
