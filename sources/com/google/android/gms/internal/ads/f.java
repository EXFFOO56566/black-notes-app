package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private String f2509a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f2510b;

    /* renamed from: c  reason: collision with root package name */
    private Context f2511c = null;
    private String d = null;

    public f(Context context, String str) {
        this.f2511c = context;
        this.d = str;
        this.f2509a = j0.f3156b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2510b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f2510b.put("v", "3");
        this.f2510b.put("os", Build.VERSION.RELEASE);
        this.f2510b.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f2510b;
        q.c();
        map.put("device", gl.c());
        this.f2510b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f2510b;
        q.c();
        map2.put("is_lite_sdk", gl.k(context) ? "1" : "0");
        Future<ig> a2 = q.n().a(this.f2511c);
        try {
            this.f2510b.put("network_coarse", Integer.toString(a2.get().j));
            this.f2510b.put("network_fine", Integer.toString(a2.get().k));
        } catch (Exception e) {
            q.g().a(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f2511c;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f2509a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> d() {
        return this.f2510b;
    }
}
