package com.google.android.gms.internal.ads;

import android.content.Context;

public final class pz0 extends vn2 {

    /* renamed from: b  reason: collision with root package name */
    private final zz0 f4251b;

    public pz0(Context context, kv kvVar, be1 be1, rf0 rf0, rn2 rn2) {
        b01 b01 = new b01(rf0);
        b01.a(rn2);
        this.f4251b = new zz0(new i01(kvVar, context, b01, be1), be1.b());
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final synchronized String V() {
        return this.f4251b.c();
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final synchronized String a() {
        return this.f4251b.a();
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final synchronized void a(rm2 rm2, int i) {
        this.f4251b.a(rm2, i);
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final void b(rm2 rm2) {
        this.f4251b.a(rm2, 1);
    }

    @Override // com.google.android.gms.internal.ads.wn2
    public final synchronized boolean u() {
        return this.f4251b.b();
    }
}
