package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class cs implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2158b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2159c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ wr f;

    cs(wr wrVar, String str, String str2, String str3, String str4) {
        this.f = wrVar;
        this.f2158b = str;
        this.f2159c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f2158b);
        if (!TextUtils.isEmpty(this.f2159c)) {
            hashMap.put("cachedSrc", this.f2159c);
        }
        wr wrVar = this.f;
        hashMap.put("type", wr.c(this.d));
        hashMap.put("reason", this.d);
        if (!TextUtils.isEmpty(this.e)) {
            hashMap.put("message", this.e);
        }
        this.f.a((wr) "onPrecacheEvent", (String) hashMap);
    }
}
