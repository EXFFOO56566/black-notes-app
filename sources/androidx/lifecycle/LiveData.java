package androidx.lifecycle;

import androidx.lifecycle.e;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object j = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f911a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private a.b.a.b.b<n<? super T>, LiveData<T>.b> f912b = new a.b.a.b.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f913c = 0;
    private volatile Object d = j;
    volatile Object e = j;
    private int f = -1;
    private boolean g;
    private boolean h;
    private final Runnable i = new a();

    /* access modifiers changed from: package-private */
    public class LifecycleBoundObserver extends LiveData<T>.b implements d {
        final h e;

        LifecycleBoundObserver(h hVar, n<? super T> nVar) {
            super(nVar);
            this.e = hVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.b
        public void a() {
            this.e.a().b(this);
        }

        @Override // androidx.lifecycle.f
        public void a(h hVar, e.a aVar) {
            if (this.e.a().a() == e.b.DESTROYED) {
                LiveData.this.a((n) this.f915a);
            } else {
                a(b());
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.b
        public boolean b() {
            return this.e.a().a().a(e.b.STARTED);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.lifecycle.LiveData.b
        public boolean g(h hVar) {
            return this.e == hVar;
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Object obj;
            synchronized (LiveData.this.f911a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.j;
            }
            LiveData.this.b(obj);
        }
    }

    /* access modifiers changed from: private */
    public abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final n<? super T> f915a;

        /* renamed from: b  reason: collision with root package name */
        boolean f916b;

        /* renamed from: c  reason: collision with root package name */
        int f917c = -1;

        b(n<? super T> nVar) {
            this.f915a = nVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            if (z != this.f916b) {
                this.f916b = z;
                int i = 1;
                boolean z2 = LiveData.this.f913c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f913c;
                if (!this.f916b) {
                    i = -1;
                }
                liveData.f913c = i2 + i;
                if (z2 && this.f916b) {
                    LiveData.this.c();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f913c == 0 && !this.f916b) {
                    liveData2.d();
                }
                if (this.f916b) {
                    LiveData.this.a((LiveData<T>.b) this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean b();

        /* access modifiers changed from: package-private */
        public boolean g(h hVar) {
            return false;
        }
    }

    private static void a(String str) {
        if (!a.b.a.a.a.b().a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f916b) {
            if (!bVar.b()) {
                bVar.a(false);
                return;
            }
            int i2 = bVar.f917c;
            int i3 = this.f;
            if (i2 < i3) {
                bVar.f917c = i3;
                bVar.f915a.a((Object) this.d);
            }
        }
    }

    public T a() {
        T t = (T) this.d;
        if (t != j) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(LiveData<T>.b bVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (bVar == null) {
                a.b.a.b.b<K, V>.d d2 = this.f912b.d();
                while (d2.hasNext()) {
                    b((LiveData<T>.b) ((b) ((Map.Entry) d2.next()).getValue()));
                    if (this.h) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public void a(h hVar, n<? super T> nVar) {
        a("observe");
        if (hVar.a().a() != e.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(hVar, nVar);
            LiveData<T>.b b2 = this.f912b.b(nVar, lifecycleBoundObserver);
            if (b2 != null && !b2.g(hVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b2 == null) {
                hVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(n<? super T> nVar) {
        a("removeObserver");
        LiveData<T>.b remove = this.f912b.remove(nVar);
        if (remove != null) {
            remove.a();
            remove.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        boolean z;
        synchronized (this.f911a) {
            z = this.e == j;
            this.e = t;
        }
        if (z) {
            a.b.a.a.a.b().b(this.i);
        }
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        a("setValue");
        this.f++;
        this.d = t;
        a((LiveData<T>.b) null);
    }

    public boolean b() {
        return this.f913c > 0;
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public void d() {
    }
}
