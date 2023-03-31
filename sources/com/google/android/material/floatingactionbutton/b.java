package com.google.android.material.floatingactionbutton;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import b.c.b.b.z.n;
import java.util.ArrayList;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public class b {
    static final TimeInterpolator F = b.c.b.b.l.a.f1256c;
    static final int[] G = {16842919, 16842910};
    static final int[] H = {16843623, 16842908, 16842910};
    static final int[] I = {16842908, 16842910};
    static final int[] J = {16843623, 16842910};
    static final int[] K = {16842910};
    static final int[] L = new int[0];
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();
    private ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: a  reason: collision with root package name */
    b.c.b.b.z.k f5942a;

    /* renamed from: b  reason: collision with root package name */
    b.c.b.b.z.g f5943b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f5944c;
    a d;
    Drawable e;
    boolean f;
    boolean g = true;
    float h;
    float i;
    float j;
    int k;
    private final com.google.android.material.internal.e l;
    private b.c.b.b.l.h m;
    private b.c.b.b.l.h n;
    private Animator o;
    private b.c.b.b.l.h p;
    private b.c.b.b.l.h q;
    private float r;
    private float s = 1.0f;
    private int t;
    private int u = 0;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final b.c.b.b.y.b z;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f5946b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f5947c;

        a(boolean z, j jVar) {
            this.f5946b = z;
            this.f5947c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5945a = true;
        }

        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            if (!this.f5945a) {
                b.this.y.a(this.f5946b ? 8 : 4, this.f5946b);
                j jVar = this.f5947c;
                if (jVar != null) {
                    jVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.y.a(0, this.f5946b);
            b.this.u = 1;
            b.this.o = animator;
            this.f5945a = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    public class C0086b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f5948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f5949b;

        C0086b(boolean z, j jVar) {
            this.f5948a = z;
            this.f5949b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            j jVar = this.f5949b;
            if (jVar != null) {
                jVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.y.a(0, this.f5948a);
            b.this.u = 2;
            b.this.o = animator;
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends b.c.b.b.l.g {
        c() {
        }

        @Override // b.c.b.b.l.g
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            b.this.s = f;
            return super.a(f, matrix, matrix2);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f5951a = new FloatEvaluator();

        d(b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f5951a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        public boolean onPreDraw() {
            b.this.o();
            return true;
        }
    }

    private class f extends l {
        f(b bVar) {
            super(bVar, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            return 0.0f;
        }
    }

    private class g extends l {
        g() {
            super(b.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            b bVar = b.this;
            return bVar.h + bVar.i;
        }
    }

    private class h extends l {
        h() {
            super(b.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            b bVar = b.this;
            return bVar.h + bVar.j;
        }
    }

    /* access modifiers changed from: package-private */
    public interface i {
        void a();

        void b();
    }

    /* access modifiers changed from: package-private */
    public interface j {
        void a();

        void b();
    }

    private class k extends l {
        k() {
            super(b.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            return b.this.h;
        }
    }

    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5953a;

        /* renamed from: b  reason: collision with root package name */
        private float f5954b;

        /* renamed from: c  reason: collision with root package name */
        private float f5955c;

        private l() {
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            b.this.e((float) ((int) this.f5955c));
            this.f5953a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f5953a) {
                b.c.b.b.z.g gVar = b.this.f5943b;
                this.f5954b = gVar == null ? 0.0f : gVar.e();
                this.f5955c = a();
                this.f5953a = true;
            }
            b bVar = b.this;
            float f = this.f5954b;
            bVar.e((float) ((int) (f + ((this.f5955c - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    b(FloatingActionButton floatingActionButton, b.c.b.b.y.b bVar) {
        this.y = floatingActionButton;
        this.z = bVar;
        com.google.android.material.internal.e eVar = new com.google.android.material.internal.e();
        this.l = eVar;
        eVar.a(G, a((l) new h()));
        this.l.a(H, a((l) new g()));
        this.l.a(I, a((l) new g()));
        this.l.a(J, a((l) new g()));
        this.l.a(K, a((l) new k()));
        this.l.a(L, a((l) new f(this)));
        this.r = this.y.getRotation();
    }

    private boolean A() {
        return u.C(this.y) && !this.y.isInEditMode();
    }

    private AnimatorSet a(b.c.b.b.l.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        hVar.a("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        hVar.a("scale").a((Animator) ofFloat2);
        a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        hVar.a("scale").a((Animator) ofFloat3);
        a(ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new b.c.b.b.l.f(), new c(), new Matrix(this.D));
        hVar.a("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        b.c.b.b.l.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator a(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable != null && this.t != 0) {
            RectF rectF = this.B;
            RectF rectF2 = this.C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.t;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.t;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private void a(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new d(this));
        }
    }

    private b.c.b.b.l.h x() {
        if (this.n == null) {
            this.n = b.c.b.b.l.h.a(this.y.getContext(), b.c.b.b.a.design_fab_hide_motion_spec);
        }
        b.c.b.b.l.h hVar = this.n;
        a.g.k.h.a(hVar);
        return hVar;
    }

    private b.c.b.b.l.h y() {
        if (this.m == null) {
            this.m = b.c.b.b.l.h.a(this.y.getContext(), b.c.b.b.a.design_fab_show_motion_spec);
        }
        b.c.b.b.l.h hVar = this.m;
        a.g.k.h.a(hVar);
        return hVar;
    }

    private ViewTreeObserver.OnPreDrawListener z() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public final Drawable a() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (this.h != f2) {
            this.h = f2;
            a(f2, this.i, this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, float f3, float f4) {
        w();
        e(f2);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        b.c.b.b.z.g gVar = this.f5943b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(colorStateList);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        b.c.b.b.z.g gVar = this.f5943b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        int sizeDimension = this.f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float b2 = this.g ? b() + this.j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) b2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (b2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public final void a(b.c.b.b.l.h hVar) {
        this.q = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(b.c.b.b.z.k kVar) {
        this.f5942a = kVar;
        b.c.b.b.z.g gVar = this.f5943b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f5944c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(kVar);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public void a(j jVar, boolean z2) {
        if (!i()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (A()) {
                b.c.b.b.l.h hVar = this.q;
                if (hVar == null) {
                    hVar = x();
                }
                AnimatorSet a2 = a(hVar, 0.0f, 0.0f, 0.0f);
                a2.addListener(new a(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.y.a(z2 ? 8 : 4, z2);
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        this.f = z2;
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr) {
        this.l.a(iArr);
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void b(float f2) {
        if (this.i != f2) {
            this.i = f2;
            a(this.h, f2, this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f5944c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, b.c.b.b.x.b.a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Rect rect) {
        b.c.b.b.y.b bVar;
        Drawable drawable;
        a.g.k.h.a(this.e, "Didn't initialize content background");
        if (s()) {
            drawable = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.z;
        } else {
            bVar = this.z;
            drawable = this.e;
        }
        bVar.a(drawable);
    }

    /* access modifiers changed from: package-private */
    public final void b(b.c.b.b.l.h hVar) {
        this.p = hVar;
    }

    /* access modifiers changed from: package-private */
    public void b(j jVar, boolean z2) {
        if (!j()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (A()) {
                if (this.y.getVisibility() != 0) {
                    this.y.setAlpha(0.0f);
                    this.y.setScaleY(0.0f);
                    this.y.setScaleX(0.0f);
                    c(0.0f);
                }
                b.c.b.b.l.h hVar = this.p;
                if (hVar == null) {
                    hVar = y();
                }
                AnimatorSet a2 = a(hVar, 1.0f, 1.0f, 1.0f);
                a2.addListener(new C0086b(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.y.a(0, z2);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            c(1.0f);
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        this.g = z2;
        w();
    }

    /* access modifiers changed from: package-private */
    public final void c(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        a(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final b.c.b.b.l.h d() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public final void d(float f2) {
        if (this.j != f2) {
            this.j = f2;
            a(this.h, this.i, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        b.c.b.b.z.g gVar = this.f5943b;
        if (gVar != null) {
            gVar.a(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final b.c.b.b.z.k g() {
        return this.f5942a;
    }

    /* access modifiers changed from: package-private */
    public final b.c.b.b.l.h h() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.l.a();
    }

    /* access modifiers changed from: package-private */
    public void l() {
        b.c.b.b.z.g gVar = this.f5943b;
        if (gVar != null) {
            b.c.b.b.z.h.a(this.y, gVar);
        }
        if (r()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(z());
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
    }

    /* access modifiers changed from: package-private */
    public void n() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean t() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        int i2;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                i2 = 1;
                if (this.y.getLayerType() != 1) {
                    floatingActionButton = this.y;
                }
            } else if (this.y.getLayerType() != 0) {
                floatingActionButton = this.y;
                i2 = 0;
            }
            floatingActionButton.setLayerType(i2, null);
        }
        b.c.b.b.z.g gVar = this.f5943b;
        if (gVar != null) {
            gVar.a((int) this.r);
        }
    }

    /* access modifiers changed from: package-private */
    public final void v() {
        c(this.s);
    }

    /* access modifiers changed from: package-private */
    public final void w() {
        Rect rect = this.A;
        a(rect);
        b(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
