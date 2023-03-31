package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class z30 implements r42<hk> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<d> f5689a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<tk> f5690b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f5691c;

    private z30(e52<d> e52, e52<tk> e522, e52<zd1> e523) {
        this.f5689a = e52;
        this.f5690b = e522;
        this.f5691c = e523;
    }

    public static z30 a(e52<d> e52, e52<tk> e522, e52<zd1> e523) {
        return new z30(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        hk a2 = this.f5690b.get().a(this.f5689a.get(), this.f5691c.get().f);
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
