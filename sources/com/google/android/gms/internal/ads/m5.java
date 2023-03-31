package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class m5 implements l5 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ro f3662a;

    m5(j5 j5Var, ro roVar) {
        this.f3662a = roVar;
    }

    @Override // com.google.android.gms.internal.ads.l5
    public final void a(JSONObject jSONObject) {
        this.f3662a.b(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.l5
    public final void b(String str) {
        this.f3662a.a(new f9(str));
    }
}
