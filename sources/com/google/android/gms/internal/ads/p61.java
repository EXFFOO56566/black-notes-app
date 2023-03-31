package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p61 implements y61<v61<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f4116a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4117b;

    p61(ko1 ko1, Context context) {
        this.f4116a = ko1;
        this.f4117b = context;
    }

    public static Bundle a(Context context, JSONArray jSONArray) {
        Object obj;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : t61.f4761c : t61.f4760b : t61.f4759a;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                if (split.length > 2 || split.length == 0) {
                    obj = null;
                } else {
                    if (split.length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = u61.f4905a[i2 - 1];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3 && (obj instanceof Boolean)) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v61<Bundle>> a() {
        return this.f4116a.a(new s61(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ v61 b() {
        String str = (String) on2.e().a(zr2.V2);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new r61(a(this.f4117b, new JSONArray(str)));
        } catch (JSONException e) {
            co.a("JSON parsing error", e);
            return null;
        }
    }
}
