package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import b.c.b.b.l.h;
import b.c.b.b.w.d;
import b.c.b.b.z.g;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.material.internal.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class a extends g implements b, Drawable.Callback, f.b {
    private static final int[] G0 = {16842910};
    private static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    private float A;
    private ColorStateList A0;
    private ColorStateList B;
    private WeakReference<AbstractC0083a> B0;
    private float C;
    private TextUtils.TruncateAt C0;
    private ColorStateList D;
    private boolean D0;
    private CharSequence E;
    private int E0;
    private boolean F;
    private boolean F0;
    private Drawable G;
    private ColorStateList H;
    private float I;
    private boolean J;
    private boolean K;
    private Drawable L;
    private Drawable M;
    private ColorStateList N;
    private float O;
    private CharSequence P;
    private boolean Q;
    private boolean R;
    private Drawable S;
    private h T;
    private h U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private float Z;
    private float a0;
    private float b0;
    private float c0;
    private final Context d0;
    private final Paint e0 = new Paint(1);
    private final Paint f0;
    private final Paint.FontMetrics g0 = new Paint.FontMetrics();
    private final RectF h0 = new RectF();
    private final PointF i0 = new PointF();
    private final Path j0 = new Path();
    private final f k0;
    private int l0;
    private int m0;
    private int n0;
    private int o0;
    private int p0;
    private int q0;
    private boolean r0;
    private int s0;
    private int t0 = 255;
    private ColorFilter u0;
    private PorterDuffColorFilter v0;
    private ColorStateList w0;
    private ColorStateList x;
    private PorterDuff.Mode x0 = PorterDuff.Mode.SRC_IN;
    private ColorStateList y;
    private int[] y0;
    private float z;
    private boolean z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface AbstractC0083a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = null;
        this.B0 = new WeakReference<>(null);
        a(context);
        this.d0 = context;
        f fVar = new f(this);
        this.k0 = fVar;
        this.E = BuildConfig.FLAVOR;
        fVar.b().density = context.getResources().getDisplayMetrics().density;
        this.f0 = null;
        if (0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(G0);
        a(G0);
        this.D0 = true;
        if (b.c.b.b.x.b.f1301a) {
            H0.setTint(-1);
        }
    }

    public static a a(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.a(attributeSet, i, i2);
        return aVar;
    }

    private void a(Canvas canvas, Rect rect) {
        if (f0()) {
            a(rect, this.h0);
            RectF rectF = this.h0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.S.setBounds(0, 0, (int) this.h0.width(), (int) this.h0.height());
            this.S.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (g0() || f0()) {
            float f = this.V + this.W;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.I;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.I;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.I;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.util.AttributeSet r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 459
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.a(android.util.AttributeSet, int, int):void");
    }

    private static boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(int[] r7, int[] r8) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.a(int[], int[]):boolean");
    }

    private void b(Canvas canvas, Rect rect) {
        if (!this.F0) {
            this.e0.setColor(this.m0);
            this.e0.setStyle(Paint.Style.FILL);
            this.e0.setColorFilter(e0());
            this.h0.set(rect);
            canvas.drawRoundRect(this.h0, w(), w(), this.e0);
        }
    }

    private void b(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (h0()) {
            float f = this.c0 + this.b0 + this.O + this.a0 + this.Z;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    private static boolean b(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f1290b) == null || !colorStateList.isStateful()) ? false : true;
    }

    private void c(Canvas canvas, Rect rect) {
        if (g0()) {
            a(rect, this.h0);
            RectF rectF = this.h0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.G.setBounds(0, 0, (int) this.h0.width(), (int) this.h0.height());
            this.G.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (h0()) {
            float f = this.c0 + this.b0;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.O;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.O;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.O;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private float c0() {
        this.k0.b().getFontMetrics(this.g0);
        Paint.FontMetrics fontMetrics = this.g0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private void d(Canvas canvas, Rect rect) {
        if (this.C > 0.0f && !this.F0) {
            this.e0.setColor(this.o0);
            this.e0.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                this.e0.setColorFilter(e0());
            }
            RectF rectF = this.h0;
            float f = this.C;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.A - (this.C / 2.0f);
            canvas.drawRoundRect(this.h0, f2, f2, this.e0);
        }
    }

    private void d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (h0()) {
            float f = this.c0 + this.b0 + this.O + this.a0 + this.Z;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.a(drawable, androidx.core.graphics.drawable.a.e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.L) {
                if (drawable.isStateful()) {
                    drawable.setState(K());
                }
                androidx.core.graphics.drawable.a.a(drawable, this.N);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.G;
            if (drawable == drawable2 && this.J) {
                androidx.core.graphics.drawable.a.a(drawable2, this.H);
            }
        }
    }

    private boolean d0() {
        return this.R && this.S != null && this.Q;
    }

    private void e(Canvas canvas, Rect rect) {
        if (!this.F0) {
            this.e0.setColor(this.l0);
            this.e0.setStyle(Paint.Style.FILL);
            this.h0.set(rect);
            canvas.drawRoundRect(this.h0, w(), w(), this.e0);
        }
    }

    private void e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.E != null) {
            float s = this.V + s() + this.Y;
            float t = this.c0 + t() + this.Z;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.left = ((float) rect.left) + s;
                rectF.right = ((float) rect.right) - t;
            } else {
                rectF.left = ((float) rect.left) + t;
                rectF.right = ((float) rect.right) - s;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean e(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private ColorFilter e0() {
        ColorFilter colorFilter = this.u0;
        return colorFilter != null ? colorFilter : this.v0;
    }

    private void f(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (h0()) {
            c(rect, this.h0);
            RectF rectF = this.h0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.L.setBounds(0, 0, (int) this.h0.width(), (int) this.h0.height());
            if (b.c.b.b.x.b.f1301a) {
                this.M.setBounds(this.L.getBounds());
                this.M.jumpToCurrentState();
                drawable = this.M;
            } else {
                drawable = this.L;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private boolean f0() {
        return this.R && this.S != null && this.r0;
    }

    private void g(Canvas canvas, Rect rect) {
        this.e0.setColor(this.p0);
        this.e0.setStyle(Paint.Style.FILL);
        this.h0.set(rect);
        if (!this.F0) {
            canvas.drawRoundRect(this.h0, w(), w(), this.e0);
            return;
        }
        a(new RectF(rect), this.j0);
        super.a(canvas, this.e0, this.j0, d());
    }

    private boolean g0() {
        return this.F && this.G != null;
    }

    private void h(Canvas canvas, Rect rect) {
        Paint paint = this.f0;
        if (paint != null) {
            paint.setColor(a.g.e.a.c(-16777216, 127));
            canvas.drawRect(rect, this.f0);
            if (g0() || f0()) {
                a(rect, this.h0);
                canvas.drawRect(this.h0, this.f0);
            }
            if (this.E != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f0);
            }
            if (h0()) {
                c(rect, this.h0);
                canvas.drawRect(this.h0, this.f0);
            }
            this.f0.setColor(a.g.e.a.c(-65536, 127));
            b(rect, this.h0);
            canvas.drawRect(this.h0, this.f0);
            this.f0.setColor(a.g.e.a.c(-16711936, 127));
            d(rect, this.h0);
            canvas.drawRect(this.h0, this.f0);
        }
    }

    private static boolean h(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private boolean h0() {
        return this.K && this.L != null;
    }

    private void i(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            onStateChange(getState());
        }
    }

    private void i(Canvas canvas, Rect rect) {
        if (this.E != null) {
            Paint.Align a2 = a(rect, this.i0);
            e(rect, this.h0);
            if (this.k0.a() != null) {
                this.k0.b().drawableState = getState();
                this.k0.a(this.d0);
            }
            this.k0.b().setTextAlign(a2);
            int i = 0;
            boolean z2 = Math.round(this.k0.a(S().toString())) > Math.round(this.h0.width());
            if (z2) {
                i = canvas.save();
                canvas.clipRect(this.h0);
            }
            CharSequence charSequence = this.E;
            if (z2 && this.C0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.k0.b(), this.h0.width(), this.C0);
            }
            int length = charSequence.length();
            PointF pointF = this.i0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.k0.b());
            if (z2) {
                canvas.restoreToCount(i);
            }
        }
    }

    private void i0() {
        this.A0 = this.z0 ? b.c.b.b.x.b.a(this.D) : null;
    }

    @TargetApi(21)
    private void j0() {
        this.M = new RippleDrawable(b.c.b.b.x.b.a(Q()), this.L, H0);
    }

    public ColorStateList A() {
        return this.H;
    }

    public void A(int i) {
        a(new d(this.d0, i));
    }

    public float B() {
        return this.z;
    }

    public void B(int i) {
        p(this.d0.getResources().getDimension(i));
    }

    public float C() {
        return this.V;
    }

    public void C(int i) {
        q(this.d0.getResources().getDimension(i));
    }

    public ColorStateList D() {
        return this.B;
    }

    public float E() {
        return this.C;
    }

    public Drawable F() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return null;
    }

    public CharSequence G() {
        return this.P;
    }

    public float H() {
        return this.b0;
    }

    public float I() {
        return this.O;
    }

    public float J() {
        return this.a0;
    }

    public int[] K() {
        return this.y0;
    }

    public ColorStateList L() {
        return this.N;
    }

    public TextUtils.TruncateAt M() {
        return this.C0;
    }

    public h N() {
        return this.U;
    }

    public float O() {
        return this.X;
    }

    public float P() {
        return this.W;
    }

    public ColorStateList Q() {
        return this.D;
    }

    public h R() {
        return this.T;
    }

    public CharSequence S() {
        return this.E;
    }

    public d T() {
        return this.k0.a();
    }

    public float U() {
        return this.Z;
    }

    public float V() {
        return this.Y;
    }

    public boolean W() {
        return this.z0;
    }

    public boolean X() {
        return this.Q;
    }

    public boolean Y() {
        return e(this.L);
    }

    public boolean Z() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public Paint.Align a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.E != null) {
            float s = this.V + s() + this.Y;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                pointF.x = ((float) rect.left) + s;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - s;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - c0();
        }
        return align;
    }

    @Override // com.google.android.material.internal.f.b
    public void a() {
        a0();
        invalidateSelf();
    }

    public void a(RectF rectF) {
        d(getBounds(), rectF);
    }

    public void a(Drawable drawable) {
        if (this.S != drawable) {
            float s = s();
            this.S = drawable;
            float s2 = s();
            f(this.S);
            d(this.S);
            invalidateSelf();
            if (s != s2) {
                a0();
            }
        }
    }

    public void a(TextUtils.TruncateAt truncateAt) {
        this.C0 = truncateAt;
    }

    public void a(h hVar) {
        this.U = hVar;
    }

    public void a(d dVar) {
        this.k0.a(dVar, this.d0);
    }

    public void a(AbstractC0083a aVar) {
        this.B0 = new WeakReference<>(aVar);
    }

    public void a(CharSequence charSequence) {
        if (this.P != charSequence) {
            this.P = a.g.j.a.b().a(charSequence);
            invalidateSelf();
        }
    }

    public void a(boolean z2) {
        if (this.Q != z2) {
            this.Q = z2;
            float s = s();
            if (!z2 && this.r0) {
                this.r0 = false;
            }
            float s2 = s();
            invalidateSelf();
            if (s != s2) {
                a0();
            }
        }
    }

    public boolean a(int[] iArr) {
        if (Arrays.equals(this.y0, iArr)) {
            return false;
        }
        this.y0 = iArr;
        if (h0()) {
            return a(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void a0() {
        AbstractC0083a aVar = this.B0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void b(int i) {
        a(this.d0.getResources().getBoolean(i));
    }

    public void b(Drawable drawable) {
        Drawable y2 = y();
        if (y2 != drawable) {
            float s = s();
            this.G = drawable != null ? androidx.core.graphics.drawable.a.i(drawable).mutate() : null;
            float s2 = s();
            f(y2);
            if (g0()) {
                d(this.G);
            }
            invalidateSelf();
            if (s != s2) {
                a0();
            }
        }
    }

    public void b(h hVar) {
        this.T = hVar;
    }

    public void b(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.E, charSequence)) {
            this.E = charSequence;
            this.k0.a(true);
            invalidateSelf();
            a0();
        }
    }

    public void b(boolean z2) {
        if (this.R != z2) {
            boolean f02 = f0();
            this.R = z2;
            boolean f03 = f0();
            if (f02 != f03) {
                if (f03) {
                    d(this.S);
                } else {
                    f(this.S);
                }
                invalidateSelf();
                a0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        return this.D0;
    }

    public void c(int i) {
        a(a.a.k.a.a.c(this.d0, i));
    }

    public void c(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            onStateChange(getState());
        }
    }

    public void c(Drawable drawable) {
        Drawable F2 = F();
        if (F2 != drawable) {
            float t = t();
            this.L = drawable != null ? androidx.core.graphics.drawable.a.i(drawable).mutate() : null;
            if (b.c.b.b.x.b.f1301a) {
                j0();
            }
            float t2 = t();
            f(F2);
            if (h0()) {
                d(this.L);
            }
            invalidateSelf();
            if (t != t2) {
                a0();
            }
        }
    }

    public void c(boolean z2) {
        if (this.F != z2) {
            boolean g02 = g0();
            this.F = z2;
            boolean g03 = g0();
            if (g02 != g03) {
                if (g03) {
                    d(this.G);
                } else {
                    f(this.G);
                }
                invalidateSelf();
                a0();
            }
        }
    }

    public void d(int i) {
        b(this.d0.getResources().getBoolean(i));
    }

    public void d(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (g0()) {
                androidx.core.graphics.drawable.a.a(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d(boolean z2) {
        if (this.K != z2) {
            boolean h02 = h0();
            this.K = z2;
            boolean h03 = h0();
            if (h02 != h03) {
                if (h03) {
                    d(this.L);
                } else {
                    f(this.L);
                }
                invalidateSelf();
                a0();
            }
        }
    }

    @Override // b.c.b.b.z.g
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.t0;
            if (i2 < 255) {
                i = b.c.b.b.m.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            e(canvas, bounds);
            b(canvas, bounds);
            if (this.F0) {
                super.draw(canvas);
            }
            d(canvas, bounds);
            g(canvas, bounds);
            c(canvas, bounds);
            a(canvas, bounds);
            if (this.D0) {
                i(canvas, bounds);
            }
            f(canvas, bounds);
            h(canvas, bounds);
            if (this.t0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    @Deprecated
    public void e(float f) {
        if (this.A != f) {
            this.A = f;
            setShapeAppearanceModel(k().a(f));
        }
    }

    public void e(int i) {
        c(a.a.k.a.a.b(this.d0, i));
    }

    public void e(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z2) {
        this.D0 = z2;
    }

    public void f(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            a0();
        }
    }

    @Deprecated
    public void f(int i) {
        e(this.d0.getResources().getDimension(i));
    }

    public void f(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (h0()) {
                androidx.core.graphics.drawable.a.a(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void f(boolean z2) {
        if (this.z0 != z2) {
            this.z0 = z2;
            i0();
            onStateChange(getState());
        }
    }

    public void g(float f) {
        if (this.I != f) {
            float s = s();
            this.I = f;
            float s2 = s();
            invalidateSelf();
            if (s != s2) {
                a0();
            }
        }
    }

    public void g(int i) {
        f(this.d0.getResources().getDimension(i));
    }

    public void g(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            i0();
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.t0;
    }

    public ColorFilter getColorFilter() {
        return this.u0;
    }

    public int getIntrinsicHeight() {
        return (int) this.z;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.V + s() + this.Y + this.k0.a(S().toString()) + this.Z + t() + this.c0), this.E0);
    }

    @Override // b.c.b.b.z.g
    public int getOpacity() {
        return -3;
    }

    @Override // b.c.b.b.z.g
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.A);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void h(float f) {
        if (this.z != f) {
            this.z = f;
            invalidateSelf();
            a0();
        }
    }

    public void h(int i) {
        b(a.a.k.a.a.c(this.d0, i));
    }

    public void i(float f) {
        if (this.V != f) {
            this.V = f;
            invalidateSelf();
            a0();
        }
    }

    public void i(int i) {
        g(this.d0.getResources().getDimension(i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // b.c.b.b.z.g
    public boolean isStateful() {
        return h(this.x) || h(this.y) || h(this.B) || (this.z0 && h(this.A0)) || b(this.k0.a()) || d0() || e(this.G) || e(this.S) || h(this.w0);
    }

    public void j(float f) {
        if (this.C != f) {
            this.C = f;
            this.e0.setStrokeWidth(f);
            if (this.F0) {
                super.d(f);
            }
            invalidateSelf();
        }
    }

    public void j(int i) {
        d(a.a.k.a.a.b(this.d0, i));
    }

    public void k(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            if (h0()) {
                a0();
            }
        }
    }

    public void k(int i) {
        c(this.d0.getResources().getBoolean(i));
    }

    public void l(float f) {
        if (this.O != f) {
            this.O = f;
            invalidateSelf();
            if (h0()) {
                a0();
            }
        }
    }

    public void l(int i) {
        h(this.d0.getResources().getDimension(i));
    }

    public void m(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidateSelf();
            if (h0()) {
                a0();
            }
        }
    }

    public void m(int i) {
        i(this.d0.getResources().getDimension(i));
    }

    public void n(float f) {
        if (this.X != f) {
            float s = s();
            this.X = f;
            float s2 = s();
            invalidateSelf();
            if (s != s2) {
                a0();
            }
        }
    }

    public void n(int i) {
        e(a.a.k.a.a.b(this.d0, i));
    }

    public void o(float f) {
        if (this.W != f) {
            float s = s();
            this.W = f;
            float s2 = s();
            invalidateSelf();
            if (s != s2) {
                a0();
            }
        }
    }

    public void o(int i) {
        j(this.d0.getResources().getDimension(i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (g0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.a(this.G, i);
        }
        if (f0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.a(this.S, i);
        }
        if (h0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.a(this.L, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (g0()) {
            onLevelChange |= this.G.setLevel(i);
        }
        if (f0()) {
            onLevelChange |= this.S.setLevel(i);
        }
        if (h0()) {
            onLevelChange |= this.L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.internal.f.b, b.c.b.b.z.g
    public boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return a(iArr, K());
    }

    public void p(float f) {
        if (this.Z != f) {
            this.Z = f;
            invalidateSelf();
            a0();
        }
    }

    public void p(int i) {
        k(this.d0.getResources().getDimension(i));
    }

    public void q(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            a0();
        }
    }

    public void q(int i) {
        c(a.a.k.a.a.c(this.d0, i));
    }

    public void r(int i) {
        l(this.d0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    public float s() {
        if (g0() || f0()) {
            return this.W + this.I + this.X;
        }
        return 0.0f;
    }

    public void s(int i) {
        m(this.d0.getResources().getDimension(i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // b.c.b.b.z.g
    public void setAlpha(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            invalidateSelf();
        }
    }

    @Override // b.c.b.b.z.g
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.u0 != colorFilter) {
            this.u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // b.c.b.b.z.g, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // b.c.b.b.z.g, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            this.v0 = b.c.b.b.r.a.a(this, this.w0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (g0()) {
            visible |= this.G.setVisible(z2, z3);
        }
        if (f0()) {
            visible |= this.S.setVisible(z2, z3);
        }
        if (h0()) {
            visible |= this.L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* access modifiers changed from: package-private */
    public float t() {
        if (h0()) {
            return this.a0 + this.O + this.b0;
        }
        return 0.0f;
    }

    public void t(int i) {
        f(a.a.k.a.a.b(this.d0, i));
    }

    public Drawable u() {
        return this.S;
    }

    public void u(int i) {
        a(h.a(this.d0, i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public ColorStateList v() {
        return this.y;
    }

    public void v(int i) {
        n(this.d0.getResources().getDimension(i));
    }

    public float w() {
        return this.F0 ? m() : this.A;
    }

    public void w(int i) {
        o(this.d0.getResources().getDimension(i));
    }

    public float x() {
        return this.c0;
    }

    public void x(int i) {
        this.E0 = i;
    }

    public Drawable y() {
        Drawable drawable = this.G;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return null;
    }

    public void y(int i) {
        g(a.a.k.a.a.b(this.d0, i));
    }

    public float z() {
        return this.I;
    }

    public void z(int i) {
        b(h.a(this.d0, i));
    }
}
