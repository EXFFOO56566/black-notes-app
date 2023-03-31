package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class d extends Drawable implements Drawable.Callback, c, b {
    static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private int f800b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f801c;
    private boolean d;
    f e;
    private boolean f;
    Drawable g;

    d(Drawable drawable) {
        this.e = c();
        a(drawable);
    }

    d(f fVar, Resources resources) {
        this.e = fVar;
        a(resources);
    }

    private void a(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.e;
        if (fVar != null && (constantState = fVar.f803b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        f fVar = this.e;
        ColorStateList colorStateList = fVar.f804c;
        PorterDuff.Mode mode = fVar.d;
        if (colorStateList == null || mode == null) {
            this.d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.d && colorForState == this.f800b && mode == this.f801c)) {
                setColorFilter(colorForState, mode);
                this.f800b = colorForState;
                this.f801c = mode;
                this.d = true;
                return true;
            }
        }
        return false;
    }

    private f c() {
        return new f(this.e);
    }

    @Override // androidx.core.graphics.drawable.c
    public final Drawable a() {
        return this.g;
    }

    @Override // androidx.core.graphics.drawable.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.e;
            if (fVar != null) {
                fVar.f803b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.e.f802a = getChangingConfigurations();
        return this.e;
    }

    public Drawable getCurrent() {
        return this.g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.g.getPadding(rect);
    }

    public int[] getState() {
        return this.g.getState();
    }

    public Region getTransparentRegion() {
        return this.g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.g.isAutoMirrored();
    }

    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!b() || (fVar = this.e) == null) ? null : fVar.f804c;
        return (colorStateList != null && colorStateList.isStateful()) || this.g.isStateful();
    }

    public void jumpToCurrentState() {
        this.g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.e = c();
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.e;
            if (fVar != null) {
                Drawable drawable2 = this.g;
                fVar.f803b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.g.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.g.setState(iArr);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.e.f804c = colorStateList;
        a(getState());
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.e.d = mode;
        a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
