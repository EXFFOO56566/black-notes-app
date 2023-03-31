package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class qz {
    public static JSONObject a(id1 id1) {
        try {
            return new JSONObject(id1.w);
        } catch (JSONException unused) {
            return null;
        }
    }
}
