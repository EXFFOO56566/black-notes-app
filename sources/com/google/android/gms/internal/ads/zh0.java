package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zh0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5753a;

    /* renamed from: b  reason: collision with root package name */
    private final ph0 f5754b;

    public zh0(Executor executor, ph0 ph0) {
        this.f5753a = executor;
        this.f5754b = ph0;
    }

    public final lo1<List<ei0>> a(JSONObject jSONObject, String str) {
        lo1 lo1;
        String optString;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return yn1.a((Object) Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                String optString2 = optJSONObject.optString("type");
                char c2 = "string".equals(optString2) ? 1 : "image".equals(optString2) ? (char) 2 : 0;
                if (c2 == 1) {
                    lo1 = yn1.a(new ei0(optString, optJSONObject.optString("string_value")));
                } else if (c2 == 2) {
                    lo1 = yn1.a(this.f5754b.a(optJSONObject, "image_value"), new bi0(optString), this.f5753a);
                }
                arrayList.add(lo1);
            }
            lo1 = yn1.a((Object) null);
            arrayList.add(lo1);
        }
        return yn1.a(yn1.a((Iterable) arrayList), ci0.f2119a, this.f5753a);
    }
}
