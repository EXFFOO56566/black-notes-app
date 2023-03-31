package a.d.a;

import a.d.a.h;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* access modifiers changed from: package-private */
public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    final RectF f68a = new RectF();

    class a implements h.a {
        a() {
        }

        @Override // a.d.a.h.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                d.this.f68a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(d.this.f68a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f68a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f68a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f68a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    d() {
    }

    private h j(e eVar) {
        return (h) eVar.d();
    }

    @Override // a.d.a.f
    public float a(e eVar) {
        return j(eVar).c();
    }

    @Override // a.d.a.f
    public void a() {
        h.r = new a();
    }

    @Override // a.d.a.f
    public void a(e eVar, float f) {
        j(eVar).a(f);
        i(eVar);
    }

    @Override // a.d.a.f
    public void a(e eVar, ColorStateList colorStateList) {
        j(eVar).a(colorStateList);
    }

    @Override // a.d.a.f
    public ColorStateList b(e eVar) {
        return j(eVar).a();
    }

    @Override // a.d.a.f
    public void b(e eVar, float f) {
        j(eVar).c(f);
    }

    @Override // a.d.a.f
    public float c(e eVar) {
        return j(eVar).f();
    }

    @Override // a.d.a.f
    public void c(e eVar, float f) {
        j(eVar).b(f);
        i(eVar);
    }

    @Override // a.d.a.f
    public float d(e eVar) {
        return j(eVar).b();
    }

    @Override // a.d.a.f
    public float e(e eVar) {
        return j(eVar).d();
    }

    @Override // a.d.a.f
    public float f(e eVar) {
        return j(eVar).e();
    }

    @Override // a.d.a.f
    public void g(e eVar) {
    }

    @Override // a.d.a.f
    public void h(e eVar) {
        j(eVar).a(eVar.b());
        i(eVar);
    }

    public void i(e eVar) {
        Rect rect = new Rect();
        j(eVar).a(rect);
        eVar.a((int) Math.ceil((double) f(eVar)), (int) Math.ceil((double) e(eVar)));
        eVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
