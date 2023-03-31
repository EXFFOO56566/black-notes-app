package a.g.l;

import android.os.Build;
import android.view.WindowInsets;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f210a;

    private c0(Object obj) {
        this.f210a = obj;
    }

    static c0 a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c0(obj);
    }

    static Object a(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        return c0Var.f210a;
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f210a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public c0 a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new c0(((WindowInsets) this.f210a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f210a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f210a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f210a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f210a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f210a;
        Object obj3 = ((c0) obj).f210a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f210a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
