package b.c.b.b.z;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import b.c.b.b.z.k;
import b.c.b.b.z.l;
import b.c.b.b.z.m;

public class g extends Drawable implements androidx.core.graphics.drawable.b, n {
    private static final Paint w = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    private c f1311b;

    /* renamed from: c  reason: collision with root package name */
    private final m.g[] f1312c;
    private final m.g[] d;
    private boolean e;
    private final Matrix f;
    private final Path g;
    private final Path h;
    private final RectF i;
    private final RectF j;
    private final Region k;
    private final Region l;
    private k m;
    private final Paint n;
    private final Paint o;
    private final b.c.b.b.y.a p;
    private final l.a q;
    private final l r;
    private PorterDuffColorFilter s;
    private PorterDuffColorFilter t;
    private Rect u;
    private final RectF v;

    class a implements l.a {
        a() {
        }

        @Override // b.c.b.b.z.l.a
        public void a(m mVar, Matrix matrix, int i) {
            g.this.d[i] = mVar.a(matrix);
        }

        @Override // b.c.b.b.z.l.a
        public void b(m mVar, Matrix matrix, int i) {
            g.this.f1312c[i] = mVar.a(matrix);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f1314a;

        b(g gVar, float f) {
            this.f1314a = f;
        }

        @Override // b.c.b.b.z.k.c
        public c a(c cVar) {
            return cVar instanceof i ? cVar : new b(this.f1314a, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f1315a;

        /* renamed from: b  reason: collision with root package name */
        public b.c.b.b.s.a f1316b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f1317c;
        public ColorStateList d = null;
        public ColorStateList e = null;
        public ColorStateList f = null;
        public ColorStateList g = null;
        public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
        public Rect i = null;
        public float j = 1.0f;
        public float k = 1.0f;
        public float l;
        public int m = 255;
        public float n = 0.0f;
        public float o = 0.0f;
        public float p = 0.0f;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public c(c cVar) {
            this.f1315a = cVar.f1315a;
            this.f1316b = cVar.f1316b;
            this.l = cVar.l;
            this.f1317c = cVar.f1317c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }

        public c(k kVar, b.c.b.b.s.a aVar) {
            this.f1315a = kVar;
            this.f1316b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.e = true;
            return gVar;
        }
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.a(context, attributeSet, i2, i3).a());
    }

    private g(c cVar) {
        this.f1312c = new m.g[4];
        this.d = new m.g[4];
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        this.n = new Paint(1);
        this.o = new Paint(1);
        this.p = new b.c.b.b.y.a();
        this.r = new l();
        this.v = new RectF();
        this.f1311b = cVar;
        this.o.setStyle(Paint.Style.STROKE);
        this.n.setStyle(Paint.Style.FILL);
        w.setColor(-1);
        w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A();
        a(getState());
        this.q = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private boolean A() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.f1311b;
        this.s = a(cVar.g, cVar.h, this.n, true);
        c cVar2 = this.f1311b;
        this.t = a(cVar2.f, cVar2.h, this.o, false);
        c cVar3 = this.f1311b;
        if (cVar3.u) {
            this.p.a(cVar3.g.getColorForState(getState(), 0));
        }
        return !a.g.k.c.a(porterDuffColorFilter, this.s) || !a.g.k.c.a(porterDuffColorFilter2, this.t);
    }

    private void B() {
        float p2 = p();
        this.f1311b.r = (int) Math.ceil((double) (0.75f * p2));
        this.f1311b.s = (int) Math.ceil((double) (p2 * 0.25f));
        A();
        y();
    }

    private static int a(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? a(paint, z) : a(colorStateList, mode, z);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = b(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter a(Paint paint, boolean z) {
        int color;
        int b2;
        if (!z || (b2 = b((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN);
    }

    public static g a(Context context, float f2) {
        int a2 = b.c.b.b.q.a.a(context, b.c.b.b.b.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.a(context);
        gVar.a(ColorStateList.valueOf(a2));
        gVar.a(f2);
        return gVar;
    }

    private void a(Canvas canvas) {
        if (this.f1311b.s != 0) {
            canvas.drawPath(this.g, this.p.a());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f1312c[i2].a(this.p, this.f1311b.r, canvas);
            this.d[i2].a(this.p, this.f1311b.r, canvas);
        }
        int h2 = h();
        int i3 = i();
        canvas.translate((float) (-h2), (float) (-i3));
        canvas.drawPath(this.g, w);
        canvas.translate((float) h2, (float) i3);
    }

    private void a(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.a(rectF)) {
            float a2 = kVar.l().a(rectF);
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private boolean a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f1311b.d == null || color2 == (colorForState2 = this.f1311b.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.f1311b.e == null || color == (colorForState = this.f1311b.e.getColorForState(iArr, (color = this.o.getColor())))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    private int b(int i2) {
        float p2 = p() + g();
        b.c.b.b.s.a aVar = this.f1311b.f1316b;
        return aVar != null ? aVar.b(i2, p2) : i2;
    }

    private void b(Canvas canvas) {
        a(canvas, this.n, this.g, this.f1311b.f1315a, d());
    }

    private void b(RectF rectF, Path path) {
        a(rectF, path);
        if (this.f1311b.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f2 = this.f1311b.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.v, true);
    }

    private void c(Canvas canvas) {
        a(canvas, this.o, this.h, this.m, t());
    }

    private void d(Canvas canvas) {
        int h2 = h();
        int i2 = i();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i3 = this.f1311b.r;
            clipBounds.inset(-i3, -i3);
            clipBounds.offset(h2, i2);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) h2, (float) i2);
    }

    private void s() {
        k a2 = k().a(new b(this, -u()));
        this.m = a2;
        this.r.a(a2, this.f1311b.k, t(), this.h);
    }

    private RectF t() {
        RectF d2 = d();
        float u2 = u();
        this.j.set(d2.left + u2, d2.top + u2, d2.right - u2, d2.bottom - u2);
        return this.j;
    }

    private float u() {
        if (x()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean v() {
        c cVar = this.f1311b;
        int i2 = cVar.q;
        return i2 != 1 && cVar.r > 0 && (i2 == 2 || z());
    }

    private boolean w() {
        Paint.Style style = this.f1311b.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean x() {
        Paint.Style style = this.f1311b.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    private void y() {
        super.invalidateSelf();
    }

    private boolean z() {
        return Build.VERSION.SDK_INT < 21 || (!r() && !this.g.isConvex());
    }

    public void a(float f2) {
        c cVar = this.f1311b;
        if (cVar.o != f2) {
            cVar.o = f2;
            B();
        }
    }

    public void a(float f2, int i2) {
        d(f2);
        b(ColorStateList.valueOf(i2));
    }

    public void a(float f2, ColorStateList colorStateList) {
        d(f2);
        b(colorStateList);
    }

    public void a(int i2) {
        c cVar = this.f1311b;
        if (cVar.t != i2) {
            cVar.t = i2;
            y();
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        c cVar = this.f1311b;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.f1311b.i.set(i2, i3, i4, i5);
        this.u = this.f1311b.i;
        invalidateSelf();
    }

    public void a(Context context) {
        this.f1311b.f1316b = new b.c.b.b.s.a(context);
        B();
    }

    public void a(ColorStateList colorStateList) {
        c cVar = this.f1311b;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        a(canvas, paint, path, this.f1311b.f1315a, rectF);
    }

    /* access modifiers changed from: protected */
    public final void a(RectF rectF, Path path) {
        l lVar = this.r;
        c cVar = this.f1311b;
        lVar.a(cVar.f1315a, cVar.k, rectF, this.q, path);
    }

    public float b() {
        return this.f1311b.f1315a.c().a(d());
    }

    public void b(float f2) {
        c cVar = this.f1311b;
        if (cVar.k != f2) {
            cVar.k = f2;
            this.e = true;
            invalidateSelf();
        }
    }

    public void b(ColorStateList colorStateList) {
        c cVar = this.f1311b;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public float c() {
        return this.f1311b.f1315a.e().a(d());
    }

    public void c(float f2) {
        c cVar = this.f1311b;
        if (cVar.n != f2) {
            cVar.n = f2;
            B();
        }
    }

    /* access modifiers changed from: protected */
    public RectF d() {
        Rect bounds = getBounds();
        this.i.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.i;
    }

    public void d(float f2) {
        this.f1311b.l = f2;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(a(alpha, this.f1311b.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.f1311b.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(a(alpha2, this.f1311b.m));
        if (this.e) {
            s();
            b(d(), this.g);
            this.e = false;
        }
        if (v()) {
            canvas.save();
            d(canvas);
            int width = (int) (this.v.width() - ((float) getBounds().width()));
            int height = (int) (this.v.height() - ((float) getBounds().height()));
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.f1311b.r * 2) + width, ((int) this.v.height()) + (this.f1311b.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (float) ((getBounds().left - this.f1311b.r) - width);
            float f3 = (float) ((getBounds().top - this.f1311b.r) - height);
            canvas2.translate(-f2, -f3);
            a(canvas2);
            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (w()) {
            b(canvas);
        }
        if (x()) {
            c(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public float e() {
        return this.f1311b.o;
    }

    public ColorStateList f() {
        return this.f1311b.d;
    }

    public float g() {
        return this.f1311b.n;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f1311b;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f1311b.q != 2) {
            if (r()) {
                outline.setRoundRect(getBounds(), m());
                return;
            }
            b(d(), this.g);
            if (this.g.isConvex()) {
                outline.setConvexPath(this.g);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.u;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.k.set(getBounds());
        b(d(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public int h() {
        c cVar = this.f1311b;
        return (int) (((double) cVar.s) * Math.sin(Math.toRadians((double) cVar.t)));
    }

    public int i() {
        c cVar = this.f1311b;
        return (int) (((double) cVar.s) * Math.cos(Math.toRadians((double) cVar.t)));
    }

    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f1311b.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f1311b.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f1311b.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f1311b.d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        return this.f1311b.r;
    }

    public k k() {
        return this.f1311b.f1315a;
    }

    public ColorStateList l() {
        return this.f1311b.g;
    }

    public float m() {
        return this.f1311b.f1315a.j().a(d());
    }

    public Drawable mutate() {
        this.f1311b = new c(this.f1311b);
        return this;
    }

    public float n() {
        return this.f1311b.f1315a.l().a(d());
    }

    public float o() {
        return this.f1311b.p;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = a(iArr) || A();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public float p() {
        return e() + o();
    }

    public boolean q() {
        b.c.b.b.s.a aVar = this.f1311b.f1316b;
        return aVar != null && aVar.a();
    }

    public boolean r() {
        return this.f1311b.f1315a.a(d());
    }

    public void setAlpha(int i2) {
        c cVar = this.f1311b;
        if (cVar.m != i2) {
            cVar.m = i2;
            y();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1311b.f1317c = colorFilter;
        y();
    }

    @Override // b.c.b.b.z.n
    public void setShapeAppearanceModel(k kVar) {
        this.f1311b.f1315a = kVar;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1311b.g = colorStateList;
        A();
        y();
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f1311b;
        if (cVar.h != mode) {
            cVar.h = mode;
            A();
            y();
        }
    }
}
