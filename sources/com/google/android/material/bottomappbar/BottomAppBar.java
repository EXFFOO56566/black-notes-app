package com.google.android.material.bottomappbar;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.b.b.l.k;
import b.c.b.b.z.h;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private final int Q;
    private final b.c.b.b.z.g R;
    private Animator S;
    private Animator T;
    private int U;
    private int V;
    private boolean W;
    private int a0;
    private ArrayList<f> b0;
    private boolean c0;
    private Behavior d0;
    private int e0;
    AnimatorListenerAdapter f0;
    k<FloatingActionButton> g0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect e = new Rect();
        private WeakReference<BottomAppBar> f;
        private int g;
        private final View.OnLayoutChangeListener h = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.b(Behavior.this.e);
                int height = Behavior.this.e.height();
                bottomAppBar.b(height);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.g == 0) {
                    int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(b.c.b.b.d.mtrl_bottomappbar_fab_bottom_margin);
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f = new WeakReference<>(bottomAppBar);
            View p = bottomAppBar.p();
            if (p != null && !u.C(p)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) p.getLayoutParams();
                fVar.d = 49;
                this.g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (p instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) p;
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    bottomAppBar.a((BottomAppBar) floatingActionButton);
                }
                bottomAppBar.s();
            }
            coordinatorLayout.c(bottomAppBar, i);
            return super.a(coordinatorLayout, (View) bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5861a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m();
            }
        }

        b(int i) {
            this.f5861a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.c((BottomAppBar) this.f5861a));
            floatingActionButton.b(new a());
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m();
            BottomAppBar.this.T = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n();
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f5866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5867c;
        final /* synthetic */ boolean d;

        d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f5866b = actionMenuView;
            this.f5867c = i;
            this.d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5865a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5865a) {
                BottomAppBar.this.b(this.f5866b, this.f5867c, this.d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f0.onAnimationStart(animator);
            FloatingActionButton o = BottomAppBar.this.o();
            if (o != null) {
                o.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public interface f {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* access modifiers changed from: package-private */
    public static class g extends a.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        int d;
        boolean e;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    private void a(int i, boolean z) {
        if (u.C(this)) {
            Animator animator = this.T;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!q()) {
                i = 0;
                z = false;
            }
            a(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.T = animatorSet;
            animatorSet.addListener(new c());
            this.T.start();
        }
    }

    private void a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - ((float) a(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.addListener(new d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.a(this.f0);
        floatingActionButton.b(new e());
        floatingActionButton.a(this.g0);
    }

    private void b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o(), "translationX", c(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) a(actionMenuView, i, z));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float c(int i) {
        int i2 = 1;
        boolean z = u.o(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.Q;
        if (z) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    private void d(int i) {
        if (this.U != i && u.C(this)) {
            Animator animator = this.S;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.V == 1) {
                b(i, arrayList);
            } else {
                a(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.S = animatorSet;
            animatorSet.addListener(new a());
            this.S.start();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getBottomInset() {
        return this.e0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getFabTranslationX() {
        return c(this.U);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().a();
    }

    private a getTopEdgeTreatment() {
        return (a) this.R.k().h();
    }

    private void l() {
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.S;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m() {
        ArrayList<f> arrayList;
        int i = this.a0 - 1;
        this.a0 = i;
        if (i == 0 && (arrayList = this.b0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void n() {
        ArrayList<f> arrayList;
        int i = this.a0;
        this.a0 = i + 1;
        if (i == 0 && (arrayList = this.b0) != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private FloatingActionButton o() {
        View p = p();
        if (p instanceof FloatingActionButton) {
            return (FloatingActionButton) p;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View p() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.c(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.p():android.view.View");
    }

    private boolean q() {
        FloatingActionButton o = o();
        return o != null && o.c();
    }

    private void r() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!q()) {
                b(actionMenuView, 0, false);
            } else {
                b(actionMenuView, this.U, this.c0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s() {
        getTopEdgeTreatment().e(getFabTranslationX());
        View p = p();
        this.R.b((!this.c0 || !q()) ? 0.0f : 1.0f);
        if (p != null) {
            p.setTranslationY(getFabTranslationY());
            p.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: protected */
    public int a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = u.o(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f449a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i != 1 || !z) {
            return 0;
        }
        return right;
    }

    /* access modifiers changed from: protected */
    public void a(int i, List<Animator> list) {
        FloatingActionButton o = o();
        if (o != null && !o.b()) {
            n();
            o.a(new b(i));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i) {
        float f2 = (float) i;
        if (f2 == getTopEdgeTreatment().f()) {
            return false;
        }
        getTopEdgeTreatment().d(f2);
        this.R.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.R.l();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.d0 == null) {
            this.d0 = new Behavior();
        }
        return this.d0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().a();
    }

    public int getFabAlignmentMode() {
        return this.U;
    }

    public int getFabAnimationMode() {
        return this.V;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().c();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().d();
    }

    public boolean getHideOnScroll() {
        return this.W;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this, this.R);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            l();
            s();
        }
        r();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        this.U = gVar.d;
        this.c0 = gVar.e;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.d = this.U;
        gVar.e = this.c0;
        return gVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.a(this.R, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().a(f2);
            this.R.invalidateSelf();
            s();
        }
    }

    public void setElevation(float f2) {
        this.R.a(f2);
        getBehavior().a(this, this.R.j() - this.R.i());
    }

    public void setFabAlignmentMode(int i) {
        d(i);
        a(i, this.c0);
        this.U = i;
    }

    public void setFabAnimationMode(int i) {
        this.V = i;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().b(f2);
            this.R.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().c(f2);
            this.R.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.W = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
