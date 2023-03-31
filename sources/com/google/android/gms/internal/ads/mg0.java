package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class mg0 implements d5 {

    /* renamed from: a  reason: collision with root package name */
    private final jg0 f3705a;

    /* renamed from: b  reason: collision with root package name */
    private final v3 f3706b;

    mg0(jg0 jg0, v3 v3Var) {
        this.f3705a = jg0;
        this.f3706b = v3Var;
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map map) {
        jg0 jg0 = this.f3705a;
        v3 v3Var = this.f3706b;
        try {
            jg0.g = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            co.b("Failed to call parse unconfirmedClickTimestamp.");
        }
        jg0.f = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (v3Var == null) {
            co.a("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            v3Var.j(str);
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }
}
