package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class cn2 {

    /* renamed from: a  reason: collision with root package name */
    private final pm2 f2144a;

    /* renamed from: b  reason: collision with root package name */
    private final mm2 f2145b;

    /* renamed from: c  reason: collision with root package name */
    private final oq2 f2146c;
    private final ih d;
    private final zd e;

    public cn2(pm2 pm2, mm2 mm2, oq2 oq2, a4 a4Var, ih ihVar, hi hiVar, zd zdVar, d4 d4Var) {
        this.f2144a = pm2;
        this.f2145b = mm2;
        this.f2146c = oq2;
        this.d = ihVar;
        this.e = zdVar;
    }

    /* access modifiers changed from: private */
    public static void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        on2.a().a(context, on2.g().f2633b, "gmob-apps", bundle, true);
    }

    public final be a(Activity activity) {
        fn2 fn2 = new fn2(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            co.b("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (be) fn2.a(activity, z);
    }

    public final xn2 a(Context context, String str, ra raVar) {
        return (xn2) new kn2(this, context, str, raVar).a(context, false);
    }
}
