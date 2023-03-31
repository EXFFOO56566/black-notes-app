package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p;

public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final float f630b;

    /* renamed from: c  reason: collision with root package name */
    private final int f631c;
    private final int d;
    final View e;
    private Runnable f;
    private Runnable g;
    private boolean h;
    private int i;
    private final int[] j = new int[2];

    /* access modifiers changed from: private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = h0.this.e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            h0.this.d();
        }
    }

    public h0(View view) {
        this.e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f630b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f631c = tapTimeout;
        this.d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private boolean a(MotionEvent motionEvent) {
        f0 f0Var;
        View view = this.e;
        p a2 = a();
        if (a2 == null || !a2.Q() || (f0Var = (f0) a2.R()) == null || !f0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        a(view, obtainNoHistory);
        b(f0Var, obtainNoHistory);
        boolean a3 = f0Var.a(obtainNoHistory, this.i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a3 && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean a(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.b(android.view.MotionEvent):boolean");
    }

    private boolean b(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private void e() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.e.removeCallbacks(runnable2);
        }
    }

    public abstract p a();

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public boolean c() {
        p a2 = a();
        if (a2 == null || !a2.Q()) {
            return true;
        }
        a2.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e();
        View view = this.e;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.h = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.h;
        if (z2) {
            z = a(motionEvent) || !c();
        } else {
            z = b(motionEvent) && b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.h = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.i = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
    }
}
