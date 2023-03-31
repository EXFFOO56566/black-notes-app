package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class s81 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f4614a;

    public s81(List<String> list) {
        this.f4614a = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.f4614a));
        } catch (JSONException unused) {
            wk.e("Failed putting experiment ids.");
        }
    }
}
