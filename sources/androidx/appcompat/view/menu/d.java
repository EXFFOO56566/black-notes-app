package androidx.appcompat.view.menu;

import a.a.g;
import a.g.l.u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c  reason: collision with root package name */
    private final Context f509c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    final Handler h;
    private final List<g> i = new ArrayList();
    final List<C0038d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final k0 m = new c();
    private int n = 0;
    private int o = 0;
    private View p;
    View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private m.a y;
    ViewTreeObserver z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.Q() && d.this.j.size() > 0 && !d.this.j.get(0).f515a.i()) {
                View view = d.this.q;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0038d dVar : d.this.j) {
                    dVar.f515a.P();
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
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements k0 {

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0038d f513b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MenuItem f514c;
            final /* synthetic */ g d;

            a(C0038d dVar, MenuItem menuItem, g gVar) {
                this.f513b = dVar;
                this.f514c = menuItem;
                this.d = gVar;
            }

            public void run() {
                C0038d dVar = this.f513b;
                if (dVar != null) {
                    d.this.B = true;
                    dVar.f516b.a(false);
                    d.this.B = false;
                }
                if (this.f514c.isEnabled() && this.f514c.hasSubMenu()) {
                    this.d.a(this.f514c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void a(g gVar, MenuItem menuItem) {
            C0038d dVar = null;
            d.this.h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f516b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < d.this.j.size()) {
                    dVar = d.this.j.get(i2);
                }
                d.this.h.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.k0
        public void b(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    public static class C0038d {

        /* renamed from: a  reason: collision with root package name */
        public final l0 f515a;

        /* renamed from: b  reason: collision with root package name */
        public final g f516b;

        /* renamed from: c  reason: collision with root package name */
        public final int f517c;

        public C0038d(l0 l0Var, g gVar, int i) {
            this.f515a = l0Var;
            this.f516b = gVar;
            this.f517c = i;
        }

        public ListView a() {
            return this.f515a.R();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        this.f509c = context;
        this.p = view;
        this.e = i2;
        this.f = i3;
        this.g = z2;
        this.w = false;
        this.r = e();
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.a.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    private MenuItem a(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(C0038d dVar, g gVar) {
        int i2;
        f fVar;
        int firstVisiblePosition;
        MenuItem a2 = a(dVar.f516b, gVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = dVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i2 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (a2 == fVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
            return a3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int c(g gVar) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.j.get(i2).f516b) {
                return i2;
            }
        }
        return -1;
    }

    private int d(int i2) {
        List<C0038d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private l0 d() {
        l0 l0Var = new l0(this.f509c, null, this.e, this.f);
        l0Var.a(this.m);
        l0Var.a((AdapterView.OnItemClickListener) this);
        l0Var.a((PopupWindow.OnDismissListener) this);
        l0Var.a(this.p);
        l0Var.f(this.o);
        l0Var.a(true);
        l0Var.g(2);
        return l0Var;
    }

    private void d(g gVar) {
        View view;
        C0038d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f509c);
        f fVar = new f(gVar, from, this.g, C);
        if (!Q() && this.w) {
            fVar.a(true);
        } else if (Q()) {
            fVar.a(k.b(gVar));
        }
        int a2 = k.a(fVar, null, this.f509c, this.d);
        l0 d2 = d();
        d2.a((ListAdapter) fVar);
        d2.e(a2);
        d2.f(this.o);
        if (this.j.size() > 0) {
            List<C0038d> list = this.j;
            dVar = list.get(list.size() - 1);
            view = a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            d2.c(false);
            d2.a((Object) null);
            int d3 = d(a2);
            boolean z2 = d3 == 1;
            this.r = d3;
            if (Build.VERSION.SDK_INT >= 26) {
                d2.a(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) != 5) {
                if (z2) {
                    a2 = view.getWidth();
                }
                i4 = i2 - a2;
                d2.c(i4);
                d2.b(true);
                d2.a(i3);
            } else if (!z2) {
                a2 = view.getWidth();
                i4 = i2 - a2;
                d2.c(i4);
                d2.b(true);
                d2.a(i3);
            }
            i4 = i2 + a2;
            d2.c(i4);
            d2.b(true);
            d2.a(i3);
        } else {
            if (this.s) {
                d2.c(this.u);
            }
            if (this.t) {
                d2.a(this.v);
            }
            d2.a(c());
        }
        this.j.add(new C0038d(d2, gVar, this.r));
        d2.P();
        ListView R = d2.R();
        R.setOnKeyListener(this);
        if (dVar == null && this.x && gVar.h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) R, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.h());
            R.addHeaderView(frameLayout, null, false);
            d2.P();
        }
    }

    private int e() {
        return u.o(this.p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.p
    public void P() {
        if (!Q()) {
            for (g gVar : this.i) {
                d(gVar);
            }
            this.i.clear();
            View view = this.p;
            this.q = view;
            if (view != null) {
                boolean z2 = this.z == null;
                ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
                this.z = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean Q() {
        return this.j.size() > 0 && this.j.get(0).f515a.Q();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView R() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<C0038d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = a.g.l.d.a(i2, u.o(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = a.g.l.d.a(this.n, u.o(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(g gVar) {
        gVar.a(this, this.f509c);
        if (Q()) {
            d(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z2) {
        int c2 = c(gVar);
        if (c2 >= 0) {
            int i2 = c2 + 1;
            if (i2 < this.j.size()) {
                this.j.get(i2).f516b.a(false);
            }
            C0038d remove = this.j.remove(c2);
            remove.f516b.b(this);
            if (this.B) {
                remove.f515a.b((Object) null);
                remove.f515a.d(0);
            }
            remove.f515a.dismiss();
            int size = this.j.size();
            this.r = size > 0 ? this.j.get(size - 1).f517c : e();
            if (size == 0) {
                dismiss();
                m.a aVar = this.y;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
            } else if (z2) {
                this.j.get(0).f516b.a(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z2) {
        for (C0038d dVar : this.j) {
            k.a(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        for (C0038d dVar : this.j) {
            if (rVar == dVar.f516b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        a((g) rVar);
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.a(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(boolean z2) {
        this.w = z2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.k
    public boolean b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(boolean z2) {
        this.x = z2;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0038d[] dVarArr = (C0038d[]) this.j.toArray(new C0038d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0038d dVar = dVarArr[i2];
                if (dVar.f515a.Q()) {
                    dVar.f515a.dismiss();
                }
            }
        }
    }

    public void onDismiss() {
        C0038d dVar;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.j.get(i2);
            if (!dVar.f515a.Q()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f516b.a(false);
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
