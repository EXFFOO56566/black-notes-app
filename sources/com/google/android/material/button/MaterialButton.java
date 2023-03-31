package com.google.android.material.button;

import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.widget.i;
import b.c.b.b.j;
import b.c.b.b.k;
import b.c.b.b.w.c;
import b.c.b.b.z.n;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends f implements Checkable, n {
    private static final int[] p = {16842911};
    private static final int[] q = {16842912};
    private static final int r = j.Widget_MaterialComponents_Button;
    private final a d;
    private final LinkedHashSet<a> e;
    private b f;
    private PorterDuff.Mode g;
    private ColorStateList h;
    private Drawable i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.b.b.b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(g.b(context, attributeSet, i2, r), attributeSet, i2);
        this.e = new LinkedHashSet<>();
        boolean z = false;
        this.m = false;
        this.n = false;
        Context context2 = getContext();
        TypedArray c2 = g.c(context2, attributeSet, k.MaterialButton, i2, r, new int[0]);
        this.l = c2.getDimensionPixelSize(k.MaterialButton_iconPadding, 0);
        this.g = h.a(c2.getInt(k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.h = c.a(getContext(), c2, k.MaterialButton_iconTint);
        this.i = c.b(getContext(), c2, k.MaterialButton_icon);
        this.o = c2.getInteger(k.MaterialButton_iconGravity, 1);
        this.j = c2.getDimensionPixelSize(k.MaterialButton_iconSize, 0);
        a aVar = new a(this, b.c.b.b.z.k.a(context2, attributeSet, i2, r).a());
        this.d = aVar;
        aVar.a(c2);
        c2.recycle();
        setCompoundDrawablePadding(this.l);
        b(this.i != null ? true : z);
    }

    private void a(boolean z) {
        if (z) {
            i.a(this, this.i, null, null, null);
        } else {
            i.a(this, null, null, this.i, null);
        }
    }

    private void b(boolean z) {
        Drawable drawable = this.i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.i(drawable).mutate();
            this.i = mutate;
            androidx.core.graphics.drawable.a.a(mutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.a(this.i, mode);
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicWidth();
            }
            int i3 = this.j;
            if (i3 == 0) {
                i3 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i4 = this.k;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.o;
        boolean z3 = i5 == 1 || i5 == 2;
        if (z) {
            a(z3);
            return;
        }
        Drawable[] a2 = i.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[2];
        if ((z3 && drawable3 != this.i) || (!z3 && drawable4 != this.i)) {
            z2 = true;
        }
        if (z2) {
            a(z3);
        }
    }

    private boolean b() {
        return u.o(this) == 1;
    }

    private boolean c() {
        a aVar = this.d;
        return aVar != null && !aVar.j();
    }

    private void d() {
        if (this.i != null && getLayout() != null) {
            int i2 = this.o;
            boolean z = true;
            if (i2 == 1 || i2 == 3) {
                this.k = 0;
                b(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i3 = this.j;
            if (i3 == 0) {
                i3 = this.i.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - u.s(this)) - i3) - this.l) - u.t(this)) / 2;
            boolean b2 = b();
            if (this.o != 4) {
                z = false;
            }
            if (b2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.k != measuredWidth) {
                this.k = measuredWidth;
                b(false);
            }
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        a aVar = this.d;
        return aVar != null && aVar.k();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.d.a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.o;
    }

    public int getIconPadding() {
        return this.l;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.d.d();
        }
        return null;
    }

    public b.c.b.b.z.k getShapeAppearanceModel() {
        if (c()) {
            return this.d.e();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.d.f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.d.g();
        }
        return 0;
    }

    @Override // a.g.l.t, androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        return c() ? this.d.h() : super.getSupportBackgroundTintList();
    }

    @Override // a.g.l.t, androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return c() ? this.d.i() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.c.b.b.z.h.a(this, this.d.c());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, q);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.d) != null) {
            aVar.a(i5 - i3, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        d();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (c()) {
            this.d.a(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setBackgroundDrawable(Drawable drawable) {
        if (c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.d.l();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (c()) {
            this.d.a(z);
        }
    }

    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (!this.n) {
                this.n = true;
                Iterator<a> it = this.e.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.m);
                }
                this.n = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (c()) {
            this.d.b(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (c()) {
            this.d.c().a(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            b(true);
        }
    }

    public void setIconGravity(int i2) {
        if (this.o != i2) {
            this.o = i2;
            d();
        }
    }

    public void setIconPadding(int i2) {
        if (this.l != i2) {
            this.l = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.j != i2) {
            this.j = i2;
            b(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            b(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            b(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(a.a.k.a.a.b(getContext(), i2));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.d.a(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (c()) {
            setRippleColor(a.a.k.a.a.b(getContext(), i2));
        }
    }

    @Override // b.c.b.b.z.n
    public void setShapeAppearanceModel(b.c.b.b.z.k kVar) {
        if (c()) {
            this.d.a(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            this.d.b(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.d.b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (c()) {
            setStrokeColor(a.a.k.a.a.b(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (c()) {
            this.d.c(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // a.g.l.t, androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.d.c(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // a.g.l.t, androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.d.a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.m);
    }
}
