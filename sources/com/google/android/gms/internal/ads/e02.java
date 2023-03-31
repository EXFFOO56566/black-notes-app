package com.google.android.gms.internal.ads;

import java.util.Map;

final class e02<K> implements Map.Entry<K, Object> {

    /* renamed from: b  reason: collision with root package name */
    private Map.Entry<K, c02> f2352b;

    private e02(Map.Entry<K, c02> entry) {
        this.f2352b = entry;
    }

    public final c02 a() {
        return this.f2352b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f2352b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2352b.getValue() == null) {
            return null;
        }
        c02.c();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof c12) {
            return this.f2352b.getValue().a((c12) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
