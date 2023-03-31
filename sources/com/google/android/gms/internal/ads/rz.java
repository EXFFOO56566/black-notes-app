package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class rz implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final nz f4571b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f4572c;

    rz(nz nzVar, JSONObject jSONObject) {
        this.f4571b = nzVar;
        this.f4572c = jSONObject;
    }

    public final void run() {
        this.f4571b.a(this.f4572c);
    }
}
