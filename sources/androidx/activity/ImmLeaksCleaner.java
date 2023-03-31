package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements f {

    /* renamed from: b  reason: collision with root package name */
    private static int f409b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f410c;
    private static Field d;
    private static Field e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f411a;

    ImmLeaksCleaner(Activity activity) {
        this.f411a = activity;
    }

    private static void a() {
        try {
            f409b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f410c = declaredField3;
            declaredField3.setAccessible(true);
            f409b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            if (f409b == 0) {
                a();
            }
            if (f409b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f411a.getSystemService("input_method");
                try {
                    Object obj = f410c.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) d.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            e.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused2) {
                            } catch (ClassCastException unused3) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
        }
    }
}
