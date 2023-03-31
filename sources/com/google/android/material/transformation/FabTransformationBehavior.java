package com.google.android.material.transformation;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.b.b.f;
import b.c.b.b.l.h;
import b.c.b.b.l.i;
import b.c.b.b.l.j;
import b.c.b.b.p.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f6032c;
    private final RectF d;
    private final RectF e;
    private final int[] f;
    private float g;
    private float h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6034b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6035c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f6033a = z;
            this.f6034b = view;
            this.f6035c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6033a) {
                this.f6034b.setVisibility(4);
                this.f6035c.setAlpha(1.0f);
                this.f6035c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f6033a) {
                this.f6034b.setVisibility(0);
                this.f6035c.setAlpha(0.0f);
                this.f6035c.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6036a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f6036a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6036a.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.c.b.b.p.d f6037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f6038b;

        c(FabTransformationBehavior fabTransformationBehavior, b.c.b.b.p.d dVar, Drawable drawable) {
            this.f6037a = dVar;
            this.f6038b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6037a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.f6037a.setCircularRevealOverlayDrawable(this.f6038b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.c.b.b.p.d f6039a;

        d(FabTransformationBehavior fabTransformationBehavior, b.c.b.b.p.d dVar) {
            this.f6039a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f6039a.getRevealInfo();
            revealInfo.f1282c = Float.MAX_VALUE;
            this.f6039a.setRevealInfo(revealInfo);
        }
    }

    /* access modifiers changed from: protected */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f6040a;

        /* renamed from: b  reason: collision with root package name */
        public j f6041b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f6032c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6032c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    private float a(View view, View view2, j jVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        rectF2.offset(-c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float a(e eVar, i iVar, float f2, float f3) {
        long a2 = iVar.a();
        long b2 = iVar.b();
        i a3 = eVar.f6040a.a("expansion");
        return b.c.b.b.l.a.a(f2, f3, iVar.c().getInterpolation(((float) (((a3.a() + a3.b()) + 17) - a2)) / ((float) b2)));
    }

    private Pair<i, i> a(float f2, float f3, boolean z, e eVar) {
        String str;
        h hVar;
        i iVar;
        int i;
        if (f2 == 0.0f || f3 == 0.0f) {
            iVar = eVar.f6040a.a("translationXLinear");
            hVar = eVar.f6040a;
            str = "translationYLinear";
        } else if ((!z || f3 >= 0.0f) && (z || i <= 0)) {
            iVar = eVar.f6040a.a("translationXCurveDownwards");
            hVar = eVar.f6040a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f6040a.a("translationXCurveUpwards");
            hVar = eVar.f6040a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.a(str));
    }

    private ViewGroup a(View view) {
        View findViewById = view.findViewById(f.mtrl_child_content_container);
        return findViewById != null ? c(findViewById) : ((view instanceof b) || (view instanceof a)) ? c(((ViewGroup) view).getChildAt(0)) : c(view);
    }

    private void a(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void a(View view, long j, long j2, long j3, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    private void a(View view, RectF rectF) {
        b(view, rectF);
        rectF.offset(this.g, this.h);
    }

    private void a(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float c2 = c(view, view2, eVar.f6041b);
        float d2 = d(view, view2, eVar.f6041b);
        Pair<i, i> a2 = a(c2, d2, z, eVar);
        i iVar = (i) a2.first;
        i iVar2 = (i) a2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            c2 = this.g;
        }
        fArr[0] = c2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            d2 = this.h;
        }
        fArr2[0] = d2;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a((Animator) ofFloat);
        iVar2.a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof b.c.b.b.p.d) {
            b.c.b.b.p.d dVar = (b.c.b.b.p.d) view2;
            float a2 = a(view, view2, eVar.f6041b);
            float b2 = b(view, view2, eVar.f6041b);
            ((FloatingActionButton) view).a(this.f6032c);
            float width = ((float) this.f6032c.width()) / 2.0f;
            i a3 = eVar.f6040a.a("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new d.e(a2, b2, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f1282c;
                }
                animator = b.c.b.b.p.a.a(dVar, a2, b2, b.c.b.b.u.a.a(a2, b2, 0.0f, 0.0f, f2, f3));
                animator.addListener(new d(this, dVar));
                a(view2, a3.a(), (int) a2, (int) b2, width, list);
            } else {
                float f4 = dVar.getRevealInfo().f1282c;
                Animator a4 = b.c.b.b.p.a.a(dVar, a2, b2, width);
                int i = (int) a2;
                int i2 = (int) b2;
                a(view2, a3.a(), i, i2, f4, list);
                a(view2, a3.a(), a3.b(), eVar.f6040a.a(), i, i2, width, list);
                animator = a4;
            }
            a3.a(animator);
            list.add(animator);
            list2.add(b.c.b.b.p.a.a(dVar));
        }
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a2;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof b.c.b.b.p.d) || b.c.b.b.p.c.f1275a != 0) && (a2 = a(view2)) != null) {
                if (z) {
                    if (!z2) {
                        b.c.b.b.l.d.f1258a.set(a2, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(a2, b.c.b.b.l.d.f1258a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(a2, b.c.b.b.l.d.f1258a, 0.0f);
                }
                eVar.f6040a.a("contentFade").a((Animator) objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void a(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float c2 = c(view, view2, eVar.f6041b);
        float d2 = d(view, view2, eVar.f6041b);
        Pair<i, i> a2 = a(c2, d2, z, eVar);
        i iVar = (i) a2.first;
        i iVar2 = (i) a2.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-c2);
                view2.setTranslationY(-d2);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            a(view2, eVar, iVar, iVar2, -c2, -d2, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -c2);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -d2);
        }
        iVar.a((Animator) objectAnimator2);
        iVar2.a((Animator) objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    private void a(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float a2 = a(eVar, iVar, f2, f4);
        float a3 = a(eVar, iVar2, f3, f5);
        Rect rect = this.f6032c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        b(view, rectF3);
        rectF3.offset(a2, a3);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float b(View view, View view2, j jVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        rectF2.offset(0.0f, -d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private int b(View view) {
        ColorStateList g2 = u.g(view);
        if (g2 != null) {
            return g2.getColorForState(view.getDrawableState(), g2.getDefaultColor());
        }
        return 0;
    }

    private void b(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void b(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof b.c.b.b.p.d) {
            b.c.b.b.p.d dVar = (b.c.b.b.p.d) view2;
            int b2 = b(view);
            int i = 16777215 & b2;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(b2);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0064d.f1279a, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0064d.f1279a, b2);
            }
            objectAnimator.setEvaluator(b.c.b.b.l.c.a());
            eVar.f6040a.a("color").a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    private float c(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        int i = jVar.f1270a & 7;
        if (i == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i != 5) {
            f2 = 0.0f;
            return f2 + jVar.f1271b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + jVar.f1271b;
    }

    private ViewGroup c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    private void c(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float k = u.k(view2) - u.k(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-k);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -k);
        }
        eVar.f6040a.a("elevation").a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    private float d(View view, View view2, j jVar) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        b(view2, rectF2);
        int i = jVar.f1270a & 112;
        if (i == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i != 80) {
            f2 = 0.0f;
            return f2 + jVar.f1272c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + jVar.f1272c;
    }

    private void d(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof b.c.b.b.p.d) && (view instanceof ImageView)) {
            b.c.b.b.p.d dVar = (b.c.b.b.p.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, b.c.b.b.l.e.f1259b, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, b.c.b.b.l.e.f1259b, 255);
                }
                objectAnimator.addUpdateListener(new b(this, view2));
                eVar.f6040a.a("iconFade").a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(this, dVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract e a(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void a(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        e a2 = a(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            c(view, view2, z, z2, a2, arrayList, arrayList2);
        }
        RectF rectF = this.d;
        a(view, view2, z, z2, a2, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        a(view, view2, z, a2, arrayList);
        d(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, width, height, arrayList, arrayList2);
        b(view, view2, z, z2, a2, arrayList, arrayList2);
        a(view, view2, z, z2, a2, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        b.c.b.b.l.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }
}
