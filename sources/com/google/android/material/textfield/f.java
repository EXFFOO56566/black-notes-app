package com.google.android.material.textfield;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import androidx.core.widget.i;
import b.c.b.b.d;
import b.c.b.b.l.b;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6018a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f6019b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f6020c;
    private int d;
    private FrameLayout e;
    private int f;
    private Animator g;
    private final float h;
    private int i;
    private int j;
    private CharSequence k;
    private boolean l;
    private TextView m;
    private int n;
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private int s;
    private ColorStateList t;
    private Typeface u;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f6022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6023c;
        final /* synthetic */ TextView d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.f6021a = i;
            this.f6022b = textView;
            this.f6023c = i2;
            this.d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            f.this.i = this.f6021a;
            f.this.g = null;
            TextView textView = this.f6022b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f6023c == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6018a = context;
        this.f6019b = textInputLayout;
        this.h = (float) context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
    }

    private ObjectAnimator a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(b.c.b.b.l.a.d);
        return ofFloat;
    }

    private ObjectAnimator a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(b.c.b.b.l.a.f1254a);
        return ofFloat;
    }

    private void a(int i2, int i3) {
        TextView d2;
        TextView d3;
        if (i2 != i3) {
            if (!(i3 == 0 || (d3 = d(i3)) == null)) {
                d3.setVisibility(0);
                d3.setAlpha(1.0f);
            }
            if (!(i2 == 0 || (d2 = d(i2)) == null)) {
                d2.setVisibility(4);
                if (i2 == 1) {
                    d2.setText((CharSequence) null);
                }
            }
            this.i = i3;
        }
    }

    private void a(int i2, int i3, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.q, this.r, 2, i2, i3);
            a(arrayList, this.l, this.m, 1, i2, i3);
            b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, d(i2), i2, d(i3)));
            animatorSet.start();
        } else {
            a(i2, i3);
        }
        this.f6019b.e();
        this.f6019b.a(z);
        this.f6019b.f();
    }

    private void a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private void a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void a(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(a(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(a(textView));
                }
            }
        }
    }

    private boolean a(TextView textView, CharSequence charSequence) {
        return u.C(this.f6019b) && this.f6019b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private TextView d(int i2) {
        if (i2 == 1) {
            return this.m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.r;
    }

    private boolean e(int i2) {
        return i2 == 1 && this.m != null && !TextUtils.isEmpty(this.k);
    }

    private boolean m() {
        return (this.f6020c == null || this.f6019b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (m()) {
            u.a(this.f6020c, u.t(this.f6019b.getEditText()), 0, u.s(this.f6019b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            a(this.m, typeface);
            a(this.r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(TextView textView, int i2) {
        if (this.f6020c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f6018a);
            this.f6020c = linearLayout;
            linearLayout.setOrientation(0);
            this.f6019b.addView(this.f6020c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f6018a);
            this.e = frameLayout;
            this.f6020c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f6020c.addView(new Space(this.f6018a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f6019b.getEditText() != null) {
                a();
            }
        }
        if (a(i2)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.f6020c.addView(textView, i2);
        }
        this.f6020c.setVisibility(0);
        this.d++;
    }

    /* access modifiers changed from: package-private */
    public void a(CharSequence charSequence) {
        b();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        a(this.i, this.j, a(this.m, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (this.l != z) {
            b();
            if (z) {
                z zVar = new z(this.f6018a);
                this.m = zVar;
                zVar.setId(b.c.b.b.f.textinput_error);
                Typeface typeface = this.u;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                b(this.n);
                a(this.o);
                this.m.setVisibility(4);
                u.g(this.m, 1);
                a(this.m, 0);
            } else {
                i();
                b(this.m, 0);
                this.m = null;
                this.f6019b.e();
                this.f6019b.f();
            }
            this.l = z;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.n = i2;
        TextView textView = this.m;
        if (textView != null) {
            this.f6019b.a(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.f6020c != null) {
            if (!a(i2) || (frameLayout = this.e) == null) {
                this.f6020c.removeView(textView);
            } else {
                int i3 = this.f - 1;
                this.f = i3;
                a(frameLayout, i3);
                this.e.removeView(textView);
            }
            int i4 = this.d - 1;
            this.d = i4;
            a(this.f6020c, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence) {
        b();
        this.p = charSequence;
        this.r.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        a(this.i, this.j, a(this.r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        if (this.q != z) {
            b();
            if (z) {
                z zVar = new z(this.f6018a);
                this.r = zVar;
                zVar.setId(b.c.b.b.f.textinput_helper_text);
                Typeface typeface = this.u;
                if (typeface != null) {
                    this.r.setTypeface(typeface);
                }
                this.r.setVisibility(4);
                u.g(this.r, 1);
                c(this.s);
                b(this.t);
                a(this.r, 1);
            } else {
                j();
                b(this.r, 1);
                this.r = null;
                this.f6019b.e();
                this.f6019b.f();
            }
            this.q = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        this.s = i2;
        TextView textView = this.r;
        if (textView != null) {
            i.d(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return e(this.j);
    }

    /* access modifiers changed from: package-private */
    public CharSequence d() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence g() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.k = null;
        b();
        if (this.i == 1) {
            this.j = (!this.q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        a(this.i, this.j, a(this.m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public void j() {
        b();
        if (this.i == 2) {
            this.j = 0;
        }
        a(this.i, this.j, a(this.r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.q;
    }
}
