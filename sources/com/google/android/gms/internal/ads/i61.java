package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class i61 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3034a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3035b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3036c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;

    public i61(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f3034a = z;
        this.f3035b = z2;
        this.f3036c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f3036c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) on2.e().a(zr2.r1));
        bundle2.putInt("target_api", this.e);
        bundle2.putInt("dv", this.f);
        bundle2.putInt("lv", this.g);
        Bundle a2 = ee1.a(bundle2, "sdk_env");
        a2.putBoolean("mf", n0.f3774a.a().booleanValue());
        a2.putBoolean("instant_app", this.f3034a);
        a2.putBoolean("lite", this.f3035b);
        a2.putBoolean("is_privileged_process", this.d);
        bundle2.putBundle("sdk_env", a2);
        Bundle a3 = ee1.a(a2, "build_meta");
        a3.putString("cl", "305933803");
        a3.putString("rapid_rc", "dev");
        a3.putString("rapid_rollup", "HEAD");
        a2.putBundle("build_meta", a3);
    }
}
