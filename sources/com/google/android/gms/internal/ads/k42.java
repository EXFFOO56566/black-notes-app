package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class k42 implements Iterator<E> {

    /* renamed from: b  reason: collision with root package name */
    private int f3320b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ h42 f3321c;

    k42(h42 h42) {
        this.f3321c = h42;
    }

    public final boolean hasNext() {
        return this.f3320b < this.f3321c.f2858b.size() || this.f3321c.f2859c.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.f3320b >= this.f3321c.f2858b.size()) {
            h42 h42 = this.f3321c;
            h42.f2858b.add(h42.f2859c.next());
        }
        List<E> list = this.f3321c.f2858b;
        int i = this.f3320b;
        this.f3320b = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
