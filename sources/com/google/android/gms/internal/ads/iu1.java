package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class iu1 extends wp0<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public long f3136b;

    /* renamed from: c  reason: collision with root package name */
    public long f3137c;

    public iu1() {
        this.f3136b = -1;
        this.f3137c = -1;
    }

    public iu1(String str) {
        this();
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.wp0
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f3136b));
        hashMap.put(1, Long.valueOf(this.f3137c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = wp0.a(str);
        if (a2 != null) {
            this.f3136b = ((Long) a2.get(0)).longValue();
            this.f3137c = ((Long) a2.get(1)).longValue();
        }
    }
}
