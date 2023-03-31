package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.o f1093a;

    /* renamed from: b  reason: collision with root package name */
    private int f1094b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f1095c;

    /* access modifiers changed from: package-private */
    public static class a extends m {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.m
        public int a() {
            return this.f1093a.r();
        }

        @Override // androidx.recyclerview.widget.m
        public int a(View view) {
            return this.f1093a.i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public void a(int i) {
            this.f1093a.e(i);
        }

        @Override // androidx.recyclerview.widget.m
        public int b() {
            return this.f1093a.r() - this.f1093a.p();
        }

        @Override // androidx.recyclerview.widget.m
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1093a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int c() {
            return this.f1093a.p();
        }

        @Override // androidx.recyclerview.widget.m
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1093a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int d() {
            return this.f1093a.s();
        }

        @Override // androidx.recyclerview.widget.m
        public int d(View view) {
            return this.f1093a.f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int e() {
            return this.f1093a.i();
        }

        @Override // androidx.recyclerview.widget.m
        public int e(View view) {
            this.f1093a.a(view, true, this.f1095c);
            return this.f1095c.right;
        }

        @Override // androidx.recyclerview.widget.m
        public int f() {
            return this.f1093a.o();
        }

        @Override // androidx.recyclerview.widget.m
        public int f(View view) {
            this.f1093a.a(view, true, this.f1095c);
            return this.f1095c.left;
        }

        @Override // androidx.recyclerview.widget.m
        public int g() {
            return (this.f1093a.r() - this.f1093a.o()) - this.f1093a.p();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends m {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.m
        public int a() {
            return this.f1093a.h();
        }

        @Override // androidx.recyclerview.widget.m
        public int a(View view) {
            return this.f1093a.e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public void a(int i) {
            this.f1093a.f(i);
        }

        @Override // androidx.recyclerview.widget.m
        public int b() {
            return this.f1093a.h() - this.f1093a.n();
        }

        @Override // androidx.recyclerview.widget.m
        public int b(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1093a.g(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int c() {
            return this.f1093a.n();
        }

        @Override // androidx.recyclerview.widget.m
        public int c(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f1093a.h(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int d() {
            return this.f1093a.i();
        }

        @Override // androidx.recyclerview.widget.m
        public int d(View view) {
            return this.f1093a.j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.m
        public int e() {
            return this.f1093a.s();
        }

        @Override // androidx.recyclerview.widget.m
        public int e(View view) {
            this.f1093a.a(view, true, this.f1095c);
            return this.f1095c.bottom;
        }

        @Override // androidx.recyclerview.widget.m
        public int f() {
            return this.f1093a.q();
        }

        @Override // androidx.recyclerview.widget.m
        public int f(View view) {
            this.f1093a.a(view, true, this.f1095c);
            return this.f1095c.top;
        }

        @Override // androidx.recyclerview.widget.m
        public int g() {
            return (this.f1093a.h() - this.f1093a.q()) - this.f1093a.n();
        }
    }

    private m(RecyclerView.o oVar) {
        this.f1094b = RecyclerView.UNDEFINED_DURATION;
        this.f1095c = new Rect();
        this.f1093a = oVar;
    }

    /* synthetic */ m(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static m a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static m a(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return a(oVar);
        }
        if (i == 1) {
            return b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static m b(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.f1094b) {
            return 0;
        }
        return g() - this.f1094b;
    }

    public void i() {
        this.f1094b = g();
    }
}
