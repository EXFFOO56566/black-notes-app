package com.google.android.gms.internal.ads;

import org.json.JSONException;

public final class p50 extends pp2 {

    /* renamed from: b  reason: collision with root package name */
    private final String f4112b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4113c;

    public p50(id1 id1, String str) {
        String str2 = null;
        this.f4113c = id1 == null ? null : id1.S;
        str2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? a(id1) : str2;
        this.f4112b = str2 != null ? str2 : str;
    }

    private static String a(id1 id1) {
        try {
            return id1.s.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.mp2
    public final String Z0() {
        return this.f4113c;
    }

    @Override // com.google.android.gms.internal.ads.mp2
    public final String a() {
        return this.f4112b;
    }
}
