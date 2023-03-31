package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class na {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f3816a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3817b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3818c;

    public na(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f3816a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        q.u();
        pa.a(jSONObject, "clickurl");
        q.u();
        pa.a(jSONObject, "imp_urls");
        q.u();
        pa.a(jSONObject, "downloaded_imp_urls");
        q.u();
        pa.a(jSONObject, "fill_urls");
        q.u();
        pa.a(jSONObject, "video_start_urls");
        q.u();
        pa.a(jSONObject, "video_complete_urls");
        q.u();
        pa.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            q.u();
            pa.a(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f3817b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        q.u();
        pa.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f3818c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
