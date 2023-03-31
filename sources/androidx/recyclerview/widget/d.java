package androidx.recyclerview.widget;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

class d extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();

    /* renamed from: a  reason: collision with root package name */
    private final int f1055a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1056b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f1057c;
    final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private int q = 0;
    private int r = 0;
    private RecyclerView s;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);

    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.a(500);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            d.this.a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1060a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f1060a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f1060a) {
                this.f1060a = false;
            } else if (((Float) d.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.b(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    private class C0051d implements ValueAnimator.AnimatorUpdateListener {
        C0051d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f1057c.setAlpha(floatValue);
            d.this.d.setAlpha(floatValue);
            d.this.a();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.f1057c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i2, drawable.getIntrinsicWidth());
        this.i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1055a = i3;
        this.f1056b = i4;
        this.f1057c.setAlpha(255);
        this.d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new C0051d());
        a(recyclerView);
    }

    private int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private void a(float f2) {
        int[] e2 = e();
        float max = Math.max((float) e2[0], Math.min((float) e2[1], f2));
        if (Math.abs(((float) this.o) - max) >= 2.0f) {
            int a2 = a(this.p, max, e2, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
            if (a2 != 0) {
                this.s.scrollBy(a2, 0);
            }
            this.p = max;
        }
    }

    private void a(Canvas canvas) {
        int i2 = this.r;
        int i3 = this.i;
        int i4 = i2 - i3;
        int i5 = this.o;
        int i6 = this.n;
        int i7 = i5 - (i6 / 2);
        this.g.setBounds(0, 0, i6, i3);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, (float) i4);
        this.h.draw(canvas);
        canvas.translate((float) i7, 0.0f);
        this.g.draw(canvas);
        canvas.translate((float) (-i7), (float) (-i4));
    }

    private void b(float f2) {
        int[] f3 = f();
        float max = Math.max((float) f3[0], Math.min((float) f3[1], f2));
        if (Math.abs(((float) this.l) - max) >= 2.0f) {
            int a2 = a(this.m, max, f3, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
            if (a2 != 0) {
                this.s.scrollBy(0, a2);
            }
            this.m = max;
        }
    }

    private void b(Canvas canvas) {
        int i2 = this.q;
        int i3 = this.e;
        int i4 = i2 - i3;
        int i5 = this.l;
        int i6 = this.k;
        int i7 = i5 - (i6 / 2);
        this.f1057c.setBounds(0, 0, i3, i6);
        this.d.setBounds(0, 0, this.f, this.r);
        if (g()) {
            this.d.draw(canvas);
            canvas.translate((float) this.e, (float) i7);
            canvas.scale(-1.0f, 1.0f);
            this.f1057c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i4 = this.e;
        } else {
            canvas.translate((float) i4, 0.0f);
            this.d.draw(canvas);
            canvas.translate(0.0f, (float) i7);
            this.f1057c.draw(canvas);
        }
        canvas.translate((float) (-i4), (float) (-i7));
    }

    private void c() {
        this.s.removeCallbacks(this.B);
    }

    private void c(int i2) {
        c();
        this.s.postDelayed(this.B, (long) i2);
    }

    private void d() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        c();
    }

    private int[] e() {
        int[] iArr = this.y;
        int i2 = this.f1056b;
        iArr[0] = i2;
        iArr[1] = this.q - i2;
        return iArr;
    }

    private int[] f() {
        int[] iArr = this.x;
        int i2 = this.f1056b;
        iArr[0] = i2;
        iArr[1] = this.r - i2;
        return iArr;
    }

    private boolean g() {
        return u.o(this.s) == 1;
    }

    private void h() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        int i3 = this.A;
        if (i3 == 1) {
            this.z.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration((long) i2);
        this.z.start();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i4 = this.r;
        this.t = computeVerticalScrollRange - i4 > 0 && i4 >= this.f1055a;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i5 = this.q;
        boolean z2 = computeHorizontalScrollRange - i5 > 0 && i5 >= this.f1055a;
        this.u = z2;
        if (this.t || z2) {
            if (this.t) {
                float f2 = (float) i4;
                this.l = (int) ((f2 * (((float) i3) + (f2 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (this.u) {
                float f3 = (float) i5;
                this.o = (int) ((f3 * (((float) i2) + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = this.v;
            if (i6 == 0 || i6 == 1) {
                b(1);
            }
        } else if (this.v != 0) {
            b(0);
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                d();
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                h();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean a(float f2, float f3) {
        if (f3 >= ((float) (this.r - this.i))) {
            int i2 = this.o;
            int i3 = this.n;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.v;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        boolean a2 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b2 && !a2) {
            return false;
        }
        if (a2) {
            this.w = 1;
            this.p = (float) ((int) motionEvent.getX());
        } else if (b2) {
            this.w = 2;
            this.m = (float) ((int) motionEvent.getY());
        }
        b(2);
    }

    public void b() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0);
        this.z.start();
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        int i3;
        if (i2 == 2 && this.v != 2) {
            this.f1057c.setState(D);
            c();
        }
        if (i2 == 0) {
            a();
        } else {
            b();
        }
        if (this.v != 2 || i2 == 2) {
            if (i2 == 1) {
                i3 = 1500;
            }
            this.v = i2;
        }
        this.f1057c.setState(E);
        i3 = 1200;
        c(i3);
        this.v = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            b(0);
        } else if (this.A != 0) {
            if (this.t) {
                b(canvas);
            }
            if (this.u) {
                a(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                if (b2 || a2) {
                    if (a2) {
                        this.w = 1;
                        this.p = (float) ((int) motionEvent.getX());
                    } else if (b2) {
                        this.w = 2;
                        this.m = (float) ((int) motionEvent.getY());
                    }
                    b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                b(1);
                this.w = 0;
            } else if (motionEvent.getAction() == 2 && this.v == 2) {
                b();
                if (this.w == 1) {
                    a(motionEvent.getX());
                }
                if (this.w == 2) {
                    b(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(float f2, float f3) {
        if (!g() ? f2 >= ((float) (this.q - this.e)) : f2 <= ((float) (this.e / 2))) {
            int i2 = this.l;
            int i3 = this.k;
            return f3 >= ((float) (i2 - (i3 / 2))) && f3 <= ((float) (i2 + (i3 / 2)));
        }
    }
}
