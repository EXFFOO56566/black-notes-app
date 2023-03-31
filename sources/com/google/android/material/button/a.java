package com.google.android.material.button;

import a.g.l.u;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import b.c.b.b.b;
import b.c.b.b.w.c;
import b.c.b.b.z.g;
import b.c.b.b.z.k;
import b.c.b.b.z.n;
import com.google.android.material.internal.h;

/* access modifiers changed from: package-private */
public class a {
    private static final boolean s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f5882a;

    /* renamed from: b  reason: collision with root package name */
    private k f5883b;

    /* renamed from: c  reason: collision with root package name */
    private int f5884c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    a(MaterialButton materialButton, k kVar) {
        this.f5882a = materialButton;
        this.f5883b = kVar;
    }

    private InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f5884c, this.e, this.d, this.f);
    }

    private void b(k kVar) {
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (b() != null) {
            b().setShapeAppearanceModel(kVar);
        }
    }

    private g c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    private Drawable m() {
        g gVar = new g(this.f5883b);
        gVar.a(this.f5882a.getContext());
        androidx.core.graphics.drawable.a.a(gVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.a(gVar, mode);
        }
        gVar.a((float) this.h, this.k);
        g gVar2 = new g(this.f5883b);
        gVar2.setTint(0);
        gVar2.a((float) this.h, this.n ? b.c.b.b.q.a.a(this.f5882a, b.colorSurface) : 0);
        if (s) {
            g gVar3 = new g(this.f5883b);
            this.m = gVar3;
            androidx.core.graphics.drawable.a.b(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.c.b.b.x.b.a(this.l), a(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        b.c.b.b.x.a aVar = new b.c.b.b.x.a(this.f5883b);
        this.m = aVar;
        androidx.core.graphics.drawable.a.a(aVar, b.c.b.b.x.b.a(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.m});
        this.r = layerDrawable;
        return a(layerDrawable);
    }

    private g n() {
        return c(true);
    }

    private void o() {
        g c2 = c();
        g n2 = n();
        if (c2 != null) {
            c2.a((float) this.h, this.k);
            if (n2 != null) {
                n2.a((float) this.h, this.n ? b.c.b.b.q.a.a(this.f5882a, b.colorSurface) : 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (c() != null) {
            c().setTint(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.f5884c, this.e, i3 - this.d, i2 - this.f);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (s && (this.f5882a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f5882a.getBackground()).setColor(b.c.b.b.x.b.a(colorStateList));
            } else if (!s && (this.f5882a.getBackground() instanceof b.c.b.b.x.a)) {
                ((b.c.b.b.x.a) this.f5882a.getBackground()).setTintList(b.c.b.b.x.b.a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(TypedArray typedArray) {
        this.f5884c = typedArray.getDimensionPixelOffset(b.c.b.b.k.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(b.c.b.b.k.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(b.c.b.b.k.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(b.c.b.b.k.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(b.c.b.b.k.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(b.c.b.b.k.MaterialButton_cornerRadius, -1);
            this.g = dimensionPixelSize;
            a(this.f5883b.a((float) dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(b.c.b.b.k.MaterialButton_strokeWidth, 0);
        this.i = h.a(typedArray.getInt(b.c.b.b.k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a(this.f5882a.getContext(), typedArray, b.c.b.b.k.MaterialButton_backgroundTint);
        this.k = c.a(this.f5882a.getContext(), typedArray, b.c.b.b.k.MaterialButton_strokeColor);
        this.l = c.a(this.f5882a.getContext(), typedArray, b.c.b.b.k.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(b.c.b.b.k.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(b.c.b.b.k.MaterialButton_elevation, 0);
        int t = u.t(this.f5882a);
        int paddingTop = this.f5882a.getPaddingTop();
        int s2 = u.s(this.f5882a);
        int paddingBottom = this.f5882a.getPaddingBottom();
        this.f5882a.setInternalBackground(m());
        g c2 = c();
        if (c2 != null) {
            c2.a((float) dimensionPixelSize2);
        }
        u.a(this.f5882a, t + this.f5884c, paddingTop + this.e, s2 + this.d, paddingBottom + this.f);
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (c() != null && this.i != null) {
                androidx.core.graphics.drawable.a.a(c(), this.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(k kVar) {
        this.f5883b = kVar;
        b(kVar);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.q = z;
    }

    public n b() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (!this.p || this.g != i2) {
            this.g = i2;
            this.p = true;
            a(this.f5883b.a((float) i2));
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        this.n = z;
        o();
    }

    /* access modifiers changed from: package-private */
    public g c() {
        return c(false);
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        if (this.h != i2) {
            this.h = i2;
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (c() != null) {
                androidx.core.graphics.drawable.a.a(c(), this.j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public k e() {
        return this.f5883b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode i() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.o = true;
        this.f5882a.setSupportBackgroundTintList(this.j);
        this.f5882a.setSupportBackgroundTintMode(this.i);
    }
}
