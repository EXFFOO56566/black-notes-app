package b.c.b.b.z;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f1332a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f1333b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f1334c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();

    /* access modifiers changed from: package-private */
    public class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f1335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f1336c;

        a(m mVar, List list, Matrix matrix) {
            this.f1335b = list;
            this.f1336c = matrix;
        }

        @Override // b.c.b.b.z.m.g
        public void a(Matrix matrix, b.c.b.b.y.a aVar, int i, Canvas canvas) {
            for (g gVar : this.f1335b) {
                gVar.a(this.f1336c, aVar, i, canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final d f1337b;

        public b(d dVar) {
            this.f1337b = dVar;
        }

        @Override // b.c.b.b.z.m.g
        public void a(Matrix matrix, b.c.b.b.y.a aVar, int i, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f1337b.b(), this.f1337b.f(), this.f1337b.c(), this.f1337b.a()), i, this.f1337b.d(), this.f1337b.e());
        }
    }

    static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        private final e f1338b;

        /* renamed from: c  reason: collision with root package name */
        private final float f1339c;
        private final float d;

        public c(e eVar, float f, float f2) {
            this.f1338b = eVar;
            this.f1339c = f;
            this.d = f2;
        }

        /* access modifiers changed from: package-private */
        public float a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f1338b.f1343c - this.d) / (this.f1338b.f1342b - this.f1339c))));
        }

        @Override // b.c.b.b.z.m.g
        public void a(Matrix matrix, b.c.b.b.y.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f1338b.f1343c - this.d), (double) (this.f1338b.f1342b - this.f1339c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f1339c, this.d);
            matrix2.preRotate(a());
            aVar.a(canvas, matrix2, rectF, i);
        }
    }

    public static class d extends f {
        private static final RectF h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f1340b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f1341c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f2, float f3, float f4, float f5) {
            b(f2);
            f(f3);
            c(f4);
            a(f5);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float a() {
            return this.e;
        }

        private void a(float f2) {
            this.e = f2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float b() {
            return this.f1340b;
        }

        private void b(float f2) {
            this.f1340b = f2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float c() {
            return this.d;
        }

        private void c(float f2) {
            this.d = f2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float d() {
            return this.f;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void d(float f2) {
            this.f = f2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float e() {
            return this.g;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void e(float f2) {
            this.g = f2;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private float f() {
            return this.f1341c;
        }

        private void f(float f2) {
            this.f1341c = f2;
        }

        @Override // b.c.b.b.z.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1344a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(b(), f(), c(), a());
            path.arcTo(h, d(), e(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        private float f1342b;

        /* renamed from: c  reason: collision with root package name */
        private float f1343c;

        @Override // b.c.b.b.z.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1344a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f1342b, this.f1343c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f1344a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* access modifiers changed from: package-private */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f1345a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, b.c.b.b.y.a aVar, int i, Canvas canvas);

        public final void a(b.c.b.b.y.a aVar, int i, Canvas canvas) {
            a(f1345a, aVar, i, canvas);
        }
    }

    public m() {
        b(0.0f, 0.0f);
    }

    private void a(float f2) {
        if (e() != f2) {
            float e2 = ((f2 - e()) + 360.0f) % 360.0f;
            if (e2 <= 180.0f) {
                d dVar = new d(a(), b(), a(), b());
                dVar.d((d) e());
                dVar.e((d) e2);
                this.h.add(new b(dVar));
                b(f2);
            }
        }
    }

    private void a(g gVar, float f2, float f3) {
        a(f2);
        this.h.add(gVar);
        b(f3);
    }

    private void b(float f2) {
        this.e = f2;
    }

    private void c(float f2) {
        this.f = f2;
    }

    private void d(float f2) {
        this.f1334c = f2;
    }

    private float e() {
        return this.e;
    }

    private void e(float f2) {
        this.d = f2;
    }

    private float f() {
        return this.f;
    }

    private void f(float f2) {
        this.f1332a = f2;
    }

    private void g(float f2) {
        this.f1333b = f2;
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.f1334c;
    }

    /* access modifiers changed from: package-private */
    public g a(Matrix matrix) {
        a(f());
        return new a(this, new ArrayList(this.h), matrix);
    }

    public void a(float f2, float f3) {
        e eVar = new e();
        eVar.f1342b = f2;
        eVar.f1343c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, a(), b());
        a(cVar, cVar.a() + 270.0f, cVar.a() + 270.0f);
        d(f2);
        e(f3);
    }

    public void a(float f2, float f3, float f4, float f5) {
        f(f2);
        g(f3);
        d(f2);
        e(f3);
        b(f4);
        c((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.d((d) f6);
        dVar.e((d) f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        a(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = (double) f8;
        d(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        e(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void a(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.d;
    }

    public void b(float f2, float f3) {
        a(f2, f3, 270.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f1332a;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f1333b;
    }
}
