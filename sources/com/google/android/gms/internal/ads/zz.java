package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zz implements r42<Set<ab0<fh2>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<f20> f5823a;

    public zz(uz uzVar, e52<f20> e52) {
        this.f5823a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new ab0(this.f5823a.get(), jo.f));
        y42.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
