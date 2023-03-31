package androidx.appcompat.widget;

import a.a.j;
import a.g.l.u;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* access modifiers changed from: package-private */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f615a;

    /* renamed from: b  reason: collision with root package name */
    private final j f616b;

    /* renamed from: c  reason: collision with root package name */
    private int f617c = -1;
    private u0 d;
    private u0 e;
    private u0 f;

    e(View view) {
        this.f615a = view;
        this.f616b = j.b();
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new u0();
        }
        u0 u0Var = this.f;
        u0Var.a();
        ColorStateList g = u.g(this.f615a);
        if (g != null) {
            u0Var.d = true;
            u0Var.f700a = g;
        }
        PorterDuff.Mode h = u.h(this.f615a);
        if (h != null) {
            u0Var.f702c = true;
            u0Var.f701b = h;
        }
        if (!u0Var.d && !u0Var.f702c) {
            return false;
        }
        j.a(drawable, u0Var, this.f615a.getDrawableState());
        return true;
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable background = this.f615a.getBackground();
        if (background == null) {
            return;
        }
        if (!d() || !b(background)) {
            u0 u0Var = this.e;
            if (u0Var != null) {
                j.a(background, u0Var, this.f615a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.d;
            if (u0Var2 != null) {
                j.a(background, u0Var2, this.f615a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        this.f617c = i;
        j jVar = this.f616b;
        a(jVar != null ? jVar.b(this.f615a.getContext(), i) : null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new u0();
            }
            u0 u0Var = this.d;
            u0Var.f700a = colorStateList;
            u0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.f701b = mode;
        u0Var.f702c = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.f617c = -1;
        a((ColorStateList) null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        w0 a2 = w0.a(this.f615a.getContext(), attributeSet, j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.g(j.ViewBackgroundHelper_android_background)) {
                this.f617c = a2.g(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f616b.b(this.f615a.getContext(), this.f617c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTint)) {
                u.a(this.f615a, a2.a(j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTintMode)) {
                u.a(this.f615a, e0.a(a2.d(j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.f700a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.f700a = colorStateList;
        u0Var.d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.f701b;
        }
        return null;
    }
}
