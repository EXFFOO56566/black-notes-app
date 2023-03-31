package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class nf0 extends of0 {

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f3838b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3839c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public nf0(id1 id1, JSONObject jSONObject) {
        super(id1);
        this.f3838b = an.a(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f3839c = an.a(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = an.a(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = an.a(false, jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z = true;
        }
        this.f = z;
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final boolean a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final JSONObject b() {
        JSONObject jSONObject = this.f3838b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f3984a.w);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final boolean c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final boolean d() {
        return this.f3839c;
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final boolean e() {
        return this.d;
    }
}
