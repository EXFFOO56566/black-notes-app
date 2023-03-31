package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class as implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f1809b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f1810c;
    private final /* synthetic */ int d;
    private final /* synthetic */ wr e;

    as(wr wrVar, String str, String str2, int i) {
        this.e = wrVar;
        this.f1809b = str;
        this.f1810c = str2;
        this.d = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f1809b);
        hashMap.put("cachedSrc", this.f1810c);
        hashMap.put("totalBytes", Integer.toString(this.d));
        this.e.a((wr) "onPrecacheEvent", (String) hashMap);
    }
}
