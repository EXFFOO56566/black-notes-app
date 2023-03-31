package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class k60 implements r42<c60> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<g60> f3329a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Set<ab0<z50>>> f3330b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f3331c;

    private k60(e52<g60> e52, e52<Set<ab0<z50>>> e522, e52<Executor> e523) {
        this.f3329a = e52;
        this.f3330b = e522;
        this.f3331c = e523;
    }

    public static k60 a(e52<g60> e52, e52<Set<ab0<z50>>> e522, e52<Executor> e523) {
        return new k60(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new c60(this.f3329a.get(), this.f3330b.get(), this.f3331c.get());
    }
}
