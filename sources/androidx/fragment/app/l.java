package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public class l extends q {
    private static final r.a h = new a();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<Fragment> f869b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, l> f870c = new HashMap<>();
    private final HashMap<String, s> d = new HashMap<>();
    private final boolean e;
    private boolean f = false;
    private boolean g = false;

    static class a implements r.a {
        a() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends q> T a(Class<T> cls) {
            return new l(true);
        }
    }

    l(boolean z) {
        this.e = z;
    }

    static l a(s sVar) {
        return (l) new r(sVar, h).a(l.class);
    }

    /* access modifiers changed from: package-private */
    public boolean a(Fragment fragment) {
        return this.f869b.add(fragment);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.q
    public void b() {
        if (j.I) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment) {
        if (j.I) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f870c.get(fragment.f);
        if (lVar != null) {
            lVar.b();
            this.f870c.remove(fragment.f);
        }
        s sVar = this.d.get(fragment.f);
        if (sVar != null) {
            sVar.a();
            this.d.remove(fragment.f);
        }
    }

    /* access modifiers changed from: package-private */
    public l c(Fragment fragment) {
        l lVar = this.f870c.get(fragment.f);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.e);
        this.f870c.put(fragment.f, lVar2);
        return lVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> c() {
        return this.f869b;
    }

    /* access modifiers changed from: package-private */
    public s d(Fragment fragment) {
        s sVar = this.d.get(fragment.f);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s();
        this.d.put(fragment.f, sVar2);
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public boolean e(Fragment fragment) {
        return this.f869b.remove(fragment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f869b.equals(lVar.f869b) && this.f870c.equals(lVar.f870c) && this.d.equals(lVar.d);
    }

    /* access modifiers changed from: package-private */
    public boolean f(Fragment fragment) {
        if (!this.f869b.contains(fragment)) {
            return true;
        }
        return this.e ? this.f : !this.g;
    }

    public int hashCode() {
        return (((this.f869b.hashCode() * 31) + this.f870c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f869b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f870c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
