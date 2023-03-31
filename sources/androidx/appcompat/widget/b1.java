package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

public class b1 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f606b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f607a;

    public b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f607a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f606b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f607a.get();
        return context != null ? m0.a().a(context, this, i) : super.getDrawable(i);
    }
}
