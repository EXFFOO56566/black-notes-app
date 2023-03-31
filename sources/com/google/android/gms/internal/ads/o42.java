package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class o42<K, V, V2> implements r42<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, e52<V>> f3944a;

    o42(Map<K, e52<V>> map) {
        this.f3944a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, e52<V>> a() {
        return this.f3944a;
    }
}
