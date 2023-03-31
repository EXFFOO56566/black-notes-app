package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p;
import java.util.Collections;
import java.util.Set;

public final class oa0 implements r42<Set<ab0<p.a>>> {
    private oa0(k90 k90) {
    }

    public static oa0 a(k90 k90) {
        return new oa0(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        y42.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
