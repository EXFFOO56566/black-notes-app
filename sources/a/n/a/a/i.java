package a.n.a.a;

import a.g.e.b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i extends h {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private h f389c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    /* access modifiers changed from: private */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f394b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f393a = a.g.e.b.a(string2);
            }
            this.f395c = a.g.d.c.g.b(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (a.g.d.c.g.a(xmlPullParser, "pathData")) {
                TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.d);
                a(a2, xmlPullParser);
                a2.recycle();
            }
        }

        @Override // a.n.a.a.i.f
        public boolean b() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class c extends f {
        private int[] e;
        a.g.d.c.b f;
        float g = 0.0f;
        a.g.d.c.b h;
        float i = 1.0f;
        float j = 1.0f;
        float k = 0.0f;
        float l = 1.0f;
        float m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        c() {
        }

        c(c cVar) {
            super(cVar);
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.f395c = cVar.f395c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap a(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join a(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (a.g.d.c.g.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f394b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f393a = a.g.e.b.a(string2);
                }
                this.h = a.g.d.c.g.a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.j = a.g.d.c.g.a(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = a(a.g.d.c.g.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = a(a.g.d.c.g.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = a.g.d.c.g.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f = a.g.d.c.g.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.i = a.g.d.c.g.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
                this.g = a.g.d.c.g.a(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
                this.l = a.g.d.c.g.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = a.g.d.c.g.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = a.g.d.c.g.a(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.f395c = a.g.d.c.g.b(typedArray, xmlPullParser, "fillType", 13, this.f395c);
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.f377c);
            a(a2, xmlPullParser, theme);
            a2.recycle();
        }

        @Override // a.n.a.a.i.e
        public boolean a() {
            return this.h.d() || this.f.d();
        }

        @Override // a.n.a.a.i.e
        public boolean a(int[] iArr) {
            return this.f.a(iArr) | this.h.a(iArr);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.h.a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f.a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i2) {
            this.h.a(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i2) {
            this.f.a(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.g = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    /* access modifiers changed from: private */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f390a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f391b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        float f392c = 0.0f;
        private float d = 0.0f;
        private float e = 0.0f;
        private float f = 1.0f;
        private float g = 1.0f;
        private float h = 0.0f;
        private float i = 0.0f;
        final Matrix j = new Matrix();
        int k;
        private int[] l;
        private String m = null;

        public d() {
            super();
        }

        public d(d dVar, a.e.a<String, Object> aVar) {
            super();
            f fVar;
            this.f392c = dVar.f392c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f391b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f391b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f391b.add(fVar);
                    String str2 = fVar.f394b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f392c = a.g.d.c.g.a(typedArray, xmlPullParser, "rotation", 5, this.f392c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = a.g.d.c.g.a(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = a.g.d.c.g.a(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = a.g.d.c.g.a(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = a.g.d.c.g.a(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.f392c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.f376b);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        @Override // a.n.a.a.i.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f391b.size(); i2++) {
                if (this.f391b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // a.n.a.a.i.e
        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f391b.size(); i2++) {
                z |= this.f391b.get(i2).a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.f392c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f392c) {
                this.f392c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                b();
            }
        }
    }

    /* access modifiers changed from: private */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected b.C0009b[] f393a = null;

        /* renamed from: b  reason: collision with root package name */
        String f394b;

        /* renamed from: c  reason: collision with root package name */
        int f395c = 0;
        int d;

        public f() {
            super();
        }

        public f(f fVar) {
            super();
            this.f394b = fVar.f394b;
            this.d = fVar.d;
            this.f393a = a.g.e.b.a(fVar.f393a);
        }

        public void a(Path path) {
            path.reset();
            b.C0009b[] bVarArr = this.f393a;
            if (bVarArr != null) {
                b.C0009b.a(bVarArr, path);
            }
        }

        public boolean b() {
            return false;
        }

        public b.C0009b[] getPathData() {
            return this.f393a;
        }

        public String getPathName() {
            return this.f394b;
        }

        public void setPathData(b.C0009b[] bVarArr) {
            if (!a.g.e.b.a(this.f393a, bVarArr)) {
                this.f393a = a.g.e.b.a(bVarArr);
            } else {
                a.g.e.b.b(this.f393a, bVarArr);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f396a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f397b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f398c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final a.e.a<String, Object> p;

        public g() {
            this.f398c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.e.a<>();
            this.h = new d();
            this.f396a = new Path();
            this.f397b = new Path();
        }

        public g(g gVar) {
            this.f398c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            a.e.a<String, Object> aVar = new a.e.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f396a = new Path(gVar.f396a);
            this.f397b = new Path(gVar.f397b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        private void a(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.k;
            float f3 = ((float) i3) / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.f390a;
            this.f398c.set(matrix);
            this.f398c.postScale(f2, f3);
            float a2 = a(matrix);
            if (a2 != 0.0f) {
                fVar.a(this.f396a);
                Path path = this.f396a;
                this.f397b.reset();
                if (fVar.b()) {
                    this.f397b.setFillType(fVar.f395c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f397b.addPath(path, this.f398c);
                    canvas.clipPath(this.f397b);
                    return;
                }
                c cVar = (c) fVar;
                if (!(cVar.k == 0.0f && cVar.l == 1.0f)) {
                    float f4 = cVar.k;
                    float f5 = cVar.m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.l + f5) % 1.0f;
                    if (this.f == null) {
                        this.f = new PathMeasure();
                    }
                    this.f.setPath(this.f396a, false);
                    float length = this.f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f.getSegment(f8, length, path, true);
                        this.f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f397b.addPath(path, this.f398c);
                if (cVar.h.e()) {
                    a.g.d.c.b bVar = cVar.h;
                    if (this.e == null) {
                        Paint paint = new Paint(1);
                        this.e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.e;
                    if (bVar.c()) {
                        Shader b2 = bVar.b();
                        b2.setLocalMatrix(this.f398c);
                        paint2.setShader(b2);
                        paint2.setAlpha(Math.round(cVar.j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(i.a(bVar.a(), cVar.j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f397b.setFillType(cVar.f395c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f397b, paint2);
                }
                if (cVar.f.e()) {
                    a.g.d.c.b bVar2 = cVar.f;
                    if (this.d == null) {
                        Paint paint3 = new Paint(1);
                        this.d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.d;
                    Paint.Join join = cVar.o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.p);
                    if (bVar2.c()) {
                        Shader b3 = bVar2.b();
                        b3.setLocalMatrix(this.f398c);
                        paint4.setShader(b3);
                        paint4.setAlpha(Math.round(cVar.i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(i.a(bVar2.a(), cVar.i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.g * min * a2);
                    canvas.drawPath(this.f397b, paint4);
                }
            }
        }

        private void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.f390a.set(matrix);
            dVar.f390a.preConcat(dVar.j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f391b.size(); i4++) {
                e eVar = dVar.f391b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.f390a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    a(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        public void a(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            a(this.h, q, canvas, i2, i3, colorFilter);
        }

        public boolean a() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.h.a(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.m = i2;
        }
    }

    /* access modifiers changed from: private */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f399a;

        /* renamed from: b  reason: collision with root package name */
        g f400b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f401c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public h() {
            this.f401c = null;
            this.d = i.k;
            this.f400b = new g();
        }

        public h(h hVar) {
            this.f401c = null;
            this.d = i.k;
            if (hVar != null) {
                this.f399a = hVar.f399a;
                g gVar = new g(hVar.f400b);
                this.f400b = gVar;
                if (hVar.f400b.e != null) {
                    gVar.e = new Paint(hVar.f400b.e);
                }
                if (hVar.f400b.d != null) {
                    this.f400b.d = new Paint(hVar.f400b.d);
                }
                this.f401c = hVar.f401c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public Paint a(ColorFilter colorFilter) {
            if (!b() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f400b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return !this.k && this.g == this.f401c && this.h == this.d && this.j == this.e && this.i == this.f400b.getRootAlpha();
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f.getWidth() && i3 == this.f.getHeight();
        }

        public boolean a(int[] iArr) {
            boolean a2 = this.f400b.a(iArr);
            this.k |= a2;
            return a2;
        }

        public void b(int i2, int i3) {
            if (this.f == null || !a(i2, i3)) {
                this.f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean b() {
            return this.f400b.getRootAlpha() < 255;
        }

        public void c(int i2, int i3) {
            this.f.eraseColor(0);
            this.f400b.a(new Canvas(this.f), i2, i3, (ColorFilter) null);
        }

        public boolean c() {
            return this.f400b.a();
        }

        public void d() {
            this.g = this.f401c;
            this.h = this.d;
            this.i = this.f400b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public int getChangingConfigurations() {
            return this.f399a;
        }

        public Drawable newDrawable() {
            return new i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.n.a.a.i$i  reason: collision with other inner class name */
    public static class C0035i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f402a;

        public C0035i(Drawable.ConstantState constantState) {
            this.f402a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f402a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f402a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f388b = (VectorDrawable) this.f402a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f388b = (VectorDrawable) this.f402a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f388b = (VectorDrawable) this.f402a.newDrawable(resources, theme);
            return iVar;
        }
    }

    i() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f389c = new h();
    }

    i(h hVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f389c = hVar;
        this.d = a(this.d, hVar.f401c, hVar.d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.n.a.a.i a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            a.n.a.a.i r0 = new a.n.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = a.g.d.c.f.a(r6, r7, r8)
            r0.f388b = r6
            a.n.a.a.i$i r6 = new a.n.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f388b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            a.n.a.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.a.a.i.a(android.content.res.Resources, int, android.content.res.Resources$Theme):a.n.a.a.i");
    }

    private static PorterDuff.Mode a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: a.n.a.a.i$c */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        b bVar;
        h hVar = this.f389c;
        g gVar = hVar.f400b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f391b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f391b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f391b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = hVar.f399a;
                    i3 = dVar2.k;
                    hVar.f399a = i3 | i2;
                }
                i2 = hVar.f399a;
                i3 = bVar.d;
                hVar.f399a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f389c;
        g gVar = hVar.f400b;
        hVar.d = a(a.g.d.c.g.b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a2 = a.g.d.c.g.a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a2 != null) {
            hVar.f401c = a2;
        }
        hVar.e = a.g.d.c.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.k = a.g.d.c.g.a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float a3 = a.g.d.c.g.a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = a3;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (a3 > 0.0f) {
            gVar.i = typedArray.getDimension(3, gVar.i);
            float dimension = typedArray.getDimension(2, gVar.j);
            gVar.j = dimension;
            if (gVar.i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(a.g.d.c.g.a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    public static i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    public Object a(String str) {
        return this.f389c.f400b.p.get(str);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.g = z;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f388b;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.a(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float abs = Math.abs(this.h[0]);
            float abs2 = Math.abs(this.h[4]);
            float abs3 = Math.abs(this.h[1]);
            float abs4 = Math.abs(this.h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.j.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.j.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.j;
                canvas.translate((float) rect.left, (float) rect.top);
                if (a()) {
                    canvas.translate((float) this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                this.f389c.b(min, min2);
                if (!this.g) {
                    this.f389c.c(min, min2);
                } else if (!this.f389c.a()) {
                    this.f389c.c(min, min2);
                    this.f389c.d();
                }
                this.f389c.a(canvas, colorFilter, this.j);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f388b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f389c.f400b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f389c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f388b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.e;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f388b != null && Build.VERSION.SDK_INT >= 24) {
            return new C0035i(this.f388b.getConstantState());
        }
        this.f389c.f399a = getChangingConfigurations();
        return this.f389c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f389c.f400b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f389c.f400b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f389c;
        hVar.f400b = new g();
        TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.f375a);
        a(a2, xmlPullParser, theme);
        a2.recycle();
        hVar.f399a = getChangingConfigurations();
        hVar.k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.d = a(this.d, hVar.f401c, hVar.d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f388b;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f389c.e;
    }

    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f389c) != null && (hVar.c() || ((colorStateList = this.f389c.f401c) != null && colorStateList.isStateful())));
    }

    public Drawable mutate() {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.f389c = new h(this.f389c);
            this.f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f388b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f389c;
        ColorStateList colorStateList = hVar.f401c;
        if (!(colorStateList == null || (mode = hVar.d) == null)) {
            this.d = a(this.d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.c() || !hVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f389c.f400b.getRootAlpha() != i2) {
            this.f389c.f400b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f389c.e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            return;
        }
        h hVar = this.f389c;
        if (hVar.f401c != colorStateList) {
            hVar.f401c = colorStateList;
            this.d = a(this.d, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
            return;
        }
        h hVar = this.f389c;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.d = a(this.d, hVar.f401c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f388b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f388b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
