package a.m;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* access modifiers changed from: package-private */
public class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f321a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f322b;

    /* renamed from: c  reason: collision with root package name */
    private final float f323c;
    private final float[] d = new float[2];
    private final PointF e = new PointF();
    private float f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f321a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f322b = pathMeasure;
        this.f323c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f2) {
        this.f = f2.floatValue();
        this.f322b.getPosTan(this.f323c * f2.floatValue(), this.d, null);
        PointF pointF = this.e;
        float[] fArr = this.d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f321a.set(t, pointF);
    }

    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f);
    }
}
