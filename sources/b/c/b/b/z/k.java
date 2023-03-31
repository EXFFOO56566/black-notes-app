package b.c.b.b.z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {

    /* renamed from: a  reason: collision with root package name */
    d f1320a;

    /* renamed from: b  reason: collision with root package name */
    d f1321b;

    /* renamed from: c  reason: collision with root package name */
    d f1322c;
    d d;
    c e;
    c f;
    c g;
    c h;
    f i;
    f j;
    f k;
    f l;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f1323a = h.a();

        /* renamed from: b  reason: collision with root package name */
        private d f1324b = h.a();

        /* renamed from: c  reason: collision with root package name */
        private d f1325c = h.a();
        private d d = h.a();
        private c e = new a(0.0f);
        private c f = new a(0.0f);
        private c g = new a(0.0f);
        private c h = new a(0.0f);
        private f i = h.b();
        private f j = h.b();
        private f k = h.b();
        private f l = h.b();

        public b() {
        }

        public b(k kVar) {
            this.f1323a = kVar.f1320a;
            this.f1324b = kVar.f1321b;
            this.f1325c = kVar.f1322c;
            this.d = kVar.d;
            this.e = kVar.e;
            this.f = kVar.f;
            this.g = kVar.g;
            this.h = kVar.h;
            this.i = kVar.i;
            this.j = kVar.j;
            this.k = kVar.k;
            this.l = kVar.l;
        }

        private static float e(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f1319a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f1310a;
            }
            return -1.0f;
        }

        public b a(float f2) {
            d(f2);
            e(f2);
            c(f2);
            b(f2);
            return this;
        }

        public b a(int i2, c cVar) {
            a(h.a(i2));
            a(cVar);
            return this;
        }

        public b a(c cVar) {
            this.h = cVar;
            return this;
        }

        public b a(d dVar) {
            this.d = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                b(e2);
            }
            return this;
        }

        public k a() {
            return new k(this);
        }

        public b b(float f2) {
            this.h = new a(f2);
            return this;
        }

        public b b(int i2, c cVar) {
            b(h.a(i2));
            b(cVar);
            return this;
        }

        public b b(c cVar) {
            this.g = cVar;
            return this;
        }

        public b b(d dVar) {
            this.f1325c = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                c(e2);
            }
            return this;
        }

        public b c(float f2) {
            this.g = new a(f2);
            return this;
        }

        public b c(int i2, c cVar) {
            c(h.a(i2));
            c(cVar);
            return this;
        }

        public b c(c cVar) {
            this.e = cVar;
            return this;
        }

        public b c(d dVar) {
            this.f1323a = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                d(e2);
            }
            return this;
        }

        public b d(float f2) {
            this.e = new a(f2);
            return this;
        }

        public b d(int i2, c cVar) {
            d(h.a(i2));
            d(cVar);
            return this;
        }

        public b d(c cVar) {
            this.f = cVar;
            return this;
        }

        public b d(d dVar) {
            this.f1324b = dVar;
            float e2 = e(dVar);
            if (e2 != -1.0f) {
                e(e2);
            }
            return this;
        }

        public b e(float f2) {
            this.f = new a(f2);
            return this;
        }
    }

    public interface c {
        c a(c cVar);
    }

    static {
        new i(0.5f);
    }

    public k() {
        this.f1320a = h.a();
        this.f1321b = h.a();
        this.f1322c = h.a();
        this.d = h.a();
        this.e = new a(0.0f);
        this.f = new a(0.0f);
        this.g = new a(0.0f);
        this.h = new a(0.0f);
        this.i = h.b();
        this.j = h.b();
        this.k = h.b();
        this.l = h.b();
    }

    private k(b bVar) {
        this.f1320a = bVar.f1323a;
        this.f1321b = bVar.f1324b;
        this.f1322c = bVar.f1325c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    private static c a(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public static b a(Context context, int i2, int i3) {
        return a(context, i2, i3, 0);
    }

    private static b a(Context context, int i2, int i3, int i4) {
        return a(context, i2, i3, new a((float) i4));
    }

    private static b a(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, b.c.b.b.k.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(b.c.b.b.k.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(b.c.b.b.k.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(b.c.b.b.k.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(b.c.b.b.k.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(b.c.b.b.k.ShapeAppearance_cornerFamilyBottomLeft, i4);
            c a2 = a(obtainStyledAttributes, b.c.b.b.k.ShapeAppearance_cornerSize, cVar);
            c a3 = a(obtainStyledAttributes, b.c.b.b.k.ShapeAppearance_cornerSizeTopLeft, a2);
            c a4 = a(obtainStyledAttributes, b.c.b.b.k.ShapeAppearance_cornerSizeTopRight, a2);
            c a5 = a(obtainStyledAttributes, b.c.b.b.k.ShapeAppearance_cornerSizeBottomRight, a2);
            c a6 = a(obtainStyledAttributes, b.c.b.b.k.ShapeAppearance_cornerSizeBottomLeft, a2);
            b bVar = new b();
            bVar.c(i5, a3);
            bVar.d(i6, a4);
            bVar.b(i7, a5);
            bVar.a(i8, a6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b a(Context context, AttributeSet attributeSet, int i2, int i3) {
        return a(context, attributeSet, i2, i3, 0);
    }

    public static b a(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return a(context, attributeSet, i2, i3, new a((float) i4));
    }

    public static b a(Context context, AttributeSet attributeSet, int i2, int i3, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.b.b.k.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(b.c.b.b.k.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(b.c.b.b.k.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, cVar);
    }

    public static b n() {
        return new b();
    }

    public f a() {
        return this.k;
    }

    public k a(float f2) {
        b m = m();
        m.a(f2);
        return m.a();
    }

    public k a(c cVar) {
        b m = m();
        m.c(cVar.a(j()));
        m.d(cVar.a(l()));
        m.a(cVar.a(c()));
        m.b(cVar.a(e()));
        return m.a();
    }

    public boolean a(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f1321b instanceof j) && (this.f1320a instanceof j) && (this.f1322c instanceof j) && (this.d instanceof j));
    }

    public d b() {
        return this.d;
    }

    public c c() {
        return this.h;
    }

    public d d() {
        return this.f1322c;
    }

    public c e() {
        return this.g;
    }

    public f f() {
        return this.l;
    }

    public f g() {
        return this.j;
    }

    public f h() {
        return this.i;
    }

    public d i() {
        return this.f1320a;
    }

    public c j() {
        return this.e;
    }

    public d k() {
        return this.f1321b;
    }

    public c l() {
        return this.f;
    }

    public b m() {
        return new b(this);
    }
}
