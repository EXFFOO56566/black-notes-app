package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.Collections;
import java.util.Set;

public final class p90 implements r42<Set<ab0<o>>> {
    private p90(k90 k90) {
    }

    public static p90 a(k90 k90) {
        return new p90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        y42.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
