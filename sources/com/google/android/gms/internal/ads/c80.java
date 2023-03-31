package com.google.android.gms.internal.ads;

import java.util.Set;

public final class c80 implements r42<a80> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<b80>>> f2076a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<id1> f2077b;

    private c80(e52<Set<ab0<b80>>> e52, e52<id1> e522) {
        this.f2076a = e52;
        this.f2077b = e522;
    }

    public static c80 a(e52<Set<ab0<b80>>> e52, e52<id1> e522) {
        return new c80(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new a80(this.f2076a.get(), this.f2077b.get());
    }
}
