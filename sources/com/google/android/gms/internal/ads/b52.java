package com.google.android.gms.internal.ads;

public final class b52<T> implements e52<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1866c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile e52<T> f1867a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f1868b = f1866c;

    private b52(e52<T> e52) {
        this.f1867a = e52;
    }

    public static <P extends e52<T>, T> e52<T> a(P p) {
        if ((p instanceof b52) || (p instanceof t42)) {
            return p;
        }
        y42.a(p);
        return new b52(p);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final T get() {
        T t = (T) this.f1868b;
        if (t != f1866c) {
            return t;
        }
        e52<T> e52 = this.f1867a;
        if (e52 == null) {
            return (T) this.f1868b;
        }
        T t2 = e52.get();
        this.f1868b = t2;
        this.f1867a = null;
        return t2;
    }
}
