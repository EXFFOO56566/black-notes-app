package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class fg {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f2587a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2588b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2589c;
    private final boolean d;
    private String e;
    private final int f;
    private final JSONObject g;
    private final String h;

    public fg(JSONObject jSONObject) {
        this.e = jSONObject.optString("url");
        this.f2588b = jSONObject.optString("base_uri");
        this.f2589c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.d = optString != null && (optString.equals("1") || optString.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        this.f2587a = optString2 == null ? null : Arrays.asList(optString2.split(","));
        this.f = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.g = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.h = jSONObject.optString("pool_key");
    }

    public final int a() {
        return this.f;
    }

    public final String b() {
        return this.e;
    }

    public final List<String> c() {
        return this.f2587a;
    }

    public final String d() {
        return this.f2588b;
    }

    public final String e() {
        return this.f2589c;
    }

    public final boolean f() {
        return this.d;
    }

    public final JSONObject g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }
}
