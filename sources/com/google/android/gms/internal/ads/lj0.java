package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class lj0 implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final jj0 f3566a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3567b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f3568c;

    lj0(jj0 jj0, String str, JSONObject jSONObject) {
        this.f3566a = jj0;
        this.f3567b = str;
        this.f3568c = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        return this.f3566a.a(this.f3567b, this.f3568c, (ws) obj);
    }
}
