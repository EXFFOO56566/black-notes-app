package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t01 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    static final xk1 f4734a = new t01();

    private t01() {
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        return ((JSONObject) obj).optString("nas");
    }
}
