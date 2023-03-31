package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class t52 extends wp0<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f4756b;

    /* renamed from: c  reason: collision with root package name */
    public Long f4757c;
    public Long d;
    public Long e;

    public t52(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.wp0
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f4756b);
        hashMap.put(1, this.f4757c);
        hashMap.put(2, this.d);
        hashMap.put(3, this.e);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = wp0.a(str);
        if (a2 != null) {
            this.f4756b = (Long) a2.get(0);
            this.f4757c = (Long) a2.get(1);
            this.d = (Long) a2.get(2);
            this.e = (Long) a2.get(3);
        }
    }
}
