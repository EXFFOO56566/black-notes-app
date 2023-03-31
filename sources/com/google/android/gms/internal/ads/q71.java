package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class q71 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4283a;

    public q71(String str) {
        this.f4283a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.f4283a);
        } catch (JSONException e) {
            wk.e("Failed putting Ad ID.", e);
        }
    }
}
