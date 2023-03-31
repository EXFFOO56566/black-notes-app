package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class q extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f1096a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f1097b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.t f1098c = new a();

    class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        boolean f1099a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.f1099a) {
                this.f1099a = false;
                q.this.a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f1099a = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends j {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.j
        public float a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.z
        public void a(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            q qVar = q.this;
            RecyclerView recyclerView = qVar.f1096a;
            if (recyclerView != null) {
                int[] a2 = qVar.a(recyclerView.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int d = d(Math.max(Math.abs(i), Math.abs(i2)));
                if (d > 0) {
                    aVar.a(i, i2, d, this.j);
                }
            }
        }
    }

    private void b() {
        this.f1096a.removeOnScrollListener(this.f1098c);
        this.f1096a.setOnFlingListener(null);
    }

    private boolean b(RecyclerView.o oVar, int i, int i2) {
        RecyclerView.z a2;
        int a3;
        if (!(oVar instanceof RecyclerView.z.b) || (a2 = a(oVar)) == null || (a3 = a(oVar, i, i2)) == -1) {
            return false;
        }
        a2.c(a3);
        oVar.b(a2);
        return true;
    }

    private void c() {
        if (this.f1096a.getOnFlingListener() == null) {
            this.f1096a.addOnScrollListener(this.f1098c);
            this.f1096a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public abstract int a(RecyclerView.o oVar, int i, int i2);

    /* access modifiers changed from: protected */
    public RecyclerView.z a(RecyclerView.o oVar) {
        return b(oVar);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        RecyclerView.o layoutManager;
        View c2;
        RecyclerView recyclerView = this.f1096a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (c2 = c(layoutManager)) != null) {
            int[] a2 = a(layoutManager, c2);
            if (a2[0] != 0 || a2[1] != 0) {
                this.f1096a.smoothScrollBy(a2[0], a2[1]);
            }
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1096a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                b();
            }
            this.f1096a = recyclerView;
            if (recyclerView != null) {
                c();
                this.f1097b = new Scroller(this.f1096a.getContext(), new DecelerateInterpolator());
                a();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i, int i2) {
        RecyclerView.o layoutManager = this.f1096a.getLayoutManager();
        if (layoutManager == null || this.f1096a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f1096a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && b(layoutManager, i, i2);
    }

    public abstract int[] a(RecyclerView.o oVar, View view);

    /* access modifiers changed from: protected */
    @Deprecated
    public j b(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.f1096a.getContext());
    }

    public int[] b(int i, int i2) {
        this.f1097b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f1097b.getFinalX(), this.f1097b.getFinalY()};
    }

    public abstract View c(RecyclerView.o oVar);
}
