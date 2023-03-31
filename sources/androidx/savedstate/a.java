package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f1116a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f1117b = new SavedStateRegistry();

    private a(b bVar) {
        this.f1116a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry a() {
        return this.f1117b;
    }

    public void a(Bundle bundle) {
        e a2 = this.f1116a.a();
        if (a2.a() == e.b.INITIALIZED) {
            a2.a(new Recreator(this.f1116a));
            this.f1117b.a(a2, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        this.f1117b.a(bundle);
    }
}
