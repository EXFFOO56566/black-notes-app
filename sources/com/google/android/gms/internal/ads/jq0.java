package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class jq0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final lm2 f3267a;

    jq0(kq0 kq0, lm2 lm2) {
        this.f3267a = lm2;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        lm2 lm2 = this.f3267a;
        String str = (String) obj;
        String str2 = lm2.f3579b;
        String str3 = lm2.f3580c;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str2);
        jSONObject2.put("base_url", BuildConfig.FLAVOR);
        jSONObject2.put("signals", new JSONObject(str3));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return yn1.a(jSONObject);
    }
}
