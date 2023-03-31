package com.google.android.gms.internal.ads;

public final class ar2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f1806a;

    /* renamed from: b  reason: collision with root package name */
    public final m61 f1807b;

    /* renamed from: c  reason: collision with root package name */
    public final e3 f1808c;
    public boolean d;

    private ar2(e3 e3Var) {
        this.d = false;
        this.f1806a = null;
        this.f1807b = null;
        this.f1808c = e3Var;
    }

    private ar2(T t, m61 m61) {
        this.d = false;
        this.f1806a = t;
        this.f1807b = m61;
        this.f1808c = null;
    }

    public static <T> ar2<T> a(e3 e3Var) {
        return new ar2<>(e3Var);
    }

    public static <T> ar2<T> a(T t, m61 m61) {
        return new ar2<>(t, m61);
    }
}
