package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

public final class x81 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f5384a;

    public x81(Bundle bundle) {
        this.f5384a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.f5384a != null) {
            try {
                an.a(an.a(jSONObject2, "device"), "play_store").put("parental_controls", q.c().a(this.f5384a));
            } catch (JSONException unused) {
                wk.e("Failed putting parental controls bundle.");
            }
        }
    }
}
