package a.d.a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

public class a extends FrameLayout {
    private static final f f;

    /* renamed from: b  reason: collision with root package name */
    private boolean f66b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67c;
    final Rect d;
    private final e e;

    static {
        int i = Build.VERSION.SDK_INT;
        f = i >= 21 ? new c() : i >= 17 ? new b() : new d();
        f.a();
    }

    public ColorStateList getCardBackgroundColor() {
        return f.b(this.e);
    }

    public float getCardElevation() {
        return f.c(this.e);
    }

    public int getContentPaddingBottom() {
        return this.d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.d.left;
    }

    public int getContentPaddingRight() {
        return this.d.right;
    }

    public int getContentPaddingTop() {
        return this.d.top;
    }

    public float getMaxCardElevation() {
        return f.a(this.e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f67c;
    }

    public float getRadius() {
        return f.d(this.e);
    }

    public boolean getUseCompatPadding() {
        return this.f66b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f instanceof c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f.f(this.e)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f.e(this.e)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f.a(this.e, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f.a(this.e, colorStateList);
    }

    public void setCardElevation(float f2) {
        f.b(this.e, f2);
    }

    public void setMaxCardElevation(float f2) {
        f.c(this.e, f2);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f67c) {
            this.f67c = z;
            f.h(this.e);
        }
    }

    public void setRadius(float f2) {
        f.a(this.e, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f66b != z) {
            this.f66b = z;
            f.g(this.e);
        }
    }
}
