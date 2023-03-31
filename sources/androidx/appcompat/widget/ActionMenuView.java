package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import androidx.recyclerview.widget.RecyclerView;

public class ActionMenuView extends i0 implements g.b, n {
    private int A;
    e B;
    private g q;
    private Context r;
    private int s;
    private boolean t;
    private c u;
    private m.a v;
    g.a w;
    private boolean x;
    private int y;
    private int z;

    public interface a {
        boolean a();

        boolean c();
    }

    /* access modifiers changed from: private */
    public static class b implements m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(g gVar) {
            return false;
        }
    }

    public static class c extends i0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f557c;
        @ViewDebug.ExportedProperty
        public int d;
        @ViewDebug.ExportedProperty
        public int e;
        @ViewDebug.ExportedProperty
        public boolean f;
        @ViewDebug.ExportedProperty
        public boolean g;
        boolean h;

        public c(int i, int i2) {
            super(i, i2);
            this.f557c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f557c = cVar.f557c;
        }
    }

    /* access modifiers changed from: private */
    public class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(g gVar) {
            g.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f);
        this.A = (int) (f * 4.0f);
        this.r = context;
        this.s = 0;
    }

    static int a(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = true;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.d();
        int i5 = 2;
        if (i2 <= 0 || (z3 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z3 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f557c || !z3) {
            z2 = false;
        }
        cVar.f = z2;
        cVar.d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.c(int, int):void");
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar) {
        this.q = gVar;
    }

    public void a(m.a aVar, g.a aVar2) {
        this.v = aVar;
        this.w = aVar2;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.q.a(iVar, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public void d() {
        c cVar = this.u;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).c();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public c e() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f557c = true;
        return generateDefaultLayoutParams;
    }

    public boolean f() {
        c cVar = this.u;
        return cVar != null && cVar.e();
    }

    public boolean g() {
        c cVar = this.u;
        return cVar != null && cVar.g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0, androidx.appcompat.widget.i0
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f640b = 16;
        return cVar;
    }

    @Override // android.view.ViewGroup, androidx.appcompat.widget.i0, androidx.appcompat.widget.i0
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, androidx.appcompat.widget.i0, androidx.appcompat.widget.i0
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f640b <= 0) {
            cVar.f640b = 16;
        }
        return cVar;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.q = gVar;
            gVar.a(new d());
            c cVar = new c(context);
            this.u = cVar;
            cVar.c(true);
            c cVar2 = this.u;
            m.a aVar = this.v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.a(aVar);
            this.q.a(this.u, this.r);
            this.u.a(this);
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.u.d();
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public boolean h() {
        c cVar = this.u;
        return cVar != null && cVar.h();
    }

    public boolean i() {
        return this.t;
    }

    public g j() {
        return this.q;
    }

    public boolean k() {
        c cVar = this.u;
        return cVar != null && cVar.i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.u;
        if (cVar != null) {
            cVar.a(false);
            if (this.u.h()) {
                this.u.e();
                this.u.i();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.x) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = c1.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f557c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (d(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    d(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a2) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f557c) {
                    int i17 = width - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f557c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0
    public void onMeasure(int i, int i2) {
        g gVar;
        boolean z2 = this.x;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.x = z3;
        if (z2 != z3) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.x || (gVar = this.q) == null || size == this.y)) {
            this.y = size;
            gVar.b(true);
        }
        int childCount = getChildCount();
        if (!this.x || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                c cVar = (c) getChildAt(i3).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.u.b(z2);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.u.a(drawable);
    }

    public void setOverflowReserved(boolean z2) {
        this.t = z2;
    }

    public void setPopupTheme(int i) {
        if (this.s != i) {
            this.s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.u = cVar;
        cVar.a(this);
    }
}
