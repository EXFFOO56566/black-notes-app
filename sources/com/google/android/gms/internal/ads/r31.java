package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class r31 implements r42<q31<b71>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<e71> f4438a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<d> f4439b;

    public r31(e52<e71> e52, e52<d> e522) {
        this.f4438a = e52;
        this.f4439b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        q31 q31 = new q31(this.f4438a.get(), i0.f3004a.a().longValue(), this.f4439b.get());
        y42.a(q31, "Cannot return null from a non-@Nullable @Provides method");
        return q31;
    }
}
