package com.google.android.gms.internal.ads;

import java.util.Set;

public final class xa0 implements r42<wa0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<ta0>>> f5395a;

    private xa0(e52<Set<ab0<ta0>>> e52) {
        this.f5395a = e52;
    }

    public static xa0 a(e52<Set<ab0<ta0>>> e52) {
        return new xa0(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new wa0(this.f5395a.get());
    }
}
