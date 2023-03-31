package androidx.fragment.app;

import a.g.l.s;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* access modifiers changed from: package-private */
public final class j extends i implements LayoutInflater.Factory2 {
    static boolean I = false;
    static final Interpolator J = new DecelerateInterpolator(2.5f);
    static final Interpolator K = new DecelerateInterpolator(1.5f);
    ArrayList<a> A;
    ArrayList<Boolean> B;
    ArrayList<Fragment> C;
    Bundle D = null;
    SparseArray<Parcelable> E = null;
    ArrayList<m> F;
    private l G;
    Runnable H = new b();
    ArrayList<k> d;
    boolean e;
    int f = 0;
    final ArrayList<Fragment> g = new ArrayList<>();
    final HashMap<String, Fragment> h = new HashMap<>();
    ArrayList<a> i;
    ArrayList<Fragment> j;
    private OnBackPressedDispatcher k;
    private final androidx.activity.b l = new a(false);
    ArrayList<a> m;
    ArrayList<Integer> n;
    ArrayList<i.b> o;
    private final CopyOnWriteArrayList<i> p = new CopyOnWriteArrayList<>();
    int q = 0;
    h r;
    e s;
    Fragment t;
    Fragment u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void a() {
            j.this.u();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            j.this.q();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f844b;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (c.this.f844b.i() != null) {
                    c.this.f844b.a((View) null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f844b;
                    jVar.a(fragment, fragment.D(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f843a = viewGroup;
            this.f844b = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            this.f843a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f848b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f849c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f847a = viewGroup;
            this.f848b = view;
            this.f849c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f847a.endViewTransition(this.f848b);
            Animator j = this.f849c.j();
            this.f849c.a((Animator) null);
            if (j != null && this.f847a.indexOfChild(this.f848b) < 0) {
                j jVar = j.this;
                Fragment fragment = this.f849c;
                jVar.a(fragment, fragment.D(), 0, 0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f851b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f852c;

        e(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f850a = viewGroup;
            this.f851b = view;
            this.f852c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f850a.endViewTransition(this.f851b);
            animator.removeListener(this);
            Fragment fragment = this.f852c;
            View view = fragment.H;
            if (view != null && fragment.z) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends g {
        f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            h hVar = j.this.r;
            return hVar.a(hVar.g(), str, null);
        }
    }

    /* access modifiers changed from: private */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f854a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f855b;

        g(Animator animator) {
            this.f854a = null;
            this.f855b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f854a = animation;
            this.f855b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* access modifiers changed from: private */
    public static class h extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final ViewGroup f856b;

        /* renamed from: c  reason: collision with root package name */
        private final View f857c;
        private boolean d;
        private boolean e;
        private boolean f = true;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f856b = viewGroup;
            this.f857c = view;
            addAnimation(animation);
            this.f856b.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                s.a(this.f856b, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.d = true;
                s.a(this.f856b, this);
            }
            return true;
        }

        public void run() {
            if (this.d || !this.f) {
                this.f856b.endViewTransition(this.f857c);
                this.e = true;
                return;
            }
            this.f = false;
            this.f856b.post(this);
        }
    }

    /* access modifiers changed from: private */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        final i.a f858a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f859b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$j  reason: collision with other inner class name */
    public static class C0045j {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f860a = {16842755, 16842960, 16842961};
    }

    /* access modifiers changed from: package-private */
    public interface k {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class l implements k {

        /* renamed from: a  reason: collision with root package name */
        final String f861a;

        /* renamed from: b  reason: collision with root package name */
        final int f862b;

        /* renamed from: c  reason: collision with root package name */
        final int f863c;

        l(String str, int i, int i2) {
            this.f861a = str;
            this.f862b = i;
            this.f863c = i2;
        }

        @Override // androidx.fragment.app.j.k
        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.u;
            if (fragment == null || this.f862b >= 0 || this.f861a != null || !fragment.l().d()) {
                return j.this.a(arrayList, arrayList2, this.f861a, this.f862b, this.f863c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class m implements Fragment.f {

        /* renamed from: a  reason: collision with root package name */
        final boolean f864a;

        /* renamed from: b  reason: collision with root package name */
        final a f865b;

        /* renamed from: c  reason: collision with root package name */
        private int f866c;

        m(a aVar, boolean z) {
            this.f864a = z;
            this.f865b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i = this.f866c - 1;
            this.f866c = i;
            if (i == 0) {
                this.f865b.r.A();
            }
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f866c++;
        }

        public void c() {
            a aVar = this.f865b;
            aVar.r.a(aVar, this.f864a, false, false);
        }

        public void d() {
            boolean z = this.f866c > 0;
            j jVar = this.f865b.r;
            int size = jVar.g.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.g.get(i);
                fragment.a((Fragment.f) null);
                if (z && fragment.J()) {
                    fragment.i0();
                }
            }
            a aVar = this.f865b;
            aVar.r.a(aVar, this.f864a, !z, true);
        }

        public boolean e() {
            return this.f866c == 0;
        }
    }

    j() {
    }

    private void C() {
        this.h.values().removeAll(Collections.singleton(null));
    }

    private void D() {
        if (w()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void E() {
        this.e = false;
        this.B.clear();
        this.A.clear();
    }

    private void F() {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.i() != null) {
                    int D2 = fragment.D();
                    View i2 = fragment.i();
                    Animation animation = i2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        i2.clearAnimation();
                    }
                    fragment.a((View) null);
                    a(fragment, D2, 0, 0, false);
                } else if (fragment.j() != null) {
                    fragment.j().end();
                }
            }
        }
    }

    private void G() {
        if (this.F != null) {
            while (!this.F.isEmpty()) {
                this.F.remove(0).d();
            }
        }
    }

    private void H() {
        ArrayList<k> arrayList = this.d;
        boolean z2 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            androidx.activity.b bVar = this.l;
            if (r() <= 0 || !i(this.t)) {
                z2 = false;
            }
            bVar.a(z2);
            return;
        }
        this.l.a(true);
    }

    private int a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.e() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.F == null) {
                    this.F = new ArrayList<>();
                }
                m mVar = new m(aVar, booleanValue);
                this.F.add(mVar);
                aVar.a(mVar);
                if (booleanValue) {
                    aVar.c();
                } else {
                    aVar.b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    static g a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220);
        return new g(alphaAnimation);
    }

    static g a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(J);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(K);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void a(a.e.b<Fragment> bVar) {
        int i2 = this.q;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.g.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.g.get(i3);
                if (fragment.f823b < min) {
                    a(fragment, min, fragment.t(), fragment.u(), false);
                    if (fragment.H != null && !fragment.z && fragment.M) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    private void a(Fragment fragment, g gVar, int i2) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        fragment.c(i2);
        if (gVar.f854a != null) {
            h hVar = new h(gVar.f854a, viewGroup, view);
            fragment.a(fragment.H);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.H.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f855b;
        fragment.a(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.H);
        animator.start();
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.g.k.b("FragmentManager"));
        h hVar = this.r;
        if (hVar != null) {
            try {
                hVar.a("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    private void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.F;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.F.get(i2);
            if (arrayList == null || mVar.f864a || (indexOf2 = arrayList.indexOf(mVar.f865b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f865b.a(arrayList, 0, arrayList.size()))) {
                    this.F.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || mVar.f864a || (indexOf = arrayList.indexOf(mVar.f865b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                i2++;
            } else {
                this.F.remove(i2);
                i2--;
                size--;
            }
            mVar.c();
            i2++;
        }
    }

    private static void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.a(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.b(z2);
            } else {
                aVar.a(1);
                aVar.c();
            }
            i2++;
        }
    }

    private boolean a(String str, int i2, int i3) {
        q();
        c(true);
        Fragment fragment = this.u;
        if (fragment != null && i2 < 0 && str == null && fragment.l().d()) {
            return true;
        }
        boolean a2 = a(this.A, this.B, str, i2, i3);
        if (a2) {
            this.e = true;
            try {
                c(this.A, this.B);
            } finally {
                E();
            }
        }
        H();
        p();
        C();
        return a2;
    }

    public static int b(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void b(a.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment h2 = bVar.h(i2);
            if (!h2.l) {
                View h0 = h2.h0();
                h2.O = h0.getAlpha();
                h0.setAlpha(0.0f);
            }
        }
    }

    private void b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z2 = arrayList.get(i6).p;
        ArrayList<Fragment> arrayList3 = this.C;
        if (arrayList3 == null) {
            this.C = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.C.addAll(this.g);
        Fragment t2 = t();
        boolean z3 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            a aVar = arrayList.get(i7);
            t2 = !arrayList2.get(i7).booleanValue() ? aVar.a(this.C, t2) : aVar.b(this.C, t2);
            z3 = z3 || aVar.h;
        }
        this.C.clear();
        if (!z2) {
            o.a(this, arrayList, arrayList2, i2, i3, false);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z2) {
            a.e.b<Fragment> bVar = new a.e.b<>();
            a(bVar);
            int a2 = a(arrayList, arrayList2, i2, i3, bVar);
            b(bVar);
            i4 = a2;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z2) {
            o.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.q, true);
        }
        while (i6 < i3) {
            a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.t) >= 0) {
                b(i5);
                aVar2.t = -1;
            }
            aVar2.f();
            i6++;
        }
        if (z3) {
            y();
        }
    }

    private boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.d != null) {
                if (this.d.size() != 0) {
                    int size = this.d.size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z2 |= this.d.get(i2).a(arrayList, arrayList2);
                    }
                    this.d.clear();
                    this.r.h().removeCallbacks(this.H);
                    return z2;
                }
            }
            return false;
        }
    }

    private void c(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).p) {
                    if (i3 != i2) {
                        b(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                            i3++;
                        }
                    }
                    b(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                b(arrayList, arrayList2, i3, size);
            }
        }
    }

    private void c(boolean z2) {
        if (this.e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.r == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.r.h().getLooper()) {
            if (!z2) {
                D();
            }
            if (this.A == null) {
                this.A = new ArrayList<>();
                this.B = new ArrayList<>();
            }
            this.e = true;
            try {
                a((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.e = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX INFO: finally extract failed */
    private void d(int i2) {
        try {
            this.e = true;
            a(i2, false);
            this.e = false;
            q();
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    public static int e(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void u(Fragment fragment) {
        if (fragment != null && this.h.get(fragment.f) == fragment) {
            fragment.a0();
        }
    }

    private Fragment v(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.g.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.g.get(indexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private boolean w(Fragment fragment) {
        return (fragment.D && fragment.E) || fragment.u.e();
    }

    /* access modifiers changed from: package-private */
    public void A() {
        synchronized (this) {
            boolean z2 = false;
            boolean z3 = this.F != null && !this.F.isEmpty();
            if (this.d != null && this.d.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.r.h().removeCallbacks(this.H);
                this.r.h().post(this.H);
                H();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                n(fragment);
            }
        }
    }

    public Fragment a(int i2) {
        for (int size = this.g.size() - 1; size >= 0; size--) {
            Fragment fragment = this.g.get(size);
            if (fragment != null && fragment.w == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && fragment2.w == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public Fragment a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.h.get(string);
        if (fragment != null) {
            return fragment;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public Fragment a(String str) {
        if (str != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                Fragment fragment = this.g.get(size);
                if (fragment != null && str.equals(fragment.y)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.h.values()) {
            if (fragment2 != null && str.equals(fragment2.y)) {
                return fragment2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public g a(Fragment fragment, int i2, boolean z2, int i3) {
        int b2;
        int t2 = fragment.t();
        boolean z3 = false;
        fragment.b(0);
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation a2 = fragment.a(i2, z2, t2);
        if (a2 != null) {
            return new g(a2);
        }
        Animator b3 = fragment.b(i2, z2, t2);
        if (b3 != null) {
            return new g(b3);
        }
        if (t2 != 0) {
            boolean equals = "anim".equals(this.r.g().getResources().getResourceTypeName(t2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.r.g(), t2);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.r.g(), t2);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.r.g(), t2);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (b2 = b(i2, z2)) < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(0.0f, 1.0f);
            case 6:
                return a(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.r.l()) {
                    this.r.k();
                }
                return null;
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new a(this);
    }

    @Override // androidx.fragment.app.i
    public void a(int i2, int i3) {
        if (i2 >= 0) {
            a((k) new l(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void a(int i2, a aVar) {
        synchronized (this) {
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int size = this.m.size();
            if (i2 < size) {
                if (I) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.m.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.m.add(null);
                    if (this.n == null) {
                        this.n = new ArrayList<>();
                    }
                    if (I) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.n.add(Integer.valueOf(size));
                    size++;
                }
                if (I) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.m.add(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2) {
        h hVar;
        if (this.r == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.q) {
            this.q = i2;
            int size = this.g.size();
            for (int i3 = 0; i3 < size; i3++) {
                l(this.g.get(i3));
            }
            for (Fragment fragment : this.h.values()) {
                if (fragment != null && ((fragment.m || fragment.A) && !fragment.M)) {
                    l(fragment);
                }
            }
            B();
            if (this.v && (hVar = this.r) != null && this.q == 4) {
                hVar.m();
                this.v = false;
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.a(configuration);
            }
        }
    }

    public void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.s == this) {
            bundle.putString(str, fragment.f);
            return;
        }
        a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void a(Parcelable parcelable) {
        m mVar;
        if (parcelable != null) {
            k kVar = (k) parcelable;
            if (kVar.f867b != null) {
                for (Fragment fragment : this.G.c()) {
                    if (I) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    Iterator<m> it = kVar.f867b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mVar = null;
                            break;
                        }
                        mVar = it.next();
                        if (mVar.f872c.equals(fragment.f)) {
                            break;
                        }
                    }
                    if (mVar == null) {
                        if (I) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f867b);
                        }
                        a(fragment, 1, 0, 0, false);
                        fragment.m = true;
                        a(fragment, 0, 0, 0, false);
                    } else {
                        mVar.o = fragment;
                        fragment.d = null;
                        fragment.r = 0;
                        fragment.o = false;
                        fragment.l = false;
                        Fragment fragment2 = fragment.h;
                        fragment.i = fragment2 != null ? fragment2.f : null;
                        fragment.h = null;
                        Bundle bundle = mVar.n;
                        if (bundle != null) {
                            bundle.setClassLoader(this.r.g().getClassLoader());
                            fragment.d = mVar.n.getSparseParcelableArray("android:view_state");
                            fragment.f824c = mVar.n;
                        }
                    }
                }
                this.h.clear();
                Iterator<m> it2 = kVar.f867b.iterator();
                while (it2.hasNext()) {
                    m next = it2.next();
                    if (next != null) {
                        Fragment a2 = next.a(this.r.g().getClassLoader(), b());
                        a2.s = this;
                        if (I) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + a2.f + "): " + a2);
                        }
                        this.h.put(a2.f, a2);
                        next.o = null;
                    }
                }
                this.g.clear();
                ArrayList<String> arrayList = kVar.f868c;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next2 = it3.next();
                        Fragment fragment3 = this.h.get(next2);
                        if (fragment3 != null) {
                            fragment3.l = true;
                            if (I) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                            }
                            if (!this.g.contains(fragment3)) {
                                synchronized (this.g) {
                                    this.g.add(fragment3);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + fragment3);
                            }
                        } else {
                            a(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                            throw null;
                        }
                    }
                }
                if (kVar.d != null) {
                    this.i = new ArrayList<>(kVar.d.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = kVar.d;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        a a3 = bVarArr[i2].a(this);
                        if (I) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a3.t + "): " + a3);
                            PrintWriter printWriter = new PrintWriter(new a.g.k.b("FragmentManager"));
                            a3.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.i.add(a3);
                        int i3 = a3.t;
                        if (i3 >= 0) {
                            a(i3, a3);
                        }
                        i2++;
                    }
                } else {
                    this.i = null;
                }
                String str = kVar.e;
                if (str != null) {
                    Fragment fragment4 = this.h.get(str);
                    this.u = fragment4;
                    u(fragment4);
                }
                this.f = kVar.f;
            }
        }
    }

    public void a(Menu menu) {
        if (this.q >= 1) {
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                Fragment fragment = this.g.get(i2);
                if (fragment != null) {
                    fragment.c(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (w()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.G.a(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x04d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 1282
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).a(fragment, context, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.a(this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).a(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.a(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).a(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.a(this, fragment, view, bundle);
            }
        }
    }

    public void a(Fragment fragment, e.b bVar) {
        if (this.h.get(fragment.f) == fragment && (fragment.t == null || fragment.r() == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void a(Fragment fragment, boolean z2) {
        if (I) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        j(fragment);
        if (fragment.A) {
            return;
        }
        if (!this.g.contains(fragment)) {
            synchronized (this.g) {
                this.g.add(fragment);
            }
            fragment.l = true;
            fragment.m = false;
            if (fragment.H == null) {
                fragment.N = false;
            }
            if (w(fragment)) {
                this.v = true;
            }
            if (z2) {
                m(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.b(z4);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            o.a(this, (ArrayList<a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.q, true);
        }
        for (Fragment fragment : this.h.values()) {
            if (fragment != null && fragment.H != null && fragment.M && aVar.b(fragment.x)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z4) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: androidx.activity.c */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(h hVar, e eVar, Fragment fragment) {
        if (this.r == null) {
            this.r = hVar;
            this.s = eVar;
            this.t = fragment;
            if (fragment != null) {
                H();
            }
            if (hVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) hVar;
                this.k = cVar.b();
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                this.k.a(fragment2, this.l);
            }
            this.G = fragment != null ? fragment.s.f(fragment) : hVar instanceof t ? l.a(((t) hVar).e()) : new l(false);
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void a(k kVar, boolean z2) {
        if (!z2) {
            D();
        }
        synchronized (this) {
            if (!this.y) {
                if (this.r != null) {
                    if (this.d == null) {
                        this.d = new ArrayList<>();
                    }
                    this.d.add(kVar);
                    A();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.h.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.h.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.g.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.g.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.j;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.j.get(i3).toString());
            }
        }
        ArrayList<a> arrayList2 = this.i;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                a aVar = this.i.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.m != null && (size2 = this.m.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((a) this.m.get(i5));
                }
            }
            if (this.n != null && this.n.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.n.toArray()));
            }
        }
        ArrayList<k> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((k) this.d.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    public void a(boolean z2) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.g.get(size);
                if (fragment != null) {
                    fragment.e(z2);
                }
            } else {
                return;
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                Fragment fragment2 = this.j.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.N();
                }
            }
        }
        this.j = arrayList;
        return z2;
    }

    public boolean a(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = this.i;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.i.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.i.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.i.get(size2);
                    if ((str != null && str.equals(aVar.d())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.i.get(size2);
                        if ((str == null || !str.equals(aVar2.d())) && (i2 < 0 || i2 != aVar2.t)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.i.size() - 1) {
                return false;
            }
            for (int size3 = this.i.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.i.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public int b(a aVar) {
        synchronized (this) {
            if (this.n != null) {
                if (this.n.size() > 0) {
                    int intValue = this.n.remove(this.n.size() - 1).intValue();
                    if (I) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                    }
                    this.m.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            int size = this.m.size();
            if (I) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.m.add(aVar);
            return size;
        }
    }

    public Fragment b(String str) {
        Fragment a2;
        for (Fragment fragment : this.h.values()) {
            if (!(fragment == null || (a2 = fragment.a(str)) == null)) {
                return a2;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.i
    public g b() {
        if (super.b() == i.f839c) {
            Fragment fragment = this.t;
            if (fragment != null) {
                return fragment.s.b();
            }
            a(new f());
        }
        return super.b();
    }

    public void b(int i2) {
        synchronized (this) {
            this.m.set(i2, null);
            if (this.n == null) {
                this.n = new ArrayList<>();
            }
            if (I) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.n.add(Integer.valueOf(i2));
        }
    }

    public void b(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            if (!this.g.contains(fragment)) {
                if (I) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.g) {
                    this.g.add(fragment);
                }
                fragment.l = true;
                if (w(fragment)) {
                    this.v = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).b(fragment, context, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.b(this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).b(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.b(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).b(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.a(this, fragment);
            }
        }
    }

    public void b(boolean z2) {
        int size = this.g.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.g.get(size);
                if (fragment != null) {
                    fragment.f(z2);
                }
            } else {
                return;
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.q < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.d(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean b(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> c() {
        List<Fragment> list;
        if (this.g.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.g) {
            list = (List) this.g.clone();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        Animator animator;
        if (fragment.H != null) {
            g a2 = a(fragment, fragment.u(), !fragment.z, fragment.v());
            if (a2 == null || (animator = a2.f855b) == null) {
                if (a2 != null) {
                    fragment.H.startAnimation(a2.f854a);
                    a2.f854a.start();
                }
                fragment.H.setVisibility((!fragment.z || fragment.H()) ? 0 : 8);
                if (fragment.H()) {
                    fragment.g(false);
                }
            } else {
                animator.setTarget(fragment.H);
                if (!fragment.z) {
                    fragment.H.setVisibility(0);
                } else if (fragment.H()) {
                    fragment.g(false);
                } else {
                    ViewGroup viewGroup = fragment.G;
                    View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    a2.f855b.addListener(new e(this, viewGroup, view, fragment));
                }
                a2.f855b.start();
            }
        }
        if (fragment.l && w(fragment)) {
            this.v = true;
        }
        fragment.N = false;
        fragment.a(fragment.z);
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).c(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.c(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).c(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.b(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2) {
        return this.q >= i2;
    }

    public void d(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (fragment.l) {
                if (I) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.g) {
                    this.g.remove(fragment);
                }
                if (w(fragment)) {
                    this.v = true;
                }
                fragment.l = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).d(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.d(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).d(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.c(this, fragment);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public boolean d() {
        D();
        return a((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (fragment.n && !fragment.q) {
            fragment.b(fragment.i(fragment.f824c), (ViewGroup) null, fragment.f824c);
            View view = fragment.H;
            if (view != null) {
                fragment.I = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.z) {
                    fragment.H.setVisibility(8);
                }
                fragment.a(fragment.H, fragment.f824c);
                a(fragment, fragment.H, fragment.f824c, false);
                return;
            }
            fragment.I = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).e(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.d(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        boolean z2 = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                z2 = w(fragment);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public l f(Fragment fragment) {
        return this.G.c(fragment);
    }

    public void f() {
        this.w = false;
        this.x = false;
        d(2);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).f(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.e(this, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.lifecycle.s g(Fragment fragment) {
        return this.G.d(fragment);
    }

    public void g() {
        this.w = false;
        this.x = false;
        d(1);
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).g(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.f(this, fragment);
            }
        }
    }

    public void h() {
        this.y = true;
        q();
        d(0);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.k != null) {
            this.l.c();
            this.k = null;
        }
    }

    public void h(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.z) {
            fragment.z = true;
            fragment.N = true ^ fragment.N;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.t;
        if (fragment2 != null) {
            i r2 = fragment2.r();
            if (r2 instanceof j) {
                ((j) r2).h(fragment, true);
            }
        }
        Iterator<i> it = this.p.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.f859b) {
                next.f858a.g(this, fragment);
            }
        }
    }

    public void i() {
        d(1);
    }

    /* access modifiers changed from: package-private */
    public boolean i(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.s;
        return fragment == jVar.t() && i(jVar.t);
    }

    public void j() {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.Y();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        if (this.h.get(fragment.f) == null) {
            this.h.put(fragment.f, fragment);
            if (fragment.C) {
                if (fragment.B) {
                    a(fragment);
                } else {
                    p(fragment);
                }
                fragment.C = false;
            }
            if (I) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    public void k() {
        d(3);
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        if (this.h.get(fragment.f) != null) {
            if (I) {
                Log.v("FragmentManager", "Removed fragment from active set " + fragment);
            }
            for (Fragment fragment2 : this.h.values()) {
                if (fragment2 != null && fragment.f.equals(fragment2.i)) {
                    fragment2.h = fragment;
                    fragment2.i = null;
                }
            }
            this.h.put(fragment.f, null);
            p(fragment);
            String str = fragment.i;
            if (str != null) {
                fragment.h = this.h.get(str);
            }
            fragment.G();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        H();
        u(this.u);
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (fragment != null) {
            if (this.h.containsKey(fragment.f)) {
                int i2 = this.q;
                if (fragment.m) {
                    i2 = fragment.I() ? Math.min(i2, 1) : Math.min(i2, 0);
                }
                a(fragment, i2, fragment.u(), fragment.v(), false);
                if (fragment.H != null) {
                    Fragment v2 = v(fragment);
                    if (v2 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.H)) < (indexOfChild = (viewGroup = fragment.G).indexOfChild(v2.H))) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.H, indexOfChild);
                    }
                    if (fragment.M && fragment.G != null) {
                        float f2 = fragment.O;
                        if (f2 > 0.0f) {
                            fragment.H.setAlpha(f2);
                        }
                        fragment.O = 0.0f;
                        fragment.M = false;
                        g a2 = a(fragment, fragment.u(), true, fragment.v());
                        if (a2 != null) {
                            Animation animation = a2.f854a;
                            if (animation != null) {
                                fragment.H.startAnimation(animation);
                            } else {
                                a2.f855b.setTarget(fragment.H);
                                a2.f855b.start();
                            }
                        }
                    }
                }
                if (fragment.N) {
                    c(fragment);
                }
            } else if (I) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
            }
        }
    }

    public void m() {
        this.w = false;
        this.x = false;
        d(4);
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment) {
        a(fragment, this.q, 0, 0, false);
    }

    public void n() {
        this.w = false;
        this.x = false;
        d(3);
    }

    public void n(Fragment fragment) {
        if (!fragment.J) {
            return;
        }
        if (this.e) {
            this.z = true;
            return;
        }
        fragment.J = false;
        a(fragment, this.q, 0, 0, false);
    }

    public void o() {
        this.x = true;
        d(2);
    }

    public void o(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z2 = !fragment.I();
        if (!fragment.A || z2) {
            synchronized (this.g) {
                this.g.remove(fragment);
            }
            if (w(fragment)) {
                this.v = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0045j.f860a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !g.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = a(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = a(i2);
        }
        if (I) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = b().a(context.getClassLoader(), attributeValue);
            fragment.n = true;
            fragment.w = resourceId != 0 ? resourceId : i2;
            fragment.x = i2;
            fragment.y = string;
            fragment.o = true;
            fragment.s = this;
            h hVar = this.r;
            fragment.t = hVar;
            fragment.a(hVar.g(), attributeSet, fragment.f824c);
            a(fragment, true);
        } else if (!fragment.o) {
            fragment.o = true;
            h hVar2 = this.r;
            fragment.t = hVar2;
            fragment.a(hVar2.g(), attributeSet, fragment.f824c);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
        }
        if (this.q >= 1 || !fragment.n) {
            m(fragment);
        } else {
            a(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.H;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (this.z) {
            this.z = false;
            B();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        if (w()) {
            if (I) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.G.e(fragment) && I) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public Bundle q(Fragment fragment) {
        if (this.D == null) {
            this.D = new Bundle();
        }
        fragment.j(this.D);
        d(fragment, this.D, false);
        Bundle bundle = null;
        if (!this.D.isEmpty()) {
            Bundle bundle2 = this.D;
            this.D = null;
            bundle = bundle2;
        }
        if (fragment.H != null) {
            r(fragment);
        }
        if (fragment.d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.d);
        }
        if (!fragment.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.K);
        }
        return bundle;
    }

    /* JADX INFO: finally extract failed */
    public boolean q() {
        c(true);
        boolean z2 = false;
        while (b(this.A, this.B)) {
            this.e = true;
            try {
                c(this.A, this.B);
                E();
                z2 = true;
            } catch (Throwable th) {
                E();
                throw th;
            }
        }
        H();
        p();
        C();
        return z2;
    }

    public int r() {
        ArrayList<a> arrayList = this.i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void r(Fragment fragment) {
        if (fragment.I != null) {
            SparseArray<Parcelable> sparseArray = this.E;
            if (sparseArray == null) {
                this.E = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.I.saveHierarchyState(this.E);
            if (this.E.size() > 0) {
                fragment.d = this.E;
                this.E = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 s() {
        return this;
    }

    public void s(Fragment fragment) {
        if (fragment == null || (this.h.get(fragment.f) == fragment && (fragment.t == null || fragment.r() == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            u(fragment2);
            u(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public Fragment t() {
        return this.u;
    }

    public void t(Fragment fragment) {
        if (I) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.z) {
            fragment.z = false;
            fragment.N = !fragment.N;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.t;
        if (obj == null) {
            obj = this.r;
        }
        a.g.k.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        q();
        if (this.l.b()) {
            d();
        } else {
            this.k.a();
        }
    }

    public boolean v() {
        return this.y;
    }

    public boolean w() {
        return this.w || this.x;
    }

    public void x() {
        this.w = false;
        this.x = false;
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.g.get(i2);
            if (fragment != null) {
                fragment.L();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        if (this.o != null) {
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                this.o.get(i2).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Parcelable z() {
        ArrayList<String> arrayList;
        int size;
        G();
        F();
        q();
        this.w = true;
        b[] bVarArr = null;
        if (this.h.isEmpty()) {
            return null;
        }
        ArrayList<m> arrayList2 = new ArrayList<>(this.h.size());
        boolean z2 = false;
        for (Fragment fragment : this.h.values()) {
            if (fragment != null) {
                if (fragment.s == this) {
                    m mVar = new m(fragment);
                    arrayList2.add(mVar);
                    if (fragment.f823b <= 0 || mVar.n != null) {
                        mVar.n = fragment.f824c;
                    } else {
                        mVar.n = q(fragment);
                        String str = fragment.i;
                        if (str != null) {
                            Fragment fragment2 = this.h.get(str);
                            if (fragment2 != null) {
                                if (mVar.n == null) {
                                    mVar.n = new Bundle();
                                }
                                a(mVar.n, "android:target_state", fragment2);
                                int i2 = fragment.j;
                                if (i2 != 0) {
                                    mVar.n.putInt("android:target_req_state", i2);
                                }
                            } else {
                                a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                                throw null;
                            }
                        }
                    }
                    if (I) {
                        Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.n);
                    }
                    z2 = true;
                } else {
                    a(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z2) {
            if (I) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.g.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.g.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f);
                if (next.s != this) {
                    a(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                    throw null;
                } else if (I) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<a> arrayList3 = this.i;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new b(this.i.get(i3));
                if (I) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.i.get(i3));
                }
            }
        }
        k kVar = new k();
        kVar.f867b = arrayList2;
        kVar.f868c = arrayList;
        kVar.d = bVarArr;
        Fragment fragment3 = this.u;
        if (fragment3 != null) {
            kVar.e = fragment3.f;
        }
        kVar.f = this.f;
        return kVar;
    }
}
