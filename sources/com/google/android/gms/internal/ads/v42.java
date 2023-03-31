package com.google.android.gms.internal.ads;

public final class v42<T> implements l42<T>, r42<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final v42<Object> f5051b = new v42<>(null);

    /* renamed from: a  reason: collision with root package name */
    private final T f5052a;

    private v42(T t) {
        this.f5052a = t;
    }

    public static <T> r42<T> a(T t) {
        y42.a(t, "instance cannot be null");
        return new v42(t);
    }

    public static <T> r42<T> b(T t) {
        return t == null ? f5051b : new v42(t);
    }

    @Override // com.google.android.gms.internal.ads.e52, com.google.android.gms.internal.ads.l42
    public final T get() {
        return this.f5052a;
    }
}
