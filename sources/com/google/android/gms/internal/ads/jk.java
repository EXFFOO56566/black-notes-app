package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class jk {

    /* renamed from: a  reason: collision with root package name */
    private final long f3243a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f3244b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f3245c = new ArrayList();
    private final Map<String, ma> d = new HashMap();
    private String e;
    private String f;
    private JSONObject g;
    private boolean h;

    public jk(String str, long j) {
        JSONObject optJSONObject;
        this.h = false;
        this.f = str;
        this.f3243a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.h = false;
                    co.d("App settings could not be fetched successfully.");
                    return;
                }
                this.h = true;
                this.e = this.g.optString("app_id");
                JSONArray optJSONArray = this.g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f3245c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.d.put(optString2, new ma(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f3244b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e2) {
                co.c("Exception occurred while processing app setting json", e2);
                q.g().a(e2, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long a() {
        return this.f3243a;
    }

    public final boolean b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final Map<String, ma> e() {
        return this.d;
    }

    public final JSONObject f() {
        return this.g;
    }
}
