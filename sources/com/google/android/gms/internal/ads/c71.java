package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class c71<T> implements r42<x61<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f2074a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Set<y61<? extends v61<T>>>> f2075b;

    private c71(e52<Executor> e52, e52<Set<y61<? extends v61<T>>>> e522) {
        this.f2074a = e52;
        this.f2075b = e522;
    }

    public static <T> c71<T> a(e52<Executor> e52, e52<Set<y61<? extends v61<T>>>> e522) {
        return new c71<>(e52, e522);
    }

    public static <T> x61<T> a(Executor executor, Set<y61<? extends v61<T>>> set) {
        return new x61<>(executor, set);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2074a.get(), this.f2075b.get());
    }
}
