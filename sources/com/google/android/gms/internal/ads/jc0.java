package com.google.android.gms.internal.ads;

import java.util.Set;

public final class jc0 implements r42<Set<ab0<u50>>> {

    /* renamed from: a  reason: collision with root package name */
    private final fc0 f3202a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<nd0> f3203b;

    private jc0(fc0 fc0, e52<nd0> e52) {
        this.f3202a = fc0;
        this.f3203b = e52;
    }

    public static jc0 a(fc0 fc0, e52<nd0> e52) {
        return new jc0(fc0, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<u50>> a2 = this.f3202a.a(this.f3203b.get());
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
