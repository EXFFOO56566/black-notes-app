package androidx.recyclerview.widget;

import a.g.l.d0.c;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager {
    boolean I = false;
    int J = -1;
    int[] K;
    View[] L;
    final SparseIntArray M = new SparseIntArray();
    final SparseIntArray N = new SparseIntArray();
    c O = new a();
    final Rect P = new Rect();
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int a(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int d(int i, int i2) {
            return i % i2;
        }
    }

    public static class b extends RecyclerView.p {
        int e = -1;
        int f = 0;

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f944a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f945b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f946c = false;
        private boolean d = false;

        static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public abstract int a(int i);

        /* access modifiers changed from: package-private */
        public int a(int i, int i2) {
            if (!this.d) {
                return c(i, i2);
            }
            int i3 = this.f945b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c2 = c(i, i2);
            this.f945b.put(i, c2);
            return c2;
        }

        public void a() {
            this.f945b.clear();
        }

        /* access modifiers changed from: package-private */
        public int b(int i, int i2) {
            if (!this.f946c) {
                return d(i, i2);
            }
            int i3 = this.f944a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d2 = d(i, i2);
            this.f944a.put(i, d2);
            return d2;
        }

        public void b() {
            this.f944a.clear();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f945b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f945b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.b(r0, r8)
                int r0 = r6.a(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.a(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.a(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.c(int, int):int");
        }

        public abstract int d(int i, int i2);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        l(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        l(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        l(RecyclerView.o.a(context, attributeSet, i, i2).f984b);
    }

    private void N() {
        int e = e();
        for (int i = 0; i < e; i++) {
            b bVar = (b) d(i).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    private void O() {
        this.M.clear();
        this.N.clear();
    }

    private void P() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private void Q() {
        int i;
        int i2;
        if (I() == 1) {
            i2 = r() - p();
            i = o();
        } else {
            i2 = h() - n();
            i = q();
        }
        m(i2 - i);
    }

    private int a(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.d()) {
            return this.O.a(i, this.J);
        }
        int a2 = vVar.a(i);
        if (a2 != -1) {
            return this.O.a(a2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private void a(float f, int i) {
        m(Math.max(Math.round(f * ((float) this.J)), i));
    }

    private void a(View view, int i, int i2, boolean z) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? b(view, i, i2, pVar) : a(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    private void a(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f987b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int g = g(bVar.e, bVar.f);
        if (this.s == 1) {
            i2 = RecyclerView.o.a(g, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.o.a(this.u.g(), i(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int a2 = RecyclerView.o.a(g, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int a3 = RecyclerView.o.a(this.u.g(), s(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = a2;
            i2 = a3;
        }
        a(view, i2, i3, z);
    }

    private void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.L[i3];
            b bVar = (b) view.getLayoutParams();
            int c2 = c(vVar, a0Var, l(view));
            bVar.f = c2;
            bVar.e = i4;
            i4 += c2;
            i3 += i2;
        }
    }

    static int[] a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private int b(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.d()) {
            return this.O.b(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = vVar.a(i);
        if (a2 != -1) {
            return this.O.b(a2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int b2 = b(vVar, a0Var, aVar.f948b);
        if (z) {
            while (b2 > 0) {
                int i2 = aVar.f948b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f948b = i3;
                    b2 = b(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int a2 = a0Var.a() - 1;
        int i4 = aVar.f948b;
        while (i4 < a2) {
            int i5 = i4 + 1;
            int b3 = b(vVar, a0Var, i5);
            if (b3 <= b2) {
                break;
            }
            i4 = i5;
            b2 = b3;
        }
        aVar.f948b = i4;
    }

    private int c(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.d()) {
            return this.O.a(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = vVar.a(i);
        if (a2 != -1) {
            return this.O.a(a2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    private int i(RecyclerView.a0 a0Var) {
        if (!(e() == 0 || a0Var.a() == 0)) {
            F();
            boolean K2 = K();
            View b2 = b(!K2, true);
            View a2 = a(!K2, true);
            if (!(b2 == null || a2 == null)) {
                int a3 = this.O.a(l(b2), this.J);
                int a4 = this.O.a(l(a2), this.J);
                int min = Math.min(a3, a4);
                int max = this.x ? Math.max(0, ((this.O.a(a0Var.a() - 1, this.J) + 1) - Math.max(a3, a4)) - 1) : Math.max(0, min);
                if (!K2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.u.a(a2) - this.u.d(b2))) / ((float) ((this.O.a(l(a2), this.J) - this.O.a(l(b2), this.J)) + 1)))) + ((float) (this.u.f() - this.u.d(b2))));
            }
        }
        return 0;
    }

    private int j(RecyclerView.a0 a0Var) {
        if (!(e() == 0 || a0Var.a() == 0)) {
            F();
            View b2 = b(!K(), true);
            View a2 = a(!K(), true);
            if (!(b2 == null || a2 == null)) {
                if (!K()) {
                    return this.O.a(a0Var.a() - 1, this.J) + 1;
                }
                int a3 = this.u.a(a2) - this.u.d(b2);
                int a4 = this.O.a(l(b2), this.J);
                return (int) ((((float) a3) / ((float) ((this.O.a(l(a2), this.J) - a4) + 1))) * ((float) (this.O.a(a0Var.a() - 1, this.J) + 1)));
            }
        }
        return 0;
    }

    private void m(int i) {
        this.K = a(this.K, this.J, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public boolean D() {
        return this.D == null && !this.I;
    }

    public int M() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int a(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Q();
        P();
        return super.a(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (a0Var.a() < 1) {
            return 0;
        }
        return a(vVar, a0Var, a0Var.a() - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View a(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        F();
        int f = this.u.f();
        int b2 = this.u.b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = d(i);
            int l = l(d);
            if (l >= 0 && l < i3 && b(vVar, a0Var, l) == 0) {
                if (((RecyclerView.p) d.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.u.d(d) < b2 && this.u.a(d) >= f) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.K == null) {
            super.a(rect, i, i2);
        }
        int o = o() + p();
        int q = q() + n();
        if (this.s == 1) {
            i4 = RecyclerView.o.a(i2, rect.height() + q, l());
            int[] iArr = this.K;
            i3 = RecyclerView.o.a(i, iArr[iArr.length - 1] + o, m());
        } else {
            i3 = RecyclerView.o.a(i, rect.width() + o, m());
            int[] iArr2 = this.K;
            i4 = RecyclerView.o.a(i2, iArr2[iArr2.length - 1] + q, l());
        }
        c(i3, i4);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && cVar.a(a0Var) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.O.a(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, a.g.l.d0.c cVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.a(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int a2 = a(vVar, a0Var, bVar.a());
        if (this.s == 0) {
            i4 = bVar.e();
            i3 = bVar.f();
            i = 1;
            z2 = false;
            z = false;
            i2 = a2;
        } else {
            i3 = 1;
            i2 = bVar.e();
            i = bVar.f();
            z2 = false;
            z = false;
            i4 = a2;
        }
        cVar.b(c.C0019c.a(i4, i3, i2, i, z2, z));
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        super.a(vVar, a0Var, aVar, i);
        Q();
        if (a0Var.a() > 0 && !a0Var.d()) {
            b(vVar, a0Var, aVar, i);
        }
        P();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int b(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Q();
        P();
        return super.b(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int b(RecyclerView.a0 a0Var) {
        return this.Q ? i(a0Var) : super.b(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (a0Var.a() < 1) {
            return 0;
        }
        return a(vVar, a0Var, a0Var.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, int i, int i2) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void b(boolean z) {
        if (!z) {
            super.b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int c(RecyclerView.a0 a0Var) {
        return this.Q ? j(a0Var) : super.c(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.p c() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d(RecyclerView recyclerView) {
        this.O.b();
        this.O.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int e(RecyclerView.a0 a0Var) {
        return this.Q ? i(a0Var) : super.e(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void e(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            N();
        }
        super.e(vVar, a0Var);
        O();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public int f(RecyclerView.a0 a0Var) {
        return this.Q ? j(a0Var) : super.f(a0Var);
    }

    /* access modifiers changed from: package-private */
    public int g(int i, int i2) {
        if (this.s != 1 || !J()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, androidx.recyclerview.widget.LinearLayoutManager
    public void g(RecyclerView.a0 a0Var) {
        super.g(a0Var);
        this.I = false;
    }

    public void l(int i) {
        if (i != this.J) {
            this.I = true;
            if (i >= 1) {
                this.J = i;
                this.O.b();
                z();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }
}
