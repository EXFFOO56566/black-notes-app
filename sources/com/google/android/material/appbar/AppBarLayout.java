package com.google.android.material.appbar;

import a.g.l.c0;
import a.g.l.l;
import a.g.l.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.b.b.d;
import b.c.b.b.k;
import b.c.b.b.z.g;
import b.c.b.b.z.h;
import java.lang.ref.WeakReference;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f5830b;

    /* renamed from: c  reason: collision with root package name */
    private int f5831c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private c0 h;
    private List<b> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private WeakReference<View> o;
    private ValueAnimator p;
    private int[] q;
    private Drawable r;

    /* access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends a<T> {
        private int k;
        private int l;
        private ValueAnimator m;
        private int n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private b r;

        /* access modifiers changed from: package-private */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f5832a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f5833b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f5832a = coordinatorLayout;
                this.f5833b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.c(this.f5832a, this.f5833b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public static abstract class b<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        /* access modifiers changed from: protected */
        public static class c extends a.i.a.a {
            public static final Parcelable.Creator<c> CREATOR = new a();
            int d;
            float e;
            boolean f;

            static class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public c[] newArray(int i) {
                    return new c[i];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.d = parcel.readInt();
                this.e = parcel.readFloat();
                this.f = parcel.readByte() != 0;
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // a.i.a.a
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.d);
                parcel.writeFloat(this.e);
                parcel.writeByte(this.f ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(c() - i);
            float abs2 = Math.abs(f);
            a(coordinatorLayout, (AppBarLayout) t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c2 = c();
            if (c2 == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m = valueAnimator3;
                valueAnimator3.setInterpolator(b.c.b.b.l.a.e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration((long) Math.min(i2, 600));
            this.m.setIntValues(c2, i);
            this.m.start();
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a2 = a(t, i);
            if (a2 != null) {
                int a3 = ((c) a2.getLayoutParams()).a();
                boolean z2 = false;
                if ((a3 & 1) != 0) {
                    int p2 = u.p(a2);
                    if (i2 <= 0 || (a3 & 12) == 0 ? !((a3 & 2) == 0 || (-i) < (a2.getBottom() - p2) - t.getTopInset()) : (-i) >= (a2.getBottom() - p2) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.c()) {
                    z2 = t.a(a(coordinatorLayout));
                }
                boolean a4 = t.a(z2);
                if (z || (a4 && c(coordinatorLayout, (AppBarLayout) t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private int b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (a(cVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private int c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                Interpolator b2 = cVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b2 != null) {
                    int a2 = cVar.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= u.p(childAt);
                        }
                    }
                    if (u.l(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b2.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        private boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c2 = coordinatorLayout.c(t);
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c d = ((CoordinatorLayout.f) c2.get(i).getLayoutParams()).d();
                if (d instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) d).c() != 0;
                }
            }
            return false;
        }

        private void d(CoordinatorLayout coordinatorLayout, T t) {
            int c2 = c();
            int b2 = b(t, c2);
            if (b2 >= 0) {
                View childAt = t.getChildAt(b2);
                c cVar = (c) childAt.getLayoutParams();
                int a2 = cVar.a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b2 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (a(a2, 2)) {
                        i2 += u.p(childAt);
                    } else if (a(a2, 5)) {
                        int p2 = u.p(childAt) + i2;
                        if (c2 < p2) {
                            i = p2;
                        } else {
                            i2 = p2;
                        }
                    }
                    if (a(a2, 32)) {
                        i += ((LinearLayout.LayoutParams) cVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    if (c2 < (i2 + i) / 2) {
                        i = i2;
                    }
                    a(coordinatorLayout, (AppBarLayout) t, a.g.g.a.a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c2 = c();
            int i4 = 0;
            if (i2 == 0 || c2 < i2 || c2 > i3) {
                this.k = 0;
            } else {
                int a2 = a.g.g.a.a(i, i2, i3);
                if (c2 != a2) {
                    int c3 = t.a() ? c(t, a2) : a2;
                    boolean a3 = a(c3);
                    i4 = c2 - a2;
                    this.k = a2 - c3;
                    if (!a3 && t.a()) {
                        coordinatorLayout.a(t);
                    }
                    t.a(b());
                    a(coordinatorLayout, (AppBarLayout) t, a2, a2 < c2 ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void e(CoordinatorLayout coordinatorLayout, T t) {
            d(coordinatorLayout, (AppBarLayout) t);
            if (t.c()) {
                t.a(t.a(a(coordinatorLayout)));
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof c) {
                c cVar = (c) parcelable;
                super.a(coordinatorLayout, (View) t, cVar.a());
                this.n = cVar.d;
                this.p = cVar.e;
                this.o = cVar.f;
                return;
            }
            super.a(coordinatorLayout, (View) t, parcelable);
            this.n = -1;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                d(coordinatorLayout, (AppBarLayout) t);
                if (t.c()) {
                    t.a(t.a(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = a(coordinatorLayout, (View) t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = a(coordinatorLayout, (View) t, i2, i5, i4);
                }
            }
            if (t.c()) {
                t.a(t.a(view));
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean a2 = super.a(coordinatorLayout, (View) t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                c(coordinatorLayout, t, (-childAt.getBottom()) + (this.o ? u.p(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, (AppBarLayout) t, i3, 0.0f);
                    } else {
                        c(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, (AppBarLayout) t, 0, 0.0f);
                    } else {
                        c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.d();
            this.n = -1;
            a(a.g.g.a.a(b(), -t.getTotalScrollRange(), 0));
            a(coordinatorLayout, (AppBarLayout) t, b(), 0, true);
            t.a(b());
            return a2;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height != -2) {
                return super.a(coordinatorLayout, (View) t, i, i2, i3, i4);
            }
            coordinatorLayout.a(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.c() || a(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean a(T t) {
            b bVar = this.r;
            if (bVar != null) {
                return bVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        public int b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.d(coordinatorLayout, (View) t);
            int b2 = b();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 <= 0 && bottom >= 0) {
                    c cVar = new c(d);
                    cVar.d = i;
                    if (bottom == u.p(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f = z;
                    cVar.e = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return d;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        public int c() {
            return b() + this.k;
        }

        /* access modifiers changed from: package-private */
        public int c(T t) {
            return t.getTotalScrollRange();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ScrollingViewBehavior_Layout);
            b(obtainStyledAttributes.getDimensionPixelSize(k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        private static int a(AppBarLayout appBarLayout) {
            CoordinatorLayout.c d = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).c();
            }
            return 0;
        }

        private void a(View view, View view2) {
            CoordinatorLayout.c d = ((CoordinatorLayout.f) view2.getLayoutParams()).d();
            if (d instanceof BaseBehavior) {
                u.e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).k) + d()) - a(view2));
            }
        }

        private void b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.c()) {
                    appBarLayout.a(appBarLayout.a(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public AppBarLayout a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a2 = a(coordinatorLayout.b(view));
            if (a2 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a2.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public float b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a2 = a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a2 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a2) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a(view, view2);
            b(view, view2);
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public int c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.c(view);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f5835a;

        a(g gVar) {
            this.f5835a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f5835a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f5837a = 1;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f5838b;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.AppBarLayout_Layout);
            this.f5837a = obtainStyledAttributes.getInt(k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f5838b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.f5837a;
        }

        public Interpolator b() {
            return this.f5838b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i = this.f5837a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    private void a(g gVar, boolean z) {
        float dimension = getResources().getDimension(d.design_appbar_elevation);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
        this.p = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(b.c.b.b.g.app_bar_elevation_anim_duration));
        this.p.setInterpolator(b.c.b.b.l.a.f1254a);
        this.p.addUpdateListener(new a(gVar));
        this.p.start();
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.g = i3 | i2;
        requestLayout();
    }

    private View b(View view) {
        int i2;
        if (this.o == null && (i2 = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i2) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean b(boolean z) {
        if (this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        return true;
    }

    private void e() {
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    private boolean f() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((c) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void g() {
        this.f5831c = -1;
        this.d = -1;
        this.e = -1;
    }

    private boolean h() {
        return this.r != null && getTopInset() > 0;
    }

    private boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !u.l(childAt);
    }

    private void j() {
        setWillNotDraw(!h());
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.f5830b = i2;
        if (!willNotDraw()) {
            u.G(this);
        }
        List<b> list = this.i;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.i.get(i3);
                if (bVar != null) {
                    bVar.a(this, i2);
                }
            }
        }
    }

    public void a(boolean z, boolean z2) {
        a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view) {
        View b2 = b(view);
        if (b2 != null) {
            view = b2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: package-private */
    public boolean a(boolean z) {
        if (this.l == z) {
            return false;
        }
        this.l = z;
        refreshDrawableState();
        if (!this.m || !(getBackground() instanceof g)) {
            return true;
        }
        a((g) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return getTotalScrollRange() != 0;
    }

    public boolean c() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.g = 0;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (h()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f5830b));
            this.r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    public c generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams) : new c((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i2;
        int p2;
        int i3 = this.d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.f5837a;
            if ((i5 & 5) == 5) {
                int i6 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if ((i5 & 8) != 0) {
                    p2 = u.p(childAt);
                } else if ((i5 & 2) != 0) {
                    p2 = measuredHeight - u.p(childAt);
                } else {
                    i2 = i6 + measuredHeight;
                    if (childCount == 0 && u.l(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
                i2 = i6 + p2;
                i2 = Math.min(i2, measuredHeight - getTopInset());
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.d = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            int i5 = cVar.f5837a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= u.p(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int p2 = u.p(this);
        if (p2 == 0) {
            int childCount = getChildCount();
            p2 = childCount >= 1 ? u.p(getChildAt(childCount - 1)) : 0;
            if (p2 == 0) {
                return getHeight() / 3;
            }
        }
        return (p2 * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.g;
    }

    public Drawable getStatusBarForeground() {
        return this.r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        c0 c0Var = this.h;
        if (c0Var != null) {
            return c0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f5831c;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.f5837a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            if (i3 == 0 && u.l(childAt)) {
                i4 -= getTopInset();
            }
            if ((i5 & 2) != 0) {
                i4 -= u.p(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f5831c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.k ? b.c.b.b.b.state_liftable : -b.c.b.b.b.state_liftable;
        iArr[1] = (!this.k || !this.l) ? -b.c.b.b.b.state_lifted : b.c.b.b.b.state_lifted;
        iArr[2] = this.k ? b.c.b.b.b.state_collapsible : -b.c.b.b.b.state_collapsible;
        iArr[3] = (!this.k || !this.l) ? -b.c.b.b.b.state_collapsed : b.c.b.b.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (u.l(this) && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                u.e(getChildAt(childCount), topInset);
            }
        }
        g();
        this.f = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((c) getChildAt(i6).getLayoutParams()).b() != null) {
                this.f = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.j) {
            if (!this.m && !f()) {
                z2 = false;
            }
            b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && u.l(this) && i()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = a.g.g.a.a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        g();
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        h.a(this, f2);
    }

    public void setExpanded(boolean z) {
        a(z, u.C(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.m = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.n = i2;
        e();
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.r, u.o(this));
                this.r.setVisible(getVisibility() == 0, false);
                this.r.setCallback(this);
            }
            j();
            u.G(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(a.a.k.a.a.c(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this, f2);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }
}
