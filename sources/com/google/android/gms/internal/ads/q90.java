package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class q90 implements r42<Set<ab0<l70>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f4294a;

    private q90(k90 k90) {
        this.f4294a = k90;
    }

    public static q90 a(k90 k90) {
        return new q90(k90);
    }

    public static Set<ab0<l70>> b(k90 k90) {
        Set<ab0<l70>> emptySet = Collections.emptySet();
        y42.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f4294a);
    }
}
