package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

public final class lg extends ng {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3543a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Context f3544b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f3545c;
    private final i9<JSONObject, JSONObject> d;

    public lg(Context context, i9<JSONObject, JSONObject> i9Var) {
        this.f3544b = context.getApplicationContext();
        this.d = i9Var;
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", fo.d().f2633b);
            jSONObject.put("mf", n0.f3774a.a());
            jSONObject.put("cl", "305933803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ng
    public final lo1<Void> a() {
        synchronized (this.f3543a) {
            if (this.f3545c == null) {
                this.f3545c = this.f3544b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (q.j().a() - this.f3545c.getLong("js_last_update", 0) < n0.f3775b.a().longValue()) {
            return yn1.a((Object) null);
        }
        return yn1.a(this.d.b(a(this.f3544b)), new og(this), jo.f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(JSONObject jSONObject) {
        zr2.a(this.f3544b, 1, jSONObject);
        this.f3545c.edit().putLong("js_last_update", q.j().a()).apply();
        return null;
    }
}
