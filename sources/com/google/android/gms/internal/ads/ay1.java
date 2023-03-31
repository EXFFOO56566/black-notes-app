package com.google.android.gms.internal.ads;

final class ay1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f1832a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1833b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a() {
        return f1832a != null && !f1833b;
    }

    static Class<?> b() {
        return f1832a;
    }
}
