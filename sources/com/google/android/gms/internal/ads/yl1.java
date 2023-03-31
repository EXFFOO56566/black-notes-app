package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class yl1<K, V> implements Serializable, Map<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private transient cm1<Map.Entry<K, V>> f5612b;

    /* renamed from: c  reason: collision with root package name */
    private transient cm1<K> f5613c;
    private transient tl1<V> d;

    yl1() {
    }

    public static <K, V> yl1<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        ol1.a(k, v);
        ol1.a(k2, v2);
        ol1.a(k3, v3);
        ol1.a(k4, v4);
        ol1.a(k5, v5);
        return im1.a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    /* access modifiers changed from: package-private */
    public abstract cm1<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract cm1<K> b();

    /* access modifiers changed from: package-private */
    public abstract tl1<V> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((tl1) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        cm1<Map.Entry<K, V>> cm1 = this.f5612b;
        if (cm1 != null) {
            return cm1;
        }
        cm1<Map.Entry<K, V>> a2 = a();
        this.f5612b = a2;
        return a2;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return om1.a((cm1) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        cm1<K> cm1 = this.f5613c;
        if (cm1 != null) {
            return cm1;
        }
        cm1<K> b2 = b();
        this.f5613c = b2;
        return b2;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        ol1.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append((Object) entry.getKey());
            sb.append('=');
            sb.append((Object) entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        tl1<V> tl1 = this.d;
        if (tl1 != null) {
            return tl1;
        }
        tl1<V> c2 = c();
        this.d = c2;
        return c2;
    }
}
