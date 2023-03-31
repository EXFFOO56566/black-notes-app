package a.a.l.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    private Drawable f19b;

    public c(Drawable drawable) {
        a(drawable);
    }

    public Drawable a() {
        return this.f19b;
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f19b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f19b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f19b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f19b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f19b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f19b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f19b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f19b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f19b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f19b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f19b.getPadding(rect);
    }

    public int[] getState() {
        return this.f19b.getState();
    }

    public Region getTransparentRegion() {
        return this.f19b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.f(this.f19b);
    }

    public boolean isStateful() {
        return this.f19b.isStateful();
    }

    public void jumpToCurrentState() {
        a.g(this.f19b);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f19b.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f19b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f19b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        a.a(this.f19b, z);
    }

    public void setChangingConfigurations(int i) {
        this.f19b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f19b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f19b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        a.a(this.f19b, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        a.a(this.f19b, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f19b.setState(iArr);
    }

    public void setTint(int i) {
        a.b(this.f19b, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.a(this.f19b, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.a(this.f19b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f19b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
