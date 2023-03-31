package com.google.android.gms.internal.ads;

import java.util.Set;

public final class v90 implements r42<Set<ab0<u50>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f5069a;

    private v90(k90 k90) {
        this.f5069a = k90;
    }

    public static v90 a(k90 k90) {
        return new v90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<u50>> a2 = this.f5069a.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
