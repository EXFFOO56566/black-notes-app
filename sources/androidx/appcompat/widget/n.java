package androidx.appcompat.widget;

import a.a.j;
import a.a.k.a.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f663a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f664b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f665c;
    private u0 d;

    public n(ImageView imageView) {
        this.f663a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new u0();
        }
        u0 u0Var = this.d;
        u0Var.a();
        ColorStateList a2 = e.a(this.f663a);
        if (a2 != null) {
            u0Var.d = true;
            u0Var.f700a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.f663a);
        if (b2 != null) {
            u0Var.f702c = true;
            u0Var.f701b = b2;
        }
        if (!u0Var.d && !u0Var.f702c) {
            return false;
        }
        j.a(drawable, u0Var, this.f663a.getDrawableState());
        return true;
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f664b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable drawable = this.f663a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!e() || !a(drawable)) {
            u0 u0Var = this.f665c;
            if (u0Var != null) {
                j.a(drawable, u0Var, this.f663a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f664b;
            if (u0Var2 != null) {
                j.a(drawable, u0Var2, this.f663a.getDrawableState());
            }
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable c2 = a.c(this.f663a.getContext(), i);
            if (c2 != null) {
                e0.b(c2);
            }
            this.f663a.setImageDrawable(c2);
        } else {
            this.f663a.setImageDrawable(null);
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.f665c == null) {
            this.f665c = new u0();
        }
        u0 u0Var = this.f665c;
        u0Var.f700a = colorStateList;
        u0Var.d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f665c == null) {
            this.f665c = new u0();
        }
        u0 u0Var = this.f665c;
        u0Var.f701b = mode;
        u0Var.f702c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        int g;
        w0 a2 = w0.a(this.f663a.getContext(), attributeSet, j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f663a.getDrawable();
            if (!(drawable != null || (g = a2.g(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.c(this.f663a.getContext(), g)) == null)) {
                this.f663a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (a2.g(j.AppCompatImageView_tint)) {
                e.a(this.f663a, a2.a(j.AppCompatImageView_tint));
            }
            if (a2.g(j.AppCompatImageView_tintMode)) {
                e.a(this.f663a, e0.a(a2.d(j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        u0 u0Var = this.f665c;
        if (u0Var != null) {
            return u0Var.f700a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        u0 u0Var = this.f665c;
        if (u0Var != null) {
            return u0Var.f701b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f663a.getBackground() instanceof RippleDrawable);
    }
}
