package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class j4 implements d5<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final l4 f3171a;

    public j4(l4 l4Var) {
        this.f3171a = l4Var;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        if (this.f3171a != null) {
            String str = map.get("name");
            if (str == null) {
                co.c("Ad metadata with no name parameter.");
                str = BuildConfig.FLAVOR;
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = an.a(new JSONObject(map.get("info")));
                } catch (JSONException e) {
                    co.b("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                co.b("Failed to convert ad metadata to Bundle.");
            } else {
                this.f3171a.a(str, bundle);
            }
        }
    }
}
