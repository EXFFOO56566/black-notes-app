package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

public class n42<K, V, V2> {

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<K, e52<V>> f3797a;

    n42(int i) {
        this.f3797a = q42.c(i);
    }

    /* access modifiers changed from: package-private */
    public n42<K, V, V2> a(K k, e52<V> e52) {
        LinkedHashMap<K, e52<V>> linkedHashMap = this.f3797a;
        y42.a(k, "key");
        y42.a(e52, "provider");
        linkedHashMap.put(k, e52);
        return this;
    }
}
