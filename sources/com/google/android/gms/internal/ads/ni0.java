package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ni0 implements fh2 {

    /* renamed from: b  reason: collision with root package name */
    private final ws f3851b;

    ni0(ws wsVar) {
        this.f3851b = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        ws wsVar = this.f3851b;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", hh2.j ? "1" : "0");
        wsVar.a("onAdVisibilityChanged", hashMap);
    }
}
