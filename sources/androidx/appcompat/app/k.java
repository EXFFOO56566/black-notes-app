package androidx.appcompat.app;

import a.a.f;
import a.a.j;
import a.a.n.b;
import a.a.n.h;
import a.g.l.a0;
import a.g.l.b0;
import a.g.l.u;
import a.g.l.y;
import a.g.l.z;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class k extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();
    final z A = new a();
    final z B = new b();
    final b0 C = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f491a;

    /* renamed from: b  reason: collision with root package name */
    private Context f492b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f493c;
    private Dialog d;
    ActionBarOverlayLayout e;
    ActionBarContainer f;
    d0 g;
    ActionBarContextView h;
    View i;
    p0 j;
    private boolean k;
    d l;
    a.a.n.b m;
    b.a n;
    private boolean o;
    private ArrayList<a.b> p = new ArrayList<>();
    private boolean q;
    private int r = 0;
    boolean s = true;
    boolean t;
    boolean u;
    private boolean v;
    private boolean w = true;
    h x;
    private boolean y;
    boolean z;

    class a extends a0 {
        a() {
        }

        @Override // a.g.l.z
        public void b(View view) {
            View view2;
            k kVar = k.this;
            if (kVar.s && (view2 = kVar.i) != null) {
                view2.setTranslationY(0.0f);
                k.this.f.setTranslationY(0.0f);
            }
            k.this.f.setVisibility(8);
            k.this.f.setTransitioning(false);
            k kVar2 = k.this;
            kVar2.x = null;
            kVar2.m();
            ActionBarOverlayLayout actionBarOverlayLayout = k.this.e;
            if (actionBarOverlayLayout != null) {
                u.H(actionBarOverlayLayout);
            }
        }
    }

    class b extends a0 {
        b() {
        }

        @Override // a.g.l.z
        public void b(View view) {
            k kVar = k.this;
            kVar.x = null;
            kVar.f.requestLayout();
        }
    }

    class c implements b0 {
        c() {
        }

        @Override // a.g.l.b0
        public void a(View view) {
            ((View) k.this.f.getParent()).invalidate();
        }
    }

    public class d extends a.a.n.b implements g.a {
        private final Context d;
        private final g e;
        private b.a f;
        private WeakReference<View> g;

        public d(Context context, b.a aVar) {
            this.d = context;
            this.f = aVar;
            g gVar = new g(context);
            gVar.c(1);
            this.e = gVar;
            gVar.a(this);
        }

        @Override // a.a.n.b
        public void a() {
            k kVar = k.this;
            if (kVar.l == this) {
                if (!k.a(kVar.t, kVar.u, false)) {
                    k kVar2 = k.this;
                    kVar2.m = this;
                    kVar2.n = this.f;
                } else {
                    this.f.a(this);
                }
                this.f = null;
                k.this.e(false);
                k.this.h.a();
                k.this.g.h().sendAccessibilityEvent(32);
                k kVar3 = k.this;
                kVar3.e.setHideOnContentScrollEnabled(kVar3.z);
                k.this.l = null;
            }
        }

        @Override // a.a.n.b
        public void a(int i) {
            a((CharSequence) k.this.f491a.getResources().getString(i));
        }

        @Override // a.a.n.b
        public void a(View view) {
            k.this.h.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(g gVar) {
            if (this.f != null) {
                i();
                k.this.h.d();
            }
        }

        @Override // a.a.n.b
        public void a(CharSequence charSequence) {
            k.this.h.setSubtitle(charSequence);
        }

        @Override // a.a.n.b
        public void a(boolean z) {
            super.a(z);
            k.this.h.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // a.a.n.b
        public View b() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.a.n.b
        public void b(int i) {
            b(k.this.f491a.getResources().getString(i));
        }

        @Override // a.a.n.b
        public void b(CharSequence charSequence) {
            k.this.h.setTitle(charSequence);
        }

        @Override // a.a.n.b
        public Menu c() {
            return this.e;
        }

        @Override // a.a.n.b
        public MenuInflater d() {
            return new a.a.n.g(this.d);
        }

        @Override // a.a.n.b
        public CharSequence e() {
            return k.this.h.getSubtitle();
        }

        @Override // a.a.n.b
        public CharSequence g() {
            return k.this.h.getTitle();
        }

        @Override // a.a.n.b
        public void i() {
            if (k.this.l == this) {
                this.e.s();
                try {
                    this.f.a(this, this.e);
                } finally {
                    this.e.r();
                }
            }
        }

        @Override // a.a.n.b
        public boolean j() {
            return k.this.h.b();
        }

        public boolean k() {
            this.e.s();
            try {
                return this.f.b(this, this.e);
            } finally {
                this.e.r();
            }
        }
    }

    public k(Activity activity, boolean z2) {
        new ArrayList();
        this.f493c = activity;
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z2) {
            this.i = decorView.findViewById(16908290);
        }
    }

    public k(Dialog dialog) {
        new ArrayList();
        this.d = dialog;
        b(dialog.getWindow().getDecorView());
    }

    private d0 a(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    private void b(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.g = a(view.findViewById(f.action_bar));
        this.h = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.f = actionBarContainer;
        d0 d0Var = this.g;
        if (d0Var == null || this.h == null || actionBarContainer == null) {
            throw new IllegalStateException(k.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f491a = d0Var.getContext();
        boolean z2 = (this.g.j() & 4) != 0;
        if (z2) {
            this.k = true;
        }
        a.a.n.a a2 = a.a.n.a.a(this.f491a);
        j(a2.a() || z2);
        k(a2.f());
        TypedArray obtainStyledAttributes = this.f491a.obtainStyledAttributes(null, j.ActionBar, a.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void k(boolean z2) {
        this.q = z2;
        if (!z2) {
            this.g.a((p0) null);
            this.f.setTabContainer(this.j);
        } else {
            this.f.setTabContainer(null);
            this.g.a(this.j);
        }
        boolean z3 = true;
        boolean z4 = n() == 2;
        p0 p0Var = this.j;
        if (p0Var != null) {
            if (z4) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                if (actionBarOverlayLayout != null) {
                    u.H(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.g.b(!this.q && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
        if (this.q || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private void l(boolean z2) {
        if (a(this.t, this.u, this.v)) {
            if (!this.w) {
                this.w = true;
                g(z2);
            }
        } else if (this.w) {
            this.w = false;
            f(z2);
        }
    }

    private void o() {
        if (this.v) {
            this.v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            l(false);
        }
    }

    private boolean p() {
        return u.C(this.f);
    }

    private void q() {
        if (!this.v) {
            this.v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            l(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public a.a.n.b a(b.a aVar) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.a();
        }
        this.e.setHideOnContentScrollEnabled(false);
        this.h.c();
        d dVar2 = new d(this.h.getContext(), aVar);
        if (!dVar2.k()) {
            return null;
        }
        this.l = dVar2;
        dVar2.i();
        this.h.a(dVar2);
        e(true);
        this.h.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.u) {
            this.u = false;
            l(true);
        }
    }

    public void a(float f2) {
        u.a(this.f, f2);
    }

    public void a(int i2, int i3) {
        int j2 = this.g.j();
        if ((i3 & 4) != 0) {
            this.k = true;
        }
        this.g.b((i2 & i3) | ((~i3) & j2));
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        k(a.a.n.a.a(this.f491a).f());
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.g.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z2) {
        this.s = z2;
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i2, KeyEvent keyEvent) {
        Menu c2;
        d dVar = this.l;
        if (dVar == null || (c2 = dVar.c()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        c2.setQwertyMode(z2);
        return c2.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        h hVar = this.x;
        if (hVar != null) {
            hVar.a();
            this.x = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z2) {
        if (z2 != this.o) {
            this.o = z2;
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).a(z2);
            }
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z2) {
        if (!this.k) {
            h(z2);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (!this.u) {
            this.u = true;
            l(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z2) {
        h hVar;
        this.y = z2;
        if (!z2 && (hVar = this.x) != null) {
            hVar.a();
        }
    }

    public void e(boolean z2) {
        y yVar;
        y yVar2;
        if (z2) {
            q();
        } else {
            o();
        }
        if (p()) {
            if (z2) {
                yVar = this.g.a(4, 100);
                yVar2 = this.h.a(0, 200);
            } else {
                yVar2 = this.g.a(0, 200);
                yVar = this.h.a(8, 100);
            }
            h hVar = new h();
            hVar.a(yVar, yVar2);
            hVar.c();
        } else if (z2) {
            this.g.a(4);
            this.h.setVisibility(0);
        } else {
            this.g.a(0);
            this.h.setVisibility(8);
        }
    }

    public void f(boolean z2) {
        View view;
        h hVar = this.x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.r != 0 || (!this.y && !z2)) {
            this.A.b(null);
            return;
        }
        this.f.setAlpha(1.0f);
        this.f.setTransitioning(true);
        h hVar2 = new h();
        float f2 = (float) (-this.f.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        y a2 = u.a(this.f);
        a2.b(f2);
        a2.a(this.C);
        hVar2.a(a2);
        if (this.s && (view = this.i) != null) {
            y a3 = u.a(view);
            a3.b(f2);
            hVar2.a(a3);
        }
        hVar2.a(D);
        hVar2.a(250);
        hVar2.a(this.A);
        this.x = hVar2;
        hVar2.c();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        d0 d0Var = this.g;
        if (d0Var == null || !d0Var.i()) {
            return false;
        }
        this.g.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.g.j();
    }

    public void g(boolean z2) {
        View view;
        View view2;
        h hVar = this.x;
        if (hVar != null) {
            hVar.a();
        }
        this.f.setVisibility(0);
        if (this.r != 0 || (!this.y && !z2)) {
            this.f.setAlpha(1.0f);
            this.f.setTranslationY(0.0f);
            if (this.s && (view = this.i) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        } else {
            this.f.setTranslationY(0.0f);
            float f2 = (float) (-this.f.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f.setTranslationY(f2);
            h hVar2 = new h();
            y a2 = u.a(this.f);
            a2.b(0.0f);
            a2.a(this.C);
            hVar2.a(a2);
            if (this.s && (view2 = this.i) != null) {
                view2.setTranslationY(f2);
                y a3 = u.a(this.i);
                a3.b(0.0f);
                hVar2.a(a3);
            }
            hVar2.a(E);
            hVar2.a(250);
            hVar2.a(this.B);
            this.x = hVar2;
            hVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.e;
        if (actionBarOverlayLayout != null) {
            u.H(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        if (this.f492b == null) {
            TypedValue typedValue = new TypedValue();
            this.f491a.getTheme().resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f492b = new ContextThemeWrapper(this.f491a, i2);
            } else {
                this.f492b = this.f491a;
            }
        }
        return this.f492b;
    }

    public void h(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void i() {
        if (!this.t) {
            this.t = true;
            l(false);
        }
    }

    public void i(boolean z2) {
        if (!z2 || this.e.i()) {
            this.z = z2;
            this.e.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void j(boolean z2) {
        this.g.a(z2);
    }

    /* access modifiers changed from: package-private */
    public void m() {
        b.a aVar = this.n;
        if (aVar != null) {
            aVar.a(this.m);
            this.m = null;
            this.n = null;
        }
    }

    public int n() {
        return this.g.k();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i2) {
        this.r = i2;
    }
}
