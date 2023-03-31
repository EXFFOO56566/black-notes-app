package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class bs implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2002b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2003c;
    private final /* synthetic */ int d;
    private final /* synthetic */ int e;
    private final /* synthetic */ long f;
    private final /* synthetic */ long g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ int i;
    private final /* synthetic */ int j;
    private final /* synthetic */ wr k;

    bs(wr wrVar, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.k = wrVar;
        this.f2002b = str;
        this.f2003c = str2;
        this.d = i2;
        this.e = i3;
        this.f = j2;
        this.g = j3;
        this.h = z;
        this.i = i4;
        this.j = i5;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f2002b);
        hashMap.put("cachedSrc", this.f2003c);
        hashMap.put("bytesLoaded", Integer.toString(this.d));
        hashMap.put("totalBytes", Integer.toString(this.e));
        hashMap.put("bufferedDuration", Long.toString(this.f));
        hashMap.put("totalDuration", Long.toString(this.g));
        hashMap.put("cacheReady", this.h ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.i));
        hashMap.put("playerPreparedCount", Integer.toString(this.j));
        this.k.a((wr) "onPrecacheEvent", (String) hashMap);
    }
}
