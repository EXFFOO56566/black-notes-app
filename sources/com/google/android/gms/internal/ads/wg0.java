package com.google.android.gms.internal.ads;

import a.e.a;

public final class wg0 implements n60 {

    /* renamed from: b  reason: collision with root package name */
    private final if0 f5267b;

    /* renamed from: c  reason: collision with root package name */
    private final of0 f5268c;

    public wg0(if0 if0, of0 of0) {
        this.f5267b = if0;
        this.f5268c = of0;
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void K() {
        if (this.f5267b.v() != null) {
            ws u = this.f5267b.u();
            ws t = this.f5267b.t();
            if (u == null) {
                u = t != null ? t : null;
            }
            if (this.f5268c.a() && u != null) {
                u.a("onSdkImpression", new a());
            }
        }
    }
}
