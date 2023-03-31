package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class i81 implements y61<v61<JSONObject>> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f3045a;

    i81(Context context) {
        this.f3045a = lg.a(context);
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v61<JSONObject>> a() {
        return yn1.a(new l81(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f3045a);
        } catch (JSONException unused) {
            wk.e("Failed putting version constants.");
        }
    }
}
