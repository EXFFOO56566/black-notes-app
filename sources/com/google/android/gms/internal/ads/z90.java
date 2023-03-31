package com.google.android.gms.internal.ads;

import java.util.Set;

public final class z90 implements r42<Set<ab0<b80>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f5719a;

    private z90(k90 k90) {
        this.f5719a = k90;
    }

    public static z90 a(k90 k90) {
        return new z90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<b80>> j = this.f5719a.j();
        y42.a(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }
}
