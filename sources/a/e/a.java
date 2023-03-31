package a.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {
    f<K, V> i;

    /* access modifiers changed from: package-private */
    /* renamed from: a.e.a$a  reason: collision with other inner class name */
    public class C0006a extends f<K, V> {
        C0006a() {
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public int a(Object obj) {
            return a.this.a(obj);
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public Object a(int i, int i2) {
            return a.this.f97c[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public V a(int i, V v) {
            return (V) a.this.a(i, v);
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public void a(int i) {
            a.this.c(i);
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public void a(K k, V v) {
            a.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public int b(Object obj) {
            return a.this.b(obj);
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public Map<K, V> b() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        @Override // a.e.f
        public int c() {
            return a.this.d;
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public a(g gVar) {
        super(gVar);
    }

    private f<K, V> b() {
        if (this.i == null) {
            this.i = new C0006a();
        }
        return this.i;
    }

    public boolean a(Collection<?> collection) {
        return f.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.e.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
