package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class qo0 implements r42<Set<ab0<n60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<so0> f4365a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4366b;

    private qo0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f4365a = e52;
        this.f4366b = e522;
    }

    public static qo0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new qo0(io0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<n60>> f = io0.f(this.f4365a.get(), this.f4366b.get());
        y42.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
