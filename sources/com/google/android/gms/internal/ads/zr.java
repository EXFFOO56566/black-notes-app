package com.google.android.gms.internal.ads;

import java.util.HashMap;

final class zr implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5799b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5800c;
    private final /* synthetic */ int d;
    private final /* synthetic */ int e;
    private final /* synthetic */ boolean f = false;
    private final /* synthetic */ wr g;

    zr(wr wrVar, String str, String str2, int i, int i2, boolean z) {
        this.g = wrVar;
        this.f5799b = str;
        this.f5800c = str2;
        this.d = i;
        this.e = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f5799b);
        hashMap.put("cachedSrc", this.f5800c);
        hashMap.put("bytesLoaded", Integer.toString(this.d));
        hashMap.put("totalBytes", Integer.toString(this.e));
        hashMap.put("cacheReady", this.f ? "1" : "0");
        this.g.a((wr) "onPrecacheEvent", (String) hashMap);
    }
}
