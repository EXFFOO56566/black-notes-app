package androidx.appcompat.widget;

import a.a.a;
import a.g.l.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.j;

public class s extends RadioButton implements j, t {

    /* renamed from: b  reason: collision with root package name */
    private final i f693b;

    /* renamed from: c  reason: collision with root package name */
    private final e f694c;
    private final y d;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.radioButtonStyle);
    }

    public s(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        i iVar = new i(this);
        this.f693b = iVar;
        iVar.a(attributeSet, i);
        e eVar = new e(this);
        this.f694c = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.d = yVar;
        yVar.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f694c;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.d;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f693b;
        return iVar != null ? iVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f694c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f694c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f693b;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f693b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f694c;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f694c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.a.k.a.a.c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f693b;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f694c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f694c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f693b;
        if (iVar != null) {
            iVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f693b;
        if (iVar != null) {
            iVar.a(mode);
        }
    }
}
