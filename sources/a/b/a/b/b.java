package a.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    c<K, V> f54b;

    /* renamed from: c  reason: collision with root package name */
    private c<K, V> f55c;
    private WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    private int e = 0;

    /* access modifiers changed from: package-private */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.b.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        /* access modifiers changed from: package-private */
        @Override // a.b.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* renamed from: a.b.a.b.b$b  reason: collision with other inner class name */
    private static class C0004b<K, V> extends e<K, V> {
        C0004b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // a.b.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        /* access modifiers changed from: package-private */
        @Override // a.b.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final K f56b;

        /* renamed from: c  reason: collision with root package name */
        final V f57c;
        c<K, V> d;
        c<K, V> e;

        c(K k, V v) {
            this.f56b = k;
            this.f57c = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f56b.equals(cVar.f56b) && this.f57c.equals(cVar.f57c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f56b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f57c;
        }

        public int hashCode() {
            return this.f56b.hashCode() ^ this.f57c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f56b) + "=" + ((Object) this.f57c);
        }
    }

    /* access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private c<K, V> f58b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f59c = true;

        d() {
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f58b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.f58b = cVar3;
                this.f59c = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f59c) {
                return b.this.f54b != null;
            }
            c<K, V> cVar = this.f58b;
            return (cVar == null || cVar.d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f59c) {
                this.f59c = false;
                cVar = b.this.f54b;
            } else {
                c<K, V> cVar2 = this.f58b;
                cVar = cVar2 != null ? cVar2.d : null;
            }
            this.f58b = cVar;
            return this.f58b;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f60b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f61c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f60b = cVar2;
            this.f61c = cVar;
        }

        private c<K, V> a() {
            c<K, V> cVar = this.f61c;
            c<K, V> cVar2 = this.f60b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f60b == cVar && cVar == this.f61c) {
                this.f61c = null;
                this.f60b = null;
            }
            c<K, V> cVar2 = this.f60b;
            if (cVar2 == cVar) {
                this.f60b = b(cVar2);
            }
            if (this.f61c == cVar) {
                this.f61c = a();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f61c != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f61c;
            this.f61c = a();
            return cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k) {
        c<K, V> cVar = this.f54b;
        while (cVar != null && !cVar.f56b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.f55c;
        if (cVar2 == null) {
            this.f54b = cVar;
        } else {
            cVar2.d = cVar;
            cVar.e = cVar2;
        }
        this.f55c = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0004b bVar = new C0004b(this.f55c, this.f54b);
        this.d.put(bVar, false);
        return bVar;
    }

    public V b(K k, V v) {
        c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f57c;
        }
        a(k, v);
        return null;
    }

    public Map.Entry<K, V> b() {
        return this.f54b;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.d.put(dVar, false);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f55c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f54b, this.f55c);
        this.d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f<K, V> fVar : this.d.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.e;
        if (cVar != null) {
            cVar.d = a2.d;
        } else {
            this.f54b = a2.d;
        }
        c<K, V> cVar2 = a2.d;
        if (cVar2 != null) {
            cVar2.e = a2.e;
        } else {
            this.f55c = a2.e;
        }
        a2.d = null;
        a2.e = null;
        return a2.f57c;
    }

    public int size() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
