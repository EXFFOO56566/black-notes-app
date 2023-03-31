package com.google.android.gms.internal.ads;

import java.util.Map;

public final class dn0 implements zh1 {

    /* renamed from: b  reason: collision with root package name */
    private Map<ph1, fn0> f2283b;

    /* renamed from: c  reason: collision with root package name */
    private wj2 f2284c;

    dn0(wj2 wj2, Map<ph1, fn0> map) {
        this.f2283b = map;
        this.f2284c = wj2;
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str, Throwable th) {
        if (this.f2283b.containsKey(ph1)) {
            this.f2284c.a(this.f2283b.get(ph1).f2628c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void b(ph1 ph1, String str) {
        if (this.f2283b.containsKey(ph1)) {
            this.f2284c.a(this.f2283b.get(ph1).f2626a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void c(ph1 ph1, String str) {
        if (this.f2283b.containsKey(ph1)) {
            this.f2284c.a(this.f2283b.get(ph1).f2627b);
        }
    }
}
