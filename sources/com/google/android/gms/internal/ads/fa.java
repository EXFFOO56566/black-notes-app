package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class fa implements l5 {

    /* renamed from: a  reason: collision with root package name */
    private final ro<O> f2563a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ da f2564b;

    public fa(da daVar, ro<O> roVar) {
        this.f2564b = daVar;
        this.f2563a = roVar;
    }

    @Override // com.google.android.gms.internal.ads.l5
    public final void a(JSONObject jSONObject) {
        try {
            this.f2563a.b((O) this.f2564b.f2230a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f2563a.a(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.l5
    public final void b(String str) {
        if (str == null) {
            try {
                this.f2563a.a(new f9());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f2563a.a(new f9(str));
        }
    }
}
