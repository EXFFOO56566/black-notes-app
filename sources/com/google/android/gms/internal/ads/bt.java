package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* access modifiers changed from: package-private */
public final class bt implements o {

    /* renamed from: b  reason: collision with root package name */
    private ws f2007b;

    /* renamed from: c  reason: collision with root package name */
    private o f2008c;

    public bt(ws wsVar, o oVar) {
        this.f2007b = wsVar;
        this.f2008c = oVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        this.f2008c.I();
        this.f2007b.o();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void p() {
        this.f2008c.p();
        this.f2007b.F();
    }
}
