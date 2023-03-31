package androidx.appcompat.widget;

import a.a.j;
import a.g.l.u;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;

/* access modifiers changed from: package-private */
public class v extends r {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f = null;
    private PorterDuff.Mode g = null;
    private boolean h = false;
    private boolean i = false;

    v(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    private void d() {
        if (this.e == null) {
            return;
        }
        if (this.h || this.i) {
            Drawable i2 = a.i(this.e.mutate());
            this.e = i2;
            if (this.h) {
                a.a(i2, this.f);
            }
            if (this.i) {
                a.a(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.d.getPaddingLeft(), (float) (this.d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            a.a(drawable, u.o(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            d();
        }
        this.d.invalidate();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.r
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        w0 a2 = w0.a(this.d.getContext(), attributeSet, j.AppCompatSeekBar, i2, 0);
        Drawable c2 = a2.c(j.AppCompatSeekBar_android_thumb);
        if (c2 != null) {
            this.d.setThumb(c2);
        }
        a(a2.b(j.AppCompatSeekBar_tickMark));
        if (a2.g(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.a(a2.d(j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (a2.g(j.AppCompatSeekBar_tickMarkTint)) {
            this.f = a2.a(j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        a2.a();
        d();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
