package androidx.appcompat.widget;

import a.a.j;
import a.g.d.c.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f730a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f731b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f732c;
    private u0 d;
    private u0 e;
    private u0 f;
    private u0 g;
    private u0 h;
    private final a0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* access modifiers changed from: private */
    public static class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<y> f733a;

        /* renamed from: b  reason: collision with root package name */
        private final int f734b;

        /* renamed from: c  reason: collision with root package name */
        private final int f735c;

        /* renamed from: androidx.appcompat.widget.y$a$a  reason: collision with other inner class name */
        private class RunnableC0041a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private final WeakReference<y> f736b;

            /* renamed from: c  reason: collision with root package name */
            private final Typeface f737c;

            RunnableC0041a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.f736b = weakReference;
                this.f737c = typeface;
            }

            public void run() {
                y yVar = this.f736b.get();
                if (yVar != null) {
                    yVar.a(this.f737c);
                }
            }
        }

        a(y yVar, int i, int i2) {
            this.f733a = new WeakReference<>(yVar);
            this.f734b = i;
            this.f735c = i2;
        }

        @Override // a.g.d.c.f.a
        public void a(int i) {
        }

        @Override // a.g.d.c.f.a
        public void a(Typeface typeface) {
            int i;
            y yVar = this.f733a.get();
            if (yVar != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i = this.f734b) != -1) {
                    typeface = Typeface.create(typeface, i, (this.f735c & 2) != 0);
                }
                yVar.a(new RunnableC0041a(this, this.f733a, typeface));
            }
        }
    }

    y(TextView textView) {
        this.f730a = textView;
        this.i = new a0(this.f730a);
    }

    private static u0 a(Context context, j jVar, int i2) {
        ColorStateList b2 = jVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.d = true;
        u0Var.f700a = b2;
        return u0Var;
    }

    private void a(Context context, w0 w0Var) {
        String d2;
        Typeface typeface;
        Typeface typeface2;
        this.j = w0Var.d(j.TextAppearance_android_textStyle, this.j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int d3 = w0Var.d(j.TextAppearance_android_textFontWeight, -1);
            this.k = d3;
            if (d3 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (w0Var.g(j.TextAppearance_android_fontFamily) || w0Var.g(j.TextAppearance_fontFamily)) {
            this.l = null;
            int i2 = w0Var.g(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            int i3 = this.k;
            int i4 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface a2 = w0Var.a(i2, this.j, new a(this, i3, i4));
                    if (a2 != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                            a2 = Typeface.create(Typeface.create(a2, 0), this.k, (this.j & 2) != 0);
                        }
                        this.l = a2;
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (d2 = w0Var.d(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    typeface = Typeface.create(d2, this.j);
                } else {
                    Typeface create = Typeface.create(d2, 0);
                    int i5 = this.k;
                    if ((this.j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i5, z);
                }
                this.l = typeface;
            }
        } else if (w0Var.g(j.TextAppearance_android_typeface)) {
            this.m = false;
            int d4 = w0Var.d(j.TextAppearance_android_typeface, 1);
            if (d4 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (d4 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (d4 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.l = typeface2;
        }
    }

    private void a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f730a.getCompoundDrawablesRelative();
            TextView textView = this.f730a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f730a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f730a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f730a.getCompoundDrawables();
            TextView textView3 = this.f730a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable != null && u0Var != null) {
            j.a(drawable, u0Var, this.f730a.getDrawableState());
        }
    }

    private void b(int i2, float f2) {
        this.i.a(i2, f2);
    }

    private void l() {
        u0 u0Var = this.h;
        this.f731b = u0Var;
        this.f732c = u0Var;
        this.d = u0Var;
        this.e = u0Var;
        this.f = u0Var;
        this.g = u0Var;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!(this.f731b == null && this.f732c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.f730a.getCompoundDrawables();
            a(compoundDrawables[0], this.f731b);
            a(compoundDrawables[1], this.f732c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.f730a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.i.b(i2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2) {
        if (!b.f814a && !j()) {
            b(i2, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        this.i.a(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, int i2) {
        String d2;
        ColorStateList a2;
        w0 a3 = w0.a(context, i2, j.TextAppearance);
        if (a3.g(j.TextAppearance_textAllCaps)) {
            a(a3.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a3.g(j.TextAppearance_android_textColor) && (a2 = a3.a(j.TextAppearance_android_textColor)) != null) {
            this.f730a.setTextColor(a2);
        }
        if (a3.g(j.TextAppearance_android_textSize) && a3.c(j.TextAppearance_android_textSize, -1) == 0) {
            this.f730a.setTextSize(0, 0.0f);
        }
        a(context, a3);
        if (Build.VERSION.SDK_INT >= 26 && a3.g(j.TextAppearance_fontVariationSettings) && (d2 = a3.d(j.TextAppearance_fontVariationSettings)) != null) {
            this.f730a.setFontVariationSettings(d2);
        }
        a3.a();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f730a.setTypeface(typeface, this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f700a = colorStateList;
        u0Var.d = colorStateList != null;
        l();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f701b = mode;
        u0Var.f702c = mode != null;
        l();
    }

    public void a(Typeface typeface) {
        if (this.m) {
            this.f730a.setTypeface(typeface);
            this.l = typeface;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        j jVar;
        int i3;
        Context context = this.f730a.getContext();
        j b2 = j.b();
        w0 a2 = w0.a(context, attributeSet, j.AppCompatTextHelper, i2, 0);
        int g2 = a2.g(j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.g(j.AppCompatTextHelper_android_drawableLeft)) {
            this.f731b = a(context, b2, a2.g(j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.g(j.AppCompatTextHelper_android_drawableTop)) {
            this.f732c = a(context, b2, a2.g(j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.g(j.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, b2, a2.g(j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.g(j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, b2, a2.g(j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.g(j.AppCompatTextHelper_android_drawableStart)) {
                this.f = a(context, b2, a2.g(j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a2.g(j.AppCompatTextHelper_android_drawableEnd)) {
                this.g = a(context, b2, a2.g(j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a2.a();
        boolean z3 = this.f730a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g2 != -1) {
            w0 a3 = w0.a(context, g2, j.TextAppearance);
            if (z3 || !a3.g(j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = a3.a(j.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = a3.g(j.TextAppearance_android_textColor) ? a3.a(j.TextAppearance_android_textColor) : null;
                colorStateList3 = a3.g(j.TextAppearance_android_textColorHint) ? a3.a(j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = a3.g(j.TextAppearance_android_textColorLink) ? a3.a(j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str2 = a3.g(j.TextAppearance_textLocale) ? a3.d(j.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !a3.g(j.TextAppearance_fontVariationSettings)) ? null : a3.d(j.TextAppearance_fontVariationSettings);
            a3.a();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            colorStateList2 = null;
            z2 = false;
            z = false;
            colorStateList = null;
        }
        w0 a4 = w0.a(context, attributeSet, j.TextAppearance, i2, 0);
        if (!z3 && a4.g(j.TextAppearance_textAllCaps)) {
            z2 = a4.a(j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.g(j.TextAppearance_android_textColor)) {
                colorStateList = a4.a(j.TextAppearance_android_textColor);
            }
            if (a4.g(j.TextAppearance_android_textColorHint)) {
                colorStateList3 = a4.a(j.TextAppearance_android_textColorHint);
            }
            if (a4.g(j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a4.a(j.TextAppearance_android_textColorLink);
            }
        }
        if (a4.g(j.TextAppearance_textLocale)) {
            str2 = a4.d(j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && a4.g(j.TextAppearance_fontVariationSettings)) {
            str = a4.d(j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT < 28 || !a4.g(j.TextAppearance_android_textSize) || a4.c(j.TextAppearance_android_textSize, -1) != 0) {
            jVar = b2;
        } else {
            jVar = b2;
            this.f730a.setTextSize(0, 0.0f);
        }
        a(context, a4);
        a4.a();
        if (colorStateList != null) {
            this.f730a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.f730a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f730a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z) {
            a(z2);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f730a.setTypeface(typeface, this.j);
            } else {
                this.f730a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f730a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 24) {
                this.f730a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i4 >= 21) {
                this.f730a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.i.a(attributeSet, i2);
        if (b.f814a && this.i.f() != 0) {
            int[] e2 = this.i.e();
            if (e2.length > 0) {
                if (((float) this.f730a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f730a.setAutoSizeTextTypeUniformWithConfiguration(this.i.c(), this.i.b(), this.i.d(), 0);
                } else {
                    this.f730a.setAutoSizeTextTypeUniformWithPresetSizes(e2, 0);
                }
            }
        }
        w0 a5 = w0.a(context, attributeSet, j.AppCompatTextView);
        int g3 = a5.g(j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable a6 = g3 != -1 ? jVar.a(context, g3) : null;
        int g4 = a5.g(j.AppCompatTextView_drawableTopCompat, -1);
        Drawable a7 = g4 != -1 ? jVar.a(context, g4) : null;
        int g5 = a5.g(j.AppCompatTextView_drawableRightCompat, -1);
        Drawable a8 = g5 != -1 ? jVar.a(context, g5) : null;
        int g6 = a5.g(j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable a9 = g6 != -1 ? jVar.a(context, g6) : null;
        int g7 = a5.g(j.AppCompatTextView_drawableStartCompat, -1);
        Drawable a10 = g7 != -1 ? jVar.a(context, g7) : null;
        int g8 = a5.g(j.AppCompatTextView_drawableEndCompat, -1);
        a(a6, a7, a8, a9, a10, g8 != -1 ? jVar.a(context, g8) : null);
        if (a5.g(j.AppCompatTextView_drawableTint)) {
            i.a(this.f730a, a5.a(j.AppCompatTextView_drawableTint));
        }
        if (a5.g(j.AppCompatTextView_drawableTintMode)) {
            i3 = -1;
            i.a(this.f730a, e0.a(a5.d(j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i3 = -1;
        }
        int c2 = a5.c(j.AppCompatTextView_firstBaselineToTopHeight, i3);
        int c3 = a5.c(j.AppCompatTextView_lastBaselineToBottomHeight, i3);
        int c4 = a5.c(j.AppCompatTextView_lineHeight, i3);
        a5.a();
        if (c2 != i3) {
            i.a(this.f730a, c2);
        }
        if (c3 != i3) {
            i.b(this.f730a, c3);
        }
        if (c4 != i3) {
            i.c(this.f730a, c4);
        }
    }

    public void a(Runnable runnable) {
        this.f730a.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f730a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i2, int i3, int i4, int i5) {
        if (!b.f814a) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr, int i2) {
        this.i.a(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.i.b();
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.i.c();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.i.d();
    }

    /* access modifiers changed from: package-private */
    public int[] f() {
        return this.i.e();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.i.f();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f700a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode i() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f701b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.i.g();
    }

    /* access modifiers changed from: package-private */
    public void k() {
        a();
    }
}
