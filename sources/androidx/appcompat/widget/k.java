package androidx.appcompat.widget;

import a.a.a;
import a.g.l.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.i;

public class k extends EditText implements t {

    /* renamed from: b  reason: collision with root package name */
    private final e f656b;

    /* renamed from: c  reason: collision with root package name */
    private final y f657c;
    private final x d;

    public k(Context context) {
        this(context, null);
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public k(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f656b = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.f657c = yVar;
        yVar.a(attributeSet, i);
        this.f657c.a();
        this.d = new x(this);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f656b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f657c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f656b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f656b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.d) == null) ? super.getTextClassifier() : xVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f656b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f656b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f656b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f656b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f657c;
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
}
