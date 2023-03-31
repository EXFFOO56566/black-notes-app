package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class ko0 implements r42<Set<ab0<a60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<so0> f3424a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3425b;

    private ko0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f3424a = e52;
        this.f3425b = e522;
    }

    public static ko0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new ko0(io0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<a60>> d = io0.d(this.f3424a.get(), this.f3425b.get());
        y42.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
