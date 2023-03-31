package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class l91 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f3512a;

    public l91(Map<String, Object> map) {
        this.f3512a = map;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", q.c().a(this.f3512a));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            wk.e(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
