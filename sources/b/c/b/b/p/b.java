package b.c.b.b.p;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import b.c.b.b.p.d;

public class b extends FrameLayout implements d {

    /* renamed from: b  reason: collision with root package name */
    private final c f1274b;

    @Override // b.c.b.b.p.d
    public void a() {
        this.f1274b.b();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void b() {
        this.f1274b.a();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f1274b;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f1274b.c();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public int getCircularRevealScrimColor() {
        this.f1274b.d();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public d.e getRevealInfo() {
        this.f1274b.e();
        throw null;
    }

    public boolean isOpaque() {
        c cVar = this.f1274b;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f1274b.a(drawable);
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void setCircularRevealScrimColor(int i) {
        this.f1274b.a(i);
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void setRevealInfo(d.e eVar) {
        this.f1274b.a(eVar);
        throw null;
    }
}
