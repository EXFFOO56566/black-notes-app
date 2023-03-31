package com.google.android.gms.internal.ads;

public final class v9 {

    /* renamed from: a  reason: collision with root package name */
    private f8 f5067a;

    /* renamed from: b  reason: collision with root package name */
    private lo1<e9> f5068b;

    v9(f8 f8Var) {
        this.f5067a = f8Var;
    }

    private final void a() {
        if (this.f5068b == null) {
            ro roVar = new ro();
            this.f5068b = roVar;
            this.f5067a.b((eq1) null).a(new y9(roVar), new x9(roVar));
        }
    }

    public final <I, O> da<I, O> a(String str, j9<I> j9Var, k9<O> k9Var) {
        a();
        return new da<>(this.f5068b, str, j9Var, k9Var);
    }

    public final void a(String str, d5<? super e9> d5Var) {
        a();
        this.f5068b = yn1.a(this.f5068b, new aa(str, d5Var), jo.f);
    }

    public final void b(String str, d5<? super e9> d5Var) {
        this.f5068b = yn1.a(this.f5068b, new z9(str, d5Var), jo.f);
    }
}
