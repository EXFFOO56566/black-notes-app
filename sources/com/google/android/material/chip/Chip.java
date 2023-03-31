package com.google.android.material.chip;

import a.g.l.d0.c;
import a.g.l.u;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.recyclerview.widget.RecyclerView;
import b.c.b.b.i;
import b.c.b.b.j;
import b.c.b.b.k;
import b.c.b.b.w.d;
import b.c.b.b.w.f;
import b.c.b.b.z.n;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.github.ajalt.reprint.module.spass.SpassReprintModule;
import com.google.android.material.chip.a;
import com.google.android.material.internal.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends g implements a.AbstractC0083a, n {
    private static final Rect u = new Rect();
    private static final int[] v = {16842913};
    private static final int[] w = {16842911};
    private a e;
    private InsetDrawable f;
    private RippleDrawable g;
    private View.OnClickListener h;
    private CompoundButton.OnCheckedChangeListener i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final c q;
    private final Rect r;
    private final RectF s;
    private final f t;

    class a extends f {
        a() {
        }

        @Override // b.c.b.b.w.f
        public void a(int i) {
        }

        @Override // b.c.b.b.w.f
        public void a(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.e.b0() ? Chip.this.e.S() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.e != null) {
                Chip.this.e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: private */
    public class c extends a.i.b.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        @Override // a.i.b.a
        public int a(float f, float f2) {
            return (!Chip.this.i() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        @Override // a.i.b.a
        public void a(int i, a.g.l.d0.c cVar) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                cVar.b(closeIconContentDescription);
                cVar.c(Chip.this.getCloseIconTouchBoundsInt());
                cVar.a(c.a.e);
                cVar.f(Chip.this.isEnabled());
                return;
            }
            cVar.b(charSequence);
            cVar.c(Chip.u);
        }

        /* access modifiers changed from: protected */
        @Override // a.i.b.a
        public void a(int i, boolean z) {
            if (i == 1) {
                Chip.this.m = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        @Override // a.i.b.a
        public void a(a.g.l.d0.c cVar) {
            cVar.b(Chip.this.b());
            cVar.d(Chip.this.isClickable());
            cVar.a((CharSequence) ((Chip.this.b() || Chip.this.isClickable()) ? Chip.this.b() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View"));
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.g(text);
            } else {
                cVar.b(text);
            }
        }

        /* access modifiers changed from: protected */
        @Override // a.i.b.a
        public void a(List<Integer> list) {
            list.add(0);
            if (Chip.this.i() && Chip.this.c()) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        @Override // a.i.b.a
        public boolean a(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.d();
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.c.b.b.b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.r = new Rect();
        this.s = new RectF();
        this.t = new a();
        a(attributeSet);
        a a2 = a.a(context, attributeSet, i2, j.Widget_MaterialComponents_Chip_Action);
        a(context, attributeSet, i2);
        setChipDrawable(a2);
        a2.a(u.k(this));
        TypedArray c2 = com.google.android.material.internal.g.c(context, attributeSet, k.Chip, i2, j.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(b.c.b.b.w.c.a(context, c2, k.Chip_android_textColor));
        }
        boolean hasValue = c2.hasValue(k.Chip_shapeAppearance);
        c2.recycle();
        c cVar = new c(this);
        this.q = cVar;
        if (Build.VERSION.SDK_INT >= 24) {
            u.a(this, cVar);
        } else {
            l();
        }
        if (!hasValue) {
            j();
        }
        setChecked(this.j);
        setText(a2.S());
        setEllipsize(a2.M());
        setIncludeFontPadding(false);
        p();
        if (!this.e.b0()) {
            setSingleLine();
        }
        setGravity(8388627);
        o();
        if (e()) {
            setMinHeight(this.p);
        }
        this.o = u.o(this);
    }

    private void a(int i2, int i3, int i4, int i5) {
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i4, i5);
    }

    private void a(Context context, AttributeSet attributeSet, int i2) {
        TypedArray c2 = com.google.android.material.internal.g.c(context, attributeSet, k.Chip, i2, j.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.n = c2.getBoolean(k.Chip_ensureMinTouchTargetSize, false);
        this.p = (int) Math.ceil((double) c2.getDimension(k.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) h.a(getContext(), 48))));
        c2.recycle();
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    private void a(a aVar) {
        aVar.a(this);
    }

    @SuppressLint({"PrivateApi"})
    private boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = a.i.b.a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = a.i.b.a.class.getDeclaredMethod("i", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.q, Integer.valueOf((int) RecyclerView.UNDEFINED_DURATION));
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            }
        }
        return false;
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.a((a.AbstractC0083a) null);
        }
    }

    private int[] g() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.m) {
            i3++;
        }
        if (this.l) {
            i3++;
        }
        if (this.k) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.m) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.l) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.k) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private RectF getCloseIconTouchBounds() {
        this.s.setEmpty();
        if (i()) {
            this.e.a(this.s);
        }
        return this.s;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.r;
    }

    private d getTextAppearance() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.T();
        }
        return null;
    }

    private void h() {
        if (getBackgroundDrawable() == this.f && this.e.getCallback() == null) {
            this.e.setCallback(this.f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean i() {
        a aVar = this.e;
        return (aVar == null || aVar.F() == null) ? false : true;
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void k() {
        if (this.f != null) {
            this.f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m();
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT < 24) {
            u.a(this, (!i() || !c()) ? null : this.q);
        }
    }

    private void m() {
        if (b.c.b.b.x.b.f1301a) {
            n();
            return;
        }
        this.e.f(true);
        u.a(this, getBackgroundDrawable());
        h();
    }

    private void n() {
        this.g = new RippleDrawable(b.c.b.b.x.b.a(this.e.Q()), getBackgroundDrawable(), null);
        this.e.f(false);
        u.a(this, this.g);
    }

    private void o() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.e) != null) {
            u.a(this, (int) (this.e.C() + this.e.V() + this.e.s()), getPaddingTop(), (int) (aVar.x() + this.e.U() + this.e.t()), getPaddingBottom());
        }
    }

    private void p() {
        TextPaint paint = getPaint();
        a aVar = this.e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.b(getContext(), paint, this.t);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.AbstractC0083a
    public void a() {
        a(this.p);
        m();
        o();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (getMinWidth() != r6) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.a(int):boolean");
    }

    public boolean b() {
        a aVar = this.e;
        return aVar != null && aVar.X();
    }

    public boolean c() {
        a aVar = this.e;
        return aVar != null && aVar.Z();
    }

    public boolean d() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.q.a(1, 1);
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return a(motionEvent) || this.q.a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.q.a(keyEvent) || this.q.c() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.e;
        if ((aVar == null || !aVar.Y()) ? false : this.e.a(g())) {
            invalidate();
        }
    }

    public boolean e() {
        return this.n;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.u();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.v();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.w();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.x();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.y();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.z();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.A();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.B();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.C();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.D();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.E();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.F();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.H();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.I();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.J();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.L();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.M();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.q.c() == 1 || this.q.b() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public b.c.b.b.l.h getHideMotionSpec() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.N();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.O();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.P();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.Q();
        }
        return null;
    }

    public b.c.b.b.z.k getShapeAppearanceModel() {
        return this.e.k();
    }

    public b.c.b.b.l.h getShowMotionSpec() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.R();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.U();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.e;
        if (aVar != null) {
            return aVar.V();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.c.b.b.z.h.a(this, this.e);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, v);
        }
        if (b()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, w);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.q.a(z, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((b() || isClickable()) ? b() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), SpassReprintModule.STATUS_HW_UNAVAILABLE);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.o != i2) {
            this.o = i2;
            o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.k
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.k
            if (r0 == 0) goto L_0x0034
            r5.d()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.g
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public void setCheckableResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(i2);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.e;
        if (aVar == null) {
            this.j = z;
        } else if (aVar.X()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.i) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.c(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.d(i2);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.e(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.e(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.f(i2);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.e;
        if (aVar2 != aVar) {
            b(aVar2);
            this.e = aVar;
            aVar.e(false);
            a(this.e);
            a(this.p);
            m();
        }
    }

    public void setChipEndPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.f(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.g(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.h(i2);
        }
    }

    public void setChipIconSize(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.g(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.i(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.j(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.k(i2);
        }
    }

    public void setChipIconVisible(boolean z) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.c(z);
        }
    }

    public void setChipMinHeight(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.h(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.l(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.i(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.m(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.e(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.n(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.j(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.o(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.c(drawable);
        }
        l();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.k(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.p(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.q(i2);
        }
        l();
    }

    public void setCloseIconSize(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.l(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.r(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.m(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.s(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.f(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.t(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.d(z);
        }
        l();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(f2);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.e;
                if (aVar != null) {
                    aVar.a(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        a(this.p);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(b.c.b.b.l.h hVar) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.u(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.n(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.v(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.o(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.w(i2);
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        a aVar = this.e;
        if (aVar != null) {
            aVar.x(i2);
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.g(colorStateList);
        }
        if (!this.e.W()) {
            n();
        }
    }

    public void setRippleColorResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.y(i2);
            if (!this.e.W()) {
                n();
            }
        }
    }

    @Override // b.c.b.b.z.n
    public void setShapeAppearanceModel(b.c.b.b.z.k kVar) {
        this.e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(b.c.b.b.l.h hVar) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(hVar);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.z(i2);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.e != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(this.e.b0() ? null : charSequence, bufferType);
            a aVar = this.e;
            if (aVar != null) {
                aVar.b(charSequence);
            }
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        a aVar = this.e;
        if (aVar != null) {
            aVar.A(i2);
        }
        p();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        a aVar = this.e;
        if (aVar != null) {
            aVar.A(i2);
        }
        p();
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(dVar);
        }
        p();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.p(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.B(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.q(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.C(i2);
        }
    }
}
