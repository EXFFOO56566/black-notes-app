package a.g.e;

import a.e.e;
import a.g.d.c.c;
import a.g.d.c.f;
import a.g.i.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final h f122a;

    /* renamed from: b  reason: collision with root package name */
    private static final e<String, Typeface> f123b = new e<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        f122a = i >= 28 ? new g() : i >= 26 ? new f() : (i < 24 || !e.a()) ? Build.VERSION.SDK_INT >= 21 ? new d() : new h() : new e();
    }

    public static Typeface a(Context context, c.a aVar, Resources resources, int i, int i2, f.a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = b.a(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typeface = f122a.a(context, (c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.a(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f123b.a(a(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f122a.a(context, resources, i, str, i2);
        if (a2 != null) {
            f123b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface b2;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (b2 = b(context, typeface, i)) == null) ? Typeface.create(typeface, i) : b2;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        return f122a.a(context, cancellationSignal, fVarArr, i);
    }

    private static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    private static Typeface b(Context context, Typeface typeface, int i) {
        c.b a2 = f122a.a(typeface);
        if (a2 == null) {
            return null;
        }
        return f122a.a(context, a2, context.getResources(), i);
    }

    public static Typeface b(Resources resources, int i, int i2) {
        return f123b.b(a(resources, i, i2));
    }
}
