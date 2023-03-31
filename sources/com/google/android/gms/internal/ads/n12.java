package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class n12 {

    /* renamed from: c  reason: collision with root package name */
    private static final n12 f3784c = new n12();

    /* renamed from: a  reason: collision with root package name */
    private final y12 f3785a = new p02();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, z12<?>> f3786b = new ConcurrentHashMap();

    private n12() {
    }

    public static n12 a() {
        return f3784c;
    }

    public final <T> z12<T> a(Class<T> cls) {
        uz1.a((Object) cls, "messageType");
        z12<T> z12 = (z12<T>) this.f3786b.get(cls);
        if (z12 != null) {
            return z12;
        }
        z12<T> a2 = this.f3785a.a(cls);
        uz1.a((Object) cls, "messageType");
        uz1.a((Object) a2, "schema");
        z12<T> z122 = (z12<T>) this.f3786b.putIfAbsent(cls, a2);
        return z122 != null ? z122 : a2;
    }

    public final <T> z12<T> a(T t) {
        return a((Class) t.getClass());
    }
}
