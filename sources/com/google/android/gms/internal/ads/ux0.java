package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class ux0 implements kt0<qc, uu0> {

    /* renamed from: a  reason: collision with root package name */
    private final cz0 f5018a;

    public ux0(cz0 cz0) {
        this.f5018a = cz0;
    }

    @Override // com.google.android.gms.internal.ads.kt0
    public final lt0<qc, uu0> a(String str, JSONObject jSONObject) {
        qc b2 = this.f5018a.b(str);
        if (b2 == null) {
            return null;
        }
        return new lt0<>(b2, new uu0(), str);
    }
}
