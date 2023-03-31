package a.d.a;

import a.d.a.h;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

class b extends d {

    class a implements h.a {
        a(b bVar) {
        }

        @Override // a.d.a.h.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    b() {
    }

    @Override // a.d.a.f, a.d.a.d
    public void a() {
        h.r = new a(this);
    }
}
