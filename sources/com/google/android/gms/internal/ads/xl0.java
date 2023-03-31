package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class xl0 {
    public static String a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (!((Boolean) on2.e().a(zr2.K0)).booleanValue() || jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str2)) == null) {
            return BuildConfig.FLAVOR;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                if (a(optJSONArray2, str) && !a(optJSONArray3, str)) {
                    return optJSONObject.optString("effective_ad_unit_id", BuildConfig.FLAVOR);
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    private static boolean a(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || str == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (Pattern.compile(jSONArray.optString(i)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (PatternSyntaxException e) {
                    q.g().a(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
