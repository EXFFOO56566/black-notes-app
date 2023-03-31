package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class nv0 implements kt0<le1, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final rl0 f3898a;

    public nv0(rl0 rl0) {
        this.f3898a = rl0;
    }

    @Override // com.google.android.gms.internal.ads.kt0
    public final lt0<le1, uu0> a(String str, JSONObject jSONObject) {
        le1 a2 = this.f3898a.a(str, jSONObject);
        if (a2 == null) {
            return null;
        }
        return new lt0<>(a2, new uu0(), str);
    }
}
