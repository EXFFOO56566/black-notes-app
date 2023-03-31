package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public final class kh0 {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f3392a;

    /* renamed from: b  reason: collision with root package name */
    private final ph0 f3393b;

    /* renamed from: c  reason: collision with root package name */
    private final zh0 f3394c;

    public kh0(ko1 ko1, ph0 ph0, zh0 zh0) {
        this.f3392a = ko1;
        this.f3393b = ph0;
        this.f3394c = zh0;
    }

    public final lo1<if0> a(vd1 vd1, id1 id1, JSONObject jSONObject) {
        JSONObject optJSONObject;
        lo1 a2;
        lo1 a3 = this.f3392a.a(new nh0(this, vd1, id1, jSONObject));
        lo1<List<i1>> b2 = this.f3393b.b(jSONObject, "images");
        lo1<i1> a4 = this.f3393b.a(jSONObject, "secondary_image");
        lo1<i1> a5 = this.f3393b.a(jSONObject, "app_icon");
        lo1<h1> c2 = this.f3393b.c(jSONObject, "attribution");
        lo1<ws> a6 = this.f3393b.a(jSONObject);
        ph0 ph0 = this.f3393b;
        if (jSONObject.optBoolean("enable_omid") && (optJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            String optString = optJSONObject.optString("omid_html");
            if (!TextUtils.isEmpty(optString)) {
                a2 = yn1.a(yn1.a((Object) null), new th0(ph0, optString), jo.e);
                lo1<List<ei0>> a7 = this.f3394c.a(jSONObject, "custom_assets");
                return yn1.a(a3, b2, a4, a5, c2, a6, a2, a7).a(new mh0(this, a3, b2, a5, a4, c2, jSONObject, a6, a2, a7), this.f3392a);
            }
        }
        a2 = yn1.a((Object) null);
        lo1<List<ei0>> a72 = this.f3394c.a(jSONObject, "custom_assets");
        return yn1.a(a3, b2, a4, a5, c2, a6, a2, a72).a(new mh0(this, a3, b2, a5, a4, c2, jSONObject, a6, a2, a72), this.f3392a);
    }
}
