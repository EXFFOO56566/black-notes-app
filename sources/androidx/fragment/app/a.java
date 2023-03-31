package androidx.fragment.app;

import a.g.k.b;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class a extends n implements j.k {
    final j r;
    boolean s;
    int t = -1;

    public a(j jVar) {
        this.r = jVar;
    }

    private static boolean b(n.a aVar) {
        Fragment fragment = aVar.f877b;
        return fragment != null && fragment.l && fragment.H != null && !fragment.A && !fragment.z && fragment.J();
    }

    @Override // androidx.fragment.app.n
    public int a() {
        return a(false);
    }

    /* access modifiers changed from: package-private */
    public int a(boolean z) {
        if (!this.s) {
            if (j.I) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b("FragmentManager"));
                a("  ", printWriter);
                printWriter.close();
            }
            this.s = true;
            this.t = this.h ? this.r.b(this) : -1;
            this.r.a(this, z);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: package-private */
    public Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f873a.size()) {
            n.a aVar = this.f873a.get(i);
            int i2 = aVar.f876a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f877b;
                    int i3 = fragment3.x;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.x == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f873a.add(i, new n.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                n.a aVar2 = new n.a(3, fragment4);
                                aVar2.f878c = aVar.f878c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.f873a.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f873a.remove(i);
                        i--;
                    } else {
                        aVar.f876a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.f877b);
                    Fragment fragment5 = aVar.f877b;
                    if (fragment5 == fragment2) {
                        this.f873a.add(i, new n.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f873a.add(i, new n.a(9, fragment2));
                        i++;
                        fragment2 = aVar.f877b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.f877b);
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.n
    public n a(Fragment fragment) {
        j jVar = fragment.s;
        if (jVar == null || jVar == this.r) {
            super.a(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        if (this.h) {
            if (j.I) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f873a.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a aVar = this.f873a.get(i2);
                Fragment fragment = aVar.f877b;
                if (fragment != null) {
                    fragment.r += i;
                    if (j.I) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f877b + " to " + aVar.f877b.r);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.n
    public void a(int i, Fragment fragment, String str, int i2) {
        super.a(i, fragment, str, i2);
        fragment.s = this.r;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment.f fVar) {
        for (int i = 0; i < this.f873a.size(); i++) {
            n.a aVar = this.f873a.get(i);
            if (b(aVar)) {
                aVar.f877b.a(fVar);
            }
        }
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (!(this.f874b == 0 && this.f875c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f874b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f875c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.j == 0 && this.k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (!this.f873a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f873a.size();
            for (int i = 0; i < size; i++) {
                n.a aVar = this.f873a.get(i);
                switch (aVar.f876a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f876a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f877b);
                if (z) {
                    if (!(aVar.f878c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f878c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f873a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f873a.get(i4).f877b;
            int i5 = fragment != null ? fragment.x : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f873a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f873a.get(i7).f877b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.I) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.h) {
            return true;
        }
        this.r.a(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public int b() {
        return a(true);
    }

    /* access modifiers changed from: package-private */
    public Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f873a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f873a.get(size);
            int i = aVar.f876a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f877b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.f877b);
            }
            arrayList.remove(aVar.f877b);
        }
        return fragment;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        for (int size = this.f873a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f873a.get(size);
            Fragment fragment = aVar.f877b;
            if (fragment != null) {
                fragment.a(j.e(this.f), this.g);
            }
            switch (aVar.f876a) {
                case 1:
                    fragment.b(aVar.f);
                    this.r.o(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f876a);
                case 3:
                    fragment.b(aVar.e);
                    this.r.a(fragment, false);
                    break;
                case 4:
                    fragment.b(aVar.e);
                    this.r.t(fragment);
                    break;
                case 5:
                    fragment.b(aVar.f);
                    this.r.h(fragment);
                    break;
                case 6:
                    fragment.b(aVar.e);
                    this.r.b(fragment);
                    break;
                case 7:
                    fragment.b(aVar.f);
                    this.r.d(fragment);
                    break;
                case 8:
                    this.r.s(null);
                    break;
                case 9:
                    this.r.s(fragment);
                    break;
                case 10:
                    this.r.a(fragment, aVar.g);
                    break;
            }
            if (!(this.p || aVar.f876a == 3 || fragment == null)) {
                this.r.l(fragment);
            }
        }
        if (!this.p && z) {
            j jVar = this.r;
            jVar.a(jVar.q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i) {
        int size = this.f873a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f873a.get(i2).f877b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int size = this.f873a.size();
        for (int i = 0; i < size; i++) {
            n.a aVar = this.f873a.get(i);
            Fragment fragment = aVar.f877b;
            if (fragment != null) {
                fragment.a(this.f, this.g);
            }
            switch (aVar.f876a) {
                case 1:
                    fragment.b(aVar.f878c);
                    this.r.a(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f876a);
                case 3:
                    fragment.b(aVar.d);
                    this.r.o(fragment);
                    break;
                case 4:
                    fragment.b(aVar.d);
                    this.r.h(fragment);
                    break;
                case 5:
                    fragment.b(aVar.f878c);
                    this.r.t(fragment);
                    break;
                case 6:
                    fragment.b(aVar.d);
                    this.r.d(fragment);
                    break;
                case 7:
                    fragment.b(aVar.f878c);
                    this.r.b(fragment);
                    break;
                case 8:
                    this.r.s(fragment);
                    break;
                case 9:
                    this.r.s(null);
                    break;
                case 10:
                    this.r.a(fragment, aVar.h);
                    break;
            }
            if (!(this.p || aVar.f876a == 1 || fragment == null)) {
                this.r.l(fragment);
            }
        }
        if (!this.p) {
            j jVar = this.r;
            jVar.a(jVar.q, true);
        }
    }

    public String d() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        for (int i = 0; i < this.f873a.size(); i++) {
            if (b(this.f873a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(" #");
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
