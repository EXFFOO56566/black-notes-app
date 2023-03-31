package androidx.appcompat.widget;

import a.g.l.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.l;

public class o extends ImageView implements t, l {

    /* renamed from: b  reason: collision with root package name */
    private final e f667b;

    /* renamed from: c  reason: collision with root package name */
    private final n f668c;

    public o(Context context) {
        this(context, null);
    }

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f667b = eVar;
        eVar.a(attributeSet, i);
        n nVar = new n(this);
        this.f668c = nVar;
        nVar.a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f667b;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.f668c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // a.g.l.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f667b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.l.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f667b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f668c;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f668c;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f668c.d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f667b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f667b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f668c;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f668c;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void setImageResource(int i) {
        n nVar = this.f668c;
        if (nVar != null) {
            nVar.a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f668c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f667b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.l.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f667b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f668c;
        if (nVar != null) {
            nVar.a(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f668c;
        if (nVar != null) {
            nVar.a(mode);
        }
    }
}
