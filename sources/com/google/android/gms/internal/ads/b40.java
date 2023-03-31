package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class b40 implements r42<y30> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<d> f1858a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<hk> f1859b;

    private b40(e52<d> e52, e52<hk> e522) {
        this.f1858a = e52;
        this.f1859b = e522;
    }

    public static b40 a(e52<d> e52, e52<hk> e522) {
        return new b40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new y30(this.f1858a.get(), this.f1859b.get());
    }
}
