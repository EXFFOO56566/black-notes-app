package b.c.b.b.p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f1276b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f1277a = new e();

        /* renamed from: a */
        public e evaluate(float f, e eVar, e eVar2) {
            this.f1277a.a(b.c.b.b.u.a.a(eVar.f1280a, eVar2.f1280a, f), b.c.b.b.u.a.a(eVar.f1281b, eVar2.f1281b, f), b.c.b.b.u.a.a(eVar.f1282c, eVar2.f1282c, f));
            return this.f1277a;
        }
    }

    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f1278a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: b.c.b.b.p.d$d  reason: collision with other inner class name */
    public static class C0064d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f1279a = new C0064d("circularRevealScrimColor");

        private C0064d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f1280a;

        /* renamed from: b  reason: collision with root package name */
        public float f1281b;

        /* renamed from: c  reason: collision with root package name */
        public float f1282c;

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.f1280a = f;
            this.f1281b = f2;
            this.f1282c = f3;
        }

        public void a(float f, float f2, float f3) {
            this.f1280a = f;
            this.f1281b = f2;
            this.f1282c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
