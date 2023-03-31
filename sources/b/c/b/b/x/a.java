package b.c.b.b.x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b.c.b.b.z.g;
import b.c.b.b.z.k;
import b.c.b.b.z.n;

public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: b  reason: collision with root package name */
    private b f1298b;

    /* access modifiers changed from: package-private */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f1299a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1300b;

        public b(b bVar) {
            this.f1299a = (g) bVar.f1299a.getConstantState().newDrawable();
            this.f1300b = bVar.f1300b;
        }

        public b(g gVar) {
            this.f1299a = gVar;
            this.f1300b = false;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public a newDrawable() {
            return new a(new b(this));
        }
    }

    private a(b bVar) {
        this.f1298b = bVar;
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    public void draw(Canvas canvas) {
        b bVar = this.f1298b;
        if (bVar.f1300b) {
            bVar.f1299a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f1298b;
    }

    public int getOpacity() {
        return this.f1298b.f1299a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public a mutate() {
        this.f1298b = new b(this.f1298b);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1298b.f1299a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f1298b.f1299a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a2 = b.a(iArr);
        b bVar = this.f1298b;
        if (bVar.f1300b == a2) {
            return onStateChange;
        }
        bVar.f1300b = a2;
        return true;
    }

    public void setAlpha(int i) {
        this.f1298b.f1299a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1298b.f1299a.setColorFilter(colorFilter);
    }

    @Override // b.c.b.b.z.n
    public void setShapeAppearanceModel(k kVar) {
        this.f1298b.f1299a.setShapeAppearanceModel(kVar);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.f1298b.f1299a.setTint(i);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1298b.f1299a.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1298b.f1299a.setTintMode(mode);
    }
}
