package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class tr0 implements zg1 {

    /* renamed from: a  reason: collision with root package name */
    static final zg1 f4848a = new tr0();

    private tr0() {
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final Object a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        wk.e("Ad request signals:");
        wk.e(jSONObject.toString(2));
        return jSONObject;
    }
}
