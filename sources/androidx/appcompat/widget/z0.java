package androidx.appcompat.widget;

import a.g.l.u;
import a.g.l.v;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* access modifiers changed from: package-private */
public class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static z0 k;
    private static z0 l;

    /* renamed from: b  reason: collision with root package name */
    private final View f740b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f741c;
    private final int d;
    private final Runnable e = new a();
    private final Runnable f = new b();
    private int g;
    private int h;
    private a1 i;
    private boolean j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            z0.this.a(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            z0.this.a();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f740b = view;
        this.f741c = charSequence;
        this.d = v.a(ViewConfiguration.get(view.getContext()));
        c();
        this.f740b.setOnLongClickListener(this);
        this.f740b.setOnHoverListener(this);
    }

    public static void a(View view, CharSequence charSequence) {
        z0 z0Var = k;
        if (z0Var != null && z0Var.f740b == view) {
            a((z0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var2 = l;
            if (z0Var2 != null && z0Var2.f740b == view) {
                z0Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new z0(view, charSequence);
    }

    private static void a(z0 z0Var) {
        z0 z0Var2 = k;
        if (z0Var2 != null) {
            z0Var2.b();
        }
        k = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.g) <= this.d && Math.abs(y - this.h) <= this.d) {
            return false;
        }
        this.g = x;
        this.h = y;
        return true;
    }

    private void b() {
        this.f740b.removeCallbacks(this.e);
    }

    private void c() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f740b.postDelayed(this.e, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (l == this) {
            l = null;
            a1 a1Var = this.i;
            if (a1Var != null) {
                a1Var.a();
                this.i = null;
                c();
                this.f740b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            a((z0) null);
        }
        this.f740b.removeCallbacks(this.f);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        long j2;
        if (u.B(this.f740b)) {
            a((z0) null);
            z0 z0Var = l;
            if (z0Var != null) {
                z0Var.a();
            }
            l = this;
            this.j = z;
            a1 a1Var = new a1(this.f740b.getContext());
            this.i = a1Var;
            a1Var.a(this.f740b, this.g, this.h, this.j, this.f741c);
            this.f740b.addOnAttachStateChangeListener(this);
            if (this.j) {
                j2 = 2500;
            } else {
                j2 = ((u.v(this.f740b) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f740b.removeCallbacks(this.f);
            this.f740b.postDelayed(this.f, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f740b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                a();
            }
        } else if (this.f740b.isEnabled() && this.i == null && a(motionEvent)) {
            a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
