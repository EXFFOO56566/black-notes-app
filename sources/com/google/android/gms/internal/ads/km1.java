package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

final class km1 extends ul1<Map.Entry<K, V>> {
    private final /* synthetic */ hm1 d;

    km1(hm1 hm1) {
        this.d = hm1;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        jl1.a(i, hm1.a(this.d));
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(hm1.b(this.d)[i2], hm1.b(this.d)[i2 + 1]);
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return true;
    }

    public final int size() {
        return hm1.a(this.d);
    }
}
