package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class jo0 implements r42<Set<ab0<q60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<so0> f3259a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3260b;

    private jo0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f3259a = e52;
        this.f3260b = e522;
    }

    public static jo0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new jo0(io0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<q60>> a2 = io0.a(this.f3259a.get(), this.f3260b.get());
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
