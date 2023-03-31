package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class j91 implements v61 {

    /* renamed from: a  reason: collision with root package name */
    static final v61 f3195a = new j91();

    private j91() {
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void a(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
