package a.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class h extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    static a r;

    /* renamed from: a  reason: collision with root package name */
    private final int f73a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f74b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f75c;
    private Paint d;
    private final RectF e;
    private float f;
    private Path g;
    private float h;
    private float i;
    private float j;
    private ColorStateList k;
    private boolean l;
    private final int m;
    private final int n;
    private boolean o;
    private boolean p;

    interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    static float a(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - q) * ((double) f3))) : f2;
    }

    private void a(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 >= 0.0f) {
            float d2 = (float) d(f2);
            float d3 = (float) d(f3);
            if (d2 > d3) {
                if (!this.p) {
                    this.p = true;
                }
                d2 = d3;
            }
            if (this.j != d2 || this.h != d3) {
                this.j = d2;
                this.h = d3;
                this.i = (float) ((int) ((d2 * 1.5f) + ((float) this.f73a) + 0.5f));
                this.l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
    }

    private void a(Canvas canvas) {
        float f2 = this.f;
        float f3 = (-f2) - this.i;
        float f4 = f2 + ((float) this.f73a) + (this.j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.e.width() - f5 > 0.0f;
        boolean z2 = this.e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.g, this.f75c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.e.width() - f5, -this.f, this.d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.f75c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.e.width() - f5, (-this.f) + this.i, this.d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.f75c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.e.height() - f5, -this.f, this.d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.f75c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.e.height() - f5, -this.f, this.d);
        }
        canvas.restoreToCount(save4);
    }

    static float b(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        return z ? (float) (((double) f4) + ((1.0d - q) * ((double) f3))) : f4;
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.f74b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private void b(Rect rect) {
        float f2 = this.h;
        float f3 = 1.5f * f2;
        this.e.set(((float) rect.left) + f2, ((float) rect.top) + f3, ((float) rect.right) - f2, ((float) rect.bottom) - f3);
        g();
    }

    private int d(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    private void g() {
        float f2 = this.f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.i;
        rectF2.inset(-f3, -f3);
        Path path = this.g;
        if (path == null) {
            this.g = new Path();
        } else {
            path.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f4 = this.f;
        float f5 = f4 / (this.i + f4);
        Paint paint = this.f75c;
        float f6 = this.f + this.i;
        int i2 = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.n}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.d;
        float f7 = this.f;
        float f8 = this.i;
        int i3 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.d.setAntiAlias(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList a() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (f2 >= 0.0f) {
            float f3 = (float) ((int) (f2 + 0.5f));
            if (this.f != f3) {
                this.f = f3;
                this.l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void b(float f2) {
        a(this.j, f2);
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public void c(float f2) {
        a(f2, this.h);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        float f2 = this.h;
        return (Math.max(f2, this.f + ((float) this.f73a) + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.h * 1.5f) + ((float) this.f73a)) * 2.0f);
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            b(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        a(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.e, this.f, this.f74b);
    }

    /* access modifiers changed from: package-private */
    public float e() {
        float f2 = this.h;
        return (Math.max(f2, this.f + ((float) this.f73a) + (f2 / 2.0f)) * 2.0f) + ((this.h + ((float) this.f73a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) b(this.h, this.f, this.o));
        int ceil2 = (int) Math.ceil((double) a(this.h, this.f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f74b.getColor() == colorForState) {
            return false;
        }
        this.f74b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i2) {
        this.f74b.setAlpha(i2);
        this.f75c.setAlpha(i2);
        this.d.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f74b.setColorFilter(colorFilter);
    }
}
