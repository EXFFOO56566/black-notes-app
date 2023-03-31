package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class po0 implements r42<Set<ab0<zh1>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<so0> f4210a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4211b;

    private po0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f4210a = e52;
        this.f4211b = e522;
    }

    public static po0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new po0(io0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<zh1>> h = io0.h(this.f4210a.get(), this.f4211b.get());
        y42.a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
