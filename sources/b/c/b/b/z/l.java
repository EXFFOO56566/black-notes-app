package b.c.b.b.z;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f1326a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f1327b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f1328c = new Matrix[4];
    private final PointF d = new PointF();
    private final m e = new m();
    private final float[] f = new float[2];
    private final float[] g = new float[2];

    public interface a {
        void a(m mVar, Matrix matrix, int i);

        void b(m mVar, Matrix matrix, int i);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k f1329a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f1330b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f1331c;
        public final a d;
        public final float e;

        b(k kVar, float f, RectF rectF, a aVar, Path path) {
            this.d = aVar;
            this.f1329a = kVar;
            this.e = f;
            this.f1331c = rectF;
            this.f1330b = path;
        }
    }

    public l() {
        for (int i = 0; i < 4; i++) {
            this.f1326a[i] = new m();
            this.f1327b[i] = new Matrix();
            this.f1328c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (float) ((i + 1) * 90);
    }

    private float a(RectF rectF, int i) {
        float centerX;
        float f2;
        float[] fArr = this.f;
        m[] mVarArr = this.f1326a;
        fArr[0] = mVarArr[i].f1334c;
        fArr[1] = mVarArr[i].d;
        this.f1327b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f2 = this.f[0];
        } else {
            centerX = rectF.centerY();
            f2 = this.f[1];
        }
        return Math.abs(centerX - f2);
    }

    private c a(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.l() : kVar.j() : kVar.c() : kVar.e();
    }

    private void a(int i, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        if (i == 1) {
            f2 = rectF.right;
            f3 = rectF.bottom;
        } else if (i != 2) {
            f2 = i != 3 ? rectF.right : rectF.left;
            f3 = rectF.top;
        } else {
            f2 = rectF.left;
            f3 = rectF.bottom;
        }
        pointF.set(f2, f3);
    }

    private void a(b bVar, int i) {
        this.f[0] = this.f1326a[i].c();
        this.f[1] = this.f1326a[i].d();
        this.f1327b[i].mapPoints(this.f);
        Path path = bVar.f1330b;
        float[] fArr = this.f;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f1326a[i].a(this.f1327b[i], bVar.f1330b);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.b(this.f1326a[i], this.f1327b[i], i);
        }
    }

    private d b(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.k() : kVar.i() : kVar.b() : kVar.d();
    }

    private void b(int i) {
        this.f[0] = this.f1326a[i].a();
        this.f[1] = this.f1326a[i].b();
        this.f1327b[i].mapPoints(this.f);
        float a2 = a(i);
        this.f1328c[i].reset();
        Matrix matrix = this.f1328c[i];
        float[] fArr = this.f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f1328c[i].preRotate(a2);
    }

    private void b(b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f[0] = this.f1326a[i].a();
        this.f[1] = this.f1326a[i].b();
        this.f1327b[i].mapPoints(this.f);
        this.g[0] = this.f1326a[i2].c();
        this.g[1] = this.f1326a[i2].d();
        this.f1327b[i2].mapPoints(this.g);
        float[] fArr = this.f;
        float f2 = fArr[0];
        float[] fArr2 = this.g;
        float max = Math.max(((float) Math.hypot((double) (f2 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float a2 = a(bVar.f1331c, i);
        this.e.b(0.0f, 0.0f);
        c(i, bVar.f1329a).a(max, a2, bVar.e, this.e);
        this.e.a(this.f1328c[i], bVar.f1330b);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.a(this.e, this.f1328c[i], i);
        }
    }

    private f c(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.g() : kVar.h() : kVar.f() : kVar.a();
    }

    private void c(b bVar, int i) {
        b(i, bVar.f1329a).a(this.f1326a[i], 90.0f, bVar.e, bVar.f1331c, a(i, bVar.f1329a));
        float a2 = a(i);
        this.f1327b[i].reset();
        a(i, bVar.f1331c, this.d);
        Matrix matrix = this.f1327b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f1327b[i].preRotate(a2);
    }

    public void a(k kVar, float f2, RectF rectF, Path path) {
        a(kVar, f2, rectF, null, path);
    }

    public void a(k kVar, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(kVar, f2, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            c(bVar, i);
            b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            a(bVar, i2);
            b(bVar, i2);
        }
        path.close();
    }
}
