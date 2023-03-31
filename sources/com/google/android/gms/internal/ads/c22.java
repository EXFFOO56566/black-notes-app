package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class c22 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f2049b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f2050c;
    private final /* synthetic */ a22 d;

    private c22(a22 a22) {
        this.d = a22;
        this.f2049b = this.d.f1686c.size();
    }

    /* synthetic */ c22(a22 a22, d22 d22) {
        this(a22);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f2050c == null) {
            this.f2050c = this.d.g.entrySet().iterator();
        }
        return this.f2050c;
    }

    public final boolean hasNext() {
        int i = this.f2049b;
        return (i > 0 && i <= this.d.f1686c.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List list = this.d.f1686c;
            int i = this.f2049b - 1;
            this.f2049b = i;
            obj = list.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
