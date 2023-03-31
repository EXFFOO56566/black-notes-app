package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b.c.b.b.y.b;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class c extends b {
    c(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(b.F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.G, a(f, f3));
            stateListAnimator.addState(b.H, a(f, f2));
            stateListAnimator.addState(b.I, a(f, f2));
            stateListAnimator.addState(b.J, a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.F);
            stateListAnimator.addState(b.K, animatorSet);
            stateListAnimator.addState(b.L, a(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (s()) {
            w();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void a(Rect rect) {
        if (this.z.a()) {
            super.a(rect);
            return;
        }
        int sizeDimension = !t() ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void a(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.y.isEnabled()) {
                this.y.setElevation(this.h);
                if (this.y.isPressed()) {
                    floatingActionButton = this.y;
                    f = this.j;
                } else if (this.y.isFocused() || this.y.isHovered()) {
                    floatingActionButton = this.y;
                    f = this.i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.y.setElevation(0.0f);
            floatingActionButton = this.y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float b() {
        return this.y.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f5944c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(b.c.b.b.x.b.a(colorStateList));
        } else {
            super.b(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void k() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void m() {
        w();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public boolean s() {
        return this.z.a() || !t();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void u() {
    }
}
