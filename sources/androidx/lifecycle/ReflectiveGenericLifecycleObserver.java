package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.e;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f918a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0046a f919b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f918a = obj;
        this.f919b = a.f921c.a(obj.getClass());
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        this.f919b.a(hVar, aVar, this.f918a);
    }
}
