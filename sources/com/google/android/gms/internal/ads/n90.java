package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class n90 implements r42<Set<ab0<q60>>> {
    private n90(k90 k90) {
    }

    public static n90 a(k90 k90) {
        return new n90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        y42.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
