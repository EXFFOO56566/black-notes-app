package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class yp0 implements r42<PackageInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5624a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ApplicationInfo> f5625b;

    private yp0(e52<Context> e52, e52<ApplicationInfo> e522) {
        this.f5624a = e52;
        this.f5625b = e522;
    }

    public static yp0 a(e52<Context> e52, e52<ApplicationInfo> e522) {
        return new yp0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return np0.a(this.f5624a.get(), this.f5625b.get());
    }
}
