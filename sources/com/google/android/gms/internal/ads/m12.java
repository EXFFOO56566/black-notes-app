package com.google.android.gms.internal.ads;

final class m12 {

    /* renamed from: a  reason: collision with root package name */
    private static final k12 f3645a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final k12 f3646b = new j12();

    static k12 a() {
        return f3645a;
    }

    static k12 b() {
        return f3646b;
    }

    private static k12 c() {
        try {
            return (k12) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
