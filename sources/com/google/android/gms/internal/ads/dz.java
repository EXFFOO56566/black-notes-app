package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dz implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final ws f2336b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f2337c;

    dz(ws wsVar, JSONObject jSONObject) {
        this.f2336b = wsVar;
        this.f2337c = jSONObject;
    }

    public final void run() {
        this.f2336b.b("AFMA_updateActiveView", this.f2337c);
    }
}
