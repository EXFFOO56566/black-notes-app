package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class t0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f696c = new Object();
    private static ArrayList<WeakReference<t0>> d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f697a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f698b;

    private t0(Context context) {
        super(context);
        if (b1.b()) {
            b1 b1Var = new b1(this, context.getResources());
            this.f697a = b1Var;
            Resources.Theme newTheme = b1Var.newTheme();
            this.f698b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f697a = new v0(this, context.getResources());
        this.f698b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof t0) || (context.getResources() instanceof v0) || (context.getResources() instanceof b1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || b1.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f696c) {
            if (d == null) {
                d = new ArrayList<>();
            } else {
                for (int size = d.size() - 1; size >= 0; size--) {
                    WeakReference<t0> weakReference = d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        d.remove(size);
                    }
                }
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<t0> weakReference2 = d.get(size2);
                    t0 t0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (t0Var != null && t0Var.getBaseContext() == context) {
                        return t0Var;
                    }
                }
            }
            t0 t0Var2 = new t0(context);
            d.add(new WeakReference<>(t0Var2));
            return t0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f697a.getAssets();
    }

    public Resources getResources() {
        return this.f697a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f698b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f698b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
