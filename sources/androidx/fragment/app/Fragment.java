package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.l;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, h, t, androidx.savedstate.b {
    static final Object X = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E = true;
    private boolean F;
    ViewGroup G;
    View H;
    View I;
    boolean J;
    boolean K = true;
    d L;
    boolean M;
    boolean N;
    float O;
    LayoutInflater P;
    boolean Q;
    e.b R;
    i S;
    r T;
    m<h> U;
    androidx.savedstate.a V;
    private int W;

    /* renamed from: b  reason: collision with root package name */
    int f823b = 0;

    /* renamed from: c  reason: collision with root package name */
    Bundle f824c;
    SparseArray<Parcelable> d;
    Boolean e;
    String f = UUID.randomUUID().toString();
    Bundle g;
    Fragment h;
    String i = null;
    int j;
    private Boolean k = null;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    j s;
    h t;
    j u = new j();
    Fragment v;
    int w;
    int x;
    String y;
    boolean z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.i0();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            Fragment.this.d();
        }
    }

    class c extends e {
        c() {
        }

        @Override // androidx.fragment.app.e
        public View a(int i) {
            View view = Fragment.this.H;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.H != null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f829a;

        /* renamed from: b  reason: collision with root package name */
        Animator f830b;

        /* renamed from: c  reason: collision with root package name */
        int f831c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        l o;
        l p;
        boolean q;
        f r;
        boolean s;

        d() {
            Object obj = Fragment.X;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* access modifiers changed from: package-private */
    public interface f {
        void a();

        void b();
    }

    public Fragment() {
        new a();
        this.R = e.b.RESUMED;
        this.U = new m<>();
        k0();
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.m(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private d j0() {
        if (this.L == null) {
            this.L = new d();
        }
        return this.L;
    }

    private void k0() {
        this.S = new i(this);
        this.V = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.S.a(new androidx.lifecycle.f() {
                /* class androidx.fragment.app.Fragment.AnonymousClass2 */

                @Override // androidx.lifecycle.f
                public void a(h hVar, e.a aVar) {
                    View view;
                    if (aVar == e.a.ON_STOP && (view = Fragment.this.H) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    public Object A() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == X ? n() : obj;
    }

    public Object B() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public Object C() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == X ? B() : obj;
    }

    /* access modifiers changed from: package-private */
    public int D() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f831c;
    }

    public final Fragment E() {
        String str;
        Fragment fragment = this.h;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.s;
        if (jVar == null || (str = this.i) == null) {
            return null;
        }
        return jVar.h.get(str);
    }

    public View F() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public void G() {
        k0();
        this.f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new j();
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.z = false;
        this.A = false;
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        d dVar = this.L;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    /* access modifiers changed from: package-private */
    public final boolean I() {
        return this.r > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        d dVar = this.L;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    public final boolean K() {
        j jVar = this.s;
        if (jVar == null) {
            return false;
        }
        return jVar.w();
    }

    /* access modifiers changed from: package-private */
    public void L() {
        this.u.x();
    }

    public void M() {
        this.F = true;
    }

    public void N() {
    }

    public void O() {
        this.F = true;
    }

    public void P() {
        this.F = true;
    }

    public void Q() {
        this.F = true;
    }

    public void R() {
        this.F = true;
    }

    public void S() {
        this.F = true;
    }

    public void T() {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.u.a(this.t, new c(), this);
        this.F = false;
        a(this.t.g());
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        this.u.h();
        this.S.a(e.a.ON_DESTROY);
        this.f823b = 0;
        this.F = false;
        this.Q = false;
        M();
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        this.u.i();
        if (this.H != null) {
            this.T.a(e.a.ON_DESTROY);
        }
        this.f823b = 1;
        this.F = false;
        O();
        if (this.F) {
            a.k.a.a.a(this).a();
            this.q = false;
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void X() {
        this.F = false;
        P();
        this.P = null;
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.u.v()) {
            this.u.h();
            this.u = new j();
        }
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        onLowMemory();
        this.u.j();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        this.u.k();
        if (this.H != null) {
            this.T.a(e.a.ON_PAUSE);
        }
        this.S.a(e.a.ON_PAUSE);
        this.f823b = 3;
        this.F = false;
        Q();
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    @Deprecated
    public LayoutInflater a(Bundle bundle) {
        h hVar = this.t;
        if (hVar != null) {
            LayoutInflater j2 = hVar.j();
            j jVar = this.u;
            jVar.s();
            a.g.l.f.b(j2, jVar);
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.W;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public Animation a(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment a(String str) {
        return str.equals(this.f) ? this : this.u.b(str);
    }

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.e a() {
        return this.S;
    }

    public final String a(int i2) {
        return y().getString(i2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (this.L != null || i2 != 0 || i3 != 0) {
            j0();
            d dVar = this.L;
            dVar.e = i2;
            dVar.f = i3;
        }
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(int i2, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    public void a(Animator animator) {
        j0().f830b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.F = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
    }

    public void a(Context context) {
        this.F = true;
        h hVar = this.t;
        Activity f2 = hVar == null ? null : hVar.f();
        if (f2 != null) {
            this.F = false;
            a(f2);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        h hVar = this.t;
        Activity f2 = hVar == null ? null : hVar.f();
        if (f2 != null) {
            this.F = false;
            a(f2, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.a(configuration);
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        j0().f829a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar) {
        j0();
        f fVar2 = this.L.r;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                d dVar = this.L;
                if (dVar.q) {
                    dVar.r = fVar;
                }
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void a(Fragment fragment) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mTag=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f823b);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.f824c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f824c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.d);
        }
        Fragment E2 = E();
        if (E2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(E2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(t());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (i() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(i());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(D());
        }
        if (m() != null) {
            a.k.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        j jVar = this.u;
        jVar.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void a(boolean z2) {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        boolean i2 = this.s.i(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != i2) {
            this.k = Boolean.valueOf(i2);
            d(i2);
            this.u.l();
        }
    }

    public Animator b(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (this.L != null || i2 != 0) {
            j0().d = i2;
        }
    }

    public void b(Bundle bundle) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.x();
        this.q = true;
        this.T = new r();
        View a2 = a(layoutInflater, viewGroup, bundle);
        this.H = a2;
        if (a2 != null) {
            this.T.d();
            this.U.b(this.T);
        } else if (!this.T.e()) {
            this.T = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void b(Menu menu) {
    }

    public void b(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            a(menu, menuInflater);
        }
        return z2 | this.u.a(menu, menuInflater);
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b0() {
        this.u.x();
        this.u.q();
        this.f823b = 4;
        this.F = false;
        R();
        if (this.F) {
            this.S.a(e.a.ON_RESUME);
            if (this.H != null) {
                this.T.a(e.a.ON_RESUME);
            }
            this.u.m();
            this.u.q();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onResume()");
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry c() {
        return this.V.a();
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        j0().f831c = i2;
    }

    public void c(Bundle bundle) {
        this.F = true;
        k(bundle);
        if (!this.u.c(1)) {
            this.u.g();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Menu menu) {
        if (!this.z) {
            if (this.D && this.E) {
                a(menu);
            }
            this.u.a(menu);
        }
    }

    public void c(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean c(MenuItem menuItem) {
        if (!this.z) {
            return a(menuItem) || this.u.a(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c0() {
        this.u.x();
        this.u.q();
        this.f823b = 3;
        this.F = false;
        S();
        if (this.F) {
            this.S.a(e.a.ON_START);
            if (this.H != null) {
                this.T.a(e.a.ON_START);
            }
            this.u.n();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStart()");
    }

    public LayoutInflater d(Bundle bundle) {
        return a(bundle);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        d dVar = this.L;
        f fVar = null;
        if (dVar != null) {
            dVar.q = false;
            f fVar2 = dVar.r;
            dVar.r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public void d(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean d(Menu menu) {
        boolean z2 = false;
        if (this.z) {
            return false;
        }
        if (this.D && this.E) {
            z2 = true;
            b(menu);
        }
        return z2 | this.u.b(menu);
    }

    /* access modifiers changed from: package-private */
    public boolean d(MenuItem menuItem) {
        if (!this.z) {
            return (this.D && this.E && b(menuItem)) || this.u.b(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        this.u.o();
        if (this.H != null) {
            this.T.a(e.a.ON_STOP);
        }
        this.S.a(e.a.ON_STOP);
        this.f823b = 2;
        this.F = false;
        T();
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    @Override // androidx.lifecycle.t
    public s e() {
        j jVar = this.s;
        if (jVar != null) {
            return jVar.g(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void e(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z2) {
        b(z2);
        this.u.a(z2);
    }

    public final d e0() {
        d f2 = f();
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final d f() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return (d) hVar.f();
    }

    public void f(Bundle bundle) {
        this.F = true;
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z2) {
        c(z2);
        this.u.b(z2);
    }

    public final Context f0() {
        Context m2 = m();
        if (m2 != null) {
            return m2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        this.u.x();
        this.f823b = 2;
        this.F = false;
        b(bundle);
        if (this.F) {
            this.u.f();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z2) {
        j0().s = z2;
    }

    public boolean g() {
        Boolean bool;
        d dVar = this.L;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final i g0() {
        i r2 = r();
        if (r2 != null) {
            return r2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    public void h(Bundle bundle) {
        this.u.x();
        this.f823b = 1;
        this.F = false;
        this.V.a(bundle);
        c(bundle);
        this.Q = true;
        if (this.F) {
            this.S.a(e.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean h() {
        Boolean bool;
        d dVar = this.L;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final View h0() {
        View F2 = F();
        if (F2 != null) {
            return F2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater i(Bundle bundle) {
        LayoutInflater d2 = d(bundle);
        this.P = d2;
        return d2;
    }

    /* access modifiers changed from: package-private */
    public View i() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f829a;
    }

    public void i0() {
        j jVar = this.s;
        if (jVar == null || jVar.r == null) {
            j0().q = false;
        } else if (Looper.myLooper() != this.s.r.h().getLooper()) {
            this.s.r.h().postAtFrontOfQueue(new b());
        } else {
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public Animator j() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.f830b;
    }

    /* access modifiers changed from: package-private */
    public void j(Bundle bundle) {
        e(bundle);
        this.V.b(bundle);
        Parcelable z2 = this.u.z();
        if (z2 != null) {
            bundle.putParcelable("android:support:fragments", z2);
        }
    }

    public final Bundle k() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.u.a(parcelable);
            this.u.g();
        }
    }

    public final i l() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public final void l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.d;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.d = null;
        }
        this.F = false;
        f(bundle);
        if (!this.F) {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.H != null) {
            this.T.a(e.a.ON_CREATE);
        }
    }

    public Context m() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public void m(Bundle bundle) {
        if (this.s == null || !K()) {
            this.g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public Object n() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    /* access modifiers changed from: package-private */
    public l o() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        e0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.F = true;
    }

    public Object p() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    /* access modifiers changed from: package-private */
    public l q() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    public final i r() {
        return this.s;
    }

    public final Object s() {
        h hVar = this.t;
        if (hVar == null) {
            return null;
        }
        return hVar.i();
    }

    /* access modifiers changed from: package-private */
    public int t() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.g.k.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f);
        sb.append(")");
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        if (this.y != null) {
            sb.append(" ");
            sb.append(this.y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public int u() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.e;
    }

    /* access modifiers changed from: package-private */
    public int v() {
        d dVar = this.L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f;
    }

    public final Fragment w() {
        return this.v;
    }

    public Object x() {
        d dVar = this.L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == X ? p() : obj;
    }

    public final Resources y() {
        return f0().getResources();
    }

    public final boolean z() {
        return this.B;
    }
}
