package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

public final class vs0 implements zh1 {

    /* renamed from: b  reason: collision with root package name */
    private final us0 f5155b;

    vs0(us0 us0) {
        this.f5155b = us0;
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str, Throwable th) {
        if (((Boolean) on2.e().a(zr2.Z2)).booleanValue() && ph1.RENDERER == ph1 && this.f5155b.c() != 0) {
            this.f5155b.b(q.j().b() - this.f5155b.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void b(ph1 ph1, String str) {
        if (((Boolean) on2.e().a(zr2.Z2)).booleanValue() && ph1.RENDERER == ph1) {
            this.f5155b.c(q.j().b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void c(ph1 ph1, String str) {
        if (((Boolean) on2.e().a(zr2.Z2)).booleanValue() && ph1.RENDERER == ph1 && this.f5155b.c() != 0) {
            this.f5155b.b(q.j().b() - this.f5155b.c());
        }
    }
}
