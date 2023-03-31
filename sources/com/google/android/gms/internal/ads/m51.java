package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class m51 implements r42<i51> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ApplicationInfo> f3664a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<PackageInfo> f3665b;

    private m51(e52<ApplicationInfo> e52, e52<PackageInfo> e522) {
        this.f3664a = e52;
        this.f3665b = e522;
    }

    public static i51 a(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new i51(applicationInfo, packageInfo);
    }

    public static m51 a(e52<ApplicationInfo> e52, e52<PackageInfo> e522) {
        return new m51(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f3664a.get(), this.f3665b.get());
    }
}
