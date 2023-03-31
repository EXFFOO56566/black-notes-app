package com.google.android.gms.internal.ads;

final class dy0 implements h70 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2332a = false;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ro f2333b;

    dy0(yx0 yx0, ro roVar) {
        this.f2333b = roVar;
    }

    private final void b(int i, String str) {
        this.f2333b.a(new nt0(((Boolean) on2.e().a(zr2.t2)).booleanValue() ? 3 : i, i, str));
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final void a(int i) {
        if (!this.f2332a) {
            b(i, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final synchronized void a(int i, String str) {
        this.f2332a = true;
        b(i, str);
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final synchronized void s() {
        this.f2333b.b(null);
    }
}
