package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class au0 extends wp0<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public String f1816b;

    /* renamed from: c  reason: collision with root package name */
    public long f1817c;
    public String d;
    public String e;
    public String f;

    public au0() {
        this.f1816b = "E";
        this.f1817c = -1;
        this.d = "E";
        this.e = "E";
        this.f = "E";
    }

    public au0(String str) {
        this();
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.wp0
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f1816b);
        hashMap.put(4, this.f);
        hashMap.put(3, this.e);
        hashMap.put(2, this.d);
        hashMap.put(1, Long.valueOf(this.f1817c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = wp0.a(str);
        if (a2 != null) {
            String str2 = "E";
            this.f1816b = a2.get(0) == null ? str2 : (String) a2.get(0);
            this.f1817c = a2.get(1) == null ? -1 : ((Long) a2.get(1)).longValue();
            this.d = a2.get(2) == null ? str2 : (String) a2.get(2);
            this.e = a2.get(3) == null ? str2 : (String) a2.get(3);
            if (a2.get(4) != null) {
                str2 = (String) a2.get(4);
            }
            this.f = str2;
        }
    }
}
