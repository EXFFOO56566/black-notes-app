package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class v22 implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f5043b = this.f5044c.f4746b.iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ t22 f5044c;

    v22(t22 t22) {
        this.f5044c = t22;
    }

    public final boolean hasNext() {
        return this.f5043b.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f5043b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
