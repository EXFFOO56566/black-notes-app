package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

public final class tg implements dg {

    /* renamed from: a  reason: collision with root package name */
    private i9<JSONObject, JSONObject> f4806a;

    public tg(Context context) {
        q9 a2 = q.p().a(context, fo.d());
        m9<JSONObject> m9Var = l9.f3510b;
        a2.a("google.afma.request.getAdDictionary", m9Var, m9Var);
        q9 a3 = q.p().a(context, fo.d());
        m9<JSONObject> m9Var2 = l9.f3510b;
        this.f4806a = a3.a("google.afma.sdkConstants.getSdkConstants", m9Var2, m9Var2);
    }

    @Override // com.google.android.gms.internal.ads.dg
    public final i9<JSONObject, JSONObject> a() {
        return this.f4806a;
    }
}
