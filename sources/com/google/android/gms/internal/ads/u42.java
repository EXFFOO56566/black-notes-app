package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class u42<K, V> extends o42<K, V, V> {
    static {
        v42.a(Collections.emptyMap());
    }

    private u42(Map<K, e52<V>> map) {
        super(map);
    }

    public static <K, V> w42<K, V> a(int i) {
        return new w42<>(i);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        LinkedHashMap c2 = q42.c(a().size());
        for (Map.Entry<K, e52<V>> entry : a().entrySet()) {
            c2.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(c2);
    }
}
