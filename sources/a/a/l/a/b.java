package a.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* access modifiers changed from: package-private */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    private c f12b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f13c;
    private Drawable d;
    private Drawable e;
    private int f = 255;
    private boolean g;
    private int h = -1;
    private boolean i;
    private Runnable j;
    private long k;
    private long l;
    private C0002b m;

    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.b$b  reason: collision with other inner class name */
    public static class C0002b implements Drawable.Callback {

        /* renamed from: b  reason: collision with root package name */
        private Drawable.Callback f15b;

        C0002b() {
        }

        public C0002b a(Drawable.Callback callback) {
            this.f15b = callback;
            return this;
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f15b;
            this.f15b = null;
            return callback;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f15b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f15b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f16a;

        /* renamed from: b  reason: collision with root package name */
        Resources f17b;

        /* renamed from: c  reason: collision with root package name */
        int f18c = 160;
        int d;
        int e;
        SparseArray<Drawable.ConstantState> f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        c(c cVar, b bVar, Resources resources) {
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.f16a = bVar;
            this.f17b = resources != null ? resources : cVar != null ? cVar.f17b : null;
            int a2 = b.a(resources, cVar != null ? cVar.f18c : 0);
            this.f18c = a2;
            if (cVar != null) {
                this.d = cVar.d;
                this.e = cVar.e;
                this.v = true;
                this.w = true;
                this.i = cVar.i;
                this.l = cVar.l;
                this.x = cVar.x;
                this.y = cVar.y;
                this.z = cVar.z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.f18c == a2) {
                    if (cVar.j) {
                        this.k = new Rect(cVar.k);
                        this.j = true;
                    }
                    if (cVar.m) {
                        this.n = cVar.n;
                        this.o = cVar.o;
                        this.p = cVar.p;
                        this.q = cVar.q;
                        this.m = true;
                    }
                }
                if (cVar.r) {
                    this.s = cVar.s;
                    this.r = true;
                }
                if (cVar.t) {
                    this.u = cVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = cVar.g;
                this.g = new Drawable[drawableArr.length];
                this.h = cVar.h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f;
                this.f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.h);
                int i2 = this.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f.put(i3, constantState);
                        } else {
                            this.g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.g = new Drawable[10];
            this.h = 0;
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f16a);
            return mutate;
        }

        private void n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.g[this.f.keyAt(i2)] = b(this.f.valueAt(i2).newDrawable(this.f17b));
                }
                this.f = null;
            }
        }

        public final int a(Drawable drawable) {
            int i2 = this.h;
            if (i2 >= this.g.length) {
                a(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f16a);
            this.g[i2] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            k();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i2;
        }

        public final Drawable a(int i2) {
            int indexOfKey;
            Drawable drawable = this.g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable b2 = b(this.f.valueAt(indexOfKey).newDrawable(this.f17b));
            this.g[i2] = b2;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return b2;
        }

        public void a(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.g, 0, drawableArr, 0, i2);
            this.g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources.Theme theme) {
            if (theme != null) {
                n();
                int i2 = this.h;
                Drawable[] drawableArr = this.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                a(theme.getResources());
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources resources) {
            if (resources != null) {
                this.f17b = resources;
                int a2 = b.a(resources, this.f18c);
                int i2 = this.f18c;
                this.f18c = a2;
                if (i2 != a2) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final void a(boolean z2) {
            this.l = z2;
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            n();
            this.v = true;
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.m = true;
            n();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void b(int i2) {
            this.A = i2;
        }

        public final void b(boolean z2) {
            this.i = z2;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(int i2, int i3) {
            int i4 = this.h;
            Drawable[] drawableArr = this.g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z2 = layoutDirection;
                    }
                }
            }
            this.z = i2;
            return z2;
        }

        /* access modifiers changed from: package-private */
        public final int c() {
            return this.g.length;
        }

        public final void c(int i2) {
            this.B = i2;
        }

        public boolean canApplyTheme() {
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            return this.h;
        }

        public final int e() {
            if (!this.m) {
                b();
            }
            return this.o;
        }

        public final int f() {
            if (!this.m) {
                b();
            }
            return this.q;
        }

        public final int g() {
            if (!this.m) {
                b();
            }
            return this.p;
        }

        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Rect h() {
            Rect rect = null;
            if (this.i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            n();
            Rect rect2 = new Rect();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect2.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect2.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect2.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect2.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.j = true;
            this.k = rect;
            return rect;
        }

        public final int i() {
            if (!this.m) {
                b();
            }
            return this.n;
        }

        public final int j() {
            if (this.r) {
                return this.s;
            }
            n();
            int i2 = this.h;
            Drawable[] drawableArr = this.g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.r = false;
            this.t = false;
        }

        public final boolean l() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public abstract void m();
    }

    b() {
    }

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    private void a(Drawable drawable) {
        if (this.m == null) {
            this.m = new C0002b();
        }
        C0002b bVar = this.m;
        bVar.a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f12b.A <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            if (this.f12b.E) {
                drawable.setColorFilter(this.f12b.D);
            } else {
                if (this.f12b.H) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f12b.F);
                }
                if (this.f12b.I) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f12b.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f12b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f12b.C);
            }
            Rect rect = this.f13c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    private boolean c() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    /* access modifiers changed from: package-private */
    public c a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.f12b = cVar;
        int i2 = this.h;
        if (i2 >= 0) {
            Drawable a2 = cVar.a(i2);
            this.d = a2;
            if (a2 != null) {
                a(a2);
            }
        }
        this.e = null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Resources resources) {
        this.f12b.a(resources);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.l.a.b.a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r10) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.l.a.b.a(int):boolean");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f12b.a(theme);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.h;
    }

    public boolean canApplyTheme() {
        return this.f12b.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f12b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f12b.a()) {
            return null;
        }
        this.f12b.d = getChangingConfigurations();
        return this.f12b;
    }

    public Drawable getCurrent() {
        return this.d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f12b.l()) {
            return this.f12b.e();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f12b.l()) {
            return this.f12b.i();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f12b.l()) {
            return this.f12b.f();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f12b.l()) {
            return this.f12b.g();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f12b.j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h2 = this.f12b.h();
        if (h2 != null) {
            rect.set(h2);
            z = (h2.right | ((h2.left | h2.top) | h2.bottom)) != 0;
        } else {
            Drawable drawable = this.d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (c()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f12b;
        if (cVar != null) {
            cVar.k();
        }
        if (drawable == this.d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f12b.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.d.setAlpha(this.f);
            }
        }
        if (this.l != 0) {
            this.l = 0;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            c a2 = a();
            a2.m();
            a(a2);
            this.i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f12b.b(i2, b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.g || this.f != i2) {
            this.g = true;
            this.f = i2;
            Drawable drawable = this.d;
            if (drawable == null) {
                return;
            }
            if (this.k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        c cVar = this.f12b;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.a(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f12b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        c cVar = this.f12b;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f13c;
        if (rect == null) {
            this.f13c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f12b;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.a(this.d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f12b;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.a(this.d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
