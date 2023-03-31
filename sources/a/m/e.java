package a.m;

import a.m.m;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class e extends q {

    class a extends m.e {
        a(e eVar, Rect rect) {
        }
    }

    class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f317b;

        b(e eVar, View view, ArrayList arrayList) {
            this.f316a = view;
            this.f317b = arrayList;
        }

        @Override // a.m.m.f
        public void a(m mVar) {
        }

        @Override // a.m.m.f
        public void b(m mVar) {
        }

        @Override // a.m.m.f
        public void c(m mVar) {
        }

        @Override // a.m.m.f
        public void d(m mVar) {
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            mVar.b(this);
            this.f316a.setVisibility(8);
            int size = this.f317b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f317b.get(i)).setVisibility(0);
            }
        }
    }

    class c extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f319b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f320c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f318a = obj;
            this.f319b = arrayList;
            this.f320c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // a.m.m.f, a.m.n
        public void a(m mVar) {
            Object obj = this.f318a;
            if (obj != null) {
                e.this.a(obj, this.f319b, (ArrayList<View>) null);
            }
            Object obj2 = this.f320c;
            if (obj2 != null) {
                e.this.a(obj2, this.d, (ArrayList<View>) null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                e.this.a(obj3, this.f, (ArrayList<View>) null);
            }
        }

        @Override // a.m.m.f
        public void e(m mVar) {
            mVar.b(this);
        }
    }

    class d extends m.e {
        d(e eVar, Rect rect) {
        }
    }

    private static boolean a(m mVar) {
        return !q.a(mVar.m()) || !q.a(mVar.n()) || !q.a(mVar.o());
    }

    @Override // androidx.fragment.app.q
    public Object a(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            q qVar = new q();
            qVar.a(mVar);
            qVar.a(mVar2);
            qVar.b(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar2 = new q();
        if (mVar != null) {
            qVar2.a(mVar);
        }
        qVar2.a(mVar3);
        return qVar2;
    }

    @Override // androidx.fragment.app.q
    public void a(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.q
    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).a(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.q
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).a(view);
        }
    }

    @Override // androidx.fragment.app.q
    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.q
    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.q
    public void a(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int t = qVar.t();
                while (i < t) {
                    a(qVar.a(i), arrayList);
                    i++;
                }
            } else if (!a(mVar) && q.a((List) mVar.p())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.a(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.q
    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int t = qVar.t();
            while (i < t) {
                a((Object) qVar.a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!a(mVar)) {
            List<View> p = mVar.p();
            if (p.size() == arrayList.size() && p.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    mVar.a(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.d(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.q
    public boolean a(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.q
    public Object b(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.q
    public Object b(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.a((m) obj);
        }
        if (obj2 != null) {
            qVar.a((m) obj2);
        }
        if (obj3 != null) {
            qVar.a((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.q
    public void b(Object obj, View view) {
        if (obj != null) {
            ((m) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.q
    public void b(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> p = qVar.p();
        p.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q.a(p, arrayList.get(i));
        }
        p.add(view);
        arrayList.add(view);
        a(qVar, arrayList);
    }

    @Override // androidx.fragment.app.q
    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.p().clear();
            qVar.p().addAll(arrayList2);
            a((Object) qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.q
    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.a((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.q
    public void c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((m) obj).a(new a(this, rect));
        }
    }
}
