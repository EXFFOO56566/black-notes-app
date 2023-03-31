package androidx.appcompat.widget;

import a.e.h;
import a.n.a.a.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class m0 {
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static m0 i;
    private static final c j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, h<ColorStateList>> f660a;

    /* renamed from: b  reason: collision with root package name */
    private a.e.a<String, d> f661b;

    /* renamed from: c  reason: collision with root package name */
    private h<String> f662c;
    private final WeakHashMap<Context, a.e.d<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private e g;

    /* access modifiers changed from: package-private */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.a.l.a.a.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.n.a.a.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c extends a.e.e<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) b(Integer.valueOf(b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) a(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
        }
    }

    /* access modifiers changed from: private */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* access modifiers changed from: package-private */
    public interface e {
        ColorStateList a(Context context, int i);

        PorterDuff.Mode a(int i);

        Drawable a(m0 m0Var, Context context, int i);

        boolean a(Context context, int i, Drawable drawable);

        boolean b(Context context, int i, Drawable drawable);
    }

    /* access modifiers changed from: private */
    public static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (m0.class) {
            a2 = j.a(i2, mode);
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                j.a(i2, mode, a2);
            }
        }
        return a2;
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i3 = androidx.core.graphics.drawable.a.i(drawable);
            androidx.core.graphics.drawable.a.a(i3, b2);
            PorterDuff.Mode a2 = a(i2);
            if (a2 == null) {
                return i3;
            }
            androidx.core.graphics.drawable.a.a(i3, a2);
            return i3;
        }
        e eVar = this.g;
        if ((eVar == null || !eVar.b(context, i2, drawable)) && !a(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private synchronized Drawable a(Context context, long j2) {
        a.e.d<WeakReference<Drawable.ConstantState>> dVar = this.d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> b2 = dVar.b(j2);
        if (b2 != null) {
            Drawable.ConstantState constantState = b2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.a(j2);
        }
        return null;
    }

    public static synchronized m0 a() {
        m0 m0Var;
        synchronized (m0.class) {
            if (i == null) {
                m0 m0Var2 = new m0();
                i = m0Var2;
                a(m0Var2);
            }
            m0Var = i;
        }
        return m0Var;
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.f660a == null) {
            this.f660a = new WeakHashMap<>();
        }
        h<ColorStateList> hVar = this.f660a.get(context);
        if (hVar == null) {
            hVar = new h<>();
            this.f660a.put(context, hVar);
        }
        hVar.a(i2, colorStateList);
    }

    static void a(Drawable drawable, u0 u0Var, int[] iArr) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            if (u0Var.d || u0Var.f702c) {
                drawable.setColorFilter(a(u0Var.d ? u0Var.f700a : null, u0Var.f702c ? u0Var.f701b : h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    private static void a(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new f());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
        }
    }

    private void a(String str, d dVar) {
        if (this.f661b == null) {
            this.f661b = new a.e.a<>();
        }
        this.f661b.put(str, dVar);
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            a.e.d<WeakReference<Drawable.ConstantState>> dVar = this.d.get(context);
            if (dVar == null) {
                dVar = new a.e.d<>();
                this.d.put(context, dVar);
            }
            dVar.c(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private static boolean a(Drawable drawable) {
        return (drawable instanceof i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private void b(Context context) {
        if (!this.f) {
            this.f = true;
            Drawable a2 = a(context, a.a.m.a.abc_vector_test);
            if (a2 == null || !a(a2)) {
                this.f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        e eVar = this.g;
        Drawable a4 = eVar == null ? null : eVar.a(this, context, i2);
        if (a4 != null) {
            a4.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, a2, a4);
        }
        return a4;
    }

    private ColorStateList d(Context context, int i2) {
        h<ColorStateList> hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.f660a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.a(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable e(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode a(int i2) {
        e eVar = this.g;
        if (eVar == null) {
            return null;
        }
        return eVar.a(i2);
    }

    public synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, int i2, boolean z) {
        Drawable e2;
        b(context);
        e2 = e(context, i2);
        if (e2 == null) {
            e2 = c(context, i2);
        }
        if (e2 == null) {
            e2 = a.g.d.a.c(context, i2);
        }
        if (e2 != null) {
            e2 = a(context, i2, z, e2);
        }
        if (e2 != null) {
            e0.b(e2);
        }
        return e2;
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, b1 b1Var, int i2) {
        Drawable e2 = e(context, i2);
        if (e2 == null) {
            e2 = b1Var.a(i2);
        }
        if (e2 == null) {
            return null;
        }
        return a(context, i2, false, e2);
    }

    public synchronized void a(Context context) {
        a.e.d<WeakReference<Drawable.ConstantState>> dVar = this.d.get(context);
        if (dVar != null) {
            dVar.a();
        }
    }

    public synchronized void a(e eVar) {
        this.g = eVar;
    }

    /* access modifiers changed from: package-private */
    public boolean a(Context context, int i2, Drawable drawable) {
        e eVar = this.g;
        return eVar != null && eVar.a(context, i2, drawable);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList b(Context context, int i2) {
        ColorStateList d2;
        d2 = d(context, i2);
        if (d2 == null) {
            d2 = this.g == null ? null : this.g.a(context, i2);
            if (d2 != null) {
                a(context, i2, d2);
            }
        }
        return d2;
    }
}
