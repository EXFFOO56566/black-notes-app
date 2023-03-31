package a.m;

import a.g.l.u;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static m f349a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<a.e.a<ViewGroup, ArrayList<m>>>> f350b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f351c = new ArrayList<>();

    /* access modifiers changed from: private */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        m f352b;

        /* renamed from: c  reason: collision with root package name */
        ViewGroup f353c;

        /* renamed from: a.m.o$a$a  reason: collision with other inner class name */
        class C0033a extends n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.e.a f354a;

            C0033a(a.e.a aVar) {
                this.f354a = aVar;
            }

            @Override // a.m.m.f
            public void e(m mVar) {
                ((ArrayList) this.f354a.get(a.this.f353c)).remove(mVar);
                mVar.b(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f352b = mVar;
            this.f353c = viewGroup;
        }

        private void a() {
            this.f353c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f353c.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!o.f351c.remove(this.f353c)) {
                return true;
            }
            a.e.a<ViewGroup, ArrayList<m>> a2 = o.a();
            ArrayList<m> arrayList = a2.get(this.f353c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a2.put(this.f353c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f352b);
            this.f352b.a(new C0033a(a2));
            this.f352b.a(this.f353c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).e(this.f353c);
                }
            }
            this.f352b.a(this.f353c);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            o.f351c.remove(this.f353c);
            ArrayList<m> arrayList = o.a().get(this.f353c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(this.f353c);
                }
            }
            this.f352b.a(true);
        }
    }

    static a.e.a<ViewGroup, ArrayList<m>> a() {
        a.e.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<a.e.a<ViewGroup, ArrayList<m>>> weakReference = f350b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        a.e.a<ViewGroup, ArrayList<m>> aVar2 = new a.e.a<>();
        f350b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!f351c.contains(viewGroup) && u.C(viewGroup)) {
            f351c.add(viewGroup);
            if (mVar == null) {
                mVar = f349a;
            }
            m clone = mVar.clone();
            c(viewGroup, clone);
            l.a(viewGroup, null);
            b(viewGroup, clone);
        }
    }

    private static void b(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.a(viewGroup, true);
        }
        l a2 = l.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }
}
