package androidx.appcompat.widget;

import a.a.k.a.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;

public class h extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f628c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    private final y f629b;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        y yVar = new y(this);
        this.f629b = yVar;
        yVar.a(attributeSet, i);
        this.f629b.a();
        w0 a2 = w0.a(getContext(), attributeSet, f628c, i, 0);
        setCheckMarkDrawable(a2.b(0));
        a2.a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f629b;
        if (yVar != null) {
            yVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f629b;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }
}
