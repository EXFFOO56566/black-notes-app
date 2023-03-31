package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.ln1;
import com.google.android.gms.internal.ads.lo1;
import com.google.android.gms.internal.ads.yn1;
import org.json.JSONObject;

final /* synthetic */ class f implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    static final ln1 f1398a = new f();

    private f() {
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            q.g().i().c(jSONObject.getString("appSettingsJson"));
        }
        return yn1.a((Object) null);
    }
}
