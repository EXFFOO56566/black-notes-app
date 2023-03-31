package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class u71 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f4907a;

    public u71(JSONObject jSONObject) {
        this.f4907a = jSONObject;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = an.a(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f4907a;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            wk.e("Failed putting app indexing json.");
        }
    }
}
