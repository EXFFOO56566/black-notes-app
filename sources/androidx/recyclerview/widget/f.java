package androidx.recyclerview.widget;

import a.g.l.u;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class f extends RecyclerView.n implements RecyclerView.q {
    private g A;
    private final RecyclerView.s B = new b();
    private Rect C;
    private long D;

    /* renamed from: a  reason: collision with root package name */
    final List<View> f1071a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final float[] f1072b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    RecyclerView.d0 f1073c = null;
    float d;
    float e;
    private float f;
    private float g;
    float h;
    float i;
    private float j;
    private float k;
    int l = -1;
    AbstractC0052f m;
    private int n = 0;
    int o;
    List<h> p = new ArrayList();
    private int q;
    RecyclerView r;
    final Runnable s = new a();
    VelocityTracker t;
    private List<RecyclerView.d0> u;
    private List<Integer> v;
    private RecyclerView.j w = null;
    View x = null;
    int y = -1;
    a.g.l.c z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            f fVar = f.this;
            if (fVar.f1073c != null && fVar.c()) {
                f fVar2 = f.this;
                RecyclerView.d0 d0Var = fVar2.f1073c;
                if (d0Var != null) {
                    fVar2.a(d0Var);
                }
                f fVar3 = f.this;
                fVar3.r.removeCallbacks(fVar3.s);
                u.a(f.this.r, this);
            }
        }
    }

    class b implements RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(boolean z) {
            if (z) {
                f.this.a((RecyclerView.d0) null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            h a2;
            f.this.z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                f.this.l = motionEvent.getPointerId(0);
                f.this.d = motionEvent.getX();
                f.this.e = motionEvent.getY();
                f.this.b();
                f fVar = f.this;
                if (fVar.f1073c == null && (a2 = fVar.a(motionEvent)) != null) {
                    f fVar2 = f.this;
                    fVar2.d -= a2.i;
                    fVar2.e -= a2.j;
                    fVar2.a(a2.e, true);
                    if (f.this.f1071a.remove(a2.e.f966b)) {
                        f fVar3 = f.this;
                        fVar3.m.a(fVar3.r, a2.e);
                    }
                    f.this.a(a2.e, a2.f);
                    f fVar4 = f.this;
                    fVar4.a(motionEvent, fVar4.o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                f fVar5 = f.this;
                fVar5.l = -1;
                fVar5.a((RecyclerView.d0) null, 0);
            } else {
                int i = f.this.l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    f.this.a(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = f.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return f.this.f1073c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            f.this.z.a(motionEvent);
            VelocityTracker velocityTracker = f.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (f.this.l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(f.this.l);
                if (findPointerIndex >= 0) {
                    f.this.a(actionMasked, motionEvent, findPointerIndex);
                }
                f fVar = f.this;
                RecyclerView.d0 d0Var = fVar.f1073c;
                if (d0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = fVar.t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == f.this.l) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    f.this.l = motionEvent.getPointerId(i);
                                    f fVar2 = f.this;
                                    fVar2.a(motionEvent, fVar2.o, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            fVar.a(motionEvent, fVar.o, findPointerIndex);
                            f.this.a(d0Var);
                            f fVar3 = f.this;
                            fVar3.r.removeCallbacks(fVar3.s);
                            f.this.s.run();
                            f.this.r.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    f.this.a((RecyclerView.d0) null, 0);
                    f.this.l = -1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends h {
        final /* synthetic */ int n;
        final /* synthetic */ RecyclerView.d0 o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RecyclerView.d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.d0 d0Var2) {
            super(d0Var, i, i2, f, f2, f3, f4);
            this.n = i3;
            this.o = d0Var2;
        }

        @Override // androidx.recyclerview.widget.f.h
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.k) {
                if (this.n <= 0) {
                    f fVar = f.this;
                    fVar.m.a(fVar.r, this.o);
                } else {
                    f.this.f1071a.add(this.o.f966b);
                    this.h = true;
                    int i = this.n;
                    if (i > 0) {
                        f.this.a(this, i);
                    }
                }
                f fVar2 = f.this;
                View view = fVar2.x;
                View view2 = this.o.f966b;
                if (view == view2) {
                    fVar2.c(view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f1076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1077c;

        d(h hVar, int i) {
            this.f1076b = hVar;
            this.f1077c = i;
        }

        public void run() {
            RecyclerView recyclerView = f.this.r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                h hVar = this.f1076b;
                if (!hVar.k && hVar.e.h() != -1) {
                    RecyclerView.l itemAnimator = f.this.r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.a((RecyclerView.l.a) null)) && !f.this.a()) {
                        f.this.m.b(this.f1076b.e, this.f1077c);
                    } else {
                        f.this.r.post(this);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements RecyclerView.j {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public int a(int i, int i2) {
            f fVar = f.this;
            View view = fVar.x;
            if (view == null) {
                return i2;
            }
            int i3 = fVar.y;
            if (i3 == -1) {
                i3 = fVar.r.indexOfChild(view);
                f.this.y = i3;
            }
            return i2 == i + -1 ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f  reason: collision with other inner class name */
    public static abstract class AbstractC0052f {

        /* renamed from: b  reason: collision with root package name */
        private static final Interpolator f1079b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final Interpolator f1080c = new b();

        /* renamed from: a  reason: collision with root package name */
        private int f1081a = -1;

        /* renamed from: androidx.recyclerview.widget.f$f$a */
        static class a implements Interpolator {
            a() {
            }

            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.f$f$b */
        static class b implements Interpolator {
            b() {
            }

            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        private int a(RecyclerView recyclerView) {
            if (this.f1081a == -1) {
                this.f1081a = recyclerView.getResources().getDimensionPixelSize(a.l.b.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f1081a;
        }

        public static int b(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int c(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int d(int i, int i2) {
            int c2 = c(0, i2 | i);
            return c(2, i) | c(1, i2) | c2;
        }

        public float a(float f) {
            return f;
        }

        public float a(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        public int a() {
            return 0;
        }

        public int a(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public int a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * a(recyclerView))) * f1080c.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f1079b.getInterpolation(f));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public long a(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200 : 250 : i == 8 ? itemAnimator.e() : itemAnimator.f();
        }

        public RecyclerView.d0 a(RecyclerView.d0 d0Var, List<RecyclerView.d0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + d0Var.f966b.getWidth();
            int height = i2 + d0Var.f966b.getHeight();
            int left2 = i - d0Var.f966b.getLeft();
            int top2 = i2 - d0Var.f966b.getTop();
            int size = list.size();
            RecyclerView.d0 d0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.d0 d0Var3 = list.get(i4);
                if (left2 > 0 && (right = d0Var3.f966b.getRight() - width) < 0 && d0Var3.f966b.getRight() > d0Var.f966b.getRight() && (abs4 = Math.abs(right)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = d0Var3.f966b.getLeft() - i) > 0 && d0Var3.f966b.getLeft() < d0Var.f966b.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = d0Var3.f966b.getTop() - i2) > 0 && d0Var3.f966b.getTop() < d0Var.f966b.getTop() && (abs2 = Math.abs(top)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = d0Var3.f966b.getBottom() - height) < 0 && d0Var3.f966b.getBottom() > d0Var.f966b.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs;
                }
            }
            return d0Var2;
        }

        public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            h.f1088a.b(canvas, recyclerView, d0Var.f966b, f, f2, i, z);
        }

        /* access modifiers changed from: package-private */
        public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                hVar.c();
                int save = canvas.save();
                a(canvas, recyclerView, hVar.e, hVar.i, hVar.j, hVar.f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                a(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void a(RecyclerView.d0 d0Var, int i) {
            if (d0Var != null) {
                h.f1088a.b(d0Var.f966b);
            }
        }

        public void a(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            h.f1088a.a(d0Var.f966b);
        }

        public void a(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2, int i3, int i4) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof i) {
                ((i) layoutManager).a(d0Var.f966b, d0Var2.f966b, i3, i4);
                return;
            }
            if (layoutManager.a()) {
                if (layoutManager.f(d0Var2.f966b) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.i(d0Var2.f966b) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.b()) {
                if (layoutManager.j(d0Var2.f966b) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.e(d0Var2.f966b) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public boolean a(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            return true;
        }

        public float b(float f) {
            return f;
        }

        public float b(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        /* access modifiers changed from: package-private */
        public final int b(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return a(c(recyclerView, d0Var), u.o(recyclerView));
        }

        public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            h.f1088a.a(canvas, recyclerView, d0Var.f966b, f, f2, i, z);
        }

        /* access modifiers changed from: package-private */
        public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List<h> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                int save = canvas.save();
                b(canvas, recyclerView, hVar.e, hVar.i, hVar.j, hVar.f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                b(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                h hVar2 = list.get(i3);
                if (hVar2.l && !hVar2.h) {
                    list.remove(i3);
                } else if (!hVar2.l) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract void b(RecyclerView.d0 d0Var, int i);

        public abstract boolean b();

        public abstract boolean b(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2);

        public abstract int c(RecyclerView recyclerView, RecyclerView.d0 d0Var);

        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public boolean d(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (b(recyclerView, d0Var) & 16711680) != 0;
        }
    }

    /* access modifiers changed from: private */
    public class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b  reason: collision with root package name */
        private boolean f1082b = true;

        g() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1082b = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View b2;
            RecyclerView.d0 childViewHolder;
            int i;
            if (this.f1082b && (b2 = f.this.b(motionEvent)) != null && (childViewHolder = f.this.r.getChildViewHolder(b2)) != null) {
                f fVar = f.this;
                if (fVar.m.d(fVar.r, childViewHolder) && motionEvent.getPointerId(0) == (i = f.this.l)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    f fVar2 = f.this;
                    fVar2.d = x;
                    fVar2.e = y;
                    fVar2.i = 0.0f;
                    fVar2.h = 0.0f;
                    if (fVar2.m.c()) {
                        f.this.a(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final float f1084a;

        /* renamed from: b  reason: collision with root package name */
        final float f1085b;

        /* renamed from: c  reason: collision with root package name */
        final float f1086c;
        final float d;
        final RecyclerView.d0 e;
        final int f;
        private final ValueAnimator g;
        boolean h;
        float i;
        float j;
        boolean k = false;
        boolean l = false;
        private float m;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.a(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.d0 d0Var, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f = i3;
            this.e = d0Var;
            this.f1084a = f2;
            this.f1085b = f3;
            this.f1086c = f4;
            this.d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new a());
            this.g.setTarget(d0Var.f966b);
            this.g.addListener(this);
            a(0.0f);
        }

        public void a() {
            this.g.cancel();
        }

        public void a(float f2) {
            this.m = f2;
        }

        public void a(long j2) {
            this.g.setDuration(j2);
        }

        public void b() {
            this.e.a(false);
            this.g.start();
        }

        public void c() {
            float f2 = this.f1084a;
            float f3 = this.f1086c;
            this.i = f2 == f3 ? this.e.f966b.getTranslationX() : f2 + (this.m * (f3 - f2));
            float f4 = this.f1085b;
            float f5 = this.d;
            this.j = f4 == f5 ? this.e.f966b.getTranslationY() : f4 + (this.m * (f5 - f4));
        }

        public void onAnimationCancel(Animator animator) {
            a(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.l) {
                this.e.a(true);
            }
            this.l = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public interface i {
        void a(View view, View view2, int i, int i2);
    }

    public f(AbstractC0052f fVar) {
        this.m = fVar;
    }

    private void a(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - ((float) this.f1073c.f966b.getLeft());
        } else {
            fArr[0] = this.f1073c.f966b.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - ((float) this.f1073c.f966b.getTop());
        } else {
            fArr[1] = this.f1073c.f966b.getTranslationY();
        }
    }

    private static boolean a(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    private int b(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        int i4 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            AbstractC0052f fVar = this.m;
            float f2 = this.g;
            fVar.b(f2);
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i2) != 0 && i4 == i3) {
                AbstractC0052f fVar2 = this.m;
                float f3 = this.f;
                fVar2.a(f3);
                if (abs >= f3 && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
        }
        float width = ((float) this.r.getWidth()) * this.m.b(d0Var);
        if ((i2 & i4) == 0 || Math.abs(this.h) <= width) {
            return 0;
        }
        return i4;
    }

    private int c(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        int i4 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null && this.l > -1) {
            AbstractC0052f fVar = this.m;
            float f2 = this.g;
            fVar.b(f2);
            velocityTracker.computeCurrentVelocity(1000, f2);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i2) != 0 && i3 == i4) {
                AbstractC0052f fVar2 = this.m;
                float f3 = this.f;
                fVar2.a(f3);
                if (abs >= f3 && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
        }
        float height = ((float) this.r.getHeight()) * this.m.b(d0Var);
        if ((i2 & i4) == 0 || Math.abs(this.i) <= height) {
            return 0;
        }
        return i4;
    }

    private RecyclerView.d0 c(MotionEvent motionEvent) {
        View b2;
        RecyclerView.o layoutManager = this.r.getLayoutManager();
        int i2 = this.l;
        if (i2 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.e);
        int i3 = this.q;
        if (abs < ((float) i3) && abs2 < ((float) i3)) {
            return null;
        }
        if (abs > abs2 && layoutManager.a()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.b()) && (b2 = b(motionEvent)) != null) {
            return this.r.getChildViewHolder(b2);
        }
        return null;
    }

    private List<RecyclerView.d0> c(RecyclerView.d0 d0Var) {
        RecyclerView.d0 d0Var2 = d0Var;
        List<RecyclerView.d0> list = this.u;
        if (list == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            list.clear();
            this.v.clear();
        }
        int a2 = this.m.a();
        int round = Math.round(this.j + this.h) - a2;
        int round2 = Math.round(this.k + this.i) - a2;
        int i2 = a2 * 2;
        int width = d0Var2.f966b.getWidth() + round + i2;
        int height = d0Var2.f966b.getHeight() + round2 + i2;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.r.getLayoutManager();
        int e2 = layoutManager.e();
        int i5 = 0;
        while (i5 < e2) {
            View d2 = layoutManager.d(i5);
            if (d2 != d0Var2.f966b && d2.getBottom() >= round2 && d2.getTop() <= height && d2.getRight() >= round && d2.getLeft() <= width) {
                RecyclerView.d0 childViewHolder = this.r.getChildViewHolder(d2);
                if (this.m.a(this.r, this.f1073c, childViewHolder)) {
                    int abs = Math.abs(i3 - ((d2.getLeft() + d2.getRight()) / 2));
                    int abs2 = Math.abs(i4 - ((d2.getTop() + d2.getBottom()) / 2));
                    int i6 = (abs * abs) + (abs2 * abs2);
                    int size = this.u.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size && i6 > this.v.get(i7).intValue()) {
                        i8++;
                        i7++;
                    }
                    this.u.add(i8, childViewHolder);
                    this.v.add(i8, Integer.valueOf(i6));
                }
            }
            i5++;
            d0Var2 = d0Var;
        }
        return this.u;
    }

    private int d(RecyclerView.d0 d0Var) {
        if (this.n == 2) {
            return 0;
        }
        int c2 = this.m.c(this.r, d0Var);
        int a2 = (this.m.a(c2, u.o(this.r)) & 65280) >> 8;
        if (a2 == 0) {
            return 0;
        }
        int i2 = (c2 & 65280) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            int b2 = b(d0Var, a2);
            if (b2 > 0) {
                return (i2 & b2) == 0 ? AbstractC0052f.b(b2, u.o(this.r)) : b2;
            }
            int c3 = c(d0Var, a2);
            if (c3 > 0) {
                return c3;
            }
        } else {
            int c4 = c(d0Var, a2);
            if (c4 > 0) {
                return c4;
            }
            int b3 = b(d0Var, a2);
            if (b3 > 0) {
                return (i2 & b3) == 0 ? AbstractC0052f.b(b3, u.o(this.r)) : b3;
            }
        }
        return 0;
    }

    private void d() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.w == null) {
                this.w = new e();
            }
            this.r.setChildDrawingOrderCallback(this.w);
        }
    }

    private void e() {
        this.r.removeItemDecoration(this);
        this.r.removeOnItemTouchListener(this.B);
        this.r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            this.m.a(this.r, this.p.get(0).e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        f();
        i();
    }

    private void f() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private void g() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.addItemDecoration(this);
        this.r.addOnItemTouchListener(this.B);
        this.r.addOnChildAttachStateChangeListener(this);
        h();
    }

    private void h() {
        this.A = new g();
        this.z = new a.g.l.c(this.r.getContext(), this.A);
    }

    private void i() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    /* access modifiers changed from: package-private */
    public h a(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        View b2 = b(motionEvent);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.e.f966b == b2) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.d0 c2;
        int b2;
        if (this.f1073c == null && i2 == 2 && this.n != 2 && this.m.b() && this.r.getScrollState() != 1 && (c2 = c(motionEvent)) != null && (b2 = (this.m.b(this.r, c2) & 65280) >> 8) != 0) {
            float x2 = motionEvent.getX(i3);
            float y2 = motionEvent.getY(i3);
            float f2 = x2 - this.d;
            float f3 = y2 - this.e;
            float abs = Math.abs(f2);
            float abs2 = Math.abs(f3);
            int i4 = this.q;
            if (abs >= ((float) i4) || abs2 >= ((float) i4)) {
                if (abs > abs2) {
                    if (f2 < 0.0f && (b2 & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (b2 & 8) == 0) {
                        return;
                    }
                } else if (f3 < 0.0f && (b2 & 1) == 0) {
                    return;
                } else {
                    if (f3 > 0.0f && (b2 & 2) == 0) {
                        return;
                    }
                }
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                a(c2, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f2;
        float f3;
        this.y = -1;
        if (this.f1073c != null) {
            a(this.f1072b);
            float[] fArr = this.f1072b;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.m.a(canvas, recyclerView, this.f1073c, this.p, this.n, f3, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        rect.setEmpty();
    }

    /* access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent, int i2, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        float f2 = x2 - this.d;
        this.h = f2;
        this.i = y2 - this.e;
        if ((i2 & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i2 & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i2 & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a(View view) {
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            float a2 = this.m.a(d0Var);
            int i2 = (int) (this.j + this.h);
            int i3 = (int) (this.k + this.i);
            if (((float) Math.abs(i3 - d0Var.f966b.getTop())) >= ((float) d0Var.f966b.getHeight()) * a2 || ((float) Math.abs(i2 - d0Var.f966b.getLeft())) >= ((float) d0Var.f966b.getWidth()) * a2) {
                List<RecyclerView.d0> c2 = c(d0Var);
                if (c2.size() != 0) {
                    RecyclerView.d0 a3 = this.m.a(d0Var, c2, i2, i3);
                    if (a3 == null) {
                        this.u.clear();
                        this.v.clear();
                        return;
                    }
                    int h2 = a3.h();
                    int h3 = d0Var.h();
                    if (this.m.b(this.r, d0Var, a3)) {
                        this.m.a(this.r, d0Var, h3, a3, h2, i2, i3);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.recyclerview.widget.RecyclerView.d0 r24, int r25) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.a(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, boolean z2) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.e == d0Var) {
                hVar.k |= z2;
                if (!hVar.l) {
                    hVar.a();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                e();
            }
            this.r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f = resources.getDimension(a.l.b.item_touch_helper_swipe_escape_velocity);
                this.g = resources.getDimension(a.l.b.item_touch_helper_swipe_escape_max_velocity);
                g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, int i2) {
        this.r.post(new d(hVar, i2));
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.p.get(i2).l) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public View b(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        RecyclerView.d0 d0Var = this.f1073c;
        if (d0Var != null) {
            View view = d0Var.f966b;
            if (a(view, x2, y2, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            View view2 = hVar.e.f966b;
            if (a(view2, x2, y2, hVar.i, hVar.j)) {
                return view2;
            }
        }
        return this.r.findChildViewUnder(x2, y2);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        float f2;
        float f3;
        if (this.f1073c != null) {
            a(this.f1072b);
            float[] fArr = this.f1072b;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        this.m.b(canvas, recyclerView, this.f1073c, this.p, this.n, f3, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(View view) {
        c(view);
        RecyclerView.d0 childViewHolder = this.r.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.d0 d0Var = this.f1073c;
            if (d0Var == null || childViewHolder != d0Var) {
                a(childViewHolder, false);
                if (this.f1071a.remove(childViewHolder.f966b)) {
                    this.m.a(this.r, childViewHolder);
                    return;
                }
                return;
            }
            a((RecyclerView.d0) null, 0);
        }
    }

    public void b(RecyclerView.d0 d0Var) {
        if (!this.m.d(this.r, d0Var)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (d0Var.f966b.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            b();
            this.i = 0.0f;
            this.h = 0.0f;
            a(d0Var, 2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (r1 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.c():boolean");
    }
}
