package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<b1> f2514a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f2515b = new AtomicBoolean();

    static b1 a() {
        return f2514a.get();
    }

    public static void a(b1 b1Var) {
        f2514a.set(b1Var);
    }
}
