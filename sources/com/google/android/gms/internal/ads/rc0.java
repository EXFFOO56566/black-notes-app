package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class rc0 implements r42<Set<ab0<ta0>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<pd0> f4477a;

    private rc0(e52<pd0> e52) {
        this.f4477a = e52;
    }

    public static rc0 a(e52<pd0> e52) {
        return new rc0(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(ab0.a(this.f4477a.get(), jo.f));
        y42.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
