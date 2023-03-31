package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

public enum d02 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, BuildConfig.FLAVOR),
    BYTE_STRING(dy1.class, dy1.class, dy1.f2334c),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f2194b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2195c;

    private d02(Class cls, Class cls2, Object obj) {
        this.f2194b = cls2;
        this.f2195c = obj;
    }

    public final Class<?> b() {
        return this.f2194b;
    }
}
