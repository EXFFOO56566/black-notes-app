package b.c.b.b.l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f1262a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f1263b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f1264c = new Matrix();

    public Matrix a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f1262a);
        matrix2.getValues(this.f1263b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f1263b;
            float f2 = fArr[i];
            float[] fArr2 = this.f1262a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f1264c.setValues(this.f1263b);
        return this.f1264c;
    }
}
