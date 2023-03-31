package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.r.a;
import java.util.Set;
import java.util.concurrent.Executor;

public final class oo0 implements r42<Set<ab0<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<so0> f4025a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4026b;

    private oo0(io0 io0, e52<so0> e52, e52<Executor> e522) {
        this.f4025a = e52;
        this.f4026b = e522;
    }

    public static oo0 a(io0 io0, e52<so0> e52, e52<Executor> e522) {
        return new oo0(io0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<a>> b2 = io0.b(this.f4025a.get(), this.f4026b.get());
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
