package androidx.appcompat.widget;

import a.a.k.a.a;
import a.g.j.c;
import a.g.l.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class z extends TextView implements t, k, b {

    /* renamed from: b  reason: collision with root package name */
    private final e f738b;

    /* renamed from: c  reason: collision with root package name */
    private final y f739c;
    private final x d;
    private Future<c> e;

    public z(Context context) {
        this(context, null);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public z(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f738b = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.f739c = yVar;
        yVar.a(attributeSet, i);
        this.f739c.a();
        this.d = new x(this);
    }

    private void d() {
        Future<c> future = this.e;
        if (future != null) {
            try {
                this.e = null;
                i.a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f738b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f814a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f739c;
        if (yVar != null) {
            return yVar.c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f814a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f739c;
        if (yVar != null) {
            return yVar.d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f814a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f739c;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f814a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f739c;
        return yVar != null ? yVar.f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f814a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f739c;
        if (yVar != null) {
            return yVar.g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return i.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.c(this);
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f738b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f738b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f739c.h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f739c.i();
    }

    public CharSequence getText() {
        d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.d) == null) ? super.getTextClassifier() : xVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return i.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f739c;
        if (yVar != null && !b.f814a && yVar.j()) {
            this.f739c.b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f814a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f814a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f814a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f738b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f738b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c2 = i != 0 ? a.c(context, i) : null;
        Drawable c3 = i2 != 0 ? a.c(context, i2) : null;
        Drawable c4 = i3 != 0 ? a.c(context, i3) : null;
        if (i4 != 0) {
            drawable = a.c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c2, c3, c4, drawable);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c2 = i != 0 ? a.c(context, i) : null;
        Drawable c3 = i2 != 0 ? a.c(context, i2) : null;
        Drawable c4 = i3 != 0 ? a.c(context, i3) : null;
        if (i4 != 0) {
            drawable = a.c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c2, c3, c4, drawable);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.k();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.k();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            i.a(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            i.b(this, i);
        }
    }

    public void setLineHeight(int i) {
        i.c(this, i);
    }

    public void setPrecomputedText(c cVar) {
        i.a(this, cVar);
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f738b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f738b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f739c.a(colorStateList);
        this.f739c.a();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f739c.a(mode);
        this.f739c.a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.a(textClassifier);
        }
    }

    public void setTextFuture(Future<c> future) {
        this.e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        i.a(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (b.f814a) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f739c;
        if (yVar != null) {
            yVar.a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a2 = (typeface == null || i <= 0) ? null : a.g.e.c.a(getContext(), typeface, i);
        if (a2 != null) {
            typeface = a2;
        }
        super.setTypeface(typeface, i);
    }
}
