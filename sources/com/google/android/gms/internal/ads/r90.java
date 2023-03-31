package com.google.android.gms.internal.ads;

import java.util.Set;

public final class r90 implements r42<Set<ab0<jm2>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f4465a;

    private r90(k90 k90) {
        this.f4465a = k90;
    }

    public static r90 a(k90 k90) {
        return new r90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<jm2>> g = this.f4465a.g();
        y42.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
