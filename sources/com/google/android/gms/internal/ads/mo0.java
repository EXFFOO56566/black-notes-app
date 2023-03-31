package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class mo0 implements r42<Set<ab0<l70>>> {

    /* renamed from: a  reason: collision with root package name */
    private final io0 f3737a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<so0> f3738b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f3739c;

    private mo0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f3737a = io0;
        this.f3738b = e52;
        this.f3739c = e522;
    }

    public static mo0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new mo0(io0, e52, e522);
    }

    public static Set<ab0<l70>> a(io0 io0, so0 so0, Executor executor) {
        Set<ab0<l70>> c2 = io0.c(so0, executor);
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f3737a, this.f3738b.get(), this.f3739c.get());
    }
}
