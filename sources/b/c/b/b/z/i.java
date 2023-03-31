package b.c.b.b.z;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f1318a;

    public i(float f) {
        this.f1318a = f;
    }

    @Override // b.c.b.b.z.c
    public float a(RectF rectF) {
        return this.f1318a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f1318a == ((i) obj).f1318a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1318a)});
    }
}
