package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class no0 implements r42<Set<ab0<jm2>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<so0> f3874a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3875b;

    private no0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f3874a = e52;
        this.f3875b = e522;
    }

    public static no0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new no0(io0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<jm2>> g = io0.g(this.f3874a.get(), this.f3875b.get());
        y42.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
