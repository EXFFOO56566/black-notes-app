package com.google.android.gms.internal.ads;

import java.util.Set;

public final class v50 implements r42<t50> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<jm2>>> f5053a;

    private v50(e52<Set<ab0<jm2>>> e52) {
        this.f5053a = e52;
    }

    public static v50 a(e52<Set<ab0<jm2>>> e52) {
        return new v50(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new t50(this.f5053a.get());
    }
}
