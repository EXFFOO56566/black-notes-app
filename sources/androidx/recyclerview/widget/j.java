package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class j extends RecyclerView.z {
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    protected PointF k;
    private final DisplayMetrics l;
    private boolean m = false;
    private float n;
    protected int o = 0;
    protected int p = 0;

    public j(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    private float k() {
        if (!this.m) {
            this.n = a(this.l);
            this.m = true;
        }
        return this.n;
    }

    /* access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int a(View view, int i2) {
        RecyclerView.o b2 = b();
        if (b2 == null || !b2.a()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return a(b2.f(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, b2.i(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, b2.o(), b2.r() - b2.p(), i2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void a(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (a() == 0) {
            h();
            return;
        }
        this.o = b(this.o, i2);
        int b2 = b(this.p, i3);
        this.p = b2;
        if (this.o == 0 && b2 == 0) {
            a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void a(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int a2 = a(view, i());
        int b2 = b(view, j());
        int d = d((int) Math.sqrt((double) ((a2 * a2) + (b2 * b2))));
        if (d > 0) {
            aVar.a(-a2, -b2, d, this.j);
        }
    }

    /* access modifiers changed from: protected */
    public void a(RecyclerView.z.a aVar) {
        PointF a2 = a(c());
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            aVar.a(c());
            h();
            return;
        }
        a(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        aVar.a((int) (((float) this.o) * 1.2f), (int) (((float) this.p) * 1.2f), (int) (((float) e(10000)) * 1.2f), this.i);
    }

    public int b(View view, int i2) {
        RecyclerView.o b2 = b();
        if (b2 == null || !b2.b()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return a(b2.j(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, b2.e(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, b2.q(), b2.h() - b2.n(), i2);
    }

    /* access modifiers changed from: protected */
    public int d(int i2) {
        return (int) Math.ceil(((double) e(i2)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int e(int i2) {
        return (int) Math.ceil((double) (((float) Math.abs(i2)) * k()));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void f() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void g() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public int i() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int j() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
