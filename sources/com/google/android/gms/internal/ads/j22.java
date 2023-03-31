package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class j22 implements Comparable<j22>, Map.Entry<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final K f3166b;

    /* renamed from: c  reason: collision with root package name */
    private V f3167c;
    private final /* synthetic */ a22 d;

    j22(a22 a22, K k, V v) {
        this.d = a22;
        this.f3166b = k;
        this.f3167c = v;
    }

    j22(a22 a22, Map.Entry<K, V> entry) {
        this(a22, entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(j22 j22) {
        return ((Comparable) getKey()).compareTo((Comparable) j22.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f3166b, entry.getKey()) && a(this.f3167c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f3166b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f3167c;
    }

    public final int hashCode() {
        K k = this.f3166b;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f3167c;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        a22.a(this.d);
        V v2 = this.f3167c;
        this.f3167c = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3166b);
        String valueOf2 = String.valueOf(this.f3167c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
