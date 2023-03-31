package com.google.android.material.datepicker;

import a.g.l.u;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

public final class g<S> extends m<S> {
    static final Object j0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object k0 = "NAVIGATION_PREV_TAG";
    static final Object l0 = "NAVIGATION_NEXT_TAG";
    static final Object m0 = "SELECTOR_TOGGLE_TAG";
    private int Z;
    private d<S> a0;
    private a b0;
    private i c0;
    private k d0;
    private c e0;
    private RecyclerView f0;
    private RecyclerView g0;
    private View h0;
    private View i0;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5901b;

        a(int i) {
            this.f5901b = i;
        }

        public void run() {
            g.this.g0.smoothScrollToPosition(this.f5901b);
        }
    }

    class b extends a.g.l.a {
        b(g gVar) {
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            cVar.a((Object) null);
        }
    }

    class c extends n {
        final /* synthetic */ int I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void a(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = g.this.g0.getWidth();
                iArr[1] = g.this.g0.getWidth();
                return;
            }
            iArr[0] = g.this.g0.getHeight();
            iArr[1] = g.this.g0.getHeight();
        }
    }

    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.g.l
        public void a(long j) {
            if (g.this.b0.a().a(j)) {
                g.this.a0.c(j);
                Iterator<l<S>> it = g.this.Y.iterator();
                while (it.hasNext()) {
                    it.next().a((S) g.this.a0.h());
                }
                g.this.g0.getAdapter().d();
                if (g.this.f0 != null) {
                    g.this.f0.getAdapter().d();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f5904a = o.d();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f5905b = o.d();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                p pVar = (p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (a.g.k.d<Long, Long> dVar : g.this.a0.c()) {
                    F f = dVar.f192a;
                    if (!(f == null || dVar.f193b == null)) {
                        this.f5904a.setTimeInMillis(f.longValue());
                        this.f5905b.setTimeInMillis(dVar.f193b.longValue());
                        int e = pVar.e(this.f5904a.get(1));
                        int e2 = pVar.e(this.f5905b.get(1));
                        View c2 = gridLayoutManager.c(e);
                        View c3 = gridLayoutManager.c(e2);
                        int M = e / gridLayoutManager.M();
                        int M2 = e2 / gridLayoutManager.M();
                        int i = M;
                        while (i <= M2) {
                            View c4 = gridLayoutManager.c(gridLayoutManager.M() * i);
                            if (c4 != null) {
                                canvas.drawRect((float) (i == M ? c2.getLeft() + (c2.getWidth() / 2) : 0), (float) (c4.getTop() + g.this.e0.d.b()), (float) (i == M2 ? c3.getLeft() + (c3.getWidth() / 2) : recyclerView.getWidth()), (float) (c4.getBottom() - g.this.e0.d.a()), g.this.e0.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends a.g.l.a {
        f() {
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            g gVar;
            int i;
            super.a(view, cVar);
            if (g.this.i0.getVisibility() == 0) {
                gVar = g.this;
                i = b.c.b.b.i.mtrl_picker_toggle_to_year_selection;
            } else {
                gVar = g.this;
                i = b.c.b.b.i.mtrl_picker_toggle_to_day_selection;
            }
            cVar.d(gVar.a(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.g$g  reason: collision with other inner class name */
    public class C0085g extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f5907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f5908b;

        C0085g(k kVar, MaterialButton materialButton) {
            this.f5907a = kVar;
            this.f5908b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f5908b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager n0 = g.this.n0();
            int G = i < 0 ? n0.G() : n0.H();
            g.this.c0 = this.f5907a.e(G);
            this.f5908b.setText(this.f5907a.f(G));
        }
    }

    /* access modifiers changed from: package-private */
    public class h implements View.OnClickListener {
        h() {
        }

        public void onClick(View view) {
            g.this.o0();
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f5911b;

        i(k kVar) {
            this.f5911b = kVar;
        }

        public void onClick(View view) {
            int G = g.this.n0().G() + 1;
            if (G < g.this.g0.getAdapter().a()) {
                g.this.a(this.f5911b.e(G));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f5913b;

        j(k kVar) {
            this.f5913b = kVar;
        }

        public void onClick(View view) {
            int H = g.this.n0().H() - 1;
            if (H >= 0) {
                g.this.a(this.f5913b.e(H));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public enum k {
        DAY,
        YEAR
    }

    /* access modifiers changed from: package-private */
    public interface l {
        void a(long j);
    }

    private void a(View view, k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(b.c.b.b.f.month_navigation_fragment_toggle);
        materialButton.setTag(m0);
        u.a(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(b.c.b.b.f.month_navigation_previous);
        materialButton2.setTag(k0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(b.c.b.b.f.month_navigation_next);
        materialButton3.setTag(l0);
        this.h0 = view.findViewById(b.c.b.b.f.mtrl_calendar_year_selector_frame);
        this.i0 = view.findViewById(b.c.b.b.f.mtrl_calendar_day_selector_frame);
        a(k.DAY);
        materialButton.setText(this.c0.e());
        this.g0.addOnScrollListener(new C0085g(kVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(kVar));
        materialButton2.setOnClickListener(new j(kVar));
    }

    static int b(Context context) {
        return context.getResources().getDimensionPixelSize(b.c.b.b.d.mtrl_calendar_day_height);
    }

    private void d(int i2) {
        this.g0.post(new a(i2));
    }

    private RecyclerView.n p0() {
        return new e();
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.Z);
        this.e0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        i g = this.b0.g();
        if (h.b(contextThemeWrapper)) {
            i3 = b.c.b.b.h.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = b.c.b.b.h.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(b.c.b.b.f.mtrl_calendar_days_of_week);
        u.a(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new f());
        gridView.setNumColumns(g.f);
        gridView.setEnabled(false);
        this.g0 = (RecyclerView) inflate.findViewById(b.c.b.b.f.mtrl_calendar_months);
        this.g0.setLayoutManager(new c(m(), i2, false, i2));
        this.g0.setTag(j0);
        k kVar = new k(contextThemeWrapper, this.a0, this.b0, new d());
        this.g0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(b.c.b.b.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(b.c.b.b.f.mtrl_calendar_year_selector_frame);
        this.f0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f0.setAdapter(new p(this));
            this.f0.addItemDecoration(p0());
        }
        if (inflate.findViewById(b.c.b.b.f.month_navigation_fragment_toggle) != null) {
            a(inflate, kVar);
        }
        if (!h.b(contextThemeWrapper)) {
            new androidx.recyclerview.widget.k().a(this.g0);
        }
        this.g0.scrollToPosition(kVar.a(this.c0));
        return inflate;
    }

    /* access modifiers changed from: package-private */
    public void a(k kVar) {
        this.d0 = kVar;
        if (kVar == k.YEAR) {
            this.f0.getLayoutManager().i(((p) this.f0.getAdapter()).e(this.c0.e));
            this.h0.setVisibility(0);
            this.i0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.h0.setVisibility(8);
            this.i0.setVisibility(0);
            a(this.c0);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        RecyclerView recyclerView;
        int i2;
        k kVar = (k) this.g0.getAdapter();
        int a2 = kVar.a(iVar);
        int a3 = a2 - kVar.a(this.c0);
        boolean z = true;
        boolean z2 = Math.abs(a3) > 3;
        if (a3 <= 0) {
            z = false;
        }
        this.c0 = iVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.g0;
                i2 = a2 + 3;
            }
            d(a2);
        }
        recyclerView = this.g0;
        i2 = a2 - 3;
        recyclerView.scrollToPosition(i2);
        d(a2);
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        if (bundle == null) {
            bundle = k();
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.a0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.c0 = (i) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c0);
    }

    /* access modifiers changed from: package-private */
    public a j0() {
        return this.b0;
    }

    /* access modifiers changed from: package-private */
    public c k0() {
        return this.e0;
    }

    /* access modifiers changed from: package-private */
    public i l0() {
        return this.c0;
    }

    public d<S> m0() {
        return this.a0;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager n0() {
        return (LinearLayoutManager) this.g0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        k kVar;
        k kVar2 = this.d0;
        if (kVar2 == k.YEAR) {
            kVar = k.DAY;
        } else if (kVar2 == k.DAY) {
            kVar = k.YEAR;
        } else {
            return;
        }
        a(kVar);
    }
}
