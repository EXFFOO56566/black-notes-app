package b.c.b.b.s;

import android.content.Context;
import android.graphics.Color;
import b.c.b.b.w.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1283a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1284b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1285c;
    private final float d;

    public a(Context context) {
        this.f1283a = b.a(context, b.c.b.b.b.elevationOverlayEnabled, false);
        this.f1284b = b.c.b.b.q.a.a(context, b.c.b.b.b.elevationOverlayColor, 0);
        this.f1285c = b.c.b.b.q.a.a(context, b.c.b.b.b.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    private boolean a(int i) {
        return a.g.e.a.c(i, 255) == this.f1285c;
    }

    public float a(float f) {
        float f2 = this.d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int a(int i, float f) {
        float a2 = a(f);
        return a.g.e.a.c(b.c.b.b.q.a.a(a.g.e.a.c(i, 255), this.f1284b, a2), Color.alpha(i));
    }

    public boolean a() {
        return this.f1283a;
    }

    public int b(int i, float f) {
        return (!this.f1283a || !a(i)) ? i : a(i, f);
    }
}
