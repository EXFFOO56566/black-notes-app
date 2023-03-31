package androidx.lifecycle;

import androidx.lifecycle.e;

/* access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c[] f906a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f906a = cVarArr;
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        l lVar = new l();
        for (c cVar : this.f906a) {
            cVar.a(hVar, aVar, false, lVar);
        }
        for (c cVar2 : this.f906a) {
            cVar2.a(hVar, aVar, true, lVar);
        }
    }
}
