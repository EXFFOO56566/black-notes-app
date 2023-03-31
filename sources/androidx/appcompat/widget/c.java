package androidx.appcompat.widget;

import a.g.l.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class c extends androidx.appcompat.view.menu.b implements b.a {
    private b A;
    final f B = new f();
    int C;
    d j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private final SparseBooleanArray w = new SparseBooleanArray();
    e x;
    a y;
    RunnableC0040c z;

    /* access modifiers changed from: private */
    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, a.a.a.actionOverflowMenuStyle);
            if (!((i) rVar.getItem()).h()) {
                View view2 = c.this.j;
                a(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).i : view2);
            }
            a(c.this.B);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void d() {
            c cVar = c.this;
            cVar.y = null;
            cVar.C = 0;
            super.d();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p a() {
            a aVar = c.this.y;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class RunnableC0040c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private e f609b;

        public RunnableC0040c(e eVar) {
            this.f609b = eVar;
        }

        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).d != null) {
                ((androidx.appcompat.view.menu.b) c.this).d.a();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).i;
            if (!(view == null || view.getWindowToken() == null || !this.f609b.f())) {
                c.this.x = this.f609b;
            }
            c.this.z = null;
        }
    }

    /* access modifiers changed from: private */
    public class d extends o implements ActionMenuView.a {

        class a extends h0 {
            a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.h0
            public p a() {
                e eVar = c.this.x;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }

            @Override // androidx.appcompat.widget.h0
            public boolean b() {
                c.this.i();
                return true;
            }

            @Override // androidx.appcompat.widget.h0
            public boolean c() {
                c cVar = c.this;
                if (cVar.z != null) {
                    return false;
                }
                cVar.e();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.i();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* access modifiers changed from: private */
    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, a.a.a.actionOverflowMenuStyle);
            a(8388613);
            a(c.this.B);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void d() {
            if (((androidx.appcompat.view.menu.b) c.this).d != null) {
                ((androidx.appcompat.view.menu.b) c.this).d.close();
            }
            c.this.x = null;
            super.d();
        }
    }

    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.m().a(false);
            }
            m.a b2 = c.this.b();
            if (b2 != null) {
                b2.a(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(g gVar) {
            if (gVar == null) {
                return false;
            }
            c.this.C = ((r) gVar).getItem().getItemId();
            m.a b2 = c.this.b();
            if (b2 != null) {
                return b2.a(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, a.a.g.abc_action_menu_layout, a.a.g.abc_action_menu_item_layout);
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.b
    public View a(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.f()) {
            actionView = super.a(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public void a(Context context, g gVar) {
        super.a(context, gVar);
        Resources resources = context.getResources();
        a.a.n.a a2 = a.a.n.a.a(context);
        if (!this.n) {
            this.m = a2.g();
        }
        if (!this.t) {
            this.o = a2.b();
        }
        if (!this.r) {
            this.q = a2.c();
        }
        int i = this.o;
        if (this.m) {
            if (this.j == null) {
                d dVar = new d(this.f504b);
                this.j = dVar;
                if (this.l) {
                    dVar.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = i;
        this.v = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void a(Configuration configuration) {
        if (!this.r) {
            this.q = a.a.n.a.a(this.f505c).c();
        }
        g gVar = this.d;
        if (gVar != null) {
            gVar.b(true);
        }
    }

    public void a(Drawable drawable) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.l = true;
        this.k = drawable;
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public void a(g gVar, boolean z2) {
        c();
        super.a(gVar, z2);
    }

    @Override // androidx.appcompat.view.menu.b
    public void a(i iVar, n.a aVar) {
        aVar.a(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.A == null) {
            this.A = new b();
        }
        actionMenuItemView.setPopupCallback(this.A);
    }

    public void a(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.a(this.d);
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public void a(boolean z2) {
        n nVar;
        super.a(z2);
        ((View) this.i).requestLayout();
        g gVar = this.d;
        boolean z3 = false;
        if (gVar != null) {
            ArrayList<i> c2 = gVar.c();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                a.g.l.b a2 = c2.get(i).a();
                if (a2 != null) {
                    a2.a(this);
                }
            }
        }
        g gVar2 = this.d;
        ArrayList<i> j2 = gVar2 != null ? gVar2.j() : null;
        if (this.m && j2 != null) {
            int size2 = j2.size();
            if (size2 == 1) {
                z3 = !j2.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.j;
        if (z3) {
            if (dVar == null) {
                this.j = new d(this.f504b);
            }
            ViewGroup viewGroup = (ViewGroup) this.j.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.j, actionMenuView.e());
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.i)) {
            ((ViewGroup) nVar).removeView(this.j);
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.m);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a() {
        int i;
        ArrayList<i> arrayList;
        int i2;
        int i3;
        int i4;
        c cVar = this;
        g gVar = cVar.d;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.q;
        int i7 = cVar.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.i;
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i iVar = arrayList.get(i10);
            if (iVar.k()) {
                i8++;
            } else if (iVar.j()) {
                i9++;
            } else {
                z2 = true;
            }
            if (cVar.u && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.m && (z2 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.w;
        sparseBooleanArray.clear();
        if (cVar.s) {
            int i12 = cVar.v;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            i iVar2 = arrayList.get(i13);
            if (iVar2.k()) {
                View a2 = cVar.a(iVar2, view, viewGroup);
                if (cVar.s) {
                    i2 -= ActionMenuView.a(a2, i3, i2, makeMeasureSpec, i5);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a2.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.d(true);
                i4 = i;
            } else if (iVar2.j()) {
                int groupId2 = iVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i11 > 0 || z3) && i7 > 0 && (!cVar.s || i2 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View a3 = cVar.a(iVar2, null, viewGroup);
                    if (cVar.s) {
                        int a4 = ActionMenuView.a(a3, i3, i2, makeMeasureSpec, 0);
                        i2 -= a4;
                        if (a4 == 0) {
                            z5 = false;
                        }
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z4 = z5 & (!cVar.s ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.h()) {
                                i11++;
                            }
                            iVar3.d(false);
                        }
                    }
                }
                if (z4) {
                    i11--;
                }
                iVar2.d(z4);
            } else {
                i4 = i;
                iVar2.d(false);
                i13++;
                i = i4;
                view = null;
                i5 = 0;
                cVar = this;
            }
            i13++;
            i = i4;
            view = null;
            i5 = 0;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(int i, i iVar) {
        return iVar.h();
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.j) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.b
    public boolean a(r rVar) {
        boolean z2 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.t() != this.d) {
            rVar2 = (r) rVar2.t();
        }
        View a2 = a(rVar2.getItem());
        if (a2 == null) {
            return false;
        }
        rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.f505c, rVar, a2);
        this.y = aVar;
        aVar.a(z2);
        this.y.e();
        super.a(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public n b(ViewGroup viewGroup) {
        n nVar = this.i;
        n b2 = super.b(viewGroup);
        if (nVar != b2) {
            ((ActionMenuView) b2).setPresenter(this);
        }
        return b2;
    }

    public void b(boolean z2) {
        this.u = z2;
    }

    public void c(boolean z2) {
        this.m = z2;
        this.n = true;
    }

    public boolean c() {
        return e() | f();
    }

    public Drawable d() {
        d dVar = this.j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.l) {
            return this.k;
        }
        return null;
    }

    public boolean e() {
        n nVar;
        RunnableC0040c cVar = this.z;
        if (cVar == null || (nVar = this.i) == null) {
            e eVar = this.x;
            if (eVar == null) {
                return false;
            }
            eVar.a();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.z = null;
        return true;
    }

    public boolean f() {
        a aVar = this.y;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    public boolean g() {
        return this.z != null || h();
    }

    public boolean h() {
        e eVar = this.x;
        return eVar != null && eVar.c();
    }

    public boolean i() {
        g gVar;
        if (!this.m || h() || (gVar = this.d) == null || this.i == null || this.z != null || gVar.j().isEmpty()) {
            return false;
        }
        RunnableC0040c cVar = new RunnableC0040c(new e(this.f505c, this.d, this.j, true));
        this.z = cVar;
        ((View) this.i).post(cVar);
        super.a((r) null);
        return true;
    }
}
