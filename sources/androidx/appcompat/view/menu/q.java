package androidx.appcompat.view.menu;

import a.a.d;
import a.a.g;
import a.g.l.u;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;

/* access modifiers changed from: package-private */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int w = g.abc_popup_menu_item_layout;

    /* renamed from: c  reason: collision with root package name */
    private final Context f545c;
    private final g d;
    private final f e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    final l0 j;
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private m.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 0;
    private boolean v;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (q.this.Q() && !q.this.j.i()) {
                View view = q.this.o;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.j.P();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f545c = context;
        this.d = gVar;
        this.f = z;
        this.e = new f(gVar, LayoutInflater.from(context), this.f, w);
        this.h = i2;
        this.i = i3;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new l0(this.f545c, null, this.h, this.i);
        gVar.a(this, context);
    }

    private boolean d() {
        View view;
        if (Q()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.a((PopupWindow.OnDismissListener) this);
        this.j.a((AdapterView.OnItemClickListener) this);
        this.j.a(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.a(view2);
        this.j.f(this.u);
        if (!this.s) {
            this.t = k.a(this.e, null, this.f545c, this.g);
            this.s = true;
        }
        this.j.e(this.t);
        this.j.g(2);
        this.j.a(c());
        this.j.P();
        ListView R = this.j.R();
        R.setOnKeyListener(this);
        if (this.v && this.d.h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f545c).inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) R, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.d.h());
            }
            frameLayout.setEnabled(false);
            R.addHeaderView(frameLayout, null, false);
        }
        this.j.a((ListAdapter) this.e);
        this.j.P();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void P() {
        if (!d()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean Q() {
        return !this.r && this.j.Q();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView R() {
        return this.j.R();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(int i2) {
        this.u = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(View view) {
        this.n = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        if (gVar == this.d) {
            dismiss();
            m.a aVar = this.p;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
        this.p = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z) {
        this.s = false;
        f fVar = this.e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f545c, rVar, this.o, this.f, this.h, this.i);
            lVar.a(this.p);
            lVar.a(k.b(rVar));
            lVar.a(this.m);
            this.m = null;
            this.d.a(false);
            int a2 = this.j.a();
            int c2 = this.j.c();
            if ((Gravity.getAbsoluteGravity(this.u, u.o(this.n)) & 7) == 5) {
                a2 += this.n.getWidth();
            }
            if (lVar.a(a2, c2)) {
                m.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.a(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(int i2) {
        this.j.c(i2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(boolean z) {
        this.e.a(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(int i2) {
        this.j.a(i2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (Q()) {
            this.j.dismiss();
        }
    }

    public void onDismiss() {
        this.r = true;
        this.d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
