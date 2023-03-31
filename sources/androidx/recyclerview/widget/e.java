package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class e implements Runnable {
    static final ThreadLocal<e> f = new ThreadLocal<>();
    static Comparator<c> g = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<RecyclerView> f1063b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    long f1064c;
    long d;
    private ArrayList<c> e = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.d == null) != (cVar2.d == null)) {
                return cVar.d == null ? 1 : -1;
            }
            boolean z = cVar.f1068a;
            if (z != cVar2.f1068a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f1069b - cVar.f1069b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f1070c - cVar2.f1070c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        int f1065a;

        /* renamed from: b  reason: collision with root package name */
        int f1066b;

        /* renamed from: c  reason: collision with root package name */
        int[] f1067c;
        int d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f1067c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.f1067c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1067c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f1067c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1067c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.f1067c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.w()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.c()) {
                        oVar.a(recyclerView.mAdapter.a(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.a(this.f1065a, this.f1066b, recyclerView.mState, this);
                }
                int i = this.d;
                if (i > oVar.m) {
                    oVar.m = i;
                    oVar.n = z;
                    recyclerView.mRecycler.j();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i) {
            if (this.f1067c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f1067c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b(int i, int i2) {
            this.f1065a = i;
            this.f1066b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1068a;

        /* renamed from: b  reason: collision with root package name */
        public int f1069b;

        /* renamed from: c  reason: collision with root package name */
        public int f1070c;
        public RecyclerView d;
        public int e;

        c() {
        }

        public void a() {
            this.f1068a = false;
            this.f1069b = 0;
            this.f1070c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    e() {
    }

    private RecyclerView.d0 a(RecyclerView recyclerView, int i, long j) {
        if (a(recyclerView, i)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 a2 = vVar.a(i, false, j);
            if (a2 != null) {
                if (!a2.p() || a2.q()) {
                    vVar.a(a2, false);
                } else {
                    vVar.b(a2.f966b);
                }
            }
            return a2;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    private void a() {
        c cVar;
        int size = this.f1063b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f1063b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.d;
            }
        }
        this.e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f1063b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f1065a) + Math.abs(bVar.f1066b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.e.size()) {
                        cVar = new c();
                        this.e.add(cVar);
                    } else {
                        cVar = this.e.get(i3);
                    }
                    int i6 = bVar.f1067c[i5 + 1];
                    cVar.f1068a = i6 <= abs;
                    cVar.f1069b = abs;
                    cVar.f1070c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = bVar.f1067c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.e, g);
    }

    private void a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.b() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            b bVar = recyclerView.mPrefetchRegistry;
            bVar.a(recyclerView, true);
            if (bVar.d != 0) {
                try {
                    a.g.h.c.a("RV Nested Prefetch");
                    recyclerView.mState.a(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.d * 2; i += 2) {
                        a(recyclerView, bVar.f1067c[i], j);
                    }
                } finally {
                    a.g.h.c.a();
                }
            }
        }
    }

    private void a(c cVar, long j) {
        RecyclerView.d0 a2 = a(cVar.d, cVar.e, cVar.f1068a ? Long.MAX_VALUE : j);
        if (a2 != null && a2.f967c != null && a2.p() && !a2.q()) {
            a(a2.f967c.get(), j);
        }
    }

    static boolean a(RecyclerView recyclerView, int i) {
        int b2 = recyclerView.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.d(i2));
            if (childViewHolderInt.d == i && !childViewHolderInt.q()) {
                return true;
            }
        }
        return false;
    }

    private void b(long j) {
        for (int i = 0; i < this.e.size(); i++) {
            c cVar = this.e.get(i);
            if (cVar.d != null) {
                a(cVar, j);
                cVar.a();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        a();
        b(j);
    }

    public void a(RecyclerView recyclerView) {
        this.f1063b.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f1064c == 0) {
            this.f1064c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.b(i, i2);
    }

    public void b(RecyclerView recyclerView) {
        this.f1063b.remove(recyclerView);
    }

    public void run() {
        try {
            a.g.h.c.a("RV Prefetch");
            if (!this.f1063b.isEmpty()) {
                int size = this.f1063b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f1063b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    a(TimeUnit.MILLISECONDS.toNanos(j) + this.d);
                    this.f1064c = 0;
                    a.g.h.c.a();
                }
            }
        } finally {
            this.f1064c = 0;
            a.g.h.c.a();
        }
    }
}
