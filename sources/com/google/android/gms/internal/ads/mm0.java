package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class mm0 implements r42<Set<ab0<zh1>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f3728a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<dn0> f3729b;

    private mm0(e52<Executor> e52, e52<dn0> e522) {
        this.f3728a = e52;
        this.f3729b = e522;
    }

    public static mm0 a(e52<Executor> e52, e52<dn0> e522) {
        return new mm0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Executor executor = this.f3728a.get();
        Set singleton = ((Boolean) on2.e().a(zr2.g2)).booleanValue() ? Collections.singleton(new ab0(this.f3729b.get(), executor)) : Collections.emptySet();
        y42.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
