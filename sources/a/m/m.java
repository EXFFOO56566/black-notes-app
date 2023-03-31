package a.m;

import a.g.l.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class m implements Cloneable {
    private static final int[] H = {2, 1, 3, 4};
    private static final g I = new a();
    private static ThreadLocal<a.e.a<Animator, d>> J = new ThreadLocal<>();
    private boolean A = false;
    private ArrayList<f> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    p D;
    private e E;
    private a.e.a<String, String> F;
    private g G = I;

    /* renamed from: b  reason: collision with root package name */
    private String f341b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    private long f342c = -1;
    long d = -1;
    private TimeInterpolator e = null;
    ArrayList<Integer> f = new ArrayList<>();
    ArrayList<View> g = new ArrayList<>();
    private ArrayList<String> h = null;
    private ArrayList<Class<?>> i = null;
    private ArrayList<Integer> j = null;
    private ArrayList<View> k = null;
    private ArrayList<Class<?>> l = null;
    private ArrayList<String> m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class<?>> p = null;
    private t q = new t();
    private t r = new t();
    q s = null;
    private int[] t = H;
    private ArrayList<s> u;
    private ArrayList<s> v;
    boolean w = false;
    ArrayList<Animator> x = new ArrayList<>();
    private int y = 0;
    private boolean z = false;

    static class a extends g {
        a() {
        }

        @Override // a.m.g
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.e.a f343a;

        b(a.e.a aVar) {
            this.f343a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f343a.remove(animator);
            m.this.x.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            m.this.x.add(animator);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            m.this.c();
            animator.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f346a;

        /* renamed from: b  reason: collision with root package name */
        String f347b;

        /* renamed from: c  reason: collision with root package name */
        s f348c;
        m0 d;
        m e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f346a = view;
            this.f347b = str;
            this.f348c = sVar;
            this.d = m0Var;
            this.e = mVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private void a(a.e.a<View, s> aVar, a.e.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s d2 = aVar.d(i2);
            if (b(d2.f362b)) {
                this.u.add(d2);
                this.v.add(null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s d3 = aVar2.d(i3);
            if (b(d3.f362b)) {
                this.v.add(d3);
                this.u.add(null);
            }
        }
    }

    private void a(a.e.a<View, s> aVar, a.e.a<View, s> aVar2, a.e.a<String, View> aVar3, a.e.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View d2 = aVar3.d(i2);
            if (d2 != null && b(d2) && (view = aVar4.get(aVar3.b(i2))) != null && b(view)) {
                s sVar = aVar.get(d2);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(d2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a(a.e.a<View, s> aVar, a.e.a<View, s> aVar2, a.e.d<View> dVar, a.e.d<View> dVar2) {
        View b2;
        int c2 = dVar.c();
        for (int i2 = 0; i2 < c2; i2++) {
            View c3 = dVar.c(i2);
            if (c3 != null && b(c3) && (b2 = dVar2.b(dVar.a(i2))) != null && b(b2)) {
                s sVar = aVar.get(c3);
                s sVar2 = aVar2.get(b2);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(c3);
                    aVar2.remove(b2);
                }
            }
        }
    }

    private void a(a.e.a<View, s> aVar, a.e.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = sparseArray.valueAt(i2);
            if (valueAt != null && b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && b(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.u.add(sVar);
                    this.v.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void a(t tVar, t tVar2) {
        a.e.a<View, s> aVar = new a.e.a<>(tVar.f364a);
        a.e.a<View, s> aVar2 = new a.e.a<>(tVar2.f364a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.t;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    b(aVar, aVar2);
                } else if (i3 == 2) {
                    a(aVar, aVar2, tVar.d, tVar2.d);
                } else if (i3 == 3) {
                    a(aVar, aVar2, tVar.f365b, tVar2.f365b);
                } else if (i3 == 4) {
                    a(aVar, aVar2, tVar.f366c, tVar2.f366c);
                }
                i2++;
            } else {
                a(aVar, aVar2);
                return;
            }
        }
    }

    private static void a(t tVar, View view, s sVar) {
        tVar.f364a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f365b.indexOfKey(id) >= 0) {
                tVar.f365b.put(id, null);
            } else {
                tVar.f365b.put(id, view);
            }
        }
        String u2 = u.u(view);
        if (u2 != null) {
            if (tVar.d.containsKey(u2)) {
                tVar.d.put(u2, null);
            } else {
                tVar.d.put(u2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f366c.c(itemIdAtPosition) >= 0) {
                    View b2 = tVar.f366c.b(itemIdAtPosition);
                    if (b2 != null) {
                        u.b(b2, false);
                        tVar.f366c.c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                u.b(view, true);
                tVar.f366c.c(itemIdAtPosition, view);
            }
        }
    }

    private void a(Animator animator, a.e.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            a(animator);
        }
    }

    private static boolean a(s sVar, s sVar2, String str) {
        Object obj = sVar.f361a.get(str);
        Object obj2 = sVar2.f361a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void b(a.e.a<View, s> aVar, a.e.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b2 = aVar.b(size);
            if (b2 != null && b(b2) && (remove = aVar2.remove(b2)) != null && b(remove.f362b)) {
                this.u.add(aVar.c(size));
                this.v.add(remove);
            }
        }
    }

    private void c(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.l;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (this.l.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s(view);
                        if (z2) {
                            c(sVar);
                        } else {
                            a(sVar);
                        }
                        sVar.f363c.add(this);
                        b(sVar);
                        a(z2 ? this.q : this.r, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.p;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        if (this.p.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    c(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static a.e.a<Animator, d> t() {
        a.e.a<Animator, d> aVar = J.get();
        if (aVar != null) {
            return aVar;
        }
        a.e.a<Animator, d> aVar2 = new a.e.a<>();
        J.set(aVar2);
        return aVar2;
    }

    public m a(long j2) {
        this.d = j2;
        return this;
    }

    public m a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(fVar);
        return this;
    }

    public m a(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
        return this;
    }

    public m a(View view) {
        this.g.add(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    public s a(View view, boolean z2) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.a(view, z2);
        }
        ArrayList<s> arrayList = z2 ? this.u : this.v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            s sVar = arrayList.get(i3);
            if (sVar == null) {
                return null;
            }
            if (sVar.f362b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.v : this.u).get(i2);
    }

    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.d != -1) {
            str2 = str2 + "dur(" + this.d + ") ";
        }
        if (this.f342c != -1) {
            str2 = str2 + "dly(" + this.f342c + ") ";
        }
        if (this.e != null) {
            str2 = str2 + "interp(" + this.e + ") ";
        }
        if (this.f.size() <= 0 && this.g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f.size() > 0) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f.get(i2);
            }
        }
        if (this.g.size() > 0) {
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.g.get(i3);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    public void a() {
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).cancel();
        }
        ArrayList<f> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).b(this);
            }
        }
    }

    public void a(g gVar) {
        if (gVar == null) {
            gVar = I;
        }
        this.G = gVar;
    }

    public void a(e eVar) {
        this.E = eVar;
    }

    public void a(p pVar) {
        this.D = pVar;
    }

    public abstract void a(s sVar);

    /* access modifiers changed from: protected */
    public void a(Animator animator) {
        if (animator == null) {
            c();
            return;
        }
        if (d() >= 0) {
            animator.setDuration(d());
        }
        if (k() >= 0) {
            animator.setStartDelay(k() + animator.getStartDelay());
        }
        if (g() != null) {
            animator.setInterpolator(g());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
        d dVar;
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        a(this.q, this.r);
        a.e.a<Animator, d> t2 = t();
        int size = t2.size();
        m0 d2 = c0.d(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator b2 = t2.b(i2);
            if (!(b2 == null || (dVar = t2.get(b2)) == null || dVar.f346a == null || !d2.equals(dVar.d))) {
                s sVar = dVar.f348c;
                View view = dVar.f346a;
                s b3 = b(view, true);
                s a2 = a(view, true);
                if (b3 == null && a2 == null) {
                    a2 = this.r.f364a.get(view);
                }
                if (!(b3 == null && a2 == null) && dVar.e.a(sVar, a2)) {
                    if (b2.isRunning() || b2.isStarted()) {
                        b2.cancel();
                    } else {
                        t2.remove(b2);
                    }
                }
            }
        }
        a(viewGroup, this.q, this.r, this.u, this.v);
        r();
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i2;
        int i3;
        Animator a2;
        View view;
        Animator animator;
        s sVar;
        s sVar2;
        Animator animator2;
        a.e.a<Animator, d> t2 = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            s sVar3 = arrayList.get(i4);
            s sVar4 = arrayList2.get(i4);
            if (sVar3 != null && !sVar3.f363c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f363c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || a(sVar3, sVar4)) && (a2 = a(viewGroup, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f362b;
                        String[] q2 = q();
                        if (q2 != null && q2.length > 0) {
                            sVar2 = new s(view);
                            i3 = size;
                            s sVar5 = tVar2.f364a.get(view);
                            if (sVar5 != null) {
                                int i5 = 0;
                                while (i5 < q2.length) {
                                    sVar2.f361a.put(q2[i5], sVar5.f361a.get(q2[i5]));
                                    i5++;
                                    i4 = i4;
                                    sVar5 = sVar5;
                                }
                            }
                            i2 = i4;
                            int size2 = t2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = a2;
                                    break;
                                }
                                d dVar = t2.get(t2.b(i6));
                                if (dVar.f348c != null && dVar.f346a == view && dVar.f347b.equals(h()) && dVar.f348c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i3 = size;
                            i2 = i4;
                            animator2 = a2;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i3 = size;
                        i2 = i4;
                        view = sVar3.f362b;
                        animator = a2;
                        sVar = null;
                    }
                    if (animator != null) {
                        p pVar = this.D;
                        if (pVar != null) {
                            long a3 = pVar.a(viewGroup, this, sVar3, sVar4);
                            sparseIntArray.put(this.C.size(), (int) a3);
                            j2 = Math.min(a3, j2);
                        }
                        t2.put(animator, new d(view, h(), this, c0.d(viewGroup), sVar));
                        this.C.add(animator);
                        j2 = j2;
                    }
                    i4 = i2 + 1;
                    size = i3;
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j2) + animator3.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup, boolean z2) {
        a.e.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        a(z2);
        if ((this.f.size() > 0 || this.g.size() > 0) && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f.get(i2).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z2) {
                        c(sVar);
                    } else {
                        a(sVar);
                    }
                    sVar.f363c.add(this);
                    b(sVar);
                    a(z2 ? this.q : this.r, findViewById, sVar);
                }
            }
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                View view = this.g.get(i3);
                s sVar2 = new s(view);
                if (z2) {
                    c(sVar2);
                } else {
                    a(sVar2);
                }
                sVar2.f363c.add(this);
                b(sVar2);
                a(z2 ? this.q : this.r, view, sVar2);
            }
        } else {
            c(viewGroup, z2);
        }
        if (!(z2 || (aVar = this.F) == null)) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.q.d.remove(this.F.b(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.q.d.put(this.F.d(i5), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        t tVar;
        if (z2) {
            this.q.f364a.clear();
            this.q.f365b.clear();
            tVar = this.q;
        } else {
            this.r.f364a.clear();
            this.r.f365b.clear();
            tVar = this.r;
        }
        tVar.f366c.a();
    }

    public boolean a(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 != null) {
            for (String str : q2) {
                if (!a(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f361a.keySet()) {
            if (a(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public m b(long j2) {
        this.f342c = j2;
        return this;
    }

    public m b(f fVar) {
        ArrayList<f> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    public s b(View view, boolean z2) {
        q qVar = this.s;
        if (qVar != null) {
            return qVar.b(view, z2);
        }
        return (z2 ? this.q : this.r).f364a.get(view);
    }

    /* access modifiers changed from: package-private */
    public void b(s sVar) {
        String[] a2;
        if (this.D != null && !sVar.f361a.isEmpty() && (a2 = this.D.a()) != null) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= a2.length) {
                    z2 = true;
                    break;
                } else if (!sVar.f361a.containsKey(a2[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                this.D.a(sVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.l.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.m == null || u.u(view) == null || !this.m.contains(u.u(view)))) {
            return false;
        }
        if ((this.f.size() == 0 && this.g.size() == 0 && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) || this.f.contains(Integer.valueOf(id)) || this.g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.h;
        if (arrayList6 != null && arrayList6.contains(u.u(view))) {
            return true;
        }
        if (this.i != null) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                if (this.i.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void c() {
        int i2 = this.y - 1;
        this.y = i2;
        if (i2 == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((f) arrayList2.get(i3)).e(this);
                }
            }
            for (int i4 = 0; i4 < this.q.f366c.c(); i4++) {
                View c2 = this.q.f366c.c(i4);
                if (c2 != null) {
                    u.b(c2, false);
                }
            }
            for (int i5 = 0; i5 < this.r.f366c.c(); i5++) {
                View c3 = this.r.f366c.c(i5);
                if (c3 != null) {
                    u.b(c3, false);
                }
            }
            this.A = true;
        }
    }

    public abstract void c(s sVar);

    public void c(View view) {
        if (!this.A) {
            a.e.a<Animator, d> t2 = t();
            int size = t2.size();
            m0 d2 = c0.d(view);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d d3 = t2.d(i2);
                if (d3.f346a != null && d2.equals(d3.d)) {
                    a.a(t2.b(i2));
                }
            }
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((f) arrayList2.get(i3)).c(this);
                }
            }
            this.z = true;
        }
    }

    @Override // java.lang.Object
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.C = new ArrayList<>();
            mVar.q = new t();
            mVar.r = new t();
            mVar.u = null;
            mVar.v = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public long d() {
        return this.d;
    }

    public m d(View view) {
        this.g.remove(view);
        return this;
    }

    public void e(View view) {
        if (this.z) {
            if (!this.A) {
                a.e.a<Animator, d> t2 = t();
                int size = t2.size();
                m0 d2 = c0.d(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    d d3 = t2.d(i2);
                    if (d3.f346a != null && d2.equals(d3.d)) {
                        a.b(t2.b(i2));
                    }
                }
                ArrayList<f> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((f) arrayList2.get(i3)).d(this);
                    }
                }
            }
            this.z = false;
        }
    }

    public e f() {
        return this.E;
    }

    public TimeInterpolator g() {
        return this.e;
    }

    public String h() {
        return this.f341b;
    }

    public g i() {
        return this.G;
    }

    public p j() {
        return this.D;
    }

    public long k() {
        return this.f342c;
    }

    public List<Integer> m() {
        return this.f;
    }

    public List<String> n() {
        return this.h;
    }

    public List<Class<?>> o() {
        return this.i;
    }

    public List<View> p() {
        return this.g;
    }

    public String[] q() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void r() {
        s();
        a.e.a<Animator, d> t2 = t();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (t2.containsKey(next)) {
                s();
                a(next, t2);
            }
        }
        this.C.clear();
        c();
    }

    /* access modifiers changed from: protected */
    public void s() {
        if (this.y == 0) {
            ArrayList<f> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            this.A = false;
        }
        this.y++;
    }

    public String toString() {
        return a(BuildConfig.FLAVOR);
    }
}
