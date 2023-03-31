package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class h02<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f2839b;

    public h02(Iterator<Map.Entry<K, Object>> it) {
        this.f2839b = it;
    }

    public final boolean hasNext() {
        return this.f2839b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f2839b.next();
        return next.getValue() instanceof c02 ? new e02(next) : next;
    }

    public final void remove() {
        this.f2839b.remove();
    }
}
