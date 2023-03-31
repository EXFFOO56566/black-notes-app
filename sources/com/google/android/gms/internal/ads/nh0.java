package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class nh0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final kh0 f3844a;

    /* renamed from: b  reason: collision with root package name */
    private final vd1 f3845b;

    /* renamed from: c  reason: collision with root package name */
    private final id1 f3846c;
    private final JSONObject d;

    nh0(kh0 kh0, vd1 vd1, id1 id1, JSONObject jSONObject) {
        this.f3844a = kh0;
        this.f3845b = vd1;
        this.f3846c = id1;
        this.d = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        vd1 vd1 = this.f3845b;
        id1 id1 = this.f3846c;
        JSONObject jSONObject = this.d;
        if0 if0 = new if0();
        if0.a(jSONObject.optInt("template_id", -1));
        if0.a(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if0.b(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zd1 zd1 = vd1.f5092a.f4150a;
        if (zd1.g.contains(Integer.toString(if0.o()))) {
            if (if0.o() == 3) {
                if (if0.e() == null) {
                    throw new pw0("No custom template id for custom template ad response.", 0);
                } else if (!zd1.h.contains(if0.e())) {
                    throw new pw0("Unexpected custom template id in the response.", 0);
                }
            }
            if0.a(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", null);
            if (id1.E) {
                q.c();
                String e = gl.e();
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 3 + String.valueOf(optString).length());
                sb.append(e);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            if0.a("headline", optString);
            if0.a("body", jSONObject.optString("body", null));
            if0.a("call_to_action", jSONObject.optString("call_to_action", null));
            if0.a("store", jSONObject.optString("store", null));
            if0.a("price", jSONObject.optString("price", null));
            if0.a("advertiser", jSONObject.optString("advertiser", null));
            return if0;
        }
        int o = if0.o();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(o);
        throw new pw0(sb2.toString(), 0);
    }
}
