package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class l22 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a22 f3487b;

    private l22(a22 a22) {
        this.f3487b = a22;
    }

    /* synthetic */ l22(a22 a22, d22 d22) {
        this(a22);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f3487b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f3487b.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3487b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new i22(this.f3487b, null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f3487b.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f3487b.size();
    }
}
