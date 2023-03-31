package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

public final class z40 {

    /* renamed from: a  reason: collision with root package name */
    private final sh1 f5694a;

    /* renamed from: b  reason: collision with root package name */
    private final fo f5695b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationInfo f5696c;
    private final String d;
    private final List<String> e;
    private final PackageInfo f;
    private final l42<lo1<String>> g;
    private final yk h;
    private final String i;
    private final x61<Bundle> j;

    public z40(sh1 sh1, fo foVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, l42<lo1<String>> l42, yk ykVar, String str2, x61<Bundle> x61) {
        this.f5694a = sh1;
        this.f5695b = foVar;
        this.f5696c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = l42;
        this.h = ykVar;
        this.i = str2;
        this.j = x61;
    }

    public final lo1<Bundle> a() {
        return this.f5694a.a(ph1.SIGNALS).a(this.j.a(new Bundle())).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zf a(lo1 lo1) {
        return new zf((Bundle) lo1.get(), this.f5695b, this.f5696c, this.d, this.e, this.f, this.g.get().get(), this.h.b(), this.i, null, null);
    }

    public final lo1<zf> b() {
        lo1<Bundle> a2 = a();
        return this.f5694a.a(ph1.REQUEST_PARCEL, a2, this.g.get()).a(new c50(this, a2)).a();
    }
}
