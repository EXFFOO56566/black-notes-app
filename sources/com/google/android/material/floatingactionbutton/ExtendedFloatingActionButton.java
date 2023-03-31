package com.google.android.material.floatingactionbutton;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.b.b.k;
import b.c.b.b.l.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private final Rect s;
    private final d t;
    private final d u;
    private final d v;
    private final d w;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> x;
    private boolean y;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f5927a;

        /* renamed from: b  reason: collision with root package name */
        private d f5928b;

        /* renamed from: c  reason: collision with root package name */
        private d f5929c;
        private boolean d;
        private boolean e;

        public ExtendedFloatingActionButtonBehavior() {
            this.d = false;
            this.e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ExtendedFloatingActionButton_Behavior_Layout);
            this.d = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.e = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect rect = extendedFloatingActionButton.s;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : extendedFloatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i = rect.bottom;
                } else if (extendedFloatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    u.e(extendedFloatingActionButton, i);
                }
                if (i2 != 0) {
                    u.d(extendedFloatingActionButton, i2);
                }
            }
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.d || this.e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).c() == view.getId();
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f5927a == null) {
                this.f5927a = new Rect();
            }
            Rect rect = this.f5927a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                b(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        private boolean b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                b(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void a(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        /* access modifiers changed from: protected */
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.a(this.e ? extendedFloatingActionButton.u : extendedFloatingActionButton.v, this.e ? this.f5929c : this.f5928b);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> b2 = coordinatorLayout.b(extendedFloatingActionButton);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b2.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c(extendedFloatingActionButton, i);
            a(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect rect2 = extendedFloatingActionButton.s;
            rect.set(extendedFloatingActionButton.getLeft() + rect2.left, extendedFloatingActionButton.getTop() + rect2.top, extendedFloatingActionButton.getRight() - rect2.right, extendedFloatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.a(this.e ? extendedFloatingActionButton.t : extendedFloatingActionButton.w, this.e ? this.f5929c : this.f5928b);
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f5931b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f5932c;

        a(d dVar, d dVar2) {
            this.f5931b = dVar;
            this.f5932c = dVar2;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5930a = true;
            this.f5931b.b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f5931b.a();
            if (!this.f5930a) {
                this.f5931b.a(this.f5932c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f5931b.onAnimationStart(animator);
            this.f5930a = false;
        }
    }

    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    public static abstract class d {
    }

    static {
        new b(Float.class, "width");
        new c(Float.class, "height");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(d dVar, d dVar2) {
        if (!dVar.g()) {
            if (!b()) {
                dVar.c();
                dVar.a(dVar2);
                return;
            }
            measure(0, 0);
            AnimatorSet e = dVar.e();
            e.addListener(new a(dVar, dVar2));
            for (Animator.AnimatorListener animatorListener : dVar.f()) {
                e.addListener(animatorListener);
            }
            e.start();
        }
    }

    private boolean b() {
        return u.C(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(u.t(this), u.s(this)) * 2) + getIconSize();
    }

    public h getExtendMotionSpec() {
        return this.u.d();
    }

    public h getHideMotionSpec() {
        return this.w.d();
    }

    public h getShowMotionSpec() {
        return this.v.d();
    }

    public h getShrinkMotionSpec() {
        return this.t.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.y && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.y = false;
            this.t.c();
        }
    }

    public void setExtendMotionSpec(h hVar) {
        this.u.a(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(h.a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.y != z) {
            d dVar = z ? this.u : this.t;
            if (!dVar.g()) {
                dVar.c();
            }
        }
    }

    public void setHideMotionSpec(h hVar) {
        this.w.a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(h.a(getContext(), i));
    }

    public void setShowMotionSpec(h hVar) {
        this.v.a(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(h.a(getContext(), i));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.t.a(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(h.a(getContext(), i));
    }
}
