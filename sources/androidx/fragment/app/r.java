package androidx.fragment.app;

import androidx.lifecycle.e;
import androidx.lifecycle.h;
import androidx.lifecycle.i;

/* access modifiers changed from: package-private */
public class r implements h {

    /* renamed from: b  reason: collision with root package name */
    private i f905b = null;

    r() {
    }

    @Override // androidx.lifecycle.h
    public e a() {
        d();
        return this.f905b;
    }

    /* access modifiers changed from: package-private */
    public void a(e.a aVar) {
        this.f905b.a(aVar);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f905b == null) {
            this.f905b = new i(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f905b != null;
    }
}
