package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ez0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, iz0> f2506a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Map<String, List<iz0>>> f2507b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2508c;
    private JSONObject d;

    public ez0(Executor executor) {
        this.f2508c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void d() {
        JSONArray optJSONArray;
        JSONObject f = q.g().i().i().f();
        if (f != null) {
            try {
                JSONArray optJSONArray2 = f.optJSONArray("ad_unit_id_settings");
                this.d = f.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject.optString("ad_unit_id", BuildConfig.FLAVOR);
                        String optString2 = jSONObject.optString("format", BuildConfig.FLAVOR);
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("ad_networks")) == null)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys = optJSONObject2.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            bundle.putString(next, optJSONObject2.optString(next, BuildConfig.FLAVOR));
                                        }
                                    }
                                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                            String optString3 = optJSONArray3.optString(i3, BuildConfig.FLAVOR);
                                            if (!TextUtils.isEmpty(optString3)) {
                                                arrayList3.add(optString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        int i4 = 0;
                                        while (i4 < size) {
                                            Object obj = arrayList3.get(i4);
                                            i4++;
                                            String str = (String) obj;
                                            a(str);
                                            if (this.f2506a.get(str) != null) {
                                                arrayList2.add(new iz0(str, optString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                            Map<String, List<iz0>> map = this.f2507b.get(optString2);
                            if (map == null) {
                                map = new ConcurrentHashMap<>();
                            }
                            this.f2507b.put(optString2, map);
                            List<iz0> list = map.get(optString);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.addAll(arrayList);
                            map.put(optString, list);
                        }
                    }
                }
            } catch (JSONException e) {
                wk.e("Malformed config loading JSON.", e);
            }
        }
    }

    public final Map<String, List<Bundle>> a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Collections.emptyMap();
        }
        Map<String, List<iz0>> map = this.f2507b.get(str);
        if (map == null) {
            return Collections.emptyMap();
        }
        List<iz0> list = map.get(str2);
        if (list == null) {
            list = map.get(xl0.a(this.d, str2, str));
        }
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (iz0 iz0 : list) {
            String str3 = iz0.f3153a;
            if (!hashMap.containsKey(str3)) {
                hashMap.put(str3, new ArrayList());
            }
            ((List) hashMap.get(str3)).add(iz0.f3154b);
        }
        return hashMap;
    }

    public final void a() {
        q.g().i().a(new dz0(this));
        this.f2508c.execute(new hz0(this));
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && !this.f2506a.containsKey(str)) {
            this.f2506a.put(str, new iz0(str, BuildConfig.FLAVOR, new Bundle()));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f2508c.execute(new gz0(this));
    }
}
