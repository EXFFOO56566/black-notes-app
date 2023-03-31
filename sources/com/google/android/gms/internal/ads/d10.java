package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class d10 implements r42<Set<ab0<fh2>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<f20> f2196a;

    public d10(r00 r00, e52<f20> e52) {
        this.f2196a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new ab0(this.f2196a.get(), jo.f));
        y42.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
