package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

public enum m32 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(dy1.f2334c),
    ENUM(null),
    MESSAGE(null);
    

    /* renamed from: b  reason: collision with root package name */
    private final Object f3655b;

    private m32(Object obj) {
        this.f3655b = obj;
    }
}
