package a.i.b;

import a.e.h;
import a.g.l.d0.d;
import a.g.l.d0.e;
import a.g.l.u;
import a.g.l.x;
import a.i.b.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends a.g.l.a {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    private static final b.a<a.g.l.d0.c> o = new C0023a();
    private static final b.AbstractC0024b<h<a.g.l.d0.c>, a.g.l.d0.c> p = new b();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    private final AccessibilityManager h;
    private final View i;
    private c j;
    int k = RecyclerView.UNDEFINED_DURATION;
    int l = RecyclerView.UNDEFINED_DURATION;
    private int m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: a.i.b.a$a  reason: collision with other inner class name */
    static class C0023a implements b.a<a.g.l.d0.c> {
        C0023a() {
        }

        public void a(a.g.l.d0.c cVar, Rect rect) {
            cVar.a(rect);
        }
    }

    static class b implements b.AbstractC0024b<h<a.g.l.d0.c>, a.g.l.d0.c> {
        b() {
        }

        public int a(h<a.g.l.d0.c> hVar) {
            return hVar.c();
        }

        public a.g.l.d0.c a(h<a.g.l.d0.c> hVar, int i) {
            return hVar.d(i);
        }
    }

    private class c extends d {
        c() {
        }

        @Override // a.g.l.d0.d
        public a.g.l.d0.c a(int i) {
            return a.g.l.d0.c.a(a.this.b(i));
        }

        @Override // a.g.l.d0.d
        public boolean a(int i, int i2, Bundle bundle) {
            return a.this.b(i, i2, bundle);
        }

        @Override // a.g.l.d0.d
        public a.g.l.d0.c b(int i) {
            int i2 = i == 2 ? a.this.k : a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (u.m(view) == 0) {
                u.h(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect a(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private void a(int i2, Rect rect) {
        b(i2).a(rect);
    }

    private boolean a(int i2, Bundle bundle) {
        return u.a(this.i, i2, bundle);
    }

    private boolean a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.i;
        do {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                if (view.getAlpha() <= 0.0f) {
                    break;
                }
            } else {
                return parent != null;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private AccessibilityEvent b(int i2, int i3) {
        return i2 != -1 ? c(i2, i3) : e(i3);
    }

    private boolean b(int i2, Rect rect) {
        Object obj;
        h<a.g.l.d0.c> f2 = f();
        int i3 = this.l;
        int i4 = RecyclerView.UNDEFINED_DURATION;
        a.g.l.d0.c a2 = i3 == Integer.MIN_VALUE ? null : f2.a(i3);
        if (i2 == 1 || i2 == 2) {
            obj = b.a(f2, p, o, a2, i2, u.o(this.i) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.l;
            if (i5 != Integer.MIN_VALUE) {
                a(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                a(this.i, i2, rect2);
            }
            obj = b.a(f2, p, o, a2, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        a.g.l.d0.c cVar = (a.g.l.d0.c) obj;
        if (cVar != null) {
            i4 = f2.b(f2.a(cVar));
        }
        return c(i4);
    }

    private AccessibilityEvent c(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        a.g.l.d0.c b2 = b(i2);
        obtain.getText().add(b2.g());
        obtain.setContentDescription(b2.d());
        obtain.setScrollable(b2.q());
        obtain.setPassword(b2.p());
        obtain.setEnabled(b2.l());
        obtain.setChecked(b2.j());
        a(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b2.c());
            e.a(obtain, this.i, i2);
            obtain.setPackageName(this.i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private boolean c(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? a(i2, i3, bundle) : d(i2) : h(i2) : a(i2) : c(i2);
    }

    private boolean d() {
        int i2 = this.l;
        return i2 != Integer.MIN_VALUE && a(i2, 16, null);
    }

    private boolean d(int i2) {
        if (this.k != i2) {
            return false;
        }
        this.k = RecyclerView.UNDEFINED_DURATION;
        this.i.invalidate();
        a(i2, 65536);
        return true;
    }

    private a.g.l.d0.c e() {
        a.g.l.d0.c d2 = a.g.l.d0.c.d(this.i);
        u.a(this.i, d2);
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        if (d2.b() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                d2.a(this.i, ((Integer) arrayList.get(i2)).intValue());
            }
            return d2;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private AccessibilityEvent e(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private h<a.g.l.d0.c> f() {
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        h<a.g.l.d0.c> hVar = new h<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hVar.c(i2, f(i2));
        }
        return hVar;
    }

    private a.g.l.d0.c f(int i2) {
        a.g.l.d0.c x = a.g.l.d0.c.x();
        x.f(true);
        x.g(true);
        x.a("android.view.View");
        x.c(n);
        x.d(n);
        x.a(this.i);
        a(i2, x);
        if (x.g() == null && x.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        x.a(this.e);
        if (!this.e.equals(n)) {
            int a2 = x.a();
            if ((a2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((a2 & 128) == 0) {
                x.e(this.i.getContext().getPackageName());
                x.c(this.i, i2);
                if (this.k == i2) {
                    x.a(true);
                    x.a(128);
                } else {
                    x.a(false);
                    x.a(64);
                }
                boolean z = this.l == i2;
                if (z) {
                    x.a(2);
                } else if (x.m()) {
                    x.a(1);
                }
                x.h(z);
                this.i.getLocationOnScreen(this.g);
                x.b(this.d);
                if (this.d.equals(n)) {
                    x.a(this.d);
                    if (x.f214b != -1) {
                        a.g.l.d0.c x2 = a.g.l.d0.c.x();
                        for (int i3 = x.f214b; i3 != -1; i3 = x2.f214b) {
                            x2.b(this.i, -1);
                            x2.c(n);
                            a(i3, x2);
                            x2.a(this.e);
                            Rect rect = this.d;
                            Rect rect2 = this.e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        x2.t();
                    }
                    this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f)) {
                    this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.d.intersect(this.f)) {
                        x.d(this.d);
                        if (a(this.d)) {
                            x.m(true);
                        }
                    }
                }
                return x;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private static int g(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean h(int i2) {
        int i3;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i3 = this.k) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            d(i3);
        }
        this.k = i2;
        this.i.invalidate();
        a(i2, 32768);
        return true;
    }

    private void i(int i2) {
        int i3 = this.m;
        if (i3 != i2) {
            this.m = i2;
            a(i2, 128);
            a(i3, 256);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(float f2, float f3);

    @Override // a.g.l.a
    public d a(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2, a.g.l.d0.c cVar);

    /* access modifiers changed from: protected */
    public void a(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void a(a.g.l.d0.c cVar) {
    }

    @Override // a.g.l.a
    public void a(View view, a.g.l.d0.c cVar) {
        super.a(view, cVar);
        a(cVar);
    }

    /* access modifiers changed from: protected */
    public void a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(List<Integer> list);

    public final void a(boolean z, int i2, Rect rect) {
        int i3 = this.l;
        if (i3 != Integer.MIN_VALUE) {
            a(i3);
        }
        if (z) {
            b(i2, rect);
        }
    }

    public final boolean a(int i2) {
        if (this.l != i2) {
            return false;
        }
        this.l = RecyclerView.UNDEFINED_DURATION;
        a(i2, false);
        a(i2, 8);
        return true;
    }

    public final boolean a(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return x.a(parent, this.i, b(i2, i3));
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(int i2, int i3, Bundle bundle);

    public final boolean a(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g2 = g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && b(g2, (Rect) null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            d();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return b(1, (Rect) null);
            }
            return false;
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a2 = a(motionEvent.getX(), motionEvent.getY());
            i(a2);
            return a2 != Integer.MIN_VALUE;
        } else if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        } else {
            i(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    public final int b() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public a.g.l.d0.c b(int i2) {
        return i2 == -1 ? e() : f(i2);
    }

    @Override // a.g.l.a
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        a(accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? c(i2, i3, bundle) : a(i3, bundle);
    }

    public final int c() {
        return this.l;
    }

    public final boolean c(int i2) {
        int i3;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i3 = this.l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            a(i3);
        }
        this.l = i2;
        a(i2, true);
        a(i2, 8);
        return true;
    }
}
