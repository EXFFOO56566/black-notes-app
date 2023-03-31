package b.c.b.b.z;

import android.graphics.drawable.Drawable;
import android.view.View;

public class h {
    static d a() {
        return new j();
    }

    static d a(int i) {
        return i != 0 ? i != 1 ? a() : new e() : new j();
    }

    public static void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            a(view, (g) background);
        }
    }

    public static void a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).a(f);
        }
    }

    public static void a(View view, g gVar) {
        if (gVar.q()) {
            gVar.c(com.google.android.material.internal.h.a(view));
        }
    }

    static f b() {
        return new f();
    }
}
