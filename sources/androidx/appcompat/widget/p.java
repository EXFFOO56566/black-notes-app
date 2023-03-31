package androidx.appcompat.widget;

import a.a.a;
import a.g.l.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class p extends MultiAutoCompleteTextView implements t {
    private static final int[] d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    private final e f672b;

    /* renamed from: c  reason: collision with root package name */
    private final y f673c;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    public p(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        w0 a2 = w0.a(getContext(), attributeSet, d, i, 0);
        if (a2.g(0)) {
            setDropDownBackgroundDrawable(a2.b(0));
        }
        a2.a();
        e eVar = new e(this);
        this.f672b = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.f673c = yVar;
        yVar.a(attributeSet, i);
        this.f673c.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f672b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f673c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f672b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f672b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f672b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f672b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.a.k.a.a.c(getContext(), i));
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f672b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f672b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f673c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }
}
