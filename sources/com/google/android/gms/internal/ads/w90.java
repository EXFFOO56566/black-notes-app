package com.google.android.gms.internal.ads;

import java.util.Set;

public final class w90 implements r42<Set<ab0<n60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f5231a;

    private w90(k90 k90) {
        this.f5231a = k90;
    }

    public static w90 a(k90 k90) {
        return new w90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<n60>> h = this.f5231a.h();
        y42.a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
