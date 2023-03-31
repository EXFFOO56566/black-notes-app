package b.c.b.b.z;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f1308a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1309b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1308a;
            f += ((b) cVar).f1309b;
        }
        this.f1308a = cVar;
        this.f1309b = f;
    }

    @Override // b.c.b.b.z.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f1308a.a(rectF) + this.f1309b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1308a.equals(bVar.f1308a) && this.f1309b == bVar.f1309b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1308a, Float.valueOf(this.f1309b)});
    }
}
