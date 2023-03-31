package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

public final class c52<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<e52<T>> f2068a;

    /* renamed from: b  reason: collision with root package name */
    private final List<e52<Collection<T>>> f2069b;

    private c52(int i, int i2) {
        this.f2068a = q42.a(i);
        this.f2069b = q42.a(i2);
    }

    public final a52<T> a() {
        return new a52<>(this.f2068a, this.f2069b);
    }

    public final c52<T> a(e52<? extends T> e52) {
        this.f2068a.add(e52);
        return this;
    }

    public final c52<T> b(e52<? extends Collection<? extends T>> e52) {
        this.f2069b.add(e52);
        return this;
    }
}
