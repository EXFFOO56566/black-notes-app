package com.google.android.material.bottomsheet;

import a.g.l.d0.c;
import a.g.l.d0.f;
import a.g.l.u;
import a.i.b.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.b.b.j;
import b.c.b.b.z.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int K = j.Widget_Design_BottomSheet_Modal;
    int A;
    WeakReference<V> B;
    WeakReference<View> C;
    private final ArrayList<e> D = new ArrayList<>();
    private VelocityTracker E;
    int F;
    private int G;
    boolean H;
    private Map<View, Integer> I;
    private final c.AbstractC0025c J = new c();

    /* renamed from: a  reason: collision with root package name */
    private int f5871a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5872b = true;

    /* renamed from: c  reason: collision with root package name */
    private float f5873c;
    private int d;
    private boolean e;
    private int f;
    private boolean g;
    private b.c.b.b.z.g h;
    private k i;
    private boolean j;
    private BottomSheetBehavior<V>.g k = null;
    private ValueAnimator l;
    int m;
    int n;
    int o;
    float p = 0.5f;
    int q;
    float r = -1.0f;
    boolean s;
    private boolean t;
    int u = 4;
    a.i.b.c v;
    private boolean w;
    private int x;
    private boolean y;
    int z;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5874b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5875c;

        a(View view, int i) {
            this.f5874b = view;
            this.f5875c = i;
        }

        public void run() {
            BottomSheetBehavior.this.a(this.f5874b, this.f5875c);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.h != null) {
                BottomSheetBehavior.this.h.b(floatValue);
            }
        }
    }

    class c extends c.AbstractC0025c {
        c() {
        }

        @Override // a.i.b.c.AbstractC0025c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
            if (java.lang.Math.abs(r8 - r6.f5877a.o) < java.lang.Math.abs(r8 - r6.f5877a.q)) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
            if (java.lang.Math.abs(r8 - r6.f5877a.n) < java.lang.Math.abs(r8 - r6.f5877a.q)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f5877a.q)) goto L_0x0086;
         */
        @Override // a.i.b.c.AbstractC0025c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(android.view.View r7, float r8, float r9) {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, float, float):void");
        }

        @Override // a.i.b.c.AbstractC0025c
        public void a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.a(i2);
        }

        @Override // a.i.b.c.AbstractC0025c
        public int b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q;
        }

        @Override // a.i.b.c.AbstractC0025c
        public int b(View view, int i, int i2) {
            int e = BottomSheetBehavior.this.e();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a.g.g.a.a(i, e, bottomSheetBehavior.s ? bottomSheetBehavior.A : bottomSheetBehavior.q);
        }

        @Override // a.i.b.c.AbstractC0025c
        public boolean b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.u;
            if (i2 == 1 || bottomSheetBehavior.H) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.F == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.B;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // a.i.b.c.AbstractC0025c
        public void c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.f(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements a.g.l.d0.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5878a;

        d(int i) {
            this.f5878a = i;
        }

        @Override // a.g.l.d0.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.e(this.f5878a);
            return true;
        }
    }

    public static abstract class e {
        public abstract void a(View view, float f);

        public abstract void a(View view, int i);
    }

    /* access modifiers changed from: protected */
    public static class f extends a.i.a.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        final int d;
        int e;
        boolean f;
        boolean g;
        boolean h;

        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            boolean z = false;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1 ? true : z;
        }

        public f(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.d = bottomSheetBehavior.u;
            this.e = ((BottomSheetBehavior) bottomSheetBehavior).d;
            this.f = ((BottomSheetBehavior) bottomSheetBehavior).f5872b;
            this.g = bottomSheetBehavior.s;
            this.h = ((BottomSheetBehavior) bottomSheetBehavior).t;
        }

        @Override // a.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    /* access modifiers changed from: private */
    public class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f5880b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5881c;
        int d;

        g(View view, int i) {
            this.f5880b = view;
            this.d = i;
        }

        public void run() {
            a.i.b.c cVar = BottomSheetBehavior.this.v;
            if (cVar == null || !cVar.a(true)) {
                BottomSheetBehavior.this.f(this.d);
            } else {
                u.a(this.f5880b, this);
            }
            this.f5881c = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.b.b.k.BottomSheetBehavior_Layout);
        this.g = obtainStyledAttributes.hasValue(b.c.b.b.k.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(b.c.b.b.k.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            a(context, attributeSet, hasValue, b.c.b.b.w.c.a(context, obtainStyledAttributes, b.c.b.b.k.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            a(context, attributeSet, hasValue);
        }
        d();
        if (Build.VERSION.SDK_INT >= 21) {
            this.r = obtainStyledAttributes.getDimension(b.c.b.b.k.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_peekHeight);
        c((peekValue == null || (dimensionPixelSize = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : dimensionPixelSize);
        b(obtainStyledAttributes.getBoolean(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_hideable, false));
        a(obtainStyledAttributes.getBoolean(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        c(obtainStyledAttributes.getBoolean(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        d(obtainStyledAttributes.getInt(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        a(obtainStyledAttributes.getFloat(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        b(obtainStyledAttributes.getInt(b.c.b.b.k.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        obtainStyledAttributes.recycle();
        this.f5873c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void a(Context context, AttributeSet attributeSet, boolean z2) {
        a(context, attributeSet, z2, (ColorStateList) null);
    }

    private void a(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.g) {
            this.i = k.a(context, attributeSet, b.c.b.b.b.bottomSheetStyle, K).a();
            b.c.b.b.z.g gVar = new b.c.b.b.z.g(this.i);
            this.h = gVar;
            gVar.a(context);
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.h.setTint(typedValue.data);
                return;
            }
            this.h.a(colorStateList);
        }
    }

    private void a(V v2, c.a aVar, int i2) {
        u.a(v2, aVar, null, new d(i2));
    }

    private void a(f fVar) {
        int i2 = this.f5871a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.d = fVar.e;
            }
            int i3 = this.f5871a;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f5872b = fVar.f;
            }
            int i4 = this.f5871a;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.s = fVar.g;
            }
            int i5 = this.f5871a;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.t = fVar.h;
            }
        }
    }

    private void b() {
        int max = this.e ? Math.max(this.f, this.A - ((this.z * 9) / 16)) : this.d;
        if (this.f5872b) {
            this.q = Math.max(this.A - max, this.n);
        } else {
            this.q = this.A - max;
        }
    }

    private void c() {
        this.o = (int) (((float) this.A) * (1.0f - this.p));
    }

    private void d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = ofFloat;
        ofFloat.setDuration(500L);
        this.l.addUpdateListener(new b());
    }

    private void d(boolean z2) {
        int i2;
        WeakReference<V> weakReference = this.B;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z2) {
                    if (this.I == null) {
                        this.I = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.B.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.I;
                            if (map != null && map.containsKey(childAt)) {
                                i2 = this.I.get(childAt).intValue();
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.I.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            i2 = 4;
                        }
                        u.h(childAt, i2);
                    }
                }
                if (!z2) {
                    this.I = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int e() {
        return this.f5872b ? this.n : this.m;
    }

    private float f() {
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f5873c);
        return this.E.getYVelocity(this.F);
    }

    private void g() {
        this.F = -1;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
    }

    private void g(int i2) {
        V v2 = this.B.get();
        if (v2 != null) {
            ViewParent parent = v2.getParent();
            if (parent == null || !parent.isLayoutRequested() || !u.B(v2)) {
                a((View) v2, i2);
            } else {
                v2.post(new a(v2, i2));
            }
        }
    }

    private void h() {
        V v2;
        c.a aVar;
        WeakReference<V> weakReference = this.B;
        if (weakReference != null && (v2 = weakReference.get()) != null) {
            u.f(v2, 524288);
            u.f(v2, 262144);
            u.f(v2, 1048576);
            if (this.s && this.u != 5) {
                a(v2, c.a.h, 5);
            }
            int i2 = this.u;
            int i3 = 6;
            if (i2 == 3) {
                if (this.f5872b) {
                    i3 = 4;
                }
                aVar = c.a.g;
            } else if (i2 == 4) {
                if (this.f5872b) {
                    i3 = 3;
                }
                aVar = c.a.f;
            } else if (i2 == 6) {
                a(v2, c.a.g, 4);
                a(v2, c.a.f, 3);
                return;
            } else {
                return;
            }
            a(v2, aVar, i3);
        }
    }

    private void h(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.j != z2) {
                this.j = z2;
                if (this.h != null && (valueAnimator = this.l) != null) {
                    if (valueAnimator.isRunning()) {
                        this.l.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.l.setFloatValues(1.0f - f2, f2);
                    this.l.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View a(View view) {
        if (u.D(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View a2 = a(viewGroup.getChildAt(i2));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a() {
        super.a();
        this.B = null;
        this.v = null;
    }

    public void a(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.p = f2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        float f2;
        float f3;
        V v2 = this.B.get();
        if (!(v2 == null || this.D.isEmpty())) {
            int i3 = this.q;
            if (i2 > i3) {
                f2 = (float) (i3 - i2);
                f3 = (float) (this.A - i3);
            } else {
                f2 = (float) (i3 - i2);
                f3 = (float) (i3 - e());
            }
            float f4 = f2 / f3;
            for (int i4 = 0; i4 < this.D.size(); i4++) {
                this.D.get(i4).a(v2, f4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.e
            if (r4 != 0) goto L_0x0015
            r3.e = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.e
            if (r2 != 0) goto L_0x0017
            int r2 = r3.d
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.e = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.B
            if (r4 == 0) goto L_0x0042
            r3.b()
            int r4 = r3.u
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.B
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.u
            r3.g(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.q;
        } else if (i2 == 6) {
            int i5 = this.o;
            if (!this.f5872b || i5 > (i4 = this.n)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = e();
        } else if (!this.s || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i2);
        } else {
            i3 = this.A;
        }
        a(view, i2, i3, false);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, int i3, boolean z2) {
        if (z2 ? this.v.c(view.getLeft(), i3) : this.v.b(view, view.getLeft(), i3)) {
            f(2);
            h(i2);
            if (this.k == null) {
                this.k = new g(view, i2);
            }
            if (!((g) this.k).f5881c) {
                BottomSheetBehavior<V>.g gVar = this.k;
                gVar.d = i2;
                u.a(view, gVar);
                ((g) this.k).f5881c = true;
                return;
            }
            this.k.d = i2;
            return;
        }
        f(i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout.f fVar) {
        super.a(fVar);
        this.B = null;
        this.v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.a(coordinatorLayout, v2, fVar.a());
        a(fVar);
        int i2 = fVar.d;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.u = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.q)) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (java.lang.Math.abs(r3 - r2.o) < java.lang.Math.abs(r3 - r2.q)) goto L_0x009b;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.C;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v2.getTop();
                int i6 = top - i3;
                if (i3 <= 0) {
                    if (i3 < 0 && !view.canScrollVertically(-1)) {
                        int i7 = this.q;
                        if (i6 <= i7 || this.s) {
                            iArr[1] = i3;
                            u.e(v2, -i3);
                            f(1);
                        } else {
                            iArr[1] = top - i7;
                            u.e(v2, -iArr[1]);
                            i5 = 4;
                        }
                    }
                    a(v2.getTop());
                    this.x = i3;
                    this.y = true;
                } else if (i6 < e()) {
                    iArr[1] = top - e();
                    u.e(v2, -iArr[1]);
                    i5 = 3;
                } else {
                    iArr[1] = i3;
                    u.e(v2, -i3);
                    f(1);
                    a(v2.getTop());
                    this.x = i3;
                    this.y = true;
                }
                f(i5);
                a(v2.getTop());
                this.x = i3;
                this.y = true;
            }
        }
    }

    public void a(boolean z2) {
        if (this.f5872b != z2) {
            this.f5872b = z2;
            if (this.B != null) {
                b();
            }
            f((!this.f5872b || this.u != 6) ? this.u : 3);
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, float f2) {
        if (this.t) {
            return true;
        }
        return view.getTop() >= this.q && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.q)) / ((float) this.d) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        b.c.b.b.z.g gVar;
        if (u.l(coordinatorLayout) && !u.l(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.B == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(b.c.b.b.d.design_bottom_sheet_peek_height_min);
            this.B = new WeakReference<>(v2);
            if (this.g && (gVar = this.h) != null) {
                u.a(v2, gVar);
            }
            b.c.b.b.z.g gVar2 = this.h;
            if (gVar2 != null) {
                float f2 = this.r;
                if (f2 == -1.0f) {
                    f2 = u.k(v2);
                }
                gVar2.a(f2);
                boolean z2 = this.u == 3;
                this.j = z2;
                this.h.b(z2 ? 0.0f : 1.0f);
            }
            h();
            if (u.m(v2) == 0) {
                u.h(v2, 1);
            }
        }
        if (this.v == null) {
            this.v = a.i.b.c.a(coordinatorLayout, this.J);
        }
        int top = v2.getTop();
        coordinatorLayout.c(v2, i2);
        this.z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.A = height;
        this.n = Math.max(0, height - v2.getHeight());
        c();
        b();
        int i4 = this.u;
        if (i4 == 3) {
            i3 = e();
        } else if (i4 == 6) {
            i3 = this.o;
        } else if (!this.s || i4 != 5) {
            int i5 = this.u;
            if (i5 == 4) {
                i3 = this.q;
            } else {
                if (i5 == 1 || i5 == 2) {
                    u.e(v2, top - v2.getTop());
                }
                this.C = new WeakReference<>(a(v2));
                return true;
            }
        } else {
            i3 = this.A;
        }
        u.e(v2, i3);
        this.C = new WeakReference<>(a(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        a.i.b.c cVar;
        if (!v2.isShown()) {
            this.w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            g();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            if (this.u != 2) {
                WeakReference<View> weakReference = this.C;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.a(view2, x2, this.G)) {
                    this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.H = true;
                }
            }
            this.w = this.F == -1 && !coordinatorLayout.a(v2, x2, this.G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
            this.F = -1;
            if (this.w) {
                this.w = false;
                return false;
            }
        }
        if (!this.w && (cVar = this.v) != null && cVar.b(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.C;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.w && this.u != 1 && !coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.v != null && Math.abs(((float) this.G) - motionEvent.getY()) > ((float) this.v.b());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.u != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
    }

    public void b(int i2) {
        if (i2 >= 0) {
            this.m = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void b(boolean z2) {
        if (this.s != z2) {
            this.s = z2;
            if (!z2 && this.u == 5) {
                e(4);
            }
            h();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == 1 && actionMasked == 0) {
            return true;
        }
        a.i.b.c cVar = this.v;
        if (cVar != null) {
            cVar.a(motionEvent);
        }
        if (actionMasked == 0) {
            g();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.w && Math.abs(((float) this.G) - motionEvent.getY()) > ((float) this.v.b())) {
            this.v.a(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.w;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.x = 0;
        this.y = false;
        return (i2 & 2) != 0;
    }

    public void c(int i2) {
        a(i2, false);
    }

    public void c(boolean z2) {
        this.t = z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable d(CoordinatorLayout coordinatorLayout, V v2) {
        return new f(super.d(coordinatorLayout, v2), (BottomSheetBehavior<?>) this);
    }

    public void d(int i2) {
        this.f5871a = i2;
    }

    public void e(int i2) {
        if (i2 != this.u) {
            if (this.B != null) {
                g(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.s && i2 == 5)) {
                this.u = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        V v2;
        if (this.u != i2) {
            this.u = i2;
            WeakReference<V> weakReference = this.B;
            if (!(weakReference == null || (v2 = weakReference.get()) == null)) {
                if (i2 == 6 || i2 == 3) {
                    d(true);
                } else if (i2 == 5 || i2 == 4) {
                    d(false);
                }
                h(i2);
                for (int i3 = 0; i3 < this.D.size(); i3++) {
                    this.D.get(i3).a((View) v2, i2);
                }
                h();
            }
        }
    }
}
