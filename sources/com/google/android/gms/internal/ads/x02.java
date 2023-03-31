package com.google.android.gms.internal.ads;

final class x02 {

    /* renamed from: a  reason: collision with root package name */
    private static final v02 f5344a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final v02 f5345b = new y02();

    static v02 a() {
        return f5344a;
    }

    static v02 b() {
        return f5345b;
    }

    private static v02 c() {
        try {
            return (v02) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
