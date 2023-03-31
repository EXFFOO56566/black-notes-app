package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* access modifiers changed from: package-private */
public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f802a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f803b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f804c = null;
    PorterDuff.Mode d = d.h;

    f(f fVar) {
        if (fVar != null) {
            this.f802a = fVar.f802a;
            this.f803b = fVar.f803b;
            this.f804c = fVar.f804c;
            this.d = fVar.d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f803b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f802a;
        Drawable.ConstantState constantState = this.f803b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
