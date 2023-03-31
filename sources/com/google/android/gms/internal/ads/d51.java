package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

public final class d51 implements r42<w41> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f2210a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f2211b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<PackageInfo> f2212c;
    private final e52<yk> d;

    public d51(e52<ko1> e52, e52<zd1> e522, e52<PackageInfo> e523, e52<yk> e524) {
        this.f2210a = e52;
        this.f2211b = e522;
        this.f2212c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new w41(this.f2210a.get(), this.f2211b.get(), this.f2212c.get(), this.d.get());
    }
}
