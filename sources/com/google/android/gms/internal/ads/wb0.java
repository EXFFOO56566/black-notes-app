package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p;
import java.util.Set;

public final class wb0 implements r42<qb0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<p.a>>> f5240a;

    private wb0(e52<Set<ab0<p.a>>> e52) {
        this.f5240a = e52;
    }

    public static wb0 a(e52<Set<ab0<p.a>>> e52) {
        return new wb0(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new qb0(this.f5240a.get());
    }
}
