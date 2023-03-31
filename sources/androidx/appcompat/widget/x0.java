package androidx.appcompat.widget;

import a.a.e;
import a.a.f;
import a.a.h;
import a.a.j;
import a.g.l.a0;
import a.g.l.u;
import a.g.l.y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;

public class x0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f722a;

    /* renamed from: b  reason: collision with root package name */
    private int f723b;

    /* renamed from: c  reason: collision with root package name */
    private View f724c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f725b = new androidx.appcompat.view.menu.a(x0.this.f722a.getContext(), 0, 16908332, 0, 0, x0.this.i);

        a() {
        }

        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.l;
            if (callback != null && x0Var.m) {
                callback.onMenuItemSelected(0, this.f725b);
            }
        }
    }

    class b extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f727a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f728b;

        b(int i) {
            this.f728b = i;
        }

        @Override // a.g.l.a0, a.g.l.z
        public void a(View view) {
            this.f727a = true;
        }

        @Override // a.g.l.z
        public void b(View view) {
            if (!this.f727a) {
                x0.this.f722a.setVisibility(this.f728b);
            }
        }

        @Override // a.g.l.a0, a.g.l.z
        public void c(View view) {
            x0.this.f722a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f722a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        w0 a2 = w0.a(toolbar.getContext(), null, j.ActionBar, a.a.a.actionBarStyle, 0);
        this.q = a2.b(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e2 = a2.e(j.ActionBar_title);
            if (!TextUtils.isEmpty(e2)) {
                c(e2);
            }
            CharSequence e3 = a2.e(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e3)) {
                b(e3);
            }
            Drawable b2 = a2.b(j.ActionBar_logo);
            if (b2 != null) {
                a(b2);
            }
            Drawable b3 = a2.b(j.ActionBar_icon);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.g == null && (drawable = this.q) != null) {
                b(drawable);
            }
            b(a2.d(j.ActionBar_displayOptions, 0));
            int g2 = a2.g(j.ActionBar_customNavigationLayout, 0);
            if (g2 != 0) {
                a(LayoutInflater.from(this.f722a.getContext()).inflate(g2, (ViewGroup) this.f722a, false));
                b(this.f723b | 16);
            }
            int f2 = a2.f(j.ActionBar_height, 0);
            if (f2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f722a.getLayoutParams();
                layoutParams.height = f2;
                this.f722a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                this.f722a.a(Math.max(b4, 0), Math.max(b5, 0));
            }
            int g3 = a2.g(j.ActionBar_titleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar2 = this.f722a;
                toolbar2.b(toolbar2.getContext(), g3);
            }
            int g4 = a2.g(j.ActionBar_subtitleTextStyle, 0);
            if (g4 != 0) {
                Toolbar toolbar3 = this.f722a;
                toolbar3.a(toolbar3.getContext(), g4);
            }
            int g5 = a2.g(j.ActionBar_popupTheme, 0);
            if (g5 != 0) {
                this.f722a.setPopupTheme(g5);
            }
        } else {
            this.f723b = n();
        }
        a2.a();
        d(i2);
        this.k = this.f722a.getNavigationContentDescription();
        this.f722a.setNavigationOnClickListener(new a());
    }

    private void d(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f723b & 8) != 0) {
            this.f722a.setTitle(charSequence);
        }
    }

    private int n() {
        if (this.f722a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f722a.getNavigationIcon();
        return 15;
    }

    private void o() {
        if ((this.f723b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f722a.setNavigationContentDescription(this.p);
        } else {
            this.f722a.setNavigationContentDescription(this.k);
        }
    }

    private void p() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f723b & 4) != 0) {
            toolbar = this.f722a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f722a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void q() {
        Drawable drawable;
        int i2 = this.f723b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.f722a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.d0
    public y a(int i2, long j2) {
        y a2 = u.a(this.f722a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.a(j2);
        a2.a(new b(i2));
        return a2;
    }

    @Override // androidx.appcompat.widget.d0
    public void a(int i2) {
        this.f722a.setVisibility(i2);
    }

    public void a(Drawable drawable) {
        this.f = drawable;
        q();
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.f722a.getContext());
            this.n = cVar;
            cVar.a(f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.f722a.a((g) menu, this.n);
    }

    public void a(View view) {
        View view2 = this.d;
        if (!(view2 == null || (this.f723b & 16) == 0)) {
            this.f722a.removeView(view2);
        }
        this.d = view;
        if (view != null && (this.f723b & 16) != 0) {
            this.f722a.addView(view);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void a(p0 p0Var) {
        Toolbar toolbar;
        View view = this.f724c;
        if (view != null && view.getParent() == (toolbar = this.f722a)) {
            toolbar.removeView(this.f724c);
        }
        this.f724c = p0Var;
        if (p0Var != null && this.o == 2) {
            this.f722a.addView(p0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.f724c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.f449a = 8388691;
            p0Var.setAllowCollapse(true);
        }
    }

    public void a(CharSequence charSequence) {
        this.k = charSequence;
        o();
    }

    @Override // androidx.appcompat.widget.d0
    public void a(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public boolean a() {
        return this.f722a.i();
    }

    @Override // androidx.appcompat.widget.d0
    public void b() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public void b(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f723b ^ i2;
        this.f723b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    o();
                }
                p();
            }
            if ((i3 & 3) != 0) {
                q();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f722a.setTitle(this.i);
                    toolbar = this.f722a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f722a.setTitle((CharSequence) null);
                    toolbar = this.f722a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.f722a.addView(view);
                } else {
                    this.f722a.removeView(view);
                }
            }
        }
    }

    public void b(Drawable drawable) {
        this.g = drawable;
        p();
    }

    public void b(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f723b & 8) != 0) {
            this.f722a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void b(boolean z) {
        this.f722a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.d0
    public void c(int i2) {
        a(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    public void c(CharSequence charSequence) {
        this.h = true;
        d(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        return this.f722a.h();
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.f722a.c();
    }

    public void d(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.f722a.getNavigationContentDescription())) {
                e(this.p);
            }
        }
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        return this.f722a.g();
    }

    public void e(int i2) {
        a(i2 == 0 ? null : getContext().getString(i2));
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.f722a.k();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.f722a.b();
    }

    @Override // androidx.appcompat.widget.d0
    public void g() {
        this.f722a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public Context getContext() {
        return this.f722a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.f722a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup h() {
        return this.f722a;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean i() {
        return this.f722a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public int j() {
        return this.f723b;
    }

    @Override // androidx.appcompat.widget.d0
    public int k() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? a.a.k.a.a.c(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        q();
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            d(charSequence);
        }
    }
}
