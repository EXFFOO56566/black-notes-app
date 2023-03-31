package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class i52 extends wp0<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f3031b;

    /* renamed from: c  reason: collision with root package name */
    public Long f3032c;

    public i52(String str) {
        b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.wp0
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f3031b);
        hashMap.put(1, this.f3032c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        HashMap a2 = wp0.a(str);
        if (a2 != null) {
            this.f3031b = (Long) a2.get(0);
            this.f3032c = (Long) a2.get(1);
        }
    }
}
