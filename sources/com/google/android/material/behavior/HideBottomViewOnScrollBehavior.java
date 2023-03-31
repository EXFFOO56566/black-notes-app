package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f5847a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f5848b = 2;

    /* renamed from: c  reason: collision with root package name */
    private int f5849c = 0;
    private ViewPropertyAnimator d;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    public void a(V v) {
        if (this.f5848b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f5848b = 1;
            a(v, this.f5847a + this.f5849c, 175, b.c.b.b.l.a.f1256c);
        }
    }

    public void a(V v, int i) {
        this.f5849c = i;
        if (this.f5848b == 1) {
            v.setTranslationY((float) (this.f5847a + i));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            a(v);
        } else if (i2 < 0) {
            b(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f5847a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.a(coordinatorLayout, v, i);
    }

    public void b(V v) {
        if (this.f5848b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f5848b = 2;
            a(v, 0, 225, b.c.b.b.l.a.d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
