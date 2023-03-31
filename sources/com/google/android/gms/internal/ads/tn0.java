package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class tn0 {

    /* renamed from: a  reason: collision with root package name */
    private final zn0 f4834a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4835b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f4836c;

    public tn0(zn0 zn0, Executor executor) {
        this.f4834a = zn0;
        this.f4836c = zn0.a();
        this.f4835b = executor;
    }

    public final sn0 a() {
        sn0 sn0 = new sn0(this);
        sn0.a(sn0);
        return sn0;
    }
}
