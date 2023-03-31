package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class c10 implements r42<Set<ab0<l70>>> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f2040a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<f20> f2041b;

    public c10(r00 r00, e52<f20> e52) {
        this.f2040a = r00;
        this.f2041b = e52;
    }

    public static Set<ab0<l70>> a(r00 r00, f20 f20) {
        Set<ab0<l70>> singleton = Collections.singleton(new ab0(f20, jo.f));
        y42.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2040a, this.f2041b.get());
    }
}
