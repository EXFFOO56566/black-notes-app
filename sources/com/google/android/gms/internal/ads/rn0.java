package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class rn0 {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f4522a;

    public rn0(zn0 zn0) {
        this.f4522a = zn0.b();
    }

    public final Map<String, String> a() {
        return this.f4522a;
    }

    public final void a(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f4522a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f4522a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void a(vd1 vd1) {
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (vd1.f5093b.f4641a.size() > 0) {
            int i = vd1.f5093b.f4641a.get(0).f3067b;
            if (i == 1) {
                concurrentHashMap = this.f4522a;
                str = "banner";
            } else if (i == 2) {
                concurrentHashMap = this.f4522a;
                str = "interstitial";
            } else if (i == 3) {
                concurrentHashMap = this.f4522a;
                str = "native_express";
            } else if (i == 4) {
                concurrentHashMap = this.f4522a;
                str = "native_advanced";
            } else if (i != 5) {
                concurrentHashMap = this.f4522a;
                str = "unknown";
            } else {
                concurrentHashMap = this.f4522a;
                str = "rewarded";
            }
            concurrentHashMap.put("ad_format", str);
        }
        if (!TextUtils.isEmpty(vd1.f5093b.f4642b.f3376b)) {
            this.f4522a.put("gqi", vd1.f5093b.f4642b.f3376b);
        }
    }
}
