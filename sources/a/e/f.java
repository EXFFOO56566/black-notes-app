package a.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* access modifiers changed from: package-private */
public abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    f<K, V>.b f86a;

    /* renamed from: b  reason: collision with root package name */
    f<K, V>.c f87b;

    /* renamed from: c  reason: collision with root package name */
    f<K, V>.e f88c;

    final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        final int f89b;

        /* renamed from: c  reason: collision with root package name */
        int f90c;
        int d;
        boolean e = false;

        a(int i) {
            this.f89b = i;
            this.f90c = f.this.c();
        }

        public boolean hasNext() {
            return this.d < this.f90c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) f.this.a(this.d, this.f89b);
                this.d++;
                this.e = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.e) {
                int i = this.d - 1;
                this.d = i;
                this.f90c--;
                this.e = false;
                f.this.a(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Map.Entry) obj);
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.e.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c2 = f.this.c();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.a(entry.getKey(), entry.getValue());
            }
            return c2 != f.this.c();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = f.this.a(entry.getKey());
            if (a2 < 0) {
                return false;
            }
            return c.a(f.this.a(a2, 1), entry.getValue());
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return f.a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c2 = f.this.c() - 1; c2 >= 0; c2--) {
                Object a2 = f.this.a(c2, 0);
                Object a3 = f.this.a(c2, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return f.this.c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.a(obj) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return f.a((Map) f.this.b(), collection);
        }

        public boolean equals(Object obj) {
            return f.a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c2 = f.this.c() - 1; c2 >= 0; c2--) {
                Object a2 = f.this.a(c2, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return f.this.c() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int a2 = f.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            f.this.a(a2);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return f.b(f.this.b(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return f.c(f.this.b(), collection);
        }

        public int size() {
            return f.this.c();
        }

        public Object[] toArray() {
            return f.this.b(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.a(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        int f93b;

        /* renamed from: c  reason: collision with root package name */
        int f94c;
        boolean d = false;

        d() {
            this.f93b = f.this.c() - 1;
            this.f94c = -1;
        }

        public boolean equals(Object obj) {
            if (!this.d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return c.a(entry.getKey(), f.this.a(this.f94c, 0)) && c.a(entry.getValue(), f.this.a(this.f94c, 1));
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.d) {
                return (K) f.this.a(this.f94c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.d) {
                return (V) f.this.a(this.f94c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f94c < this.f93b;
        }

        public int hashCode() {
            if (this.d) {
                int i = 0;
                Object a2 = f.this.a(this.f94c, 0);
                Object a3 = f.this.a(this.f94c, 1);
                int hashCode = a2 == null ? 0 : a2.hashCode();
                if (a3 != null) {
                    i = a3.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f94c++;
                this.d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                f.this.a(this.f94c);
                this.f94c--;
                this.f93b--;
                this.d = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.d) {
                return (V) f.this.a(this.f94c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int b2 = f.this.b(obj);
            if (b2 < 0) {
                return false;
            }
            f.this.a(b2);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int c2 = f.this.c();
            int i = 0;
            boolean z = false;
            while (i < c2) {
                if (collection.contains(f.this.a(i, 1))) {
                    f.this.a(i);
                    i--;
                    c2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int c2 = f.this.c();
            int i = 0;
            boolean z = false;
            while (i < c2) {
                if (!collection.contains(f.this.a(i, 1))) {
                    f.this.a(i);
                    i--;
                    c2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return f.this.c();
        }

        public Object[] toArray() {
            return f.this.b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.a(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract V a(int i, V v);

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(K k, V v);

    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] a(T[] tArr, int i) {
        int c2 = c();
        if (tArr.length < c2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), c2));
        }
        for (int i2 = 0; i2 < c2; i2++) {
            tArr[i2] = a(i2, i);
        }
        if (tArr.length > c2) {
            tArr[c2] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    public Object[] b(int i) {
        int c2 = c();
        Object[] objArr = new Object[c2];
        for (int i2 = 0; i2 < c2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    public abstract int c();

    public Set<Map.Entry<K, V>> d() {
        if (this.f86a == null) {
            this.f86a = new b();
        }
        return this.f86a;
    }

    public Set<K> e() {
        if (this.f87b == null) {
            this.f87b = new c();
        }
        return this.f87b;
    }

    public Collection<V> f() {
        if (this.f88c == null) {
            this.f88c = new e();
        }
        return this.f88c;
    }
}
