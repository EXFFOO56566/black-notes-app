package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class fi0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final gi0 f2595a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f2596b;

    fi0(gi0 gi0, JSONObject jSONObject) {
        this.f2595a = gi0;
        this.f2596b = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        return this.f2595a.a(this.f2596b, (ws) obj);
    }
}
