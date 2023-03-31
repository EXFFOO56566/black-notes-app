package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

public final class i51 implements v61<Bundle>, y61<v61<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationInfo f3029a;

    /* renamed from: b  reason: collision with root package name */
    private final PackageInfo f3030b;

    i51(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f3029a = applicationInfo;
        this.f3030b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v61<Bundle>> a() {
        return yn1.a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f3029a.packageName;
        PackageInfo packageInfo = this.f3030b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle2.putString("pn", str);
        if (valueOf != null) {
            bundle2.putInt("vc", valueOf.intValue());
        }
    }
}
