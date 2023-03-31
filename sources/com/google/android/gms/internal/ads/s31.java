package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class s31 implements r42<q31<g31>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<k31> f4593a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<d> f4594b;

    public s31(e52<k31> e52, e52<d> e522) {
        this.f4593a = e52;
        this.f4594b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        q31 q31 = new q31(this.f4593a.get(), 10000, this.f4594b.get());
        y42.a(q31, "Cannot return null from a non-@Nullable @Provides method");
        return q31;
    }
}
