package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class a22<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final int f1685b;

    /* renamed from: c  reason: collision with root package name */
    private List<j22> f1686c;
    private Map<K, V> d;
    private boolean e;
    private volatile l22 f;
    private Map<K, V> g;
    private volatile f22 h;

    private a22(int i) {
        this.f1685b = i;
        this.f1686c = Collections.emptyList();
        this.d = Collections.emptyMap();
        this.g = Collections.emptyMap();
    }

    /* synthetic */ a22(int i, d22 d22) {
        this(i);
    }

    private final int a(K k) {
        int size = this.f1686c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f1686c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f1686c.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends iz1<FieldDescriptorType>> a22<FieldDescriptorType, Object> b(int i) {
        return new d22(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        f();
        V v = (V) this.f1686c.remove(i).getValue();
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.f1686c.add(new j22(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public final void f() {
        if (this.e) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        f();
        int a2 = a(k);
        if (a2 >= 0) {
            return (V) this.f1686c.get(a2).setValue(v);
        }
        f();
        if (this.f1686c.isEmpty() && !(this.f1686c instanceof ArrayList)) {
            this.f1686c = new ArrayList(this.f1685b);
        }
        int i = -(a2 + 1);
        if (i >= this.f1685b) {
            return g().put(k, v);
        }
        int size = this.f1686c.size();
        int i2 = this.f1685b;
        if (size == i2) {
            j22 remove = this.f1686c.remove(i2 - 1);
            g().put((K) ((Comparable) remove.getKey()), (V) remove.getValue());
        }
        this.f1686c.add(i, new j22(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> a(int i) {
        return this.f1686c.get(i);
    }

    public final boolean a() {
        return this.e;
    }

    public void b() {
        if (!this.e) {
            this.d = this.d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.d);
            this.g = this.g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.g);
            this.e = true;
        }
    }

    public final int c() {
        return this.f1686c.size();
    }

    public void clear() {
        f();
        if (!this.f1686c.isEmpty()) {
            this.f1686c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.a22<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.d.isEmpty() ? e22.a() : this.d.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.h == null) {
            this.h = new f22(this, null);
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new l22(this, null);
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a22)) {
            return super.equals(obj);
        }
        a22 a22 = (a22) obj;
        int size = size();
        if (size != a22.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != a22.c()) {
            return entrySet().equals(a22.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!a(i).equals(a22.a(i))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.d.equals(a22.d);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.a22<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? (V) this.f1686c.get(a2).getValue() : this.d.get(comparable);
    }

    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.f1686c.get(i2).hashCode();
        }
        return this.d.size() > 0 ? i + this.d.hashCode() : i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.a22<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    public int size() {
        return this.f1686c.size() + this.d.size();
    }
}
