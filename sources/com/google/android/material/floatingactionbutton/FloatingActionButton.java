package com.google.android.material.floatingactionbutton;

import a.g.l.t;
import a.g.l.u;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.l;
import b.c.b.b.k;
import b.c.b.b.l.h;
import b.c.b.b.z.n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.i;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends i implements t, l, b.c.b.b.t.a, n {

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f5933c;
    private PorterDuff.Mode d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    boolean l;
    final Rect m;
    private final Rect n;
    private final androidx.appcompat.widget.n o;
    private final b.c.b.b.t.c p;
    private b q;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f5934a;

        /* renamed from: b  reason: collision with root package name */
        private b f5935b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5936c;

        public BaseBehavior() {
            this.f5936c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.FloatingActionButton_Behavior_Layout);
            this.f5936c = obtainStyledAttributes.getBoolean(k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    u.e(floatingActionButton, i);
                }
                if (i2 != 0) {
                    u.d(floatingActionButton, i2);
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

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.f5936c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f5934a == null) {
                this.f5934a = new Rect();
            }
            Rect rect = this.f5934a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.a(this.f5935b, false);
                return true;
            }
            floatingActionButton.b(this.f5935b, false);
            return true;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.a(this.f5935b, false);
                return true;
            }
            floatingActionButton.b(this.f5935b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void a(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> b2 = coordinatorLayout.b(floatingActionButton);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b2.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c(floatingActionButton, i);
            a(coordinatorLayout, floatingActionButton);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, floatingActionButton);
                return false;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements b.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f5937a;

        a(b bVar) {
            this.f5937a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void a() {
            this.f5937a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void b() {
            this.f5937a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* access modifiers changed from: private */
    public class c implements b.c.b.b.y.b {
        c() {
        }

        @Override // b.c.b.b.y.b
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.m.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.j, i2 + FloatingActionButton.this.j, i3 + FloatingActionButton.this.j, i4 + FloatingActionButton.this.j);
        }

        @Override // b.c.b.b.y.b
        public void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // b.c.b.b.y.b
        public boolean a() {
            return FloatingActionButton.this.l;
        }
    }

    class d<T extends FloatingActionButton> implements b.i {

        /* renamed from: a  reason: collision with root package name */
        private final b.c.b.b.l.k<T> f5940a;

        d(b.c.b.b.l.k<T> kVar) {
            this.f5940a = kVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: b.c.b.b.l.k<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.b.i
        public void a() {
            this.f5940a.a(FloatingActionButton.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: b.c.b.b.l.k<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.b.i
        public void b() {
            this.f5940a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f5940a.equals(this.f5940a);
        }

        public int hashCode() {
            return this.f5940a.hashCode();
        }
    }

    private int a(int i2) {
        int i3 = this.i;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? a(1) : a(0);
        }
        return resources.getDimensionPixelSize(i2 != 1 ? b.c.b.b.d.design_fab_size_normal : b.c.b.b.d.design_fab_size_mini);
    }

    private static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private b.j c(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private void c(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.m;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private b d() {
        return Build.VERSION.SDK_INT >= 21 ? new c(this, new c()) : new b(this, new c());
    }

    private void e() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(j.a(colorForState, mode));
        }
    }

    private b getImpl() {
        if (this.q == null) {
            this.q = d();
        }
        return this.q;
    }

    public void a(Animator.AnimatorListener animatorListener) {
        getImpl().a(animatorListener);
    }

    public void a(b.c.b.b.l.k<? extends FloatingActionButton> kVar) {
        getImpl().a(new d(kVar));
    }

    public void a(b bVar) {
        a(bVar, true);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, boolean z) {
        getImpl().a(c(bVar), z);
    }

    @Override // b.c.b.b.t.b
    public boolean a() {
        this.p.b();
        throw null;
    }

    @Deprecated
    public boolean a(Rect rect) {
        if (!u.C(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        c(rect);
        return true;
    }

    public void b(Animator.AnimatorListener animatorListener) {
        getImpl().b(animatorListener);
    }

    public void b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        c(rect);
    }

    public void b(b bVar) {
        b(bVar, true);
    }

    /* access modifiers changed from: package-private */
    public void b(b bVar, boolean z) {
        getImpl().b(c(bVar), z);
    }

    public boolean b() {
        return getImpl().i();
    }

    public boolean c() {
        return getImpl().j();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f5933c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.d;
    }

    public float getCompatElevation() {
        return getImpl().b();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f();
    }

    public Drawable getContentBackground() {
        return getImpl().a();
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        this.p.a();
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().d();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.g;
    }

    public b.c.b.b.z.k getShapeAppearanceModel() {
        b.c.b.b.z.k g2 = getImpl().g();
        a.g.k.h.a(g2);
        return g2;
    }

    public h getShowMotionSpec() {
        return getImpl().h();
    }

    public int getSize() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return a(this.h);
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        return this.e;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().k();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().l();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().n();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.k) / 2;
        getImpl().w();
        int min = Math.min(a(sizeDimension, i2), a(sizeDimension, i3));
        Rect rect = this.m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b.c.b.b.a0.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b.c.b.b.a0.a aVar = (b.c.b.b.a0.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        b.c.b.b.t.c cVar = this.p;
        Bundle bundle = aVar.d.get("expandableWidgetHelper");
        a.g.k.h.a(bundle);
        cVar.a(bundle);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new b.c.b.b.a0.a(onSaveInstanceState);
        this.p.c();
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !a(this.n) || this.n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f5933c != colorStateList) {
            this.f5933c = colorStateList;
            getImpl().a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.d != mode) {
            this.d = mode;
            getImpl().a(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().a(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().b(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().d(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i2 != this.i) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().e(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().c()) {
            getImpl().a(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.p.a(i2);
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().a(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.a(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().v();
            if (this.e != null) {
                e();
            }
        }
    }

    public void setImageResource(int i2) {
        this.o.a(i2);
        e();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            getImpl().b(this.g);
        }
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().p();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().p();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().b(z);
    }

    @Override // b.c.b.b.z.n
    public void setShapeAppearanceModel(b.c.b.b.z.k kVar) {
        getImpl().a(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().b(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.i = 0;
        if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            e();
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            e();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().q();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().q();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().q();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.l != z) {
            this.l = z;
            getImpl().m();
        }
    }

    @Override // com.google.android.material.internal.i
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }
}
