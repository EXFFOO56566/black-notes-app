package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class ho0 implements r42<Set<ab0<u50>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<so0> f2951a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2952b;

    private ho0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f2951a = e52;
        this.f2952b = e522;
    }

    public static ho0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new ho0(io0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<u50>> e = io0.e(this.f2951a.get(), this.f2952b.get());
        y42.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
