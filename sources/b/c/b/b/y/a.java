package b.c.b.b.y;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class a {
    private static final int[] h = new int[3];
    private static final float[] i = {0.0f, 0.5f, 1.0f};
    private static final int[] j = new int[4];
    private static final float[] k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f1304a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1305b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f1306c;
    private int d;
    private int e;
    private int f;
    private final Path g;

    public a() {
        this(-16777216);
    }

    public a(int i2) {
        this.g = new Path();
        a(i2);
        Paint paint = new Paint(4);
        this.f1305b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f1304a = paint2;
        paint2.setColor(this.d);
        this.f1306c = new Paint(this.f1305b);
    }

    public Paint a() {
        return this.f1304a;
    }

    public void a(int i2) {
        this.d = a.g.e.a.c(i2, 68);
        this.e = a.g.e.a.c(i2, 20);
        this.f = a.g.e.a.c(i2, 0);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = h;
        iArr[0] = this.f;
        iArr[1] = this.e;
        iArr[2] = this.d;
        Paint paint = this.f1306c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, h, i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f1306c);
        canvas.restore();
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.g;
        if (z) {
            int[] iArr = j;
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.e;
            iArr[3] = this.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = (float) (-i2);
            rectF.inset(f4, f4);
            int[] iArr2 = j;
            iArr2[0] = 0;
            iArr2[1] = this.d;
            iArr2[2] = this.e;
            iArr2[3] = this.f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float[] fArr = k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f1305b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, j, k, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f1305b);
        canvas.restore();
    }
}
