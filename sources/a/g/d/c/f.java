package a.g.d.c;

import a.g.k.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

public final class f {

    public static abstract class a {

        /* access modifiers changed from: package-private */
        /* renamed from: a.g.d.c.f$a$a  reason: collision with other inner class name */
        public class RunnableC0008a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Typeface f114b;

            RunnableC0008a(Typeface typeface) {
                this.f114b = typeface;
            }

            public void run() {
                a.this.a(this.f114b);
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f116b;

            b(int i) {
                this.f116b = i;
            }

            public void run() {
                a.this.a(this.f116b);
            }
        }

        public abstract void a(int i);

        public final void a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i));
        }

        public abstract void a(Typeface typeface);

        public final void a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0008a(typeface));
        }
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, new TypedValue(), 0, null, null, false);
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, typedValue, i2, aVar, null, true);
    }

    private static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a2 = a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a2 != null || aVar != null) {
            return a2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, a.g.d.c.f.a r20, android.os.Handler r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.d.c.f.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, a.g.d.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    public static void a(Context context, int i, a aVar, Handler handler) {
        h.a(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            a(context, i, new TypedValue(), 0, aVar, handler, false);
        }
    }
}
