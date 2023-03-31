package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class n81 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f3813a;

    /* renamed from: b  reason: collision with root package name */
    private String f3814b;

    public n81(String str, String str2) {
        this.f3813a = str;
        this.f3814b = str2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = an.a(jSONObject, "pii");
            a2.put("doritos", this.f3813a);
            a2.put("doritos_v2", this.f3814b);
        } catch (JSONException unused) {
            wk.e("Failed putting doritos string.");
        }
    }
}
