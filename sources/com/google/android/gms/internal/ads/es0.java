package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

final class es0 implements j9<bs0> {
    es0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.j9
    public final /* synthetic */ JSONObject a(bs0 bs0) {
        bs0 bs02 = bs0;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", bs02.f2006c.d());
        jSONObject2.put("signals", bs02.f2005b);
        jSONObject3.put("body", bs02.f2004a.f3133c);
        jSONObject3.put("headers", q.c().a(bs02.f2004a.f3132b));
        jSONObject3.put("response_code", bs02.f2004a.f3131a);
        jSONObject3.put("latency", bs02.f2004a.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", bs02.f2006c.g());
        return jSONObject;
    }
}
