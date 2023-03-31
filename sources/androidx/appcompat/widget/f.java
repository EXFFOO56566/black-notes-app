package androidx.appcompat.widget;

import a.a.a;
import a.g.l.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.i;

public class f extends Button implements t, b {

    /* renamed from: b  reason: collision with root package name */
    private final e f620b;

    /* renamed from: c  reason: collision with root package name */
    private final y f621c;

    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f620b = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.f621c = yVar;
        yVar.a(attributeSet, i);
        this.f621c.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f620b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f814a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f621c;
        if (yVar != null) {
            return yVar.c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f814a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f621c;
        if (yVar != null) {
            return yVar.d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f814a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f621c;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f814a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f621c;
        return yVar != null ? yVar.f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f814a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f621c;
        if (yVar != null) {
            return yVar.g();
        }
        return 0;
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f620b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f620b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f621c;
        if (yVar != null && !b.f814a && yVar.j()) {
            this.f621c.b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f814a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f814a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f814a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f620b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f620b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a(z);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f620b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f620b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (b.f814a) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f621c;
        if (yVar != null) {
            yVar.a(i, f);
        }
    }
}
