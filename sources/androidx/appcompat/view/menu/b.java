package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public abstract class b implements m {

    /* renamed from: b  reason: collision with root package name */
    protected Context f504b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f505c;
    protected g d;
    protected LayoutInflater e;
    private m.a f;
    private int g;
    private int h;
    protected n i;

    public b(Context context, int i2, int i3) {
        this.f504b = context;
        this.e = LayoutInflater.from(context);
        this.g = i2;
        this.h = i3;
    }

    public View a(i iVar, View view, ViewGroup viewGroup) {
        n.a a2 = view instanceof n.a ? (n.a) view : a(viewGroup);
        a(iVar, a2);
        return (View) a2;
    }

    public n.a a(ViewGroup viewGroup) {
        return (n.a) this.e.inflate(this.h, viewGroup, false);
    }

    public void a(int i2) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(Context context, g gVar) {
        this.f505c = context;
        LayoutInflater.from(context);
        this.d = gVar;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public abstract void a(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup != null) {
            g gVar = this.d;
            int i2 = 0;
            if (gVar != null) {
                gVar.b();
                ArrayList<i> n = this.d.n();
                int size = n.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i iVar = n.get(i4);
                    if (a(i3, iVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View a2 = a(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            a(a2, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public abstract boolean a(int i2, i iVar);

    /* access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        m.a aVar = this.f;
        if (aVar != null) {
            return aVar.a(rVar);
        }
        return false;
    }

    public m.a b() {
        return this.f;
    }

    public n b(ViewGroup viewGroup) {
        if (this.i == null) {
            n nVar = (n) this.e.inflate(this.g, viewGroup, false);
            this.i = nVar;
            nVar.a(this.d);
            a(true);
        }
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean b(g gVar, i iVar) {
        return false;
    }
}
