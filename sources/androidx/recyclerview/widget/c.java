package androidx.recyclerview.widget;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends p {
    private static TimeInterpolator s;
    private ArrayList<RecyclerView.d0> h = new ArrayList<>();
    private ArrayList<RecyclerView.d0> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private ArrayList<i> k = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    ArrayList<ArrayList<j>> m = new ArrayList<>();
    ArrayList<ArrayList<i>> n = new ArrayList<>();
    ArrayList<RecyclerView.d0> o = new ArrayList<>();
    ArrayList<RecyclerView.d0> p = new ArrayList<>();
    ArrayList<RecyclerView.d0> q = new ArrayList<>();
    ArrayList<RecyclerView.d0> r = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1028b;

        a(ArrayList arrayList) {
            this.f1028b = arrayList;
        }

        public void run() {
            Iterator it = this.f1028b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.b(jVar.f1052a, jVar.f1053b, jVar.f1054c, jVar.d, jVar.e);
            }
            this.f1028b.clear();
            c.this.m.remove(this.f1028b);
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1030b;

        b(ArrayList arrayList) {
            this.f1030b = arrayList;
        }

        public void run() {
            Iterator it = this.f1030b.iterator();
            while (it.hasNext()) {
                c.this.a((i) it.next());
            }
            this.f1030b.clear();
            c.this.n.remove(this.f1030b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    class RunnableC0050c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f1032b;

        RunnableC0050c(ArrayList arrayList) {
            this.f1032b = arrayList;
        }

        public void run() {
            Iterator it = this.f1032b.iterator();
            while (it.hasNext()) {
                c.this.t((RecyclerView.d0) it.next());
            }
            this.f1032b.clear();
            c.this.l.remove(this.f1032b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f1034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1036c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1034a = d0Var;
            this.f1035b = viewPropertyAnimator;
            this.f1036c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1035b.setListener(null);
            this.f1036c.setAlpha(1.0f);
            c.this.l(this.f1034a);
            c.this.q.remove(this.f1034a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.m(this.f1034a);
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f1037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1039c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1037a = d0Var;
            this.f1038b = view;
            this.f1039c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1038b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1039c.setListener(null);
            c.this.h(this.f1037a);
            c.this.o.remove(this.f1037a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.i(this.f1037a);
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f1040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1041b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1042c;
        final /* synthetic */ int d;
        final /* synthetic */ ViewPropertyAnimator e;

        f(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f1040a = d0Var;
            this.f1041b = i;
            this.f1042c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f1041b != 0) {
                this.f1042c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.f1042c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.e.setListener(null);
            c.this.j(this.f1040a);
            c.this.p.remove(this.f1040a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.k(this.f1040a);
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f1043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1045c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1043a = iVar;
            this.f1044b = viewPropertyAnimator;
            this.f1045c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1044b.setListener(null);
            this.f1045c.setAlpha(1.0f);
            this.f1045c.setTranslationX(0.0f);
            this.f1045c.setTranslationY(0.0f);
            c.this.a(this.f1043a.f1049a, true);
            c.this.r.remove(this.f1043a.f1049a);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.b(this.f1043a.f1049a, true);
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f1046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f1048c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f1046a = iVar;
            this.f1047b = viewPropertyAnimator;
            this.f1048c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1047b.setListener(null);
            this.f1048c.setAlpha(1.0f);
            this.f1048c.setTranslationX(0.0f);
            this.f1048c.setTranslationY(0.0f);
            c.this.a(this.f1046a.f1050b, false);
            c.this.r.remove(this.f1046a.f1050b);
            c.this.j();
        }

        public void onAnimationStart(Animator animator) {
            c.this.b(this.f1046a.f1050b, false);
        }
    }

    /* access modifiers changed from: private */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f1049a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.d0 f1050b;

        /* renamed from: c  reason: collision with root package name */
        public int f1051c;
        public int d;
        public int e;
        public int f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f1049a = d0Var;
            this.f1050b = d0Var2;
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f1051c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f1049a + ", newHolder=" + this.f1050b + ", fromX=" + this.f1051c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    /* access modifiers changed from: private */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f1052a;

        /* renamed from: b  reason: collision with root package name */
        public int f1053b;

        /* renamed from: c  reason: collision with root package name */
        public int f1054c;
        public int d;
        public int e;

        j(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.f1052a = d0Var;
            this.f1053b = i;
            this.f1054c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void a(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (a(iVar, d0Var) && iVar.f1049a == null && iVar.f1050b == null) {
                list.remove(iVar);
            }
        }
    }

    private boolean a(i iVar, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (iVar.f1050b == d0Var) {
            iVar.f1050b = null;
        } else if (iVar.f1049a != d0Var) {
            return false;
        } else {
            iVar.f1049a = null;
            z = true;
        }
        d0Var.f966b.setAlpha(1.0f);
        d0Var.f966b.setTranslationX(0.0f);
        d0Var.f966b.setTranslationY(0.0f);
        a(d0Var, z);
        return true;
    }

    private void b(i iVar) {
        RecyclerView.d0 d0Var = iVar.f1049a;
        if (d0Var != null) {
            a(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f1050b;
        if (d0Var2 != null) {
            a(iVar, d0Var2);
        }
    }

    private void u(RecyclerView.d0 d0Var) {
        View view = d0Var.f966b;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(d0Var);
        animate.setDuration(f()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void v(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.f966b.animate().setInterpolator(s);
        c(d0Var);
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar) {
        RecyclerView.d0 d0Var = iVar.f1049a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f966b;
        RecyclerView.d0 d0Var2 = iVar.f1050b;
        if (d0Var2 != null) {
            view = d0Var2.f966b;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(d());
            this.r.add(iVar.f1049a);
            duration.translationX((float) (iVar.e - iVar.f1051c));
            duration.translationY((float) (iVar.f - iVar.d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.r.add(iVar.f1050b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(d()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f966b.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.p
    public boolean a(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f966b;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.f966b.getTranslationY());
        v(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            j(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.j.add(new j(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.p
    public boolean a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
        if (d0Var == d0Var2) {
            return a(d0Var, i2, i3, i4, i5);
        }
        float translationX = d0Var.f966b.getTranslationX();
        float translationY = d0Var.f966b.getTranslationY();
        float alpha = d0Var.f966b.getAlpha();
        v(d0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        d0Var.f966b.setTranslationX(translationX);
        d0Var.f966b.setTranslationY(translationY);
        d0Var.f966b.setAlpha(alpha);
        if (d0Var2 != null) {
            v(d0Var2);
            d0Var2.f966b.setTranslationX((float) (-i6));
            d0Var2.f966b.setTranslationY((float) (-i7));
            d0Var2.f966b.setAlpha(0.0f);
        }
        this.k.add(new i(d0Var, d0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.a(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.j.get(size);
            View view = jVar.f1052a.f966b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            j(jVar.f1052a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            l(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.i.get(size3);
            d0Var.f966b.setAlpha(1.0f);
            h(d0Var);
            this.i.remove(size3);
        }
        for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
            b(this.k.get(size4));
        }
        this.k.clear();
        if (g()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f1052a.f966b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    j(jVar2.f1052a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList2 = this.l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.f966b.setAlpha(1.0f);
                    h(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            a(this.q);
            a(this.p);
            a(this.o);
            a(this.r);
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.f966b;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(d0Var);
        animate.setDuration(e()).setListener(new f(d0Var, i6, view, i7, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void c(RecyclerView.d0 d0Var) {
        View view = d0Var.f966b;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).f1052a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                j(d0Var);
                this.j.remove(size);
            }
        }
        a(this.k, d0Var);
        if (this.h.remove(d0Var)) {
            view.setAlpha(1.0f);
            l(d0Var);
        }
        if (this.i.remove(d0Var)) {
            view.setAlpha(1.0f);
            h(d0Var);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.n.get(size2);
            a(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f1052a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    j(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                h(d0Var);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(d0Var);
        this.o.remove(d0Var);
        this.r.remove(d0Var);
        this.p.remove(d0Var);
        j();
    }

    @Override // androidx.recyclerview.widget.p
    public boolean f(RecyclerView.d0 d0Var) {
        v(d0Var);
        d0Var.f966b.setAlpha(0.0f);
        this.i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override // androidx.recyclerview.widget.p
    public boolean g(RecyclerView.d0 d0Var) {
        v(d0Var);
        this.h.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i() {
        boolean z = !this.h.isEmpty();
        boolean z2 = !this.j.isEmpty();
        boolean z3 = !this.k.isEmpty();
        boolean z4 = !this.i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.d0> it = this.h.iterator();
            while (it.hasNext()) {
                u(it.next());
            }
            this.h.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.j);
                this.m.add(arrayList);
                this.j.clear();
                a aVar = new a(arrayList);
                if (z) {
                    u.a(arrayList.get(0).f1052a.f966b, aVar, f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.k);
                this.n.add(arrayList2);
                this.k.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    u.a(arrayList2.get(0).f1049a.f966b, bVar, f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.i);
                this.l.add(arrayList3);
                this.i.clear();
                RunnableC0050c cVar = new RunnableC0050c(arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long f2 = z ? f() : 0;
                    long e2 = z2 ? e() : 0;
                    if (z3) {
                        j2 = d();
                    }
                    u.a(arrayList3.get(0).f966b, cVar, f2 + Math.max(e2, j2));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!g()) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void t(RecyclerView.d0 d0Var) {
        View view = d0Var.f966b;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(d0Var);
        animate.alpha(1.0f).setDuration(c()).setListener(new e(d0Var, view, animate)).start();
    }
}
