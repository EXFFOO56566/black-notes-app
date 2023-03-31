package com.google.android.material.behavior;

import a.g.l.u;
import a.i.b.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    a.i.b.c f5851a;

    /* renamed from: b  reason: collision with root package name */
    b f5852b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5853c;
    private float d = 0.0f;
    private boolean e;
    int f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final c.AbstractC0025c j = new a();

    class a extends c.AbstractC0025c {

        /* renamed from: a  reason: collision with root package name */
        private int f5854a;

        /* renamed from: b  reason: collision with root package name */
        private int f5855b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = a.g.l.u.o(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f5854a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, float):boolean");
        }

        @Override // a.i.b.c.AbstractC0025c
        public int a(View view) {
            return view.getWidth();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f5854a;
            r3 = r3.getWidth() + r5;
         */
        @Override // a.i.b.c.AbstractC0025c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = a.g.l.u.o(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f5854a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f5854a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f5854a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f5854a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f5854a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // a.i.b.c.AbstractC0025c
        public void a(View view, float f, float f2) {
            boolean z;
            int i;
            b bVar;
            this.f5855b = -1;
            int width = view.getWidth();
            if (a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f5854a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f5854a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f5851a.c(i, view.getTop())) {
                u.a(view, new c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.f5852b) != null) {
                bVar.a(view);
            }
        }

        @Override // a.i.b.c.AbstractC0025c
        public void a(View view, int i) {
            this.f5855b = i;
            this.f5854a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.i.b.c.AbstractC0025c
        public void a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f5854a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.h);
            float width2 = ((float) this.f5854a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f), 1.0f));
            }
        }

        @Override // a.i.b.c.AbstractC0025c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // a.i.b.c.AbstractC0025c
        public boolean b(View view, int i) {
            int i2 = this.f5855b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view);
        }

        @Override // a.i.b.c.AbstractC0025c
        public void c(int i) {
            b bVar = SwipeDismissBehavior.this.f5852b;
            if (bVar != null) {
                bVar.a(i);
            }
        }
    }

    public interface b {
        void a(int i);

        void a(View view);
    }

    private class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final View f5857b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f5858c;

        c(View view, boolean z) {
            this.f5857b = view;
            this.f5858c = z;
        }

        public void run() {
            b bVar;
            a.i.b.c cVar = SwipeDismissBehavior.this.f5851a;
            if (cVar != null && cVar.a(true)) {
                u.a(this.f5857b, this);
            } else if (this.f5858c && (bVar = SwipeDismissBehavior.this.f5852b) != null) {
                bVar.a(this.f5857b);
            }
        }
    }

    static float a(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int a(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void a(ViewGroup viewGroup) {
        if (this.f5851a == null) {
            this.f5851a = this.e ? a.i.b.c.a(viewGroup, this.d, this.j) : a.i.b.c.a(viewGroup, this.j);
        }
    }

    static float b(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public void a(float f2) {
        this.i = a(0.0f, f2, 1.0f);
    }

    public void a(int i2) {
        this.f = i2;
    }

    public boolean a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f5853c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5853c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5853c = false;
        }
        if (!z) {
            return false;
        }
        a((ViewGroup) coordinatorLayout);
        return this.f5851a.b(motionEvent);
    }

    public void b(float f2) {
        this.h = a(0.0f, f2, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.i.b.c cVar = this.f5851a;
        if (cVar == null) {
            return false;
        }
        cVar.a(motionEvent);
        return true;
    }
}
