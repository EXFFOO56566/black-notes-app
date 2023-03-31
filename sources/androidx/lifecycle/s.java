package androidx.lifecycle;

import java.util.HashMap;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, q> f943a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public final q a(String str) {
        return this.f943a.get(str);
    }

    public final void a() {
        for (q qVar : this.f943a.values()) {
            qVar.a();
        }
        this.f943a.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, q qVar) {
        q put = this.f943a.put(str, qVar);
        if (put != null) {
            put.b();
        }
    }
}
