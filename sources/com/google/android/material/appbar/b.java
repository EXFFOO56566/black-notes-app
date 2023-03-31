package com.google.android.material.appbar;

import a.g.g.a;
import a.g.l.c0;
import a.g.l.d;
import a.g.l.u;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

abstract class b extends c<View> {
    final Rect d = new Rect();
    final Rect e = new Rect();
    private int f = 0;
    private int g;

    public b() {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int a(View view) {
        if (this.g == 0) {
            return 0;
        }
        float b2 = b(view);
        int i = this.g;
        return a.a((int) (b2 * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    public abstract View a(List<View> list);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a2;
        c0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (a2 = a(coordinatorLayout.b(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (u.l(a2) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.d() + lastWindowInsets.a();
        }
        int c2 = size + c(a2);
        int measuredHeight = a2.getMeasuredHeight();
        if (e()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            c2 -= measuredHeight;
        }
        coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec(c2, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract float b(View view);

    public final void b(int i) {
        this.g = i;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View a2 = a(coordinatorLayout.b(view));
        if (a2 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, a2.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + a2.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            c0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && u.l(coordinatorLayout) && !u.l(view)) {
                rect.left += lastWindowInsets.b();
                rect.right -= lastWindowInsets.c();
            }
            Rect rect2 = this.e;
            d.a(c(fVar.f752c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a3 = a(a2);
            view.layout(rect2.left, rect2.top - a3, rect2.right, rect2.bottom - a3);
            i2 = rect2.top - a2.getBottom();
        } else {
            super.b(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f = i2;
    }

    public final int c() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public int c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return false;
    }
}
