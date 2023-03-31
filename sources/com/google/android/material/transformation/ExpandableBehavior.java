package com.google.android.material.transformation;

import a.g.l.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.b.b.t.b;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    private int f6027a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6028b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6029c;
        final /* synthetic */ b d;

        a(View view, int i, b bVar) {
            this.f6028b = view;
            this.f6029c = i;
            this.d = bVar;
        }

        public boolean onPreDraw() {
            this.f6028b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f6027a == this.f6029c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.d;
                expandableBehavior.a((View) bVar, this.f6028b, bVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean a(boolean z) {
        if (!z) {
            return this.f6027a == 1;
        }
        int i = this.f6027a;
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        b e;
        if (u.C(view) || (e = e(coordinatorLayout, view)) == null || !a(e.a())) {
            return false;
        }
        int i2 = e.a() ? 1 : 2;
        this.f6027a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, e));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!a(bVar.a())) {
            return false;
        }
        this.f6027a = bVar.a() ? 1 : 2;
        return a((View) bVar, view, bVar.a(), true);
    }

    /* access modifiers changed from: protected */
    public b e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> b2 = coordinatorLayout.b(view);
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            View view2 = b2.get(i);
            if (a(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }
}
