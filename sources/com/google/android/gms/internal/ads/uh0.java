package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class uh0 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    private final ph0 f4952a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f4953b;

    uh0(ph0 ph0, JSONObject jSONObject) {
        this.f4952a = ph0;
        this.f4953b = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        return this.f4952a.a(this.f4953b, (List) obj);
    }
}
