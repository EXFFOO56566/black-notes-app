package androidx.appcompat.widget;

import a.a.f;
import a.g.l.n;
import a.g.l.o;
import a.g.l.p;
import a.g.l.q;
import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;

public class ActionBarOverlayLayout extends ViewGroup implements c0, p, n, o {
    static final int[] C = {a.a.a.actionBarSize, 16842841};
    private final Runnable A;
    private final q B;

    /* renamed from: b  reason: collision with root package name */
    private int f552b;

    /* renamed from: c  reason: collision with root package name */
    private int f553c;
    private ContentFrameLayout d;
    ActionBarContainer e;
    private d0 f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private d v;
    private OverScroller w;
    ViewPropertyAnimator x;
    final AnimatorListenerAdapter y;
    private final Runnable z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = null;
            actionBarOverlayLayout.l = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.x = actionBarOverlayLayout.e.animate().translationY((float) (-ActionBarOverlayLayout.this.e.getHeight())).setListener(ActionBarOverlayLayout.this.y);
        }
    }

    public interface d {
        void a();

        void a(boolean z);

        void b();

        void c();

        void d();

        void onWindowVisibilityChanged(int i);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f553c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.y = new a();
        this.z = new b();
        this.A = new c();
        a(context);
        this.B = new q(this);
    }

    private d0 a(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        boolean z2 = false;
        this.f552b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.h = z2;
        this.w = new OverScroller(context);
    }

    private boolean a(float f2, float f3) {
        this.w.fling(0, 0, 0, (int) f3, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.w.getFinalY() > this.e.getHeight();
    }

    private boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || ((ViewGroup.MarginLayoutParams) eVar).leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i5;
            z6 = true;
        }
        if (z3 && ((ViewGroup.MarginLayoutParams) eVar).topMargin != (i4 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z6 = true;
        }
        if (z5 && ((ViewGroup.MarginLayoutParams) eVar).rightMargin != (i3 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i3;
            z6 = true;
        }
        if (!z4 || ((ViewGroup.MarginLayoutParams) eVar).bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i2;
        return true;
    }

    private void k() {
        h();
        this.A.run();
    }

    private void l() {
        h();
        postDelayed(this.A, 600);
    }

    private void m() {
        h();
        postDelayed(this.z, 600);
    }

    private void n() {
        h();
        this.z.run();
    }

    @Override // androidx.appcompat.widget.c0
    public void a(int i2) {
        j();
        if (i2 == 2) {
            this.f.l();
        } else if (i2 == 5) {
            this.f.m();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, m.a aVar) {
        j();
        this.f.a(menu, aVar);
    }

    @Override // a.g.l.n
    public void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a.g.l.n
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // a.g.l.o
    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(view, i2, i3, i4, i5, i6);
    }

    @Override // a.g.l.n
    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // a.g.l.n
    public void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public boolean a() {
        j();
        return this.f.a();
    }

    @Override // androidx.appcompat.widget.c0
    public void b() {
        j();
        this.f.b();
    }

    @Override // a.g.l.n
    public boolean b(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean c() {
        j();
        return this.f.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean d() {
        j();
        return this.f.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g != null && !this.h) {
            int bottom = this.e.getVisibility() == 0 ? (int) (((float) this.e.getBottom()) + this.e.getTranslationY() + 0.5f) : 0;
            this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
            this.g.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        j();
        return this.f.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        j();
        return this.f.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        j();
        int v2 = u.v(this) & 256;
        boolean a2 = a((View) this.e, rect, true, true, false, true);
        this.r.set(rect);
        c1.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            a2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.c0
    public void g() {
        j();
        this.f.g();
    }

    /* access modifiers changed from: protected */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        j();
        return this.f.getTitle();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean i() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (this.d == null) {
            this.d = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.e = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f = a(findViewById(f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        u.H(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        j();
        measureChildWithMargins(this.e, i2, 0, i3, 0);
        e eVar = (e) this.e.getLayoutParams();
        int max = Math.max(0, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.e.getMeasuredState());
        boolean z2 = (u.v(this) & 256) != 0;
        if (z2) {
            i4 = this.f552b;
            if (this.j && this.e.getTabContainer() != null) {
                i4 += this.f552b;
            }
        } else {
            i4 = this.e.getVisibility() != 8 ? this.e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.t.set(this.r);
        Rect rect = (this.i || z2) ? this.t : this.q;
        rect.top += i4;
        rect.bottom += 0;
        a((View) this.d, this.q, true, true, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.d.a(this.t);
        }
        measureChildWithMargins(this.d, i2, 0, i3, 0);
        e eVar2 = (e) this.d.getLayoutParams();
        int max3 = Math.max(max, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // a.g.l.p
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.k || !z2) {
            return false;
        }
        if (a(f2, f3)) {
            k();
        } else {
            n();
        }
        this.l = true;
        return true;
    }

    @Override // a.g.l.p
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // a.g.l.p
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // a.g.l.p
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.m + i3;
        this.m = i6;
        setActionBarHideOffset(i6);
    }

    @Override // a.g.l.p
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.a(view, view2, i2);
        this.m = getActionBarHideOffset();
        h();
        d dVar = this.v;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // a.g.l.p
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // a.g.l.p
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.e.getHeight()) {
                m();
            } else {
                l();
            }
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.c();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        j();
        int i3 = this.n ^ i2;
        this.n = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        d dVar = this.v;
        if (dVar != null) {
            dVar.a(!z2);
            if (z3 || !z2) {
                this.v.a();
            } else {
                this.v.d();
            }
        }
        if ((i3 & 256) != 0 && this.v != null) {
            u.H(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f553c = i2;
        d dVar = this.v;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i2);
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.v = dVar;
        if (getWindowToken() != null) {
            this.v.onWindowVisibilityChanged(this.f553c);
            int i2 = this.n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                u.H(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.k) {
            this.k = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        j();
        this.f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        j();
        this.f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        j();
        this.f.c(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.i = z2;
        this.h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        j();
        this.f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        j();
        this.f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
