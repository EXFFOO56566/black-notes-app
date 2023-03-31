package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class y71 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f5547a;

    public y71(String str) {
        this.f5547a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = an.a(jSONObject, "pii");
            if (!TextUtils.isEmpty(this.f5547a)) {
                a2.put("attok", this.f5547a);
            }
        } catch (JSONException e) {
            wk.e("Failed putting attestation token.", e);
        }
    }
}
