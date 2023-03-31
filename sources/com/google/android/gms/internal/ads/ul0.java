package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ul0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, JSONObject>> f4972a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4973b;

    public ul0(Executor executor) {
        this.f4973b = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void d() {
        Map<String, JSONObject> map;
        jk i = q.g().i().i();
        if (i != null) {
            JSONObject f = i.f();
            if (f != null) {
                f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f4972a.containsKey(optString2)) {
                                    map = this.f4972a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f4972a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        q.g().i().a(new tl0(this));
        this.f4973b.execute(new wl0(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f4973b.execute(new vl0(this));
    }
}
