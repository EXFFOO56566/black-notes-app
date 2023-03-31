package a.i.b;

import a.g.l.u;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class c {
    private static final Interpolator w = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f266a;

    /* renamed from: b  reason: collision with root package name */
    private int f267b;

    /* renamed from: c  reason: collision with root package name */
    private int f268c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private OverScroller q;
    private final AbstractC0025c r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable v = new b();

    static class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.b(0);
        }
    }

    /* renamed from: a.i.b.c$c  reason: collision with other inner class name */
    public static abstract class AbstractC0025c {
        public int a(int i) {
            return i;
        }

        public int a(View view) {
            return 0;
        }

        public abstract int a(View view, int i, int i2);

        public void a(int i, int i2) {
        }

        public abstract void a(View view, float f, float f2);

        public void a(View view, int i) {
        }

        public abstract void a(View view, int i, int i2, int i3, int i4);

        public int b(View view) {
            return 0;
        }

        public abstract int b(View view, int i, int i2);

        public void b(int i, int i2) {
        }

        public boolean b(int i) {
            return false;
        }

        public abstract boolean b(View view, int i);

        public abstract void c(int i);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0025c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.u = viewGroup;
            this.r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f267b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private float a(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int a(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int a2 = a(i4, (int) this.n, (int) this.m);
        int a3 = a(i5, (int) this.n, (int) this.m);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(a2);
        int abs4 = Math.abs(a3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (a2 != 0) {
            f3 = (float) abs3;
            f2 = (float) i6;
        } else {
            f3 = (float) abs;
            f2 = (float) i7;
        }
        float f6 = f3 / f2;
        if (a3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i6;
        } else {
            f5 = (float) abs2;
            f4 = (float) i7;
        }
        float f7 = f5 / f4;
        return (int) ((((float) b(i2, a2, this.r.a(view))) * f6) + (((float) b(i3, a3, this.r.b(view))) * f7));
    }

    public static c a(ViewGroup viewGroup, float f2, AbstractC0025c cVar) {
        c a2 = a(viewGroup, cVar);
        a2.f267b = (int) (((float) a2.f267b) * (1.0f / f2));
        return a2;
    }

    public static c a(ViewGroup viewGroup, AbstractC0025c cVar) {
        return new c(viewGroup.getContext(), viewGroup, cVar);
    }

    private void a(float f2, float f3) {
        this.t = true;
        this.r.a(this.s, f2, f3);
        this.t = false;
        if (this.f266a == 1) {
            b(0);
        }
    }

    private void a(float f2, float f3, int i2) {
        int i3 = 1;
        if (!a(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (a(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (a(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (a(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.i;
            iArr[i2] = iArr[i2] | i3;
            this.r.a(i3, i2);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (i4 != 0) {
            i2 = this.r.a(this.s, i2, i4);
            u.d(this.s, i2 - left);
        }
        if (i5 != 0) {
            i3 = this.r.b(this.s, i3, i5);
            u.e(this.s, i3 - top);
        }
        if (i4 != 0 || i5 != 0) {
            this.r.a(this.s, i2, i3, i2 - left, i3 - top);
        }
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i2] & i3) != i3 || (this.p & i3) == 0 || (this.j[i2] & i3) == i3 || (this.i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f267b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.r.b(i3)) {
            return (this.i[i2] & i3) == 0 && abs > ((float) this.f267b);
        }
        int[] iArr = this.j;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.a(view) > 0;
        boolean z2 = this.r.b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f267b) : z2 && Math.abs(f3) > ((float) this.f267b);
        }
        int i2 = this.f267b;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    private int b(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f2 = (float) (width / 2);
        float a2 = f2 + (a(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(a2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    private void b(float f2, float f3, int i2) {
        d(i2);
        float[] fArr = this.d;
        this.f[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.e;
        this.g[i2] = f3;
        fArr2[i2] = f3;
        this.h[i2] = d((int) f2, (int) f3);
        this.k |= 1 << i2;
    }

    private boolean b(int i2, int i3, int i4, int i5) {
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.q.abortAnimation();
            b(0);
            return false;
        }
        this.q.startScroll(left, top, i6, i7, a(this.s, i6, i7, i4, i5));
        b(2);
        return true;
    }

    private void c() {
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    private void c(int i2) {
        if (this.d != null && a(i2)) {
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k = (~(1 << i2)) & this.k;
        }
    }

    private void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (e(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private int d(int i2, int i3) {
        int i4 = i2 < this.u.getLeft() + this.o ? 1 : 0;
        if (i3 < this.u.getTop() + this.o) {
            i4 |= 4;
        }
        if (i2 > this.u.getRight() - this.o) {
            i4 |= 2;
        }
        return i3 > this.u.getBottom() - this.o ? i4 | 8 : i4;
    }

    private void d() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(this.l.getXVelocity(this.f268c), this.n, this.m), a(this.l.getYVelocity(this.f268c), this.n, this.m));
    }

    private void d(int i2) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    private boolean e(int i2) {
        if (a(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public View a(int i2, int i3) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.u;
            this.r.a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void a() {
        this.f268c = -1;
        c();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void a(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f266a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (e(pointerId)) {
                                float x = motionEvent.getX(i3);
                                float y = motionEvent.getY(i3);
                                float f2 = x - this.d[pointerId];
                                float f3 = y - this.e[pointerId];
                                a(f2, f3, pointerId);
                                if (this.f266a != 1) {
                                    View a2 = a((int) x, (int) y);
                                    if (a(a2, f2, f3) && b(a2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (e(this.f268c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f268c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f;
                        int i4 = this.f268c;
                        int i5 = (int) (x2 - fArr[i4]);
                        int i6 = (int) (y2 - this.g[i4]);
                        a(this.s.getLeft() + i5, this.s.getTop() + i6, i5, i6);
                    } else {
                        return;
                    }
                    c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        b(x3, y3, pointerId2);
                        if (this.f266a == 0) {
                            b(a((int) x3, (int) y3), pointerId2);
                            int i7 = this.h[pointerId2];
                            int i8 = this.p;
                            if ((i7 & i8) != 0) {
                                this.r.b(i7 & i8, pointerId2);
                                return;
                            }
                            return;
                        } else if (b((int) x3, (int) y3)) {
                            b(this.s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f266a == 1 && pointerId3 == this.f268c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i3);
                                if (pointerId4 != this.f268c) {
                                    View a3 = a((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view = this.s;
                                    if (a3 == view && b(view, pointerId4)) {
                                        i2 = this.f268c;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                d();
                            }
                        }
                        c(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f266a == 1) {
                    a(0.0f, 0.0f);
                }
            } else if (this.f266a == 1) {
                d();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View a4 = a((int) x4, (int) y4);
        b(x4, y4, pointerId5);
        b(a4, pointerId5);
        int i9 = this.h[pointerId5];
        int i10 = this.p;
        if ((i9 & i10) != 0) {
            this.r.b(i9 & i10, pointerId5);
        }
    }

    public void a(View view, int i2) {
        if (view.getParent() == this.u) {
            this.s = view;
            this.f268c = i2;
            this.r.a(view, i2);
            b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    public boolean a(int i2) {
        return ((1 << i2) & this.k) != 0;
    }

    public boolean a(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public boolean a(boolean z) {
        if (this.f266a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                u.d(this.s, left);
            }
            if (top != 0) {
                u.e(this.s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.r.a(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.u.post(this.v);
                } else {
                    b(0);
                }
            }
        }
        return this.f266a == 2;
    }

    public int b() {
        return this.f267b;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.u.removeCallbacks(this.v);
        if (this.f266a != i2) {
            this.f266a = i2;
            this.r.c(i2);
            if (this.f266a == 0) {
                this.s = null;
            }
        }
    }

    public boolean b(int i2, int i3) {
        return a(this.s, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i.b.c.b(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i2) {
        if (view == this.s && this.f268c == i2) {
            return true;
        }
        if (view == null || !this.r.b(view, i2)) {
            return false;
        }
        this.f268c = i2;
        a(view, i2);
        return true;
    }

    public boolean b(View view, int i2, int i3) {
        this.s = view;
        this.f268c = -1;
        boolean b2 = b(i2, i3, 0, 0);
        if (!b2 && this.f266a == 0 && this.s != null) {
            this.s = null;
        }
        return b2;
    }

    public boolean c(int i2, int i3) {
        if (this.t) {
            return b(i2, i3, (int) this.l.getXVelocity(this.f268c), (int) this.l.getYVelocity(this.f268c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
}
