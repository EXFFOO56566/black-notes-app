package com.google.android.material.appbar;

import a.g.l.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

abstract class a<V extends View> extends c<V> {
    private Runnable d;
    OverScroller e;
    private boolean f;
    private int g = -1;
    private int h;
    private int i = -1;
    private VelocityTracker j;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    public class RunnableC0082a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final CoordinatorLayout f5839b;

        /* renamed from: c  reason: collision with root package name */
        private final V f5840c;

        RunnableC0082a(CoordinatorLayout coordinatorLayout, V v) {
            this.f5839b = coordinatorLayout;
            this.f5840c = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.google.android.material.appbar.a */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.google.android.material.appbar.a */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f5840c != null && (overScroller = a.this.e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.c(this.f5839b, this.f5840c, aVar.e.getCurrY());
                    u.a(this.f5840c, this);
                    return;
                }
                a.this.e(this.f5839b, this.f5840c);
            }
        }
    }

    public a() {
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void d() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return b(coordinatorLayout, v, c() - i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a(V v);

    /* access modifiers changed from: package-private */
    public final boolean a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        Runnable runnable = this.d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, b(), 0, Math.round(f2), 0, 0, i2, i3);
        if (this.e.computeScrollOffset()) {
            RunnableC0082a aVar = new RunnableC0082a(coordinatorLayout, v);
            this.d = aVar;
            u.a(v, aVar);
            return true;
        }
        e(coordinatorLayout, v);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int b(V v);

    /* access modifiers changed from: package-private */
    public abstract int b(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int c();

    /* access modifiers changed from: package-private */
    public abstract int c(V v);

    /* access modifiers changed from: package-private */
    public int c(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return b(coordinatorLayout, v, i2, (int) RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public abstract void e(CoordinatorLayout coordinatorLayout, V v);
}
