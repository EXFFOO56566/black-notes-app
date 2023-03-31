package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ma {

    /* renamed from: a  reason: collision with root package name */
    public final List<na> f3682a;

    public ma(JSONObject jSONObject) {
        boolean z;
        if (co.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            wk.e(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                na naVar = new na(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(naVar.f3818c);
                arrayList.add(naVar);
                if (i < 0) {
                    Iterator<String> it = naVar.f3816a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f3682a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            q.u();
            pa.a(optJSONObject, "click_urls");
            q.u();
            pa.a(optJSONObject, "imp_urls");
            q.u();
            pa.a(optJSONObject, "downloaded_imp_urls");
            q.u();
            pa.a(optJSONObject, "nofill_urls");
            q.u();
            pa.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            int i3 = (optJSONObject.optLong("refresh", -1) > 0 ? 1 : (optJSONObject.optLong("refresh", -1) == 0 ? 0 : -1));
            uh a2 = uh.a(optJSONObject.optJSONArray("rewards"));
            if (a2 != null) {
                String str = a2.f4950b;
                int i4 = a2.f4951c;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
