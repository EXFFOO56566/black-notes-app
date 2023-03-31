package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.t.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class j71 implements v61<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0067a f3185a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3186b;

    public j71(a.C0067a aVar, String str) {
        this.f3185a = aVar;
        this.f3186b = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = an.a(jSONObject, "pii");
            if (this.f3185a == null || TextUtils.isEmpty(this.f3185a.a())) {
                a2.put("pdid", this.f3186b);
                a2.put("pdidtype", "ssaid");
                return;
            }
            a2.put("rdid", this.f3185a.a());
            a2.put("is_lat", this.f3185a.b());
            a2.put("idtype", "adid");
        } catch (JSONException e) {
            wk.e("Failed putting Ad ID.", e);
        }
    }
}
