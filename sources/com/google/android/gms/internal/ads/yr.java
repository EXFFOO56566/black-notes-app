package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class yr implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5638b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5639c;
    private final /* synthetic */ long d;
    private final /* synthetic */ long e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ int g;
    private final /* synthetic */ int h;
    private final /* synthetic */ wr i;

    yr(wr wrVar, String str, String str2, long j, long j2, boolean z, int i2, int i3) {
        this.i = wrVar;
        this.f5638b = str;
        this.f5639c = str2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f5638b);
        hashMap.put("cachedSrc", this.f5639c);
        hashMap.put("bufferedDuration", Long.toString(this.d));
        hashMap.put("totalDuration", Long.toString(this.e));
        hashMap.put("cacheReady", this.f ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.g));
        hashMap.put("playerPreparedCount", Integer.toString(this.h));
        this.i.a((wr) "onPrecacheEvent", (String) hashMap);
    }
}
