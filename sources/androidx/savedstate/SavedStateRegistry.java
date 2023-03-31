package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a  reason: collision with root package name */
    private a.b.a.b.b<String, b> f1112a = new a.b.a.b.b<>();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f1113b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1114c;
    boolean d;

    public interface a {
        void a(b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (this.f1114c) {
            Bundle bundle = this.f1113b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1113b.remove(str);
            if (this.f1113b.isEmpty()) {
                this.f1113b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1113b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.b.a.b.b<K, V>.d d2 = this.f1112a.d();
        while (d2.hasNext()) {
            Map.Entry entry = (Map.Entry) d2.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar, Bundle bundle) {
        if (!this.f1114c) {
            if (bundle != null) {
                this.f1113b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            eVar.a(new d() {
                /* class androidx.savedstate.SavedStateRegistry.AnonymousClass1 */

                @Override // androidx.lifecycle.f
                public void a(h hVar, e.a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == e.a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar == e.a.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.d = z;
                }
            });
            this.f1114c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
}
