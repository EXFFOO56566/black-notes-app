package com.google.android.material.internal;

import a.g.j.e;
import a.g.l.u;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import b.c.b.b.w.a;
import b.c.b.b.w.d;

public final class a {
    private static final boolean V = (Build.VERSION.SDK_INT < 18);
    private static final Paint W = null;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private final TextPaint J;
    private final TextPaint K;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;

    /* renamed from: a  reason: collision with root package name */
    private final View f5957a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5958b;

    /* renamed from: c  reason: collision with root package name */
    private float f5959c;
    private final Rect d;
    private final Rect e;
    private final RectF f;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private b.c.b.b.w.a v;
    private b.c.b.b.w.a w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C0087a implements a.AbstractC0065a {
        C0087a() {
        }

        @Override // b.c.b.b.w.a.AbstractC0065a
        public void a(Typeface typeface) {
            a.this.a(typeface);
        }
    }

    static {
        Paint paint = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            W.setColor(-65281);
        }
    }

    public a(View view) {
        this.f5957a = view;
        this.J = new TextPaint(129);
        this.K = new TextPaint(this.J);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return b.c.b.b.l.a.a(f2, f3, f4);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private void a(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void b(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    private boolean b(CharSequence charSequence) {
        boolean z2 = true;
        if (u.o(this.f5957a) != 1) {
            z2 = false;
        }
        return (z2 ? e.d : e.f182c).a(charSequence, 0, charSequence.length());
    }

    private int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private void c(float f2) {
        int i2;
        TextPaint textPaint;
        e(f2);
        this.q = a(this.o, this.p, f2, this.L);
        this.r = a(this.m, this.n, f2, this.L);
        f(a(this.i, this.j, f2, this.M));
        if (this.l != this.k) {
            textPaint = this.J;
            i2 = a(n(), d(), f2);
        } else {
            textPaint = this.J;
            i2 = d();
        }
        textPaint.setColor(i2);
        this.J.setShadowLayer(a(this.R, this.N, f2, (TimeInterpolator) null), a(this.S, this.O, f2, (TimeInterpolator) null), a(this.T, this.P, f2, (TimeInterpolator) null), a(c(this.U), c(this.Q), f2));
        u.G(this.f5957a);
    }

    private boolean c(Typeface typeface) {
        b.c.b.b.w.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.s == typeface) {
            return false;
        }
        this.s = typeface;
        return true;
    }

    private void d(float f2) {
        float f3;
        boolean z2;
        boolean z3;
        if (this.x != null) {
            float width = (float) this.e.width();
            float width2 = (float) this.d.width();
            boolean z4 = true;
            if (a(f2, this.j)) {
                f3 = this.j;
                this.F = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (a(f2, this.i)) {
                    this.F = 1.0f;
                } else {
                    this.F = f2 / this.i;
                }
                float f5 = this.j / this.i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
                z2 = z3;
            }
            if (width > 0.0f) {
                z2 = this.G != f3 || this.I || z2;
                this.G = f3;
                this.I = false;
            }
            if (this.y == null || z2) {
                this.J.setTextSize(this.G);
                this.J.setTypeface(this.u);
                TextPaint textPaint = this.J;
                if (this.F == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.x, this.J, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.y)) {
                    this.y = ellipsize;
                    this.z = b(ellipsize);
                }
            }
        }
    }

    private boolean d(Typeface typeface) {
        b.c.b.b.w.a aVar = this.v;
        if (aVar != null) {
            aVar.a();
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        return true;
    }

    private void e(float f2) {
        this.f.left = a((float) this.d.left, (float) this.e.left, f2, this.L);
        this.f.top = a(this.m, this.n, f2, this.L);
        this.f.right = a((float) this.d.right, (float) this.e.right, f2, this.L);
        this.f.bottom = a((float) this.d.bottom, (float) this.e.bottom, f2, this.L);
    }

    private void f(float f2) {
        d(f2);
        boolean z2 = V && this.F != 1.0f;
        this.A = z2;
        if (z2) {
            m();
        }
        u.G(this.f5957a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.j():void");
    }

    private void k() {
        c(this.f5959c);
    }

    private void l() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private void m() {
        if (this.B == null && !this.d.isEmpty() && !TextUtils.isEmpty(this.y)) {
            c(0.0f);
            this.D = this.J.ascent();
            this.E = this.J.descent();
            TextPaint textPaint = this.J;
            CharSequence charSequence = this.y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.E - this.D);
            if (round > 0 && round2 > 0) {
                this.B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.B);
                CharSequence charSequence2 = this.y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.J.descent(), this.J);
                if (this.C == null) {
                    this.C = new Paint(3);
                }
            }
        }
    }

    private int n() {
        return c(this.k);
    }

    public float a() {
        if (this.x == null) {
            return 0.0f;
        }
        a(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void a(float f2) {
        if (this.i != f2) {
            this.i = f2;
            i();
        }
    }

    public void a(int i2) {
        d dVar = new d(this.f5957a.getContext(), i2);
        ColorStateList colorStateList = dVar.f1290b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f2 = dVar.f1289a;
        if (f2 != 0.0f) {
            this.j = f2;
        }
        ColorStateList colorStateList2 = dVar.f;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.g;
        this.P = dVar.h;
        this.N = dVar.i;
        b.c.b.b.w.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        this.w = new b.c.b.b.w.a(new C0087a(), dVar.a());
        dVar.a(this.f5957a.getContext(), this.w);
        i();
    }

    public void a(int i2, int i3, int i4, int i5) {
        if (!a(this.e, i2, i3, i4, i5)) {
            this.e.set(i2, i3, i4, i5);
            this.I = true;
            h();
        }
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        i();
    }

    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            i();
        }
    }

    public void a(Canvas canvas) {
        float f2;
        int save = canvas.save();
        if (this.y != null && this.f5958b) {
            float f3 = this.q;
            float f4 = this.r;
            boolean z2 = this.A && this.B != null;
            if (z2) {
                f2 = this.D * this.F;
            } else {
                f2 = this.J.ascent() * this.F;
                this.J.descent();
            }
            if (z2) {
                f4 += f2;
            }
            float f5 = this.F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f3, f4);
            }
            if (z2) {
                canvas.drawBitmap(this.B, f3, f4, this.C);
            } else {
                CharSequence charSequence = this.y;
                canvas.drawText(charSequence, 0, charSequence.length(), f3, f4, this.J);
            }
        }
        canvas.restoreToCount(save);
    }

    public void a(Rect rect) {
        a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a(RectF rectF) {
        boolean b2 = b(this.x);
        Rect rect = this.e;
        float a2 = !b2 ? (float) rect.left : ((float) rect.right) - a();
        rectF.left = a2;
        Rect rect2 = this.e;
        rectF.top = (float) rect2.top;
        rectF.right = !b2 ? a2 + a() : (float) rect2.right;
        rectF.bottom = ((float) this.e.top) + c();
    }

    public void a(Typeface typeface) {
        if (c(typeface)) {
            i();
        }
    }

    public void a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            l();
            i();
        }
    }

    public final boolean a(int[] iArr) {
        this.H = iArr;
        if (!g()) {
            return false;
        }
        i();
        return true;
    }

    public ColorStateList b() {
        return this.l;
    }

    public void b(float f2) {
        float a2 = a.g.g.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.f5959c) {
            this.f5959c = a2;
            k();
        }
    }

    public void b(int i2) {
        if (this.h != i2) {
            this.h = i2;
            i();
        }
    }

    public void b(int i2, int i3, int i4, int i5) {
        if (!a(this.d, i2, i3, i4, i5)) {
            this.d.set(i2, i3, i4, i5);
            this.I = true;
            h();
        }
    }

    public void b(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        i();
    }

    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            i();
        }
    }

    public void b(Rect rect) {
        b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void b(Typeface typeface) {
        boolean c2 = c(typeface);
        boolean d2 = d(typeface);
        if (c2 || d2) {
            i();
        }
    }

    public float c() {
        a(this.K);
        return -this.K.ascent();
    }

    public void c(int i2) {
        if (this.g != i2) {
            this.g = i2;
            i();
        }
    }

    public int d() {
        return c(this.l);
    }

    public float e() {
        b(this.K);
        return -this.K.ascent();
    }

    public float f() {
        return this.f5959c;
    }

    public final boolean g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f5958b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void i() {
        if (this.f5957a.getHeight() > 0 && this.f5957a.getWidth() > 0) {
            j();
            k();
        }
    }
}
