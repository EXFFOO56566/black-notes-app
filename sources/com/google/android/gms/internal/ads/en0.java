package com.google.android.gms.internal.ads;

import java.util.Map;

public final class en0 implements r42<dn0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<wj2> f2452a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Map<ph1, fn0>> f2453b;

    private en0(e52<wj2> e52, e52<Map<ph1, fn0>> e522) {
        this.f2452a = e52;
        this.f2453b = e522;
    }

    public static en0 a(e52<wj2> e52, e52<Map<ph1, fn0>> e522) {
        return new en0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new dn0(this.f2452a.get(), this.f2453b.get());
    }
}
