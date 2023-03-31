package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class em1 extends qm1<T> {

    /* renamed from: b  reason: collision with root package name */
    private boolean f2448b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f2449c;

    em1(Object obj) {
        this.f2449c = obj;
    }

    public final boolean hasNext() {
        return !this.f2448b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f2448b) {
            this.f2448b = true;
            return (T) this.f2449c;
        }
        throw new NoSuchElementException();
    }
}
