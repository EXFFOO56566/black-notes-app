package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import org.json.JSONObject;

public final class md1 implements bn {

    /* renamed from: a  reason: collision with root package name */
    public final String f3692a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3693b = this.d.optString("ad_base_url", null);

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f3694c = this.d.optJSONObject("ad_json");
    private final JSONObject d;

    md1(JsonReader jsonReader) {
        JSONObject c2 = an.c(jsonReader);
        this.d = c2;
        this.f3692a = c2.optString("ad_html", null);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void a(JsonWriter jsonWriter) {
        an.a(jsonWriter, this.d);
    }
}
