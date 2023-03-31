package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class i22 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f3018b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3019c;
    private Iterator<Map.Entry<K, V>> d;
    private final /* synthetic */ a22 e;

    private i22(a22 a22) {
        this.e = a22;
        this.f3018b = -1;
    }

    /* synthetic */ i22(a22 a22, d22 d22) {
        this(a22);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.d == null) {
            this.d = this.e.d.entrySet().iterator();
        }
        return this.d;
    }

    public final boolean hasNext() {
        return this.f3018b + 1 < this.e.f1686c.size() || (!this.e.d.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f3019c = true;
        int i = this.f3018b + 1;
        this.f3018b = i;
        return (Map.Entry) (i < this.e.f1686c.size() ? this.e.f1686c.get(this.f3018b) : a().next());
    }

    public final void remove() {
        if (this.f3019c) {
            this.f3019c = false;
            this.e.f();
            if (this.f3018b < this.e.f1686c.size()) {
                a22 a22 = this.e;
                int i = this.f3018b;
                this.f3018b = i - 1;
                Object unused = a22.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
