package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f419a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f420b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.f419a = z;
    }

    public abstract void a();

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f420b.add(aVar);
    }

    public final void a(boolean z) {
        this.f419a = z;
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f420b.remove(aVar);
    }

    public final boolean b() {
        return this.f419a;
    }

    public final void c() {
        Iterator<a> it = this.f420b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
