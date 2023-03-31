package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;

public final class t81 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Location f4766a;

    public t81(Location location) {
        this.f4766a = location;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (this.f4766a != null) {
                JSONObject jSONObject3 = new JSONObject();
                Float valueOf = Float.valueOf(this.f4766a.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.f4766a.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.f4766a.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.f4766a.getLongitude() * 1.0E7d));
                jSONObject3.put("radius", valueOf);
                jSONObject3.put("lat", valueOf3);
                jSONObject3.put("long", valueOf4);
                jSONObject3.put("time", valueOf2);
                jSONObject2.put("uule", jSONObject3);
            }
        } catch (JSONException e) {
            wk.e("Failed adding location to the request JSON.", e);
        }
    }
}
