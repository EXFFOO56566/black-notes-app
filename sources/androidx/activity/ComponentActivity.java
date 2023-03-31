package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.e;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends e implements h, t, androidx.savedstate.b, c {

    /* renamed from: c  reason: collision with root package name */
    private final i f403c = new i(this);
    private final androidx.savedstate.a d = androidx.savedstate.a.a(this);
    private s e;
    private final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());
    private int g;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        Object f407a;

        /* renamed from: b  reason: collision with root package name */
        s f408b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                a().a(new f() {
                    /* class androidx.activity.ComponentActivity.AnonymousClass2 */

                    @Override // androidx.lifecycle.f
                    public void a(h hVar, e.a aVar) {
                        if (aVar == e.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            a().a(new f() {
                /* class androidx.activity.ComponentActivity.AnonymousClass3 */

                @Override // androidx.lifecycle.f
                public void a(h hVar, e.a aVar) {
                    if (aVar == e.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.e().a();
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                a().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.e a() {
        return this.f403c;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher b() {
        return this.f;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.d.a();
    }

    @Override // androidx.lifecycle.t
    public s e() {
        if (getApplication() != null) {
            if (this.e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.e = bVar.f408b;
                }
                if (this.e == null) {
                    this.e = new s();
                }
            }
            return this.e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object f() {
        return null;
    }

    public void onBackPressed() {
        this.f.a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a(bundle);
        p.a(this);
        int i = this.g;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object f2 = f();
        s sVar = this.e;
        if (sVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            sVar = bVar.f408b;
        }
        if (sVar == null && f2 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f407a = f2;
        bVar2.f408b = sVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.e a2 = a();
        if (a2 instanceof i) {
            ((i) a2).b(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }
}
