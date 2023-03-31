package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class c60 extends j90<z50> implements z50 {
    public c60(g60 g60, Set<ab0<z50>> set, Executor executor) {
        super(set);
        a(g60, executor);
    }

    @Override // com.google.android.gms.internal.ads.z50
    public final void O() {
        a(d60.f2214a);
    }

    @Override // com.google.android.gms.internal.ads.z50
    public final void a(int i, String str) {
        a(new b60(i, str));
    }

    @Override // com.google.android.gms.internal.ads.z50
    public final void a(hd0 hd0) {
        a(new e60(hd0));
    }
}
