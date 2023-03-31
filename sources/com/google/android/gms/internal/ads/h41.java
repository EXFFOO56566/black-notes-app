package com.google.android.gms.internal.ads;

import android.content.Context;

public final class h41 implements r42<f41> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2856a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f2857b;

    private h41(e52<Context> e52, e52<ko1> e522) {
        this.f2856a = e52;
        this.f2857b = e522;
    }

    public static h41 a(e52<Context> e52, e52<ko1> e522) {
        return new h41(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new f41(this.f2856a.get(), this.f2857b.get());
    }
}
