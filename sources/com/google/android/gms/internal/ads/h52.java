package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class h52 extends wp0<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Long f2866b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f2867c;
    public Boolean d;

    public h52(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.wp0
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f2866b);
        hashMap.put(1, this.f2867c);
        hashMap.put(2, this.d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = wp0.a(str);
        if (a2 != null) {
            this.f2866b = (Long) a2.get(0);
            this.f2867c = (Boolean) a2.get(1);
            this.d = (Boolean) a2.get(2);
        }
    }
}
