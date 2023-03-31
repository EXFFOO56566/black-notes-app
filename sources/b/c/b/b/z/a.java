package b.c.b.b.z;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f1307a;

    public a(float f) {
        this.f1307a = f;
    }

    @Override // b.c.b.b.z.c
    public float a(RectF rectF) {
        return this.f1307a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1307a == ((a) obj).f1307a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1307a)});
    }
}
