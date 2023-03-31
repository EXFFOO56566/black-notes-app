package b.c.b.b.p.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import b.c.b.b.p.c;
import b.c.b.b.p.d;

public class a extends b.c.b.b.n.a implements d {
    private final c o;

    @Override // b.c.b.b.p.d
    public void a() {
        this.o.b();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void b() {
        this.o.a();
        throw null;
    }

    public void draw(Canvas canvas) {
        c cVar = this.o;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.o.c();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public int getCircularRevealScrimColor() {
        this.o.d();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public d.e getRevealInfo() {
        this.o.e();
        throw null;
    }

    public boolean isOpaque() {
        c cVar = this.o;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.o.a(drawable);
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void setCircularRevealScrimColor(int i) {
        this.o.a(i);
        throw null;
    }

    @Override // b.c.b.b.p.d
    public void setRevealInfo(d.e eVar) {
        this.o.a(eVar);
        throw null;
    }
}
