package a.m;

import a.g.l.u;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* access modifiers changed from: package-private */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f311a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f312b = new a(Float.class, "translationAlpha");

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            c0.a(view, f.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return u.i(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            u.a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f311a = i >= 29 ? new h0() : i >= 23 ? new g0() : i >= 22 ? new f0() : i >= 21 ? new e0() : i >= 19 ? new d0() : new i0();
        new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f311a.a(view);
    }

    static void a(View view, float f) {
        f311a.a(view, f);
    }

    static void a(View view, int i) {
        f311a.a(view, i);
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        f311a.a(view, i, i2, i3, i4);
    }

    static void a(View view, Matrix matrix) {
        f311a.a(view, matrix);
    }

    static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.c(view);
    }

    static void b(View view, Matrix matrix) {
        f311a.b(view, matrix);
    }

    static float c(View view) {
        return f311a.b(view);
    }

    static m0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new l0(view) : new k0(view.getWindowToken());
    }

    static void e(View view) {
        f311a.c(view);
    }
}
