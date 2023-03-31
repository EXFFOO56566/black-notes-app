package a.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class g extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f70a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f71b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f72c;
    private final Rect d;
    private float e;
    private boolean f;
    private boolean g;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff.Mode k;

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f72c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.d.set(rect);
        if (this.f) {
            float b2 = h.b(this.e, this.f70a, this.g);
            this.d.inset((int) Math.ceil((double) h.a(this.e, this.f70a, this.g)), (int) Math.ceil((double) b2));
            this.f72c.set(this.d);
        }
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.f71b.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
    }

    public ColorStateList a() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (f2 != this.f70a) {
            this.f70a = f2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, boolean z, boolean z2) {
        if (f2 != this.e || this.f != z || this.g != z2) {
            this.e = f2;
            this.f = z;
            this.g = z2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.e;
    }

    public float c() {
        return this.f70a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f71b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f72c;
        float f2 = this.f70a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f70a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f71b.getColor();
        if (z) {
            this.f71b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i2) {
        this.f71b.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f71b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
