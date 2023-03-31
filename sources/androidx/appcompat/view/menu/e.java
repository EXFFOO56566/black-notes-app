package androidx.appcompat.view.menu;

import a.a.g;
import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    Context f518b;

    /* renamed from: c  reason: collision with root package name */
    LayoutInflater f519c;
    g d;
    ExpandedMenuView e;
    int f;
    int g;
    int h;
    private m.a i;
    a j;

    /* access modifiers changed from: private */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private int f520b = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i f = e.this.d.f();
            if (f != null) {
                ArrayList<i> j = e.this.d.j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f) {
                        this.f520b = i;
                        return;
                    }
                }
            }
            this.f520b = -1;
        }

        public int getCount() {
            int size = e.this.d.j().size() - e.this.f;
            return this.f520b < 0 ? size : size - 1;
        }

        public i getItem(int i) {
            ArrayList<i> j = e.this.d.j();
            int i2 = i + e.this.f;
            int i3 = this.f520b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f519c.inflate(eVar.h, viewGroup, false);
            }
            ((n.a) view).a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i2, int i3) {
        this.h = i2;
        this.g = i3;
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.f518b = context;
        this.f519c = LayoutInflater.from(context);
    }

    public n a(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (ExpandedMenuView) this.f519c.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.e.setAdapter((ListAdapter) this.j);
            this.e.setOnItemClickListener(this);
        }
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.g
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.g
            r0.<init>(r3, r1)
            r2.f518b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f519c = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f518b
            if (r0 == 0) goto L_0x0023
            r2.f518b = r3
            android.view.LayoutInflater r0 = r2.f519c
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.d = r4
            androidx.appcompat.view.menu.e$a r3 = r2.j
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.a(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
        this.i = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).a((IBinder) null);
        m.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.a(rVar);
        return true;
    }

    public ListAdapter b() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean b(g gVar, i iVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.d.a(this.j.getItem(i2), this, 0);
    }
}
