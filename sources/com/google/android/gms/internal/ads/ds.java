package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class ds implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2307b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2308c;
    private final /* synthetic */ long d;
    private final /* synthetic */ wr e;

    ds(wr wrVar, String str, String str2, long j) {
        this.e = wrVar;
        this.f2307b = str;
        this.f2308c = str2;
        this.d = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f2307b);
        hashMap.put("cachedSrc", this.f2308c);
        hashMap.put("totalDuration", Long.toString(this.d));
        this.e.a((wr) "onPrecacheEvent", (String) hashMap);
    }
}
