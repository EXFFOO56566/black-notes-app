package b.c.b.b.n;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import b.c.b.b.b;
import b.c.b.b.z.k;
import b.c.b.b.z.n;

public class a extends a.d.a.a implements Checkable, n {
    private static final int[] l = {16842911};
    private static final int[] m = {16842912};
    private static final int[] n = {b.state_dragged};
    private final b g;
    private boolean h;
    private boolean i;
    private boolean j;
    private AbstractC0062a k;

    /* renamed from: b.c.b.b.n.a$a  reason: collision with other inner class name */
    public interface AbstractC0062a {
        void a(a aVar, boolean z);
    }

    private void e() {
        if (Build.VERSION.SDK_INT > 26) {
            this.g.a();
            throw null;
        }
    }

    public boolean c() {
        b bVar = this.g;
        if (bVar == null) {
            return false;
        }
        bVar.o();
        throw null;
    }

    public boolean d() {
        return this.j;
    }

    @Override // a.d.a.a
    public ColorStateList getCardBackgroundColor() {
        this.g.c();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        this.g.d();
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        this.g.e();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingBottom() {
        this.g.m();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingLeft() {
        this.g.m();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingRight() {
        this.g.m();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingTop() {
        this.g.m();
        throw null;
    }

    public float getProgress() {
        this.g.g();
        throw null;
    }

    @Override // a.d.a.a
    public float getRadius() {
        this.g.f();
        throw null;
    }

    public ColorStateList getRippleColor() {
        this.g.h();
        throw null;
    }

    public k getShapeAppearanceModel() {
        this.g.i();
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        this.g.j();
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        this.g.k();
        throw null;
    }

    public int getStrokeWidth() {
        this.g.l();
        throw null;
    }

    public boolean isChecked() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g.b();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (c()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, l);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, m);
        }
        if (d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, n);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a.d.a.a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a.d.a.a.class.getName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    @Override // a.d.a.a
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.g.a(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h) {
            this.g.n();
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // a.d.a.a
    public void setCardBackgroundColor(int i2) {
        this.g.a(ColorStateList.valueOf(i2));
        throw null;
    }

    @Override // a.d.a.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g.a(colorStateList);
        throw null;
    }

    @Override // a.d.a.a
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.g.q();
        throw null;
    }

    public void setCheckable(boolean z) {
        this.g.a(z);
        throw null;
    }

    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g.a(drawable);
        throw null;
    }

    public void setCheckedIconResource(int i2) {
        this.g.a(a.a.k.a.a.c(getContext(), i2));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.g.b(colorStateList);
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.g.p();
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            e();
            invalidate();
        }
    }

    @Override // a.d.a.a
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.r();
        throw null;
    }

    public void setOnCheckedChangeListener(AbstractC0062a aVar) {
        this.k = aVar;
    }

    @Override // a.d.a.a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.g.r();
        throw null;
    }

    public void setProgress(float f) {
        this.g.b(f);
        throw null;
    }

    @Override // a.d.a.a
    public void setRadius(float f) {
        super.setRadius(f);
        this.g.a(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.g.c(colorStateList);
        throw null;
    }

    public void setRippleColorResource(int i2) {
        this.g.c(a.a.k.a.a.b(getContext(), i2));
        throw null;
    }

    @Override // b.c.b.b.z.n
    public void setShapeAppearanceModel(k kVar) {
        this.g.a(kVar);
        throw null;
    }

    public void setStrokeColor(int i2) {
        this.g.d(ColorStateList.valueOf(i2));
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.g.d(colorStateList);
        throw null;
    }

    public void setStrokeWidth(int i2) {
        this.g.a(i2);
        throw null;
    }

    @Override // a.d.a.a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.g.r();
        throw null;
    }

    public void toggle() {
        if (c() && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            e();
            AbstractC0062a aVar = this.k;
            if (aVar != null) {
                aVar.a(this, this.i);
            }
        }
    }
}
