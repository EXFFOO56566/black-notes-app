package com.google.android.gms.internal.ads;

final class hz1 {

    /* renamed from: a  reason: collision with root package name */
    private static final fz1<?> f2999a = new ez1();

    /* renamed from: b  reason: collision with root package name */
    private static final fz1<?> f3000b = a();

    private static fz1<?> a() {
        try {
            return (fz1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static fz1<?> b() {
        return f2999a;
    }

    static fz1<?> c() {
        fz1<?> fz1 = f3000b;
        if (fz1 != null) {
            return fz1;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
