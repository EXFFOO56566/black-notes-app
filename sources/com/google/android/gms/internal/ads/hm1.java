package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class hm1<K, V> extends cm1<Map.Entry<K, V>> {
    private final transient yl1<K, V> d;
    private final transient Object[] e;
    private final transient int f;

    hm1(yl1<K, V> yl1, Object[] objArr, int i, int i2) {
        this.d = yl1;
        this.e = objArr;
        this.f = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int a(Object[] objArr, int i) {
        return g().a(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.tl1
    /* renamed from: a */
    public final qm1<Map.Entry<K, V>> iterator() {
        return (qm1) g().iterator();
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.d.get(key));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.cm1
    public final ul1<Map.Entry<K, V>> l() {
        return new km1(this);
    }

    public final int size() {
        return this.f;
    }
}
