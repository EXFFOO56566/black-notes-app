package com.google.android.gms.internal.ads;

import java.util.Set;

public final class t90 implements r42<Set<ab0<j60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f4769a;

    private t90(k90 k90) {
        this.f4769a = k90;
    }

    public static t90 a(k90 k90) {
        return new t90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<j60>> d = this.f4769a.d();
        y42.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
