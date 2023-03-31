package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class e81 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f2383a;

    public e81(JSONObject jSONObject) {
        this.f2383a = jSONObject;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.f2383a);
        } catch (JSONException unused) {
            wk.e("Unable to get cache_state");
        }
    }
}
